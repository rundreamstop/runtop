package com.deao.dal.dao.auto;

import com.deao.dal.daomain.auto.SysMessagePushModel;
import com.deao.dal.daomain.auto.SysMessagePushModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysMessagePushModelMapper {
    int countByExample(SysMessagePushModelExample example);

    int deleteByExample(SysMessagePushModelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysMessagePushModel record);

    int insertSelective(SysMessagePushModel record);

    List<SysMessagePushModel> selectByExample(SysMessagePushModelExample example);

    SysMessagePushModel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysMessagePushModel record, @Param("example") SysMessagePushModelExample example);

    int updateByExample(@Param("record") SysMessagePushModel record, @Param("example") SysMessagePushModelExample example);

    int updateByPrimaryKeySelective(SysMessagePushModel record);

    int updateByPrimaryKey(SysMessagePushModel record);
}