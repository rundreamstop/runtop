package com.deao.dal.daomain.auto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class OrderInfoModel implements Serializable {
    /**
     * 
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 订单号
     *
     * @mbggenerated
     */
    private String orderNo;

    /**
     * 订单志愿底牌编号
     *
     * @mbggenerated
     */
    private String orderCardNo;

    /**
     * 订单名字
     *
     * @mbggenerated
     */
    private String orderName;

    /**
     * 订单状态
     *
     * @mbggenerated
     */
    private String orderStatus;

    /**
     * 订单状态的值
     *
     * @mbggenerated
     */
    private String orderStatusValues;

    /**
     * 订单金额
     *
     * @mbggenerated
     */
    private BigDecimal orderAmount;

    /**
     * 支付金额
     *
     * @mbggenerated
     */
    private BigDecimal payAmount;

    /**
     * 本次消耗积分
     *
     * @mbggenerated
     */
    private Integer integrationNumber;

    /**
     * userId
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * 教育类型
     *
     * @mbggenerated
     */
    private String eduType;

    /**
     * 教育类型的值[普高/中职/未知]
     *
     * @mbggenerated
     */
    private String eduTypeValues;

    /**
     * 一级所属分类 / 学校id
     *
     * @mbggenerated
     */
    private Integer oneLevel;

    /**
     * 一级所属分类名字 / 学校名字
     *
     * @mbggenerated
     */
    private String oneLevelName;

    /**
     * 二级所属分类
     *
     * @mbggenerated
     */
    private Integer twoLevel;

    /**
     * 二级所属分类名字
     *
     * @mbggenerated
     */
    private String twoLevelName;

    /**
     * 三级所属分类
     *
     * @mbggenerated
     */
    private Integer threeLevel;

    /**
     * 三级所属分类名字
     *
     * @mbggenerated
     */
    private String threeLevelName;

    /**
     * 文化分数成绩
     *
     * @mbggenerated
     */
    private Integer cultureFraction;

    /**
     * 专业分数成绩
     *
     * @mbggenerated
     */
    private Integer majorFraction;

    /**
     * 解锁手机号
     *
     * @mbggenerated
     */
    private String inviteNumber;

    /**
     * 订单类型
     *
     * @mbggenerated
     */
    private String orderType;

    /**
     * 订单类型的值[志愿，咨询]
     *
     * @mbggenerated
     */
    private String orderTypeValues;

    /**
     * 学生姓名
     *
     * @mbggenerated
     */
    private String stuName;

    /**
     * 学生手机号
     *
     * @mbggenerated
     */
    private String stuTelphone;

    /**
     * 学生所在高中学校
     *
     * @mbggenerated
     */
    private String stuHighSchool;

    /**
     * 学生咨询的大学 改为 咨询用户userid
     *
     * @mbggenerated
     */
    private String consultSchool;

    /**
     * 咨询订单来源方式
     *
     * @mbggenerated
     */
    private String advisorySource;

    /**
     * 咨询订单来源方式的值
     *
     * @mbggenerated
     */
    private String advisorySourceValues;

    /**
     * 是否具有 模拟志愿底牌 查看权限
     *
     * @mbggenerated
     */
    private String isCard;

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