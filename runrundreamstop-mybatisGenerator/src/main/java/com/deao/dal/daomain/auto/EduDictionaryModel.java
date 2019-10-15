package com.deao.dal.daomain.auto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class EduDictionaryModel implements Serializable {
    /**
     * 
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 字典类型
     *
     * @mbggenerated
     */
    private String dictionaryType;

    /**
     * 字典类型值
     *
     * @mbggenerated
     */
    private String dictionaryTypeValues;

    /**
     * key code
     *
     * @mbggenerated
     */
    private String keyCode;

    /**
     * key values
     *
     * @mbggenerated
     */
    private String keyValues;

    /**
     * 排序值
     *
     * @mbggenerated
     */
    private String sort;

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