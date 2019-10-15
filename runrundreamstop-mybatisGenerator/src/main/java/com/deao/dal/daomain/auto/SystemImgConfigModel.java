package com.deao.dal.daomain.auto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class SystemImgConfigModel implements Serializable {
    /**
     * 
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 图片描述
     *
     * @mbggenerated
     */
    private String imgDescribe;

    /**
     * 图片类型
     *
     * @mbggenerated
     */
    private String imgType;

    /**
     * 图片类型的值
     *
     * @mbggenerated
     */
    private String imgTypeValues;

    /**
     * 图片访问url
     *
     * @mbggenerated
     */
    private String imgUrl;

    /**
     * 跳转url
     *
     * @mbggenerated
     */
    private String toUrl;

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