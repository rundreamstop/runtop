package com.deao.dal.dao.auto;

import com.deao.dal.daomain.auto.OrderDetailModel;
import com.deao.dal.daomain.auto.OrderDetailModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderDetailModelMapper {
    int countByExample(OrderDetailModelExample example);

    int deleteByExample(OrderDetailModelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderDetailModel record);

    int insertSelective(OrderDetailModel record);

    List<OrderDetailModel> selectByExample(OrderDetailModelExample example);

    OrderDetailModel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderDetailModel record, @Param("example") OrderDetailModelExample example);

    int updateByExample(@Param("record") OrderDetailModel record, @Param("example") OrderDetailModelExample example);

    int updateByPrimaryKeySelective(OrderDetailModel record);

    int updateByPrimaryKey(OrderDetailModel record);
}