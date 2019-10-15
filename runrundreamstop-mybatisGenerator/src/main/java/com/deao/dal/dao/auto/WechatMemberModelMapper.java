package com.deao.dal.dao.auto;

import com.deao.dal.daomain.auto.WechatMemberModel;
import com.deao.dal.daomain.auto.WechatMemberModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WechatMemberModelMapper {
    int countByExample(WechatMemberModelExample example);

    int deleteByExample(WechatMemberModelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WechatMemberModel record);

    int insertSelective(WechatMemberModel record);

    List<WechatMemberModel> selectByExample(WechatMemberModelExample example);

    WechatMemberModel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WechatMemberModel record, @Param("example") WechatMemberModelExample example);

    int updateByExample(@Param("record") WechatMemberModel record, @Param("example") WechatMemberModelExample example);

    int updateByPrimaryKeySelective(WechatMemberModel record);

    int updateByPrimaryKey(WechatMemberModel record);
}