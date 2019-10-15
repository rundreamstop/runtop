package com.runtop.core.modules.page;

import com.runtop.core.modules.utils.StringUtil;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Map;

/**
 * rundreams.net by rundreams.top
 *
 * @Author: rundreams@yeah.net  @Time:2019\10\15 0015
 */
public class BaseQueryOrder implements Serializable {

    private static final long serialVersionUID = -6755779269722022567L;
    /**
     * 当前页
     */
    protected int page = 1;

    /**
     * 分页大小 如果需要excel导出 把 pageSize=5000 ，目前暂时规定仅支持最大5000
     */
    protected int pageSize = 10;

    /**
     * 排序字段
     */
    protected String orderBy;

    /**
     * 根据设定的分页大小和当前页生成分页器Paginator对象
     *
     * @return
     */
    public Paginator getPaginator() {
        Paginator paginator = new Paginator(getPageSize());
        paginator.setPage(getPage());
        return paginator;
    }

    /**
     * 生成以下查询基础参数
     * <ul>
     * <li>limitStart 分页起始位置</li>
     * <li>pageSize 分页大小</li>
     * <li>orderBy 排序字段 (可选) </li>
     * </ul>
     *
     * @param conditions
     */
    public void buildBaseConditions(Map<String, Object> conditions) {
        Paginator paginator = getPaginator();
        conditions.put("limitStart", paginator.getOffset());
        conditions.put("pageSize", paginator.getLength());
        conditions.put("isPaged", 0);
        if (StringUtil.isNotEmpty(getOrderBy())) {
            conditions.put("orderBy", getOrderBy());
        }
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
