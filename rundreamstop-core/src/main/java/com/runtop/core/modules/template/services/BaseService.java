package com.runtop.core.modules.template.services;


import com.runtop.core.modules.template.base.*;
import com.runtop.core.modules.template.enums.ResponseCodeEnums;
import com.runtop.core.modules.utils.DateUtils;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.Date;

/**
 * 追忆寻梦
 * rundreams.net
 *
 * @Author:zzh rundreams@yeah.net  @Time:2017/8/29
 */
public abstract class BaseService {

    protected final Logger logger = LoggerFactory.getLogger(BaseService.class);

    /**
     * 使用事务模版, 不使用注解方式.
     */
    @Autowired
    protected TransactionTemplate transactionTemplate;

    /**
     * 2.业务简单处理模版方法骨架.
     * <p>
     * 开启事务.
     */
    @SuppressWarnings({"rawtypes"})
    protected final <R extends BaseResponseDTO> R serviceTransaction(BaseEnum action, BaseRequestDTO request, Class<R> responseClass,
                                                                     SimpleExecutor simpleExecutor) {

        return this.service(action, request, responseClass, simpleExecutor, Boolean.TRUE);
    }

    /**
     * 4.业务简单处理模版方法骨架.
     * <p>
     * 不开启事务.
     */
    @SuppressWarnings({"rawtypes"})
    protected final <R extends BaseResponseDTO> R serviceNoTransaction(BaseEnum action, BaseRequestDTO request, Class<R> responseClass,
                                                                       SimpleExecutor simpleExecutor) {

        return this.service(action, request, responseClass, simpleExecutor, Boolean.FALSE);
    }

    /**
     * 设置成功.
     */
    public static void setSuccess(BaseResponseDTO response) {
        ResponseCodeEnums responseCode = ResponseCodeEnums.EXECUTE_SUCCESS;

        response.setSuccess(Boolean.TRUE);
        response.setExecuted(Boolean.TRUE);
        response.setResponseCode(responseCode);
        response.setMessage(responseCode.getDisplayName());
    }

    /**
     * 获取数据库日期.
     */
    protected final Date getCurrentDate() {
        Date currentDate = DateUtils.now();

        logger.debug("数据库日期: {}", currentDate);

        return currentDate;
    }

    /**
     * 业务简单处理模版方法骨架.
     */
    @SuppressWarnings({"rawtypes", "unchecked"})
    private <R extends BaseResponseDTO> R service(BaseEnum action, BaseRequestDTO request, Class<R> responseClass,
                                                  SimpleExecutor simpleExecutor, boolean isTransaction) {

        logger.info("请求业务: {}-{}", action.getDisplayName(), request);

        // 1.实例化Result.
        BaseResponseDTO response = InstantiateUtils.instantiate(responseClass);

        // 接收请求成功.
        response.setSuccess(Boolean.TRUE);

        try {

            // 2.校验Order.
            Validate.notNull(request, "request不能为空");
            request.valid();

            // 3.创建上下文对象, 并使线程持有.
            ApplicationContextHolder.set(new ApplicationContext<BaseRequestDTO, BaseModel, BaseResponseDTO>(request, null, response));

            // 事务.
            if (isTransaction) {

                // 4.创建简单的事务模板, 进行原子事务处理.
                SimpleTransactionCallback transactionCallback = new SimpleTransactionCallback(response, simpleExecutor);
                this.transactionTemplate.execute(transactionCallback);
            }
            // 非事务.
            else {

                // 4.设置成功应答.
                setSuccess(response);
                // 5.前置处理.
                Object pojo = simpleExecutor.before();
                // 6.业务处理.
                simpleExecutor.process(pojo);
                // 7.转换.
                simpleExecutor.conver(pojo, response);
            }

        } catch (IllegalArgumentException e) {
            ResponseCodeEnums responseCode = ResponseCodeEnums.ILLEGAL_ARGUMENT_EXCEPTION;

            response.setExecuted(Boolean.FALSE);
            response.setResponseCode(responseCode);
            response.setMessage(e.getMessage());
            logger.error("request: {}, message: {}:{}", request, responseCode.getDisplayName(), e.getMessage());
        } catch (DuplicateKeyException e) {
            ResponseCodeEnums responseCode = ResponseCodeEnums.DATA_EXIST_ALREADY;

            response.setExecuted(Boolean.FALSE);
            response.setResponseCode(responseCode);
            response.setMessage(responseCode.getDisplayName());
            logger.error("request: {}, message: {}:{}", request, responseCode.getDisplayName(), e.getMessage(), e);
        } catch (DataAccessException e) {
            ResponseCodeEnums responseCode = ResponseCodeEnums.DATABASE_EXCEPTION;

            response.setExecuted(Boolean.FALSE);
            response.setResponseCode(responseCode);
            response.setMessage(responseCode.getDisplayName());
            logger.error("request: {}, message: {}:{}", request, responseCode.getDisplayName(), e.getMessage(), e);
        } catch (ApplicationException e) {
            ResponseCodeEnums responseCode = e.getResponseCode();

            response.setExecuted(Boolean.FALSE);
            response.setResponseCode(responseCode);
            response.setMessage(e.getMessage());
            logger.error("request: {}, message: {}:{}", request, responseCode.getDisplayName(), e.getMessage());
        } catch (Exception e) {
            ResponseCodeEnums responseCode = ResponseCodeEnums.UNKNOWN_EXCEPTION;

            response.setExecuted(Boolean.FALSE);
            response.setResponseCode(responseCode);
            response.setMessage(responseCode.getDisplayName());
            logger.error("request: {}, message: {}:{}", request, responseCode.getDisplayName(), e.getMessage(), e);
        } finally {

            // 5.清空独立线程持有.
            ApplicationContextHolder.clear();
        }

        logger.info("响应业务: {}-{}", action.getDisplayName(), response);

        return (R) response;
    }

    /**
     * 创建事务模板, 进行原子事务处理.
     * <p>
     * 简单的事务模版.
     *
     * @date 2014年8月4日
     */
    private class SimpleTransactionCallback implements TransactionCallback<Object> {

        private BaseResponseDTO response;

        private SimpleExecutor<Object> invoker;

        private SimpleTransactionCallback(BaseResponseDTO response, SimpleExecutor<Object> invoker) {
            this.response = response;
            this.invoker = invoker;
        }

        @Override
        public Object doInTransaction(TransactionStatus status) {

            Object pojo = null;

            try {
                // 设置成功应答.
                setSuccess(response);
                // 前置处理.
                pojo = invoker.before();
                // 业务处理.
                invoker.process(pojo);
                // 转换.
                invoker.conver(pojo, response);

            } catch (RuntimeException e) {
                // 回滚.
                status.setRollbackOnly();

                throw e;
            }

            return pojo;
        }

    }

}
