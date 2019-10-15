package com.deao.dal.dao.auto;

import com.deao.dal.daomain.auto.SystemIntegrationConfig;
import com.deao.dal.daomain.auto.SystemIntegrationConfigExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SystemIntegrationConfigMapper {
    int countByExample(SystemIntegrationConfigExample example);

    int deleteByExample(SystemIntegrationConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SystemIntegrationConfig record);

    int insertSelective(SystemIntegrationConfig record);

    List<SystemIntegrationConfig> selectByExample(SystemIntegrationConfigExample example);

    SystemIntegrationConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SystemIntegrationConfig record, @Param("example") SystemIntegrationConfigExample example);

    int updateByExample(@Param("record") SystemIntegrationConfig record, @Param("example") SystemIntegrationConfigExample example);

    int updateByPrimaryKeySelective(SystemIntegrationConfig record);

    int updateByPrimaryKey(SystemIntegrationConfig record);
}