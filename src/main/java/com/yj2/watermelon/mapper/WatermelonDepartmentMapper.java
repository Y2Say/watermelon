package com.yj2.watermelon.mapper;

import com.yj2.watermelon.entity.WatermelonDepartment;
import com.yj2.watermelon.entity.WatermelonDepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WatermelonDepartmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_department
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    long countByExample(WatermelonDepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_department
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    int deleteByExample(WatermelonDepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_department
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_department
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    int insert(WatermelonDepartment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_department
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    int insertSelective(WatermelonDepartment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_department
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    List<WatermelonDepartment> selectByExample(WatermelonDepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_department
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    WatermelonDepartment selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_department
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    int updateByExampleSelective(@Param("record") WatermelonDepartment record, @Param("example") WatermelonDepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_department
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    int updateByExample(@Param("record") WatermelonDepartment record, @Param("example") WatermelonDepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_department
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    int updateByPrimaryKeySelective(WatermelonDepartment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_department
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    int updateByPrimaryKey(WatermelonDepartment record);
}