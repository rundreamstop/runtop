package com.runtop.core.modules.template.base;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 追忆寻梦
 * rundreams.net
 *
 * @Author:zzh rundreams@yeah.net  @Time:2017/8/29
 */
public class BaseModel implements Serializable {
    private static final long serialVersionUID = -8758345785273705054L;

    /**
     * 主键.
     */
    private Long id;

    /**
     * 是否删除.
     */
    private BooleanEnums isDeleted;

    /**
     * 数据新增时间.
     */
    private Date gmtCreate;

    /**
     * 数据修改时间.
     */
    private Date gmtModify;

	/* ###### 分页参数 ###### */

    /**
     * 起始记录.
     */
    private int offset;

    /**
     * 每页记录数.
     */
    private int size;

	/* ###### 批量参数 ###### */

    /**
     * 主键集合.
     */
    private List<Long> ids;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BooleanEnums getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(BooleanEnums isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
}
