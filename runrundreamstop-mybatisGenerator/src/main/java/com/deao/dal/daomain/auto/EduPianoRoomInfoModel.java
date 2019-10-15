package com.deao.dal.daomain.auto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class EduPianoRoomInfoModel implements Serializable {
    /**
     * id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 房间号
     *
     * @mbggenerated
     */
    private String pianoRoomNo;

    /**
     * 房间状态
     *
     * @mbggenerated
     */
    private String pianoRoomStatus;

    /**
     * 房间状态的值
     *
     * @mbggenerated
     */
    private String pianoRoomStatusValues;

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