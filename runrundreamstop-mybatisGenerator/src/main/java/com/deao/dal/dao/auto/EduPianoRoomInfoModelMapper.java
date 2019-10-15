package com.deao.dal.dao.auto;

import com.deao.dal.daomain.auto.EduPianoRoomInfoModel;
import com.deao.dal.daomain.auto.EduPianoRoomInfoModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduPianoRoomInfoModelMapper {
    int countByExample(EduPianoRoomInfoModelExample example);

    int deleteByExample(EduPianoRoomInfoModelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EduPianoRoomInfoModel record);

    int insertSelective(EduPianoRoomInfoModel record);

    List<EduPianoRoomInfoModel> selectByExample(EduPianoRoomInfoModelExample example);

    EduPianoRoomInfoModel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EduPianoRoomInfoModel record, @Param("example") EduPianoRoomInfoModelExample example);

    int updateByExample(@Param("record") EduPianoRoomInfoModel record, @Param("example") EduPianoRoomInfoModelExample example);

    int updateByPrimaryKeySelective(EduPianoRoomInfoModel record);

    int updateByPrimaryKey(EduPianoRoomInfoModel record);
}