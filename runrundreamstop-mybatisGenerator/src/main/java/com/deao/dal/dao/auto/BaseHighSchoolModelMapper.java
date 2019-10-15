package com.deao.dal.dao.auto;

import com.deao.dal.daomain.auto.BaseHighSchoolModel;
import com.deao.dal.daomain.auto.BaseHighSchoolModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseHighSchoolModelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_high_school
     *
     * @mbggenerated
     */
    int countByExample(BaseHighSchoolModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_high_school
     *
     * @mbggenerated
     */
    int deleteByExample(BaseHighSchoolModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_high_school
     *
     * @mbggenerated
     */
    int insert(BaseHighSchoolModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_high_school
     *
     * @mbggenerated
     */
    int insertSelective(BaseHighSchoolModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_high_school
     *
     * @mbggenerated
     */
    List<BaseHighSchoolModel> selectByExample(BaseHighSchoolModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_high_school
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") BaseHighSchoolModel record, @Param("example") BaseHighSchoolModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_high_school
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") BaseHighSchoolModel record, @Param("example") BaseHighSchoolModelExample example);
}