package com.deao.dal.daomain.auto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class EduMajorModel implements Serializable {
    /**
     * 
     *
     * @mbggenerated
     */
    private Integer id;

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
     * 专业大类
     *
     * @mbggenerated
     */
    private String majorBigCategory;

    /**
     * 专业大类值
     *
     * @mbggenerated
     */
    private String majorBigCategoryValues;

    /**
     * 专业类
     *
     * @mbggenerated
     */
    private String majorCategory;

    /**
     * 专业类值
     *
     * @mbggenerated
     */
    private String majorCategoryValues;

    /**
     * 二级学院信息字典id
     *
     * @mbggenerated
     */
    private String stuFaculty;

    /**
     * 二级学院信息的值
     *
     * @mbggenerated
     */
    private String stuFacultyValues;

    /**
     * 教育类型
     *
     * @mbggenerated
     */
    private String eduType;

    /**
     * 教育类型值
     *
     * @mbggenerated
     */
    private String eduTypeValues;

    /**
     * 学历层次
     *
     * @mbggenerated
     */
    private String eduLevel;

    /**
     * 学历层次值
     *
     * @mbggenerated
     */
    private String eduLevelValues;

    /**
     * 学制
     *
     * @mbggenerated
     */
    private String eduSystem;

    /**
     * 修学年限
     *
     * @mbggenerated
     */
    private String studyYears;

    /**
     * 招生对象
     *
     * @mbggenerated
     */
    private String recruitmentTarget;

    /**
     * 说明
     *
     * @mbggenerated
     */
    private String majorDescribe;

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