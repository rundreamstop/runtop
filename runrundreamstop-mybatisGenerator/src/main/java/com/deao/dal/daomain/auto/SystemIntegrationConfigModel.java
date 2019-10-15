package com.deao.dal.daomain.auto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class SystemIntegrationConfigModel implements Serializable {
    /**
     * 
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 积分配置类型
     *
     * @mbggenerated
     */
    private String integrationType;

    /**
     * 积分配置类型值
     *
     * @mbggenerated
     */
    private String integrationTypeValues;

    /**
     * 配置积分数量
     *
     * @mbggenerated
     */
    private Integer integrationNumber;

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