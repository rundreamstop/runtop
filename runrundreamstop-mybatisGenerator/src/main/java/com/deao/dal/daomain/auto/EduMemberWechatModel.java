package com.deao.dal.daomain.auto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class EduMemberWechatModel implements Serializable {
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