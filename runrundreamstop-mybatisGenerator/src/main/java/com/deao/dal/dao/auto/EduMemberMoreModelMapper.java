package com.deao.dal.dao.auto;

import com.deao.dal.daomain.auto.EduMemberMoreModel;
import com.deao.dal.daomain.auto.EduMemberMoreModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduMemberMoreModelMapper {
    int countByExample(EduMemberMoreModelExample example);

    int deleteByExample(EduMemberMoreModelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EduMemberMoreModel record);

    int insertSelective(EduMemberMoreModel record);

    List<EduMemberMoreModel> selectByExample(EduMemberMoreModelExample example);

    EduMemberMoreModel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EduMemberMoreModel record, @Param("example") EduMemberMoreModelExample example);

    int updateByExample(@Param("record") EduMemberMoreModel record, @Param("example") EduMemberMoreModelExample example);

    int updateByPrimaryKeySelective(EduMemberMoreModel record);

    int updateByPrimaryKey(EduMemberMoreModel record);
}