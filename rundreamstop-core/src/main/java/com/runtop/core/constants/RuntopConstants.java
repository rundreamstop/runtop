package com.runtop.core.constants;

/**
 * rundreams.net by rundreams.top
 *
 * @Author: rundreams@yeah.net  @Time:2019\10\15 0015
 */
public final class RuntopConstants {

    /**
     * 序列默认code.
     */
    public static final String SEQUENCE_DEFAULT_CODE = "DEFAULT";

    /**
     * 分页默认起始页.
     */
    public static final int PAGE_DEFAULT_BEGIN = 0;

    /**
     * 分页每页默认条数.
     */
    public static final int PAGE_DEFAULT_SIZE = 10;

    /**
     * 系统错误提示
     */
    public static final String ERROR_MESSAGE = "未知异常,请联系客服或技术人员!";

    /**
     * 无权限错误提示
     */
    public static final String NO_AUTHORITY_ERROR_MESSAGE = "你没有该接口权限!";

    /**
     * 执行成功提示
     */
    public static final String SUCCESS_MESSAGE = "执行成功!";

    /**
     * 手机正则表达式.
     */
    public static final String MOBILE_REGEXP = "^(1)\\d{10}$";

    /**
     * 密码的正则表达式
     */
    public static final String PASSWORD_REGEXP = "^[@#_A-Za-z0-9]{6,16}$";
    /**
     * 邮箱的正则表达式
     */
    public static final String EMAIL_REGEXP = "^\\w+@\\w+(\\.[A-Za-z]{2,3}){1,2}$";

}