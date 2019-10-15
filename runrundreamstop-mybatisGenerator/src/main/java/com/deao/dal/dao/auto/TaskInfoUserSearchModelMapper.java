package com.deao.dal.dao.auto;

import com.deao.dal.daomain.auto.TaskInfoUserSearchModel;
import com.deao.dal.daomain.auto.TaskInfoUserSearchModelExample;
import com.deao.dal.daomain.auto.TaskInfoUserSearchModelWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskInfoUserSearchModelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_info_user_search
     *
     * @mbggenerated
     */
    int countByExample(TaskInfoUserSearchModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_info_user_search
     *
     * @mbggenerated
     */
    int deleteByExample(TaskInfoUserSearchModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_info_user_search
     *
     * @mbggenerated
     */
    int insert(TaskInfoUserSearchModelWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_info_user_search
     *
     * @mbggenerated
     */
    int insertSelective(TaskInfoUserSearchModelWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_info_user_search
     *
     * @mbggenerated
     */
    List<TaskInfoUserSearchModelWithBLOBs> selectByExampleWithBLOBs(TaskInfoUserSearchModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_info_user_search
     *
     * @mbggenerated
     */
    List<TaskInfoUserSearchModel> selectByExample(TaskInfoUserSearchModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_info_user_search
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TaskInfoUserSearchModelWithBLOBs record, @Param("example") TaskInfoUserSearchModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_info_user_search
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") TaskInfoUserSearchModelWithBLOBs record, @Param("example") TaskInfoUserSearchModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_info_user_search
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TaskInfoUserSearchModel record, @Param("example") TaskInfoUserSearchModelExample example);
}