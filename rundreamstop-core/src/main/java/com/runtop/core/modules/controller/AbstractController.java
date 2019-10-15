package com.runtop.core.modules.controller;

import com.runtop.core.constants.RuntopConstants;
import com.runtop.core.modules.http.EnumsHttpCode;
import com.runtop.core.modules.utils.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * rundreams.net by rundreams.top
 *
 * @Author: rundreams@yeah.net  @Time:2019\10\15 0015
 */
public class AbstractController {

    /**
     * 响应码
     */
    public static final String FLAG = "flag";
    /**
     * 响应信息
     */
    public static final String MSG = "msg";
    /**
     * 响应结果对象
     */
    public static final String DATA = "data";

    /**
     * 响应结果附带对象
     */
    public static final String RESULT = "result";

    /**
     * 日志
     */
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 静态 熟悉copy
     *
     * @param obj
     * @param object
     */
    protected void copyProperties(Object obj, Object object) {
        BeanUtils.copyProperties(obj, object);
    }

    /**
     * 成功返回 输出
     *
     * @param msg
     * @param result
     * @param data
     * @return
     */
    protected Map<String, Object> successView(String msg, Object result, Object data) {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put(FLAG, EnumsHttpCode.OK.getCode());
        resultMap.put(MSG, msg);
        resultMap.put(RESULT, result);
        resultMap.put(DATA, data);
        return resultMap;
    }

    /**
     * result data
     *
     * @param result
     * @param data
     * @return
     */
    protected Map<String, Object> successView(Object result, Object data) {
        return successView(RuntopConstants.SUCCESS_MESSAGE, result, data);
    }

    /**
     * data
     *
     * @param data
     * @return
     */
    protected Map<String, Object> successView(Object data) {
        return successView(RuntopConstants.SUCCESS_MESSAGE, "", data);
    }

    /**
     * 返回成功
     *
     * @return
     */
    protected Map<String, Object> successView() {
        return successView(RuntopConstants.SUCCESS_MESSAGE, "", "");
    }

    /**
     * 失败返回 输出
     *
     * @param msg
     * @param result
     * @param data
     * @return
     */
    protected Map<String, Object> failView(String msg, Object result, Object data) {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put(FLAG, EnumsHttpCode.RETURN_FAIL.getCode());
        if (StringUtil.isEmpty(msg)) {
            resultMap.put(MSG, RuntopConstants.ERROR_MESSAGE);
        } else {
            resultMap.put(MSG, msg);
        }
        resultMap.put(RESULT, result);
        resultMap.put(DATA, data);
        return resultMap;
    }

    /**
     * 统一输出 失败返回 msg ,通常用于业务异常
     *
     * @param msg
     * @return
     */
    protected Map<String, Object> failView(String msg) {
        return failView(msg, "", "");
    }

    /**
     * 统一输出 失败，通常用于 catch 系统异常等情况
     *
     * @return
     */
    protected Map<String, Object> failView() {
        return failView(RuntopConstants.ERROR_MESSAGE);
    }

    /**
     * 自定义api 输出
     *
     * @param code
     * @param msg
     * @param result
     * @param data
     * @return
     */
    protected Map<String, Object> objectView(EnumsHttpCode code, String msg, Object result, Object data) {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put(FLAG, code.getCode());
        if (!StringUtil.equals(code.getCode().toString(), EnumsHttpCode.OK.getCode().toString())) {
            if (StringUtil.isEmpty(msg)) {
                resultMap.put(MSG, RuntopConstants.ERROR_MESSAGE);
            } else {
                resultMap.put(MSG, msg);
            }
        }
        resultMap.put(RESULT, result);
        resultMap.put(DATA, data);
        return resultMap;
    }


    /**
     * 统一输出 用于无接口权限
     *
     * @return
     */
    protected Map<String, Object> NoAuthorityfailView() {
        return failView(RuntopConstants.NO_AUTHORITY_ERROR_MESSAGE);
    }

}
