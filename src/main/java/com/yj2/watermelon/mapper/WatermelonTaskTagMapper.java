package com.yj2.watermelon.mapper;

import com.yj2.watermelon.entity.WatermelonTaskTag;
import com.yj2.watermelon.entity.WatermelonTaskTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WatermelonTaskTagMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_task_tag
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    long countByExample(WatermelonTaskTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_task_tag
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    int deleteByExample(WatermelonTaskTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_task_tag
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_task_tag
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    int insert(WatermelonTaskTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_task_tag
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    int insertSelective(WatermelonTaskTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_task_tag
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    List<WatermelonTaskTag> selectByExample(WatermelonTaskTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_task_tag
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    WatermelonTaskTag selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_task_tag
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    int updateByExampleSelective(@Param("record") WatermelonTaskTag record, @Param("example") WatermelonTaskTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_task_tag
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    int updateByExample(@Param("record") WatermelonTaskTag record, @Param("example") WatermelonTaskTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_task_tag
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    int updateByPrimaryKeySelective(WatermelonTaskTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_task_tag
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    int updateByPrimaryKey(WatermelonTaskTag record);
}