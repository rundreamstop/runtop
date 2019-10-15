package com.deao.dal.dao.auto;

import com.deao.dal.daomain.auto.SystemImgConfigModel;
import com.deao.dal.daomain.auto.SystemImgConfigModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemImgConfigModelMapper {
    int countByExample(SystemImgConfigModelExample example);

    int deleteByExample(SystemImgConfigModelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SystemImgConfigModel record);

    int insertSelective(SystemImgConfigModel record);

    List<SystemImgConfigModel> selectByExample(SystemImgConfigModelExample example);

    SystemImgConfigModel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SystemImgConfigModel record, @Param("example") SystemImgConfigModelExample example);

    int updateByExample(@Param("record") SystemImgConfigModel record, @Param("example") SystemImgConfigModelExample example);

    int updateByPrimaryKeySelective(SystemImgConfigModel record);

    int updateByPrimaryKey(SystemImgConfigModel record);
}