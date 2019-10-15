package com.runtop.core.modules.result;

import com.runtop.core.modules.template.enums.ResponseCodeEnums;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * rundreams.net by rundreams.top
 *
 * @Author: rundreams@yeah.net  @Time:2019\10\15 0015
 */
@Getter
@Setter
public class ResultBase implements Serializable {

    private static final long serialVersionUID = -9108022476952306252L;

    /**
     * 返回成功的状态, 默认为false
     */
    public boolean success = false;

    /**
     * 返回的对象
     */
    public Object object = new Object();

    /**
     * 返回结果描述-
     */
    public String message = "执行失败!";


    public ResultBase() {
        super();
    }

    /**
     * 成功结果
     *
     * @return
     */
    public static ResultBase success() {
        ResultBase resultBase = new ResultBase();
        resultBase.setSuccess(true);
        resultBase.setObject(null);
        resultBase.setMessage(ResponseCodeEnums.EXECUTE_SUCCESS.getDisplayName());
        return resultBase;
    }

    /**
     * 返回成功 带 obj
     *
     * @param obj
     * @return
     */
    public static ResultBase success(Object obj) {
        ResultBase resultBase = new ResultBase();
        resultBase.setSuccess(true);
        resultBase.setObject(obj);
        resultBase.setMessage(ResponseCodeEnums.EXECUTE_SUCCESS.getDisplayName());
        return resultBase;
    }

    /**
     * 失败 有自定义异常
     *
     * @param msg
     * @return
     */
    public static ResultBase fail(String msg) {
        ResultBase resultBase = new ResultBase();
        resultBase.setSuccess(false);
        resultBase.setObject(null);
        resultBase.setMessage(msg);
        return resultBase;
    }

    /**
     * 返回失败  系统异常
     *
     * @return
     */
    public static ResultBase fail() {
        ResultBase resultBase = new ResultBase();
        resultBase.setSuccess(false);
        resultBase.setObject(null);
        resultBase.setMessage("执行失败");
        return resultBase;
    }

    /**
     * 参数校验
     *
     * @return
     */
    public static ResultBase failCheckParameter() {
        return fail(ResponseCodeEnums.ILLEGAL_ARGUMENT_EXCEPTION.getDisplayName());
    }

    /**
     * 没有数据
     *
     * @return
     */
    public static ResultBase failNoData() {
        return fail(ResponseCodeEnums.NOT_MEET_CONDITIONS_DATA.getDisplayName());
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
