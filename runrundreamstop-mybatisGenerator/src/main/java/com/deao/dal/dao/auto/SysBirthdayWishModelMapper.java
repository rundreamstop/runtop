package com.deao.dal.dao.auto;

import com.deao.dal.daomain.auto.SysBirthdayWishModel;
import com.deao.dal.daomain.auto.SysBirthdayWishModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysBirthdayWishModelMapper {
    int countByExample(SysBirthdayWishModelExample example);

    int deleteByExample(SysBirthdayWishModelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysBirthdayWishModel record);

    int insertSelective(SysBirthdayWishModel record);

    List<SysBirthdayWishModel> selectByExample(SysBirthdayWishModelExample example);

    SysBirthdayWishModel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysBirthdayWishModel record, @Param("example") SysBirthdayWishModelExample example);

    int updateByExample(@Param("record") SysBirthdayWishModel record, @Param("example") SysBirthdayWishModelExample example);

    int updateByPrimaryKeySelective(SysBirthdayWishModel record);

    int updateByPrimaryKey(SysBirthdayWishModel record);
}