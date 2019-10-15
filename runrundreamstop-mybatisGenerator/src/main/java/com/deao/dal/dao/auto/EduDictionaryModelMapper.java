package com.deao.dal.dao.auto;

import com.deao.dal.daomain.auto.EduDictionaryModel;
import com.deao.dal.daomain.auto.EduDictionaryModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduDictionaryModelMapper {
    int countByExample(EduDictionaryModelExample example);

    int deleteByExample(EduDictionaryModelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EduDictionaryModel record);

    int insertSelective(EduDictionaryModel record);

    List<EduDictionaryModel> selectByExample(EduDictionaryModelExample example);

    EduDictionaryModel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EduDictionaryModel record, @Param("example") EduDictionaryModelExample example);

    int updateByExample(@Param("record") EduDictionaryModel record, @Param("example") EduDictionaryModelExample example);

    int updateByPrimaryKeySelective(EduDictionaryModel record);

    int updateByPrimaryKey(EduDictionaryModel record);
}