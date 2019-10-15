package com.deao.dal.dao.auto;

import com.deao.dal.daomain.auto.EduMemberBankModel;
import com.deao.dal.daomain.auto.EduMemberBankModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduMemberBankModelMapper {
    int countByExample(EduMemberBankModelExample example);

    int deleteByExample(EduMemberBankModelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EduMemberBankModel record);

    int insertSelective(EduMemberBankModel record);

    List<EduMemberBankModel> selectByExample(EduMemberBankModelExample example);

    EduMemberBankModel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EduMemberBankModel record, @Param("example") EduMemberBankModelExample example);

    int updateByExample(@Param("record") EduMemberBankModel record, @Param("example") EduMemberBankModelExample example);

    int updateByPrimaryKeySelective(EduMemberBankModel record);

    int updateByPrimaryKey(EduMemberBankModel record);
}