package com.deao.dal.dao.auto;

import com.deao.dal.daomain.auto.SystemIntegrationConfigModel;
import com.deao.dal.daomain.auto.SystemIntegrationConfigModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemIntegrationConfigModelMapper {
    int countByExample(SystemIntegrationConfigModelExample example);

    int deleteByExample(SystemIntegrationConfigModelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SystemIntegrationConfigModel record);

    int insertSelective(SystemIntegrationConfigModel record);

    List<SystemIntegrationConfigModel> selectByExample(SystemIntegrationConfigModelExample example);

    SystemIntegrationConfigModel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SystemIntegrationConfigModel record, @Param("example") SystemIntegrationConfigModelExample example);

    int updateByExample(@Param("record") SystemIntegrationConfigModel record, @Param("example") SystemIntegrationConfigModelExample example);

    int updateByPrimaryKeySelective(SystemIntegrationConfigModel record);

    int updateByPrimaryKey(SystemIntegrationConfigModel record);
}