package com.deao.dal.dao.auto;

import com.deao.dal.daomain.auto.EduMemberWechatModel;
import com.deao.dal.daomain.auto.EduMemberWechatModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduMemberWechatModelMapper {
    int countByExample(EduMemberWechatModelExample example);

    int deleteByExample(EduMemberWechatModelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EduMemberWechatModel record);

    int insertSelective(EduMemberWechatModel record);

    List<EduMemberWechatModel> selectByExample(EduMemberWechatModelExample example);

    EduMemberWechatModel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EduMemberWechatModel record, @Param("example") EduMemberWechatModelExample example);

    int updateByExample(@Param("record") EduMemberWechatModel record, @Param("example") EduMemberWechatModelExample example);

    int updateByPrimaryKeySelective(EduMemberWechatModel record);

    int updateByPrimaryKey(EduMemberWechatModel record);
}