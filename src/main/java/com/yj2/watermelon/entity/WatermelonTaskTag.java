package com.yj2.watermelon.entity;

import java.io.Serializable;
import java.util.Date;

public class WatermelonTaskTag implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_task_tag.id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_task_tag.project_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String projectId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_task_tag.name
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_task_tag.color
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private Byte color;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_task_tag.create_time
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table watermelon_task_tag
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_task_tag.id
     *
     * @return the value of watermelon_task_tag.id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_task_tag.id
     *
     * @param id the value for watermelon_task_tag.id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_task_tag.project_id
     *
     * @return the value of watermelon_task_tag.project_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_task_tag.project_id
     *
     * @param projectId the value for watermelon_task_tag.project_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_task_tag.name
     *
     * @return the value of watermelon_task_tag.name
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_task_tag.name
     *
     * @param name the value for watermelon_task_tag.name
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_task_tag.color
     *
     * @return the value of watermelon_task_tag.color
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public Byte getColor() {
        return color;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_task_tag.color
     *
     * @param color the value for watermelon_task_tag.color
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setColor(Byte color) {
        this.color = color;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_task_tag.create_time
     *
     * @return the value of watermelon_task_tag.create_time
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_task_tag.create_time
     *
     * @param createTime the value for watermelon_task_tag.create_time
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_task_tag
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
        sb.append(", projectId=").append(projectId);
        sb.append(", name=").append(name);
        sb.append(", color=").append(color);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}