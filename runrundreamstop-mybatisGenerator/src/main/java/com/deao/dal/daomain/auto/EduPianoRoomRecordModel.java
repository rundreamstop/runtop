package com.deao.dal.daomain.auto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class EduPianoRoomRecordModel implements Serializable {
    /**
     * id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 记录号
     *
     * @mbggenerated
     */
    private String recordNo;

    /**
     * 学号或者学工号
     *
     * @mbggenerated
     */
    private String stuId;

    /**
     * 琴房id
     *
     * @mbggenerated
     */
    private String pianoRoomId;

    /**
     * 预约时段id
     *
     * @mbggenerated
     */
    private String recordTimeId;

    /**
     * 同行人
     *
     * @mbggenerated
     */
    private String peer;

    /**
     * 预约日期
     *
     * @mbggenerated
     */
    private Date recordDate;

    /**
     * 预约状态
     *
     * @mbggenerated
     */
    private String recordStatus;

    /**
     * 预约状态的值
     *
     * @mbggenerated
     */
    private String recordStatusValues;

    /**
     * 开始时间
     *
     * @mbggenerated
     */
    private Date startTime;

    /**
     * 结束时间
     *
     * @mbggenerated
     */
    private Date endTime;

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