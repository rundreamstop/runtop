package com.deao.dal.daomain.auto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class SystemMessageModel implements Serializable {
    /**
     * 
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 来源系统
     *
     * @mbggenerated
     */
    private String channel;

    /**
     * 来源系统的值[官网、移动端、其他]
     *
     * @mbggenerated
     */
    private String channelValues;

    /**
     * 名字
     *
     * @mbggenerated
     */
    private String name;

    /**
     * 学校名字
     *
     * @mbggenerated
     */
    private String schoolName;

    /**
     * 职务
     *
     * @mbggenerated
     */
    private String job;

    /**
     * 电话
     *
     * @mbggenerated
     */
    private String phone;

    /**
     * 邮箱
     *
     * @mbggenerated
     */
    private String email;

    /**
     * QQ
     *
     * @mbggenerated
     */
    private String qq;

    /**
     * 意见
     *
     * @mbggenerated
     */
    private String opinion;

    /**
     * 留言时间
     *
     * @mbggenerated
     */
    private Date msgTime;

    /**
     * 学号
     *
     * @mbggenerated
     */
    private String stuId;

    /**
     * 留言状态
     *
     * @mbggenerated
     */
    private String msgStatus;

    /**
     * 留言状态的值
     *
     * @mbggenerated
     */
    private String msgStatusValues;

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