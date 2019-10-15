package com.deao.dal.dao.auto;

import com.deao.dal.daomain.auto.EduCourseResourcesModel;
import com.deao.dal.daomain.auto.EduCourseResourcesModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduCourseResourcesModelMapper {
    int countByExample(EduCourseResourcesModelExample example);

    int deleteByExample(EduCourseResourcesModelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EduCourseResourcesModel record);

    int insertSelective(EduCourseResourcesModel record);

    List<EduCourseResourcesModel> selectByExample(EduCourseResourcesModelExample example);

    EduCourseResourcesModel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EduCourseResourcesModel record, @Param("example") EduCourseResourcesModelExample example);

    int updateByExample(@Param("record") EduCourseResourcesModel record, @Param("example") EduCourseResourcesModelExample example);

    int updateByPrimaryKeySelective(EduCourseResourcesModel record);

    int updateByPrimaryKey(EduCourseResourcesModel record);
}