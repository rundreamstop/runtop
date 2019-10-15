package com.deao.dal.daomain.auto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class AccountInfoModel implements Serializable {
    /**
     *
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 积分账户id
     *
     * @mbggenerated
     */
    private String accountId;

    /**
     * 积分账户状态
     *
     * @mbggenerated
     */
    private String accountStatus;

    /**
     * 积分账户状态值
     *
     * @mbggenerated
     */
    private String accountStatusValues;

    /**
     * 用户表userid
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * 总积分
     *
     * @mbggenerated
     */
    private Integer totalScore;

    /**
     * 冻结积分
     *
     * @mbggenerated
     */
    private Integer frozenScore;

    /**
     * 正常可用积分
     *
     * @mbggenerated
     */
    private Integer normalScore;

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