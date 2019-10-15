package com.deao.dal.daomain.auto;

import java.math.BigDecimal;
import java.util.Date;

public class SchoolMajorCardInfoModel {
    /**
     * id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 学校id
     *
     * @mbggenerated
     */
    private String schoolId;

    /**
     * 学校名称
     *
     * @mbggenerated
     */
    private String schoolName;

    /**
     * 专业代码
     *
     * @mbggenerated
     */
    private String majorCode;

    /**
     * 专业id
     *
     * @mbggenerated
     */
    private Integer majorId;

    /**
     * 专业名称
     *
     * @mbggenerated
     */
    private String majorName;

    /**
     * 专业搜索次数
     *
     * @mbggenerated
     */
    private Integer majorSearchNumber;

    /**
     * 招生计划人数
     *
     * @mbggenerated
     */
    private Integer recruitPlanNumber;

    /**
     * 填报人数
     *
     * @mbggenerated
     */
    private Integer fillInNumber;

    /**
     * 填报中的第一名分数
     *
     * @mbggenerated
     */
    private BigDecimal firstPlaceScore;

    /**
     * 填报中的最后一名分数
     *
     * @mbggenerated
     */
    private BigDecimal lastPlaceScore;

    /**
     * 底牌类型[模拟底牌，真实底牌]
     *
     * @mbggenerated
     */
    private String cardType;

    /**
     * 底牌类型的值
     *
     * @mbggenerated
     */
    private String cardTypeValue;

