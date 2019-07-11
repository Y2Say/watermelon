package com.yj2.watermelon.mapper;

import com.yj2.watermelon.entity.WatermelonProjectNode;
import com.yj2.watermelon.entity.WatermelonProjectNodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WatermelonProjectNodeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_project_node
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    long countByExample(WatermelonProjectNodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_project_node
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    int deleteByExample(WatermelonProjectNodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_project_node
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_project_node
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    int insert(WatermelonProjectNode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_project_node
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    int insertSelective(WatermelonProjectNode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_project_node
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    List<WatermelonProjectNode> selectByExample(WatermelonProjectNodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_project_node
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    WatermelonProjectNode selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_project_node
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    int updateByExampleSelective(@Param("record") WatermelonProjectNode record, @Param("example") WatermelonProjectNodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_project_node
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    int updateByExample(@Param("record") WatermelonProjectNode record, @Param("example") WatermelonProjectNodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_project_node
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    int updateByPrimaryKeySelective(WatermelonProjectNode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_project_node
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    int updateByPrimaryKey(WatermelonProjectNode record);
}