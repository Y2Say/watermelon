package com.yj2.watermelon.mapper;

import com.yj2.watermelon.entity.WatermelonProjectAuthNode;
import com.yj2.watermelon.entity.WatermelonProjectAuthNodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WatermelonProjectAuthNodeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_project_auth_node
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    long countByExample(WatermelonProjectAuthNodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_project_auth_node
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    int deleteByExample(WatermelonProjectAuthNodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_project_auth_node
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_project_auth_node
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    int insert(WatermelonProjectAuthNode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_project_auth_node
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    int insertSelective(WatermelonProjectAuthNode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_project_auth_node
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    List<WatermelonProjectAuthNode> selectByExample(WatermelonProjectAuthNodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_project_auth_node
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    WatermelonProjectAuthNode selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_project_auth_node
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    int updateByExampleSelective(@Param("record") WatermelonProjectAuthNode record, @Param("example") WatermelonProjectAuthNodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_project_auth_node
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    int updateByExample(@Param("record") WatermelonProjectAuthNode record, @Param("example") WatermelonProjectAuthNodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_project_auth_node
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    int updateByPrimaryKeySelective(WatermelonProjectAuthNode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_project_auth_node
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    int updateByPrimaryKey(WatermelonProjectAuthNode record);
}