package com.deao.dal.daomain.auto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class EduMajorPlanModel implements Serializable {
    /**
     * 
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 年级
     *
     * @mbggenerated
     */
    private String grade;

    /**
     * 专业id
     *
     * @mbggenerated
     */
    private String majorId;

    /**
     * 专业名字
     *
     * @mbggenerated
     */
    private String majorName;

    /**
     * 教学模块
     *
     * @mbggenerated
     */
    private String teachingModule;

    /**
     * 教学模块值
     *
     * @mbggenerated
     */
    private String teachingModuleValues;

    /**
     * 课程性质
     *
     * @mbggenerated
     */
    private String natureCurriculum;

    /**
     * 课程性质值
     *
     * @mbggenerated
     */
    private String natureCurriculumValues;

    /**
     * 课程类别
     *
     * @mbggenerated
     */
    private String courseCategories;

    /**
     * 课程类别值
     *
     * @mbggenerated
     */
    private String courseCategoriesValues;

    /**
     * 考核方式
     *
     * @mbggenerated
     */
    private String examinationMethods;

    /**
     * 考核方式值
     *
     * @mbggenerated
     */
    private String examinationMethodsValues;

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
     * 获得学分
     *
     * @mbggenerated
     */
    private String achieveCredits;

    /**
     * 总学时
     *
     * @mbggenerated
     */
    private String totalHours;

    /**
     * 授课学时
     *
     * @mbggenerated
     */
    private String teachingHours;

    /**
     * 实践学时
     *
     * @mbggenerated
     */
    private String practicalHours;

    /**
     * 第一学期
     *
     * @mbggenerated
     */
    private String semester1;

    /**
     * 第二学期
     *
     * @mbggenerated
     */
    private String semester2;

    /**
     * 第三学期
     *
     * @mbggenerated
     */
    private String semester3;

    /**
     * 第四学期
     *
     * @mbggenerated
     */
    private String semester4;

    /**
     * 第五学期
     *
     * @mbggenerated
     */
    private String semester5;

    /**
     * 第六学期
     *
     * @mbggenerated
     */
    private String semester6;

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