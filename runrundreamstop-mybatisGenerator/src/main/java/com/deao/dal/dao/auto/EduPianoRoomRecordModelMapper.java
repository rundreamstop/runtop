package com.deao.dal.dao.auto;

import com.deao.dal.daomain.auto.EduPianoRoomRecordModel;
import com.deao.dal.daomain.auto.EduPianoRoomRecordModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduPianoRoomRecordModelMapper {
    int countByExample(EduPianoRoomRecordModelExample example);

    int deleteByExample(EduPianoRoomRecordModelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EduPianoRoomRecordModel record);

    int insertSelective(EduPianoRoomRecordModel record);

    List<EduPianoRoomRecordModel> selectByExample(EduPianoRoomRecordModelExample example);

    EduPianoRoomRecordModel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EduPianoRoomRecordModel record, @Param("example") EduPianoRoomRecordModelExample example);

    int updateByExample(@Param("record") EduPianoRoomRecordModel record, @Param("example") EduPianoRoomRecordModelExample example);

    int updateByPrimaryKeySelective(EduPianoRoomRecordModel record);

    int updateByPrimaryKey(EduPianoRoomRecordModel record);
}