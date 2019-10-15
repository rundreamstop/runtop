package com.deao.dal.daomain.auto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class EduMemberModel implements Serializable {
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
     * 用户openid
     *
     * @mbggenerated
     */
    private String openId;

    /**
     * 名字
     *
     * @mbggenerated
     */
    private String stuName;

    /**
     * 名字首字母
     *
     * @mbggenerated
     */
    private String stuNameLetter;

    /**
     * 手机号码
     *
     * @mbggenerated
     */
    private String stuPhone;

    /**
     * 学号
     *
     * @mbggenerated
     */
    private String stuId;

    /**
     * 性别
     *
     * @mbggenerated
     */
    private String sex;

    /**
     * 民族
     *
     * @mbggenerated
     */
    private String nation;

    /**
     * 身份证号
     *
     * @mbggenerated
     */
    private String idNumber;

    /**
     * 生日类型
     *
     * @mbggenerated
     */
    private String birthdayType;

    /**
     * 生日类型
     *
     * @mbggenerated
     */
    private String birthdayTypeValues;

    /**
     * 生日信息
     *
     * @mbggenerated
     */
    private String stuBirthday;

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
     * 专业信息字典id
     *
     * @mbggenerated
     */
    private String stuProfession;

    /**
     * 专业信息的值
     *
     * @mbggenerated
     */
    private String stuProfessionValues;

    /**
     * 班级信息
     *
     * @mbggenerated
     */
    private String stuClass;

    /**
     * 紧急联系人名字
     *
     * @mbggenerated
     */
    private String urgentName;

    /**
     * 紧急联系人电话
     *
     * @mbggenerated
     */
    private String urgentPhone;

    /**
     * 用户状态
     *
     * @mbggenerated
     */
    private String stuStatus;

    /**
     * 用户状态值
     *
     * @mbggenerated
     */
    private String stuStatusValues;

    /**
     * 用户角色
     *
     * @mbggenerated
     */
    private String memberRole;

    /**
     * 用户角色值
     *
     * @mbggenerated
     */
    private String memberRoleValues;

    /**
     * 登录次数
     *
     * @mbggenerated
     */
    private Integer loginNumber;

    /**
     * 最后登录时间
     *
     * @mbggenerated
     */
    private Date lastLoginTime;

    /**
     * 学制（年）
     *
     * @mbggenerated
     */
    private String schoolSystem;

    /**
     * 政治面貌
     *
     * @mbggenerated
     */
    private String politicCountenance;

    /**
     * 政治面貌值
     *
     * @mbggenerated
     */
    private String politicCountenanceValues;

    /**
     * 学籍状态
     *
     * @mbggenerated
     */
    private String studentStatus;

    /**
     * 学籍状态值
     *
     * @mbggenerated
     */
    private String studentStatusValues;

    /**
     * 学生证件照片url
     *
     * @mbggenerated
     */
    private String stuPhotoUrl;

    /**
     * 学生年级字典id
     *
     * @mbggenerated
     */
    private String stuGrade;

    /**
     * 学生年级的值
     *
     * @mbggenerated
     */
    private String stuGradeValues;

    /**
     * 电子邮箱
     *
     * @mbggenerated
     */
    private String mailBox;

    /**
     * 微信号
     *
     * @mbggenerated
     */
    private String wechatNumber;

    /**
     * 家庭住址
     *
     * @mbggenerated
     */
    private String familyAddress;

    /**
     * 信息完善状态
     *
     * @mbggenerated
     */
    private String informationStatus;

    /**
     * 信息完善状态值
     *
     * @mbggenerated
     */
    private String informationStatusValues;

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