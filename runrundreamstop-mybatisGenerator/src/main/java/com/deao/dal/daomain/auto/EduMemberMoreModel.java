package com.deao.dal.daomain.auto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class EduMemberMoreModel implements Serializable {
    /**
     * 
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 用户userId
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * 关系
     *
     * @mbggenerated
     */
    private String relation;

    /**
     * 关系的值
     *
     * @mbggenerated
     */
    private String relationValues;

    /**
     * 关系名字
     *
     * @mbggenerated
     */
    private String relName;

    /**
     * 职业
     *
     * @mbggenerated
     */
    private String occupation;

    /**
     * 工作单位
     *
     * @mbggenerated
     */
    private String workUnit;

    /**
     * 联系方式
     *
     * @mbggenerated
     */
    private String contactInformation;

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