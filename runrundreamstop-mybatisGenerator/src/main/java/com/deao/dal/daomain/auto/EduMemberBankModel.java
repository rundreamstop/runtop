package com.deao.dal.daomain.auto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class EduMemberBankModel implements Serializable {
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
     * 学年
     *
     * @mbggenerated
     */
    private String schoolYear;

    /**
     * 学期
     *
     * @mbggenerated
     */
    private String semester;

    /**
     * 课程名称
     *
     * @mbggenerated
     */
    private String courseTitle;

    /**
     * 课程性质
     *
     * @mbggenerated
     */
    private String courseNature;

    /**
     * 课程编码
     *
     * @mbggenerated
     */
    private String courseCode;

    /**
     * 学时
     *
     * @mbggenerated
     */
    private String courseHours;

    /**
     * 课程类别
     *
     * @mbggenerated
     */
    private String courseType;

    /**
     * 考试性质
     *
     * @mbggenerated
     */
    private String examNature;

    /**
     * 考试类别
     *
     * @mbggenerated
     */
    private String examType;

    /**
     * 考试记录
     *
     * @mbggenerated
     */
    private String examRecord;

    /**
     * 补重修学期
     *
     * @mbggenerated
     */
    private String rebuildSemester;

    /**
     * 成绩
     *
     * @mbggenerated
     */
    private String grade;

    /**
     * 绩点
     *
     * @mbggenerated
     */
    private String gradePoint;

    /**
     * 学分
     *
     * @mbggenerated
     */
    private String credit;

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