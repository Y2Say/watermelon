package com.yj2.watermelon.mapper;

import com.yj2.watermelon.entity.WatermelonMailQueue;
import com.yj2.watermelon.entity.WatermelonMailQueueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WatermelonMailQueueMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_mailqueue
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    long countByExample(WatermelonMailQueueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_mailqueue
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    int deleteByExample(WatermelonMailQueueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_mailqueue
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_mailqueue
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    int insert(WatermelonMailQueue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_mailqueue
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    int insertSelective(WatermelonMailQueue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_mailqueue
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    List<WatermelonMailQueue> selectByExampleWithBLOBs(WatermelonMailQueueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_mailqueue
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    List<WatermelonMailQueue> selectByExample(WatermelonMailQueueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_mailqueue
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    WatermelonMailQueue selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_mailqueue
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    int updateByExampleSelective(@Param("record") WatermelonMailQueue record, @Param("example") WatermelonMailQueueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_mailqueue
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") WatermelonMailQueue record, @Param("example") WatermelonMailQueueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_mailqueue
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    int updateByExample(@Param("record") WatermelonMailQueue record, @Param("example") WatermelonMailQueueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_mailqueue
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    int updateByPrimaryKeySelective(WatermelonMailQueue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_mailqueue
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(WatermelonMailQueue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_mailqueue
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    int updateByPrimaryKey(WatermelonMailQueue record);
}