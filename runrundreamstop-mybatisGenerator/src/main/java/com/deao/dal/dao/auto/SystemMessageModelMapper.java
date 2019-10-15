package com.deao.dal.dao.auto;

import com.deao.dal.daomain.auto.SystemMessageModel;
import com.deao.dal.daomain.auto.SystemMessageModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemMessageModelMapper {
    int countByExample(SystemMessageModelExample example);

    int deleteByExample(SystemMessageModelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SystemMessageModel record);

    int insertSelective(SystemMessageModel record);

    List<SystemMessageModel> selectByExample(SystemMessageModelExample example);

    SystemMessageModel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SystemMessageModel record, @Param("example") SystemMessageModelExample example);

    int updateByExample(@Param("record") SystemMessageModel record, @Param("example") SystemMessageModelExample example);

    int updateByPrimaryKeySelective(SystemMessageModel record);

    int updateByPrimaryKey(SystemMessageModel record);
}