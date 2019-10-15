package com.deao.dal.daomain.auto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class EduTeachingModel implements Serializable {
    /**
     * 
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 培训计划ID
     *
     * @mbggenerated
     */
    private Integer majorPlanId;

    /**
     * 教师(用户userId)
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * 名字
     *
     * @mbggenerated
     */
    private String studentName;

    /**
     * 课程代码
     *
     * @mbggenerated
     */
    private String courseCode;

    /**
     * 课程名字
     *
     * @mbggenerated
     */
    private String courseName;

    /**
     * 课程封面
     *
     * @mbggenerated
     */
    private String courseCover;

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