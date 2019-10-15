package com.deao.dal.dao.auto;

import com.deao.dal.daomain.auto.OrderInfoModel;
import com.deao.dal.daomain.auto.OrderInfoModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderInfoModelMapper {
    int countByExample(OrderInfoModelExample example);

    int deleteByExample(OrderInfoModelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderInfoModel record);

    int insertSelective(OrderInfoModel record);

    List<OrderInfoModel> selectByExample(OrderInfoModelExample example);

    OrderInfoModel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderInfoModel record, @Param("example") OrderInfoModelExample example);

    int updateByExample(@Param("record") OrderInfoModel record, @Param("example") OrderInfoModelExample example);

    int updateByPrimaryKeySelective(OrderInfoModel record);

    int updateByPrimaryKey(OrderInfoModel record);
}