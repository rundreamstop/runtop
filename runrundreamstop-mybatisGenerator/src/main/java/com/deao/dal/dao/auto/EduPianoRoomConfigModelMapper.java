package com.deao.dal.dao.auto;

import com.deao.dal.daomain.auto.EduPianoRoomConfigModel;
import com.deao.dal.daomain.auto.EduPianoRoomConfigModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduPianoRoomConfigModelMapper {
    int countByExample(EduPianoRoomConfigModelExample example);

    int deleteByExample(EduPianoRoomConfigModelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EduPianoRoomConfigModel record);

    int insertSelective(EduPianoRoomConfigModel record);

    List<EduPianoRoomConfigModel> selectByExample(EduPianoRoomConfigModelExample example);

    EduPianoRoomConfigModel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EduPianoRoomConfigModel record, @Param("example") EduPianoRoomConfigModelExample example);

    int updateByExample(@Param("record") EduPianoRoomConfigModel record, @Param("example") EduPianoRoomConfigModelExample example);

    int updateByPrimaryKeySelective(EduPianoRoomConfigModel record);

    int updateByPrimaryKey(EduPianoRoomConfigModel record);
}