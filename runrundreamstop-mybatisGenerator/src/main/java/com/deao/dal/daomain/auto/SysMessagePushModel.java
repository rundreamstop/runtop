package com.deao.dal.daomain.auto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class SysMessagePushModel implements Serializable {
    /**
     * 主键id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 消息类型
     *
     * @mbggenerated
     */
    private String messageType;

    /**
     * 消息类型的值
     *
     * @mbggenerated
     */
    private String messageTypeValues;

    /**
     * 通知的用户id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * 模板id
     *
     * @mbggenerated
     */
    private String templateId;

    /**
     * 内容
     *
     * @mbggenerated
     */
    private String content;

    /**
     * 关联记录id
     *
     * @mbggenerated
     */
    private String relationId;

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