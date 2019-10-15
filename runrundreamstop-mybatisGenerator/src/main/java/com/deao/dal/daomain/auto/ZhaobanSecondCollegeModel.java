package com.deao.dal.daomain.auto;

import java.util.Date;

public class ZhaobanSecondCollegeModel {
    /**
     * 
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 二级学院名
     *
     * @mbggenerated
     */
    private String secondCollege;

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

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zhaoban_second_college.id
     *
     * @return the value of zhaoban_second_college.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zhaoban_second_college.id
     *
     * @param id the value for zhaoban_second_college.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zhaoban_second_college.second_college
     *
     * @return the value of zhaoban_second_college.second_college
     *
     * @mbggenerated
     */
    public String getSecondCollege() {
        return secondCollege;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zhaoban_second_college.second_college
     *
     * @param secondCollege the value for zhaoban_second_college.second_college
     *
     * @mbggenerated
     */
    public void setSecondCollege(String secondCollege) {
        this.secondCollege = secondCollege == null ? null : secondCollege.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zhaoban_second_college.remark
     *
     * @return the value of zhaoban_second_college.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zhaoban_second_college.remark
     *
     * @param remark the value for zhaoban_second_college.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zhaoban_second_college.remark_extend
     *
     * @return the value of zhaoban_second_college.remark_extend
     *
     * @mbggenerated
     */
    public String getRemarkExtend() {
        return remarkExtend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zhaoban_second_college.remark_extend
     *
     * @param remarkExtend the value for zhaoban_second_college.remark_extend
     *
     * @mbggenerated
     */
    public void setRemarkExtend(String remarkExtend) {
        this.remarkExtend = remarkExtend == null ? null : remarkExtend.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zhaoban_second_college.create_time
     *
     * @return the value of zhaoban_second_college.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zhaoban_second_college.create_time
     *
     * @param createTime the value for zhaoban_second_college.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zhaoban_second_college.update_time
     *
     * @return the value of zhaoban_second_college.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zhaoban_second_college.update_time
     *
     * @param updateTime the value for zhaoban_second_college.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zhaoban_second_college.is_delete
     *
     * @return the value of zhaoban_second_college.is_delete
     *
     * @mbggenerated
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zhaoban_second_college.is_delete
     *
     * @param isDelete the value for zhaoban_second_college.is_delete
     *
     * @mbggenerated
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}