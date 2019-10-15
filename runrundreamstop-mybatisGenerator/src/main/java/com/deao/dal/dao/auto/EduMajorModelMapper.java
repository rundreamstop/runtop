package com.deao.dal.dao.auto;

import com.deao.dal.daomain.auto.EduMajorModel;
import com.deao.dal.daomain.auto.EduMajorModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduMajorModelMapper {
    int countByExample(EduMajorModelExample example);

    int deleteByExample(EduMajorModelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EduMajorModel record);

    int insertSelective(EduMajorModel record);

    List<EduMajorModel> selectByExample(EduMajorModelExample example);

    EduMajorModel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EduMajorModel record, @Param("example") EduMajorModelExample example);

    int updateByExample(@Param("record") EduMajorModel record, @Param("example") EduMajorModelExample example);

    int updateByPrimaryKeySelective(EduMajorModel record);

    int updateByPrimaryKey(EduMajorModel record);
}