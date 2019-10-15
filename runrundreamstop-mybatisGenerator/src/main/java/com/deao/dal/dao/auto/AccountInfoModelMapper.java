package com.deao.dal.dao.auto;

import com.deao.dal.daomain.auto.AccountInfoModel;
import com.deao.dal.daomain.auto.AccountInfoModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountInfoModelMapper {
    int countByExample(AccountInfoModelExample example);

    int deleteByExample(AccountInfoModelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AccountInfoModel record);

    int insertSelective(AccountInfoModel record);

    List<AccountInfoModel> selectByExample(AccountInfoModelExample example);

    AccountInfoModel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AccountInfoModel record, @Param("example") AccountInfoModelExample example);

    int updateByExample(@Param("record") AccountInfoModel record, @Param("example") AccountInfoModelExample example);

    int updateByPrimaryKeySelective(AccountInfoModel record);

    int updateByPrimaryKey(AccountInfoModel record);
}