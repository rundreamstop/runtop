package com.deao.dal.daomain.auto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class OrderDetailModel implements Serializable {
    /**
     * 
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 订单详情表no
     *
     * @mbggenerated
     */
    private String detailNo;

    /**
     * 订单号
     *
     * @mbggenerated
     */
    private String orderNo;

    /**
     * 学校代码
     *
     * @mbggenerated
     */
    private String schoolCode;

    /**
     * 学校名字
     *
     * @mbggenerated
     */
    private String schoolName;

    /**
     * 专业id
     *
     * @mbggenerated
     */
    private Integer majorId;

    /**
     * 专业代码
     *
     * @mbggenerated
     */
    private String majorCode;

    /**
     * 专业名字
     *
     * @mbggenerated
     */
    private String majorName;

    /**
     * 志愿等级
     *
     * @mbggenerated
     */
    private String gradeVolunteer;

    /**
     * 志愿等级值
     *
     * @mbggenerated
     */
    private String gradeValunteerValues;

    /**
     * 限报条件
     *
     * @mbggenerated
     */
    private String reportingConditions;

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