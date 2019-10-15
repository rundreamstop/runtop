package com.runtop.core.modules.page;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * rundreams.net by rundreams.top
 *
 * @Author: rundreams@yeah.net  @Time:2019\10\15 0015
 */
public class PageResult<T> implements Serializable {

    private static final long serialVersionUID = -544020625204933150L;
    private boolean success = false;
    private String message = "查询失败";
    private PageList<T> pageList = new PageList<T>();
    private int totalCount = 0;

    public PageResult() {
    }

    public PageResult(boolean success, String message, PageList<T> pageList, int totalCount) {
        this.success = success;
        this.message = message;
        this.pageList = pageList;
        this.totalCount = totalCount;
    }

    /**
     * 获取一个分页查询结果为空的结果
     *
     * @return
     */
    public static <T> PageResult<T> emptyResult() {
        return new PageResult<T>(false, "查询结果为空", null,0);
    }

    /**
     * 获取一个分页查询失败的结果
     *
     * @param msg
     * @param <T>
     * @return
     */
    public static <T> PageResult<T> getFailResult(String msg) {
        return new PageResult<T>(false, msg, null, 0);
    }

    /**
     * 获取一个分页查询成功的结果
     *
     * @return
     */
    public static <T> PageResult<T> getSuccessResult(PageList<T> pageList,int totalCount) {
        return new PageResult<T>(true, "查询成功", pageList,totalCount);
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public PageList<T> getPageList() {
        return pageList;
    }

    public void setPageList(PageList<T> pageList) {
        this.pageList = pageList;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * @return
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
