package mybatisGenerator.com.dao;

import java.util.List;
import mybatisGenerator.com.model.GenealogyModel;
import mybatisGenerator.com.model.GenealogyModelExample;
import org.apache.ibatis.annotations.Param;

public interface GenealogyModelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_genealogy
     *
     * @mbggenerated
     */
    int countByExample(GenealogyModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_genealogy
     *
     * @mbggenerated
     */
    int deleteByExample(GenealogyModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_genealogy
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long gid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_genealogy
     *
     * @mbggenerated
     */
    int insert(GenealogyModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_genealogy
     *
     * @mbggenerated
     */
    int insertSelective(GenealogyModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_genealogy
     *
     * @mbggenerated
     */
    List<GenealogyModel> selectByExample(GenealogyModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_genealogy
     *
     * @mbggenerated
     */
    GenealogyModel selectByPrimaryKey(Long gid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_genealogy
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") GenealogyModel record, @Param("example") GenealogyModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_genealogy
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") GenealogyModel record, @Param("example") GenealogyModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_genealogy
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(GenealogyModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_genealogy
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(GenealogyModel record);
}