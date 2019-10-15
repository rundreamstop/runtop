package com.deao.dal.dao.auto;

import com.deao.dal.daomain.auto.EduMemberModel;
import com.deao.dal.daomain.auto.EduMemberModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduMemberModelMapper {
    int countByExample(EduMemberModelExample example);

    int deleteByExample(EduMemberModelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EduMemberModel record);

    int insertSelective(EduMemberModel record);

    List<EduMemberModel> selectByExample(EduMemberModelExample example);

    EduMemberModel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EduMemberModel record, @Param("example") EduMemberModelExample example);

    int updateByExample(@Param("record") EduMemberModel record, @Param("example") EduMemberModelExample example);

    int updateByPrimaryKeySelective(EduMemberModel record);

    int updateByPrimaryKey(EduMemberModel record);
}