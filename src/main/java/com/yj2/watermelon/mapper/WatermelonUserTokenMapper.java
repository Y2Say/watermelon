package com.yj2.watermelon.mapper;

import com.yj2.watermelon.entity.WatermelonUserToken;
import com.yj2.watermelon.entity.WatermelonUserTokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WatermelonUserTokenMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_user_token
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    long countByExample(WatermelonUserTokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_user_token
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    int deleteByExample(WatermelonUserTokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_user_token
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    int deleteByPrimaryKey(Integer tokenId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_user_token
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    int insert(WatermelonUserToken record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_user_token
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    int insertSelective(WatermelonUserToken record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_user_token
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    List<WatermelonUserToken> selectByExample(WatermelonUserTokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_user_token
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    WatermelonUserToken selectByPrimaryKey(Integer tokenId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_user_token
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    int updateByExampleSelective(@Param("record") WatermelonUserToken record, @Param("example") WatermelonUserTokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_user_token
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    int updateByExample(@Param("record") WatermelonUserToken record, @Param("example") WatermelonUserTokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_user_token
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    int updateByPrimaryKeySelective(WatermelonUserToken record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_user_token
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    int updateByPrimaryKey(WatermelonUserToken record);
}