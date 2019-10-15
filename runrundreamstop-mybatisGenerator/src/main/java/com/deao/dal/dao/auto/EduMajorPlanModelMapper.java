package com.deao.dal.dao.auto;

import com.deao.dal.daomain.auto.EduMajorPlanModel;
import com.deao.dal.daomain.auto.EduMajorPlanModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduMajorPlanModelMapper {
    int countByExample(EduMajorPlanModelExample example);

    int deleteByExample(EduMajorPlanModelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EduMajorPlanModel record);

    int insertSelective(EduMajorPlanModel record);

    List<EduMajorPlanModel> selectByExample(EduMajorPlanModelExample example);

    EduMajorPlanModel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EduMajorPlanModel record, @Param("example") EduMajorPlanModelExample example);

    int updateByExample(@Param("record") EduMajorPlanModel record, @Param("example") EduMajorPlanModelExample example);

    int updateByPrimaryKeySelective(EduMajorPlanModel record);

    int updateByPrimaryKey(EduMajorPlanModel record);
}