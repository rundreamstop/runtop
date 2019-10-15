package com.deao.dal.daomain.auto;

import java.util.Date;

public class OutsideMemberModel {
    /**
     * 
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 手机号码
     *
     * @mbggenerated
     */
    private String phoneNumber;

    /**
     * 会员来源
     *
     * @mbggenerated
     */
    private String memberSource;

    /**
     * 会员来源的值[问卷星/小鹅通]
     *
     * @mbggenerated
     */
    private String memberSourceValues;

    /**
     * 真实名字
     *
     * @mbggenerated
     */
    private String realName;

    /**
     * 微信昵称
     *
     * @mbggenerated
     */
    private String nickname;

    /**
     * 性别
     *
     * @mbggenerated
     */
    private String sex;

    /**
     * 生日
     *
     * @mbggenerated
     */
    private String birthday;

    /**
     * 区
     *
     * @mbggenerated
     */
    private String area;

    /**
     * 学校名字
     *
     * @mbggenerated
     */
    private String schoolName;

    /**
     * 意向专业学校等信息
     *
     * @mbggenerated
     */
    private String intentionMinformation;

    /**
     * 就读年级
     *
     * @mbggenerated
     */
    private String yearOfStudy;

    /**
     * 家庭地址
     *
     * @mbggenerated
     */
    private String homeAddress;

    /**
     * 备注
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * 备注1
     *
     * @mbggenerated
     */
    private String remarkOne;

    /**
     * 备注2
     *
     * @mbggenerated
     */
    private String remarkTwo;

    /**
     * 备注3
     *
     * @mbggenerated
     */
    private String remarkThree;

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

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outside_member.id
     *
     * @return the value of outside_member.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outside_member.id
     *
     * @param id the value for outside_member.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outside_member.phone_number
     *
     * @return the value of outside_member.phone_number
     *
     * @mbggenerated
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outside_member.phone_number
     *
     * @param phoneNumber the value for outside_member.phone_number
     *
     * @mbggenerated
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outside_member.member_source
     *
     * @return the value of outside_member.member_source
     *
     * @mbggenerated
     */
    public String getMemberSource() {
        return memberSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outside_member.member_source
     *
     * @param memberSource the value for outside_member.member_source
     *
     * @mbggenerated
     */
    public void setMemberSource(String memberSource) {
        this.memberSource = memberSource == null ? null : memberSource.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outside_member.member_source_values
     *
     * @return the value of outside_member.member_source_values
     *
     * @mbggenerated
     */
    public String getMemberSourceValues() {
        return memberSourceValues;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outside_member.member_source_values
     *
     * @param memberSourceValues the value for outside_member.member_source_values
     *
     * @mbggenerated
     */
    public void setMemberSourceValues(String memberSourceValues) {
        this.memberSourceValues = memberSourceValues == null ? null : memberSourceValues.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outside_member.real_name
     *
     * @return the value of outside_member.real_name
     *
     * @mbggenerated
     */
    public String getRealName() {
        return realName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outside_member.real_name
     *
     * @param realName the value for outside_member.real_name
     *
     * @mbggenerated
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outside_member.nickname
     *
     * @return the value of outside_member.nickname
     *
     * @mbggenerated
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outside_member.nickname
     *
     * @param nickname the value for outside_member.nickname
     *
     * @mbggenerated
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outside_member.sex
     *
     * @return the value of outside_member.sex
     *
     * @mbggenerated
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outside_member.sex
     *
     * @param sex the value for outside_member.sex
     *
     * @mbggenerated
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outside_member.birthday
     *
     * @return the value of outside_member.birthday
     *
     * @mbggenerated
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outside_member.birthday
     *
     * @param birthday the value for outside_member.birthday
     *
     * @mbggenerated
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outside_member.area
     *
     * @return the value of outside_member.area
     *
     * @mbggenerated
     */
    public String getArea() {
        return area;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outside_member.area
     *
     * @param area the value for outside_member.area
     *
     * @mbggenerated
     */
    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outside_member.school_name
     *
     * @return the value of outside_member.school_name
     *
     * @mbggenerated
     */
    public String getSchoolName() {
        return schoolName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outside_member.school_name
     *
     * @param schoolName the value for outside_member.school_name
     *
     * @mbggenerated
     */
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName == null ? null : schoolName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outside_member.intention_minformation
     *
     * @return the value of outside_member.intention_minformation
     *
     * @mbggenerated
     */
    public String getIntentionMinformation() {
        return intentionMinformation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outside_member.intention_minformation
     *
     * @param intentionMinformation the value for outside_member.intention_minformation
     *
     * @mbggenerated
     */
    public void setIntentionMinformation(String intentionMinformation) {
        this.intentionMinformation = intentionMinformation == null ? null : intentionMinformation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outside_member.year_of_study
     *
     * @return the value of outside_member.year_of_study
     *
     * @mbggenerated
     */
    public String getYearOfStudy() {
        return yearOfStudy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outside_member.year_of_study
     *
     * @param yearOfStudy the value for outside_member.year_of_study
     *
     * @mbggenerated
     */
    public void setYearOfStudy(String yearOfStudy) {
        this.yearOfStudy = yearOfStudy == null ? null : yearOfStudy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outside_member.home_address
     *
     * @return the value of outside_member.home_address
     *
     * @mbggenerated
     */
    public String getHomeAddress() {
        return homeAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outside_member.home_address
     *
     * @param homeAddress the value for outside_member.home_address
     *
     * @mbggenerated
     */
    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress == null ? null : homeAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outside_member.remark
     *
     * @return the value of outside_member.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outside_member.remark
     *
     * @param remark the value for outside_member.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outside_member.remark_one
     *
     * @return the value of outside_member.remark_one
     *
     * @mbggenerated
     */
    public String getRemarkOne() {
        return remarkOne;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outside_member.remark_one
     *
     * @param remarkOne the value for outside_member.remark_one
     *
     * @mbggenerated
     */
    public void setRemarkOne(String remarkOne) {
        this.remarkOne = remarkOne == null ? null : remarkOne.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outside_member.remark_two
     *
     * @return the value of outside_member.remark_two
     *
     * @mbggenerated
     */
    public String getRemarkTwo() {
        return remarkTwo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outside_member.remark_two
     *
     * @param remarkTwo the value for outside_member.remark_two
     *
     * @mbggenerated
     */
    public void setRemarkTwo(String remarkTwo) {
        this.remarkTwo = remarkTwo == null ? null : remarkTwo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outside_member.remark_three
     *
     * @return the value of outside_member.remark_three
     *
     * @mbggenerated
     */
    public String getRemarkThree() {
        return remarkThree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outside_member.remark_three
     *
     * @param remarkThree the value for outside_member.remark_three
     *
     * @mbggenerated
     */
    public void setRemarkThree(String remarkThree) {
        this.remarkThree = remarkThree == null ? null : remarkThree.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outside_member.create_time
     *
     * @return the value of outside_member.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outside_member.create_time
     *
     * @param createTime the value for outside_member.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outside_member.update_time
     *
     * @return the value of outside_member.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outside_member.update_time
     *
     * @param updateTime the value for outside_member.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outside_member.is_delete
     *
     * @return the value of outside_member.is_delete
     *
     * @mbggenerated
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outside_member.is_delete
     *
     * @param isDelete the value for outside_member.is_delete
     *
     * @mbggenerated
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}