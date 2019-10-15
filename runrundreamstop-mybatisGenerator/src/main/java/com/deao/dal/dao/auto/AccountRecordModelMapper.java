package com.deao.dal.dao.auto;

import com.deao.dal.daomain.auto.AccountRecordModel;
import com.deao.dal.daomain.auto.AccountRecordModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountRecordModelMapper {
    int countByExample(AccountRecordModelExample example);

    int deleteByExample(AccountRecordModelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AccountRecordModel record);

    int insertSelective(AccountRecordModel record);

    List<AccountRecordModel> selectByExample(AccountRecordModelExample example);

    AccountRecordModel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AccountRecordModel record, @Param("example") AccountRecordModelExample example);

    int updateByExample(@Param("record") AccountRecordModel record, @Param("example") AccountRecordModelExample example);

    int updateByPrimaryKeySelective(AccountRecordModel record);

    int updateByPrimaryKey(AccountRecordModel record);
}