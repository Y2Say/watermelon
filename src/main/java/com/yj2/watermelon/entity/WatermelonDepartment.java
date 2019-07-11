package com.yj2.watermelon.entity;

import java.io.Serializable;
import java.util.Date;

public class WatermelonDepartment implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_department.id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_department.organization_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String organizationId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_department.name
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_department.sort
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private Integer sort;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_department.p_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String pId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_department.icon
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String icon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_department.create_time
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_department.path
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String path;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table watermelon_department
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_department.id
     *
     * @return the value of watermelon_department.id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_department.id
     *
     * @param id the value for watermelon_department.id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_department.organization_id
     *
     * @return the value of watermelon_department.organization_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_department.organization_id
     *
     * @param organizationId the value for watermelon_department.organization_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId == null ? null : organizationId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_department.name
     *
     * @return the value of watermelon_department.name
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_department.name
     *
     * @param name the value for watermelon_department.name
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_department.sort
     *
     * @return the value of watermelon_department.sort
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_department.sort
     *
     * @param sort the value for watermelon_department.sort
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_department.p_id
     *
     * @return the value of watermelon_department.p_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getpId() {
        return pId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_department.p_id
     *
     * @param pId the value for watermelon_department.p_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setpId(String pId) {
        this.pId = pId == null ? null : pId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_department.icon
     *
     * @return the value of watermelon_department.icon
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_department.icon
     *
     * @param icon the value for watermelon_department.icon
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_department.create_time
     *
     * @return the value of watermelon_department.create_time
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_department.create_time
     *
     * @param createTime the value for watermelon_department.create_time
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_department.path
     *
     * @return the value of watermelon_department.path
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getPath() {
        return path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_department.path
     *
     * @param path the value for watermelon_department.path
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_department
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", organizationId=").append(organizationId);
        sb.append(", name=").append(name);
        sb.append(", sort=").append(sort);
        sb.append(", pId=").append(pId);
        sb.append(", icon=").append(icon);
        sb.append(", createTime=").append(createTime);
        sb.append(", path=").append(path);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}