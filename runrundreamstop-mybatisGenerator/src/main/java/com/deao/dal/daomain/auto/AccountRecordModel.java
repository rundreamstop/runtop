package com.deao.dal.daomain.auto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class AccountRecordModel implements Serializable {
    /**
     * 
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 用户表userid
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * 记录类型
     *
     * @mbggenerated
     */
    private String recordType;

    /**
     * 记录类型的值[I:入 O:出]
     *
     * @mbggenerated
     */
    private String recordTypeValues;

    /**
     * 业务类型
     *
     * @mbggenerated
     */
    private String businessType;

    /**
     * 业务类型的值[注册 生产志愿等]
     *
     * @mbggenerated
     */
    private String businessTypeValues;

    /**
     * 记录描述信息
     *
     * @mbggenerated
     */
    private String recordDescribe;

    /**
     * 记录时间
     *
     * @mbggenerated
     */
    private Date recordTime;

    /**
     * 积分变动数量
     *
     * @mbggenerated
     */
    private Integer scoreNumber;

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