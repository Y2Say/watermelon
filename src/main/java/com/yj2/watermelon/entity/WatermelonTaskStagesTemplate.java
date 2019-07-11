package com.yj2.watermelon.entity;

import java.io.Serializable;
import java.util.Date;

public class WatermelonTaskStagesTemplate implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_task_stages_template.id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_task_stages_template.name
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_task_stages_template.project_template_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String projectTemplateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_task_stages_template.create_time
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_task_stages_template.sort
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private Integer sort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table watermelon_task_stages_template
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_task_stages_template.id
     *
     * @return the value of watermelon_task_stages_template.id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_task_stages_template.id
     *
     * @param id the value for watermelon_task_stages_template.id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_task_stages_template.name
     *
     * @return the value of watermelon_task_stages_template.name
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_task_stages_template.name
     *
     * @param name the value for watermelon_task_stages_template.name
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_task_stages_template.project_template_id
     *
     * @return the value of watermelon_task_stages_template.project_template_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getProjectTemplateId() {
        return projectTemplateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_task_stages_template.project_template_id
     *
     * @param projectTemplateId the value for watermelon_task_stages_template.project_template_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setProjectTemplateId(String projectTemplateId) {
        this.projectTemplateId = projectTemplateId == null ? null : projectTemplateId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_task_stages_template.create_time
     *
     * @return the value of watermelon_task_stages_template.create_time
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_task_stages_template.create_time
     *
     * @param createTime the value for watermelon_task_stages_template.create_time
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_task_stages_template.sort
     *
     * @return the value of watermelon_task_stages_template.sort
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_task_stages_template.sort
     *
     * @param sort the value for watermelon_task_stages_template.sort
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_task_stages_template
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
        sb.append(", name=").append(name);
        sb.append(", projectTemplateId=").append(projectTemplateId);
        sb.append(", createTime=").append(createTime);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}