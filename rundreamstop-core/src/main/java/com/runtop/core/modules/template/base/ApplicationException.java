package com.runtop.core.modules.template.base;


import com.runtop.core.modules.template.enums.ResponseCodeEnums;

/**
 * 追忆寻梦
 * rundreams.net
 *
 * @Author:zzh rundreams@yeah.net  @Time:2017/8/29
 */
public class ApplicationException extends RuntimeException {

    private static final long serialVersionUID = 3884961261442734923L;

    /**
     * 响应码.
     */
    private ResponseCodeEnums responseCode;

    /**
     * 消息.
     */
    private String message;

    public ApplicationException(ResponseCodeEnums responseCode) {
        this.responseCode = responseCode;

        if (null != responseCode) {
            message = responseCode.getDisplayName();
        }
    }

    public ApplicationException(ResponseCodeEnums responseCode, String message) {
        this.responseCode = responseCode;
        this.message = message;
    }

    public ApplicationException(String message) {
        this.message = message;
    }

    public ResponseCodeEnums getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(ResponseCodeEnums responseCode) {
        this.responseCode = responseCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