    /**
     * 年份（当前年）
     *
     * @mbggenerated
     */
    private String year;

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
     * 0未删除 1已删除
     *
     * @mbggenerated
     */
    private Integer isDelete;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column school_major_card_info.id
     *
     * @return the value of school_major_card_info.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column school_major_card_info.id
     *
     * @param id the value for school_major_card_info.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column school_major_card_info.school_id
     *
     * @return the value of school_major_card_info.school_id
     *
     * @mbggenerated
     */
    public String getSchoolId() {
        return schoolId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column school_major_card_info.school_id
     *
     * @param schoolId the value for school_major_card_info.school_id
     *
     * @mbggenerated
     */
    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId == null ? null : schoolId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column school_major_card_info.school_name
     *
     * @return the value of school_major_card_info.school_name
     *
     * @mbggenerated
     */
    public String getSchoolName() {
        return schoolName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column school_major_card_info.school_name
     *
     * @param schoolName the value for school_major_card_info.school_name
     *
     * @mbggenerated
     */
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName == null ? null : schoolName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column school_major_card_info.major_code
     *
     * @return the value of school_major_card_info.major_code
     *
     * @mbggenerated
     */
    public String getMajorCode() {
        return majorCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column school_major_card_info.major_code
     *
     * @param majorCode the value for school_major_card_info.major_code
     *
     * @mbggenerated
     */
    public void setMajorCode(String majorCode) {
        this.majorCode = majorCode == null ? null : majorCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column school_major_card_info.major_id
     *
     * @return the value of school_major_card_info.major_id
     *
     * @mbggenerated
     */
    public Integer getMajorId() {
        return majorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column school_major_card_info.major_id
     *
     * @param majorId the value for school_major_card_info.major_id
     *
     * @mbggenerated
     */
    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column school_major_card_info.major_name
     *
     * @return the value of school_major_card_info.major_name
     *
     * @mbggenerated
     */
    public String getMajorName() {
        return majorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column school_major_card_info.major_name
     *
     * @param majorName the value for school_major_card_info.major_name
     *
     * @mbggenerated
     */
    public void setMajorName(String majorName) {
        this.majorName = majorName == null ? null : majorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column school_major_card_info.major_search_number
     *
     * @return the value of school_major_card_info.major_search_number
     *
     * @mbggenerated
     */
    public Integer getMajorSearchNumber() {
        return majorSearchNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column school_major_card_info.major_search_number
     *
     * @param majorSearchNumber the value for school_major_card_info.major_search_number
     *
     * @mbggenerated
     */
    public void setMajorSearchNumber(Integer majorSearchNumber) {
        this.majorSearchNumber = majorSearchNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column school_major_card_info.recruit_plan_number
     *
     * @return the value of school_major_card_info.recruit_plan_number
     *
     * @mbggenerated
     */
    public Integer getRecruitPlanNumber() {
        return recruitPlanNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column school_major_card_info.recruit_plan_number
     *
     * @param recruitPlanNumber the value for school_major_card_info.recruit_plan_number
     *
     * @mbggenerated
     */
    public void setRecruitPlanNumber(Integer recruitPlanNumber) {
        this.recruitPlanNumber = recruitPlanNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column school_major_card_info.fill_in_number
     *
     * @return the value of school_major_card_info.fill_in_number
     *
     * @mbggenerated
     */
    public Integer getFillInNumber() {
        return fillInNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column school_major_card_info.fill_in_number
     *
     * @param fillInNumber the value for school_major_card_info.fill_in_number
     *
     * @mbggenerated
     */
    public void setFillInNumber(Integer fillInNumber) {
        this.fillInNumber = fillInNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column school_major_card_info.first_place_score
     *
     * @return the value of school_major_card_info.first_place_score
     *
     * @mbggenerated
     */
    public BigDecimal getFirstPlaceScore() {
        return firstPlaceScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column school_major_card_info.first_place_score
     *
     * @param firstPlaceScore the value for school_major_card_info.first_place_score
     *
     * @mbggenerated
     */
    public void setFirstPlaceScore(BigDecimal firstPlaceScore) {
        this.firstPlaceScore = firstPlaceScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column school_major_card_info.last_place_score
     *
     * @return the value of school_major_card_info.last_place_score
     *
     * @mbggenerated
     */
    public BigDecimal getLastPlaceScore() {
        return lastPlaceScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column school_major_card_info.last_place_score
     *
     * @param lastPlaceScore the value for school_major_card_info.last_place_score
     *
     * @mbggenerated
     */
    public void setLastPlaceScore(BigDecimal lastPlaceScore) {
        this.lastPlaceScore = lastPlaceScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column school_major_card_info.card_type
     *
     * @return the value of school_major_card_info.card_type
     *
     * @mbggenerated
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column school_major_card_info.card_type
     *
     * @param cardType the value for school_major_card_info.card_type
     *
     * @mbggenerated
     */
    public void setCardType(String cardType) {
        this.cardType = cardType == null ? null : cardType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column school_major_card_info.card_type_value
     *
     * @return the value of school_major_card_info.card_type_value
     *
     * @mbggenerated
     */
    public String getCardTypeValue() {
        return cardTypeValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column school_major_card_info.card_type_value
     *
     * @param cardTypeValue the value for school_major_card_info.card_type_value
     *
     * @mbggenerated
     */
    public void setCardTypeValue(String cardTypeValue) {
        this.cardTypeValue = cardTypeValue == null ? null : cardTypeValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column school_major_card_info.year
     *
     * @return the value of school_major_card_info.year
     *
     * @mbggenerated
     */
    public String getYear() {
        return year;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column school_major_card_info.year
     *
     * @param year the value for school_major_card_info.year
     *
     * @mbggenerated
     */
    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column school_major_card_info.remark
     *
     * @return the value of school_major_card_info.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column school_major_card_info.remark
     *
     * @param remark the value for school_major_card_info.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column school_major_card_info.remark_extend
     *
     * @return the value of school_major_card_info.remark_extend
     *
     * @mbggenerated
     */
    public String getRemarkExtend() {
        return remarkExtend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column school_major_card_info.remark_extend
     *
     * @param remarkExtend the value for school_major_card_info.remark_extend
     *
     * @mbggenerated
     */
    public void setRemarkExtend(String remarkExtend) {
        this.remarkExtend = remarkExtend == null ? null : remarkExtend.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column school_major_card_info.create_time
     *
     * @return the value of school_major_card_info.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column school_major_card_info.create_time
     *
     * @param createTime the value for school_major_card_info.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column school_major_card_info.update_time
     *
     * @return the value of school_major_card_info.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column school_major_card_info.update_time
     *
     * @param updateTime the value for school_major_card_info.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column school_major_card_info.is_delete
     *
     * @return the value of school_major_card_info.is_delete
     *
     * @mbggenerated
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column school_major_card_info.is_delete
     *
     * @param isDelete the value for school_major_card_info.is_delete
     *
     * @mbggenerated
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}