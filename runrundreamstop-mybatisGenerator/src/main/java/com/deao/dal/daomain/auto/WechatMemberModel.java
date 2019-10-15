package com.deao.dal.daomain.auto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class WechatMemberModel implements Serializable {
    /**
     * 
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * userId
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * 绑定的手机号码
     *
     * @mbggenerated
     */
    private String bindingPhone;

    /**
     * 用户的唯一标识
     *
     * @mbggenerated
     */
    private String openid;

    /**
     * unionid
     *
     * @mbggenerated
     */
    private String unionid;

    /**
     * 用户昵称
     *
     * @mbggenerated
     */
    private String nickname;

    /**
     * 真实名字
     *
     * @mbggenerated
     */
    private String realname;

    /**
     * 用户的性别
     *
     * @mbggenerated
     */
    private String sex;

    /**
     * 用户头像
     *
     * @mbggenerated
     */
    private String headimgurl;

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
     * 省
     *
     * @mbggenerated
     */
    private String province;

    /**
     * 市
     *
     * @mbggenerated
     */
    private String city;

    /**
     * 角色
     *
     * @mbggenerated
     */
    private String role;

    /**
     * 角色的值
     *
     * @mbggenerated
     */
    private String roleValues;

    /**
     * 学校id
     *
     * @mbggenerated
     */
    private String schoolId;

    /**
     * 学校名字
     *
     * @mbggenerated
     */
    private String schoolName;

    /**
     * 归属服务号
     *
     * @mbggenerated
     */
    private String serviceNumber;

    /**
     * 归属服务号的值
     *
     * @mbggenerated
     */
    private String serviceNumberValues;

    /**
     * 代理id
     *
     * @mbggenerated
     */
    private String proxyId;

    /**
     * 代理名
     *
     * @mbggenerated
     */
    private String proxyName;

    /**
     * 用户真实分数
     *
     * @mbggenerated
     */
    private BigDecimal trueScore;

    /**
     * 积分账户id
     *
     * @mbggenerated
     */
    private String accountId;

    /**
     * 邀请人userid
     *
     * @mbggenerated
     */
    private String inviteUserId;

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