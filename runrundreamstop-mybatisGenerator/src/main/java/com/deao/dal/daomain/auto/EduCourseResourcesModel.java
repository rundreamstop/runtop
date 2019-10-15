package com.deao.dal.daomain.auto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class EduCourseResourcesModel implements Serializable {
    /**
     * 自增id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 课程id
     *
     * @mbggenerated
     */
    private String courseId;

    /**
     * 资源名称
     *
     * @mbggenerated
     */
    private String resourceName;

    /**
     * 资源类型
     *
     * @mbggenerated
     */
    private String resourceType;

    /**
     * 资源类型的值
     *
     * @mbggenerated
     */
    private String resourceTypeValues;

    /**
     * 资源地址
     *
     * @mbggenerated
     */
    private String resourceHref;

    /**
     * 备注
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * 备注扩展
     *
     * @mbggenerated
     */
    private String remarkExtend;

    /**
     * 创建时间
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 修改时间
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * 0未删除 1 已删除
     *
     * @mbggenerated
     */
    private Integer isDelete;

    private static final long serialVersionUID = 1L;
}