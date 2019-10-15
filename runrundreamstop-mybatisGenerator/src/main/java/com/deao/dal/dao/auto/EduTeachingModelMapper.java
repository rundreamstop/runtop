package com.deao.dal.dao.auto;

import com.deao.dal.daomain.auto.EduTeachingModel;
import com.deao.dal.daomain.auto.EduTeachingModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduTeachingModelMapper {
    int countByExample(EduTeachingModelExample example);

    int deleteByExample(EduTeachingModelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EduTeachingModel record);

    int insertSelective(EduTeachingModel record);

    List<EduTeachingModel> selectByExample(EduTeachingModelExample example);

    EduTeachingModel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EduTeachingModel record, @Param("example") EduTeachingModelExample example);

    int updateByExample(@Param("record") EduTeachingModel record, @Param("example") EduTeachingModelExample example);

    int updateByPrimaryKeySelective(EduTeachingModel record);

    int updateByPrimaryKey(EduTeachingModel record);
}