package com.deao.dal.dao.auto;

import com.deao.dal.daomain.auto.ProxyTradeRecordModel;
import com.deao.dal.daomain.auto.ProxyTradeRecordModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProxyTradeRecordModelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table proxy_trade_record
     *
     * @mbggenerated
     */
    int countByExample(ProxyTradeRecordModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table proxy_trade_record
     *
     * @mbggenerated
     */
    int deleteByExample(ProxyTradeRecordModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table proxy_trade_record
     *
     * @mbggenerated
     */
    int insert(ProxyTradeRecordModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table proxy_trade_record
     *
     * @mbggenerated
     */
    int insertSelective(ProxyTradeRecordModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table proxy_trade_record
     *
     * @mbggenerated
     */
    List<ProxyTradeRecordModel> selectByExample(ProxyTradeRecordModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table proxy_trade_record
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ProxyTradeRecordModel record, @Param("example") ProxyTradeRecordModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table proxy_trade_record
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ProxyTradeRecordModel record, @Param("example") ProxyTradeRecordModelExample example);
}