package com.runtop.core.modules.http;

/**
 * rundreams.net by rundreams.top
 *
 * @Author: rundreams@yeah.net  @Time:2019\10\15 0015
 */
public enum EnumsHttpCode {

    /**
     * 200请求成功
     */
    OK(200, "请求成功"),

    /**
     * 请求失败
     */
    RETURN_FAIL(400, "请求失败"),

    /**
     * 401没有登录
     */
    UNAUTHORIZED(401, "没有登录"),

    /**
     * 207频繁操作
     */
    MULTI_STATUS(207, "频繁操作"),

    /**
     * 402登录失败
     */
    LOGIN_FAIL(402, "登录失败"),

    /**
     * 403没有权限
     */
    FORBIDDEN(403, "没有权限"),

    /**
     * 404找不到页面
     */
    NOT_FOUND(404, "找不到页面"),

    /**
     * 405请求方法不能被用于请求相应的资源
     */
    METHOD_NOT_ALLOWED(405, "请求方法不能被用于请求相应的资源"),

    /**
     * 406内容特性不满足
     */
    NOT_ACCEPTABLE(406, "内容特性不满足"),

    /**
     * 408请求超时
     */
    REQUEST_TIMEOUT(408, "请求超时"),

    /**
     * 409发生冲突
     */
    CONFLICT(409, "发生冲突"),

    /**
     * 410已被删除
     */
    GONE(410, "已被删除"),

    /**
     * 411没有定义长度
     */
    LENGTH_REQUIRED(411, "没有定义长度"),

    /**
     * 412条件不满足
     */
    PRECONDITION_FAILED(412, "条件不满足"),

    /**
     * 413数据太大
     */
    ENTITY_TOO_LARGE(413, "数据太大"),

    /**
     * 415不是服务器中所支持的格式
     */
    UNSUPPORTED_MEDIA_TYPE(415, "不是服务器中所支持的格式"),

    /**
     * 421连接数过多
     */
    TOO_MANY_CONNECTIONS(421, "连接数过多"),

    /**
     * 423已被锁定
     */
    LOCKED(423, "已被锁定"),

    /**
     * 451法律不允许
     */
    UNAVAILABLE_LEGAL(451, "法律不允许"),

    /**
     * 500服务器出错
     */
    INTERNAL_SERVER_ERROR(500, "服务器出错"),

    /**
     * 501不支持当前请求所需要的某个功能
     */
    NOT_IMPLEMENTED(501, "不支持当前请求所需要的某个功能"),

    /**
     * 503服务器升级中,暂时不可用
     */
    SERVICE_UNAVAILABLE(503, "服务器升级中,暂时不可用"),

    /**
     * 510获取资源所需要的策略并没有被满足
     */
    NOT_EXTENDED(510, "获取资源所需要的策略并没有被满足");

    /**
     * 枚举值
     */
    private final Integer code;

    /**
     * 枚举描述
     */
    private final String message;

    /**
     * @param code    枚举值
     * @param message 枚举描述
     */
    private EnumsHttpCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * @return Returns the code.
     */
    public Integer getCode() {
        return code;
    }

    /**
     * @return Returns the message.
     */
    public String getMessage() {
        return message;
    }

    /**
     * @return Returns the code.
     */
    public Integer code() {
        return code;
    }

    /**
     * @return Returns the message.
     */
    public String message() {
        return message;
    }

    /**
     * 通过枚举<code>code</code>获得枚举
     *
     * @param code
     * @return MemberRoleEnum
     */
    public static EnumsHttpCode getByCode(String code) {
        for (EnumsHttpCode _enum : values()) {
            if (_enum.getCode().equals(code)) {
                return _enum;
            }
        }
        return null;
    }

    /**
     * 获取全部枚举
     *
     * @return List<MemberRoleEnum>
     */
    public static java.util.List<EnumsHttpCode> getAllEnum() {
        java.util.List<EnumsHttpCode> list = new java.util.ArrayList<EnumsHttpCode>(
                values().length);
        for (EnumsHttpCode _enum : values()) {
            list.add(_enum);
        }
        return list;
    }

    /**
     * 通过code获取msg
     *
     * @param code 枚举值
     * @return
     */
    public static String getMsgByCode(String code) {
        if (code == null) {
            return null;
        }
        EnumsHttpCode _enum = getByCode(code);
        if (_enum == null) {
            return null;
        }
        return _enum.getMessage();
    }

    /**
     * 获取枚举code
     *
     * @param _enum
     * @return
     */
    public static Integer getCode(EnumsHttpCode _enum) {
        if (_enum == null) {
            return null;
        }
        return _enum.getCode();
    }
}
