package com.yj2.watermelon.entity;

import java.io.Serializable;
import java.util.Date;

public class WatermelonTaskLike implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_task_like.id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_task_like.task_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String taskId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_task_like.member_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String memberId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_task_like.create_time
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table watermelon_task_like
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_task_like.id
     *
     * @return the value of watermelon_task_like.id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_task_like.id
     *
     * @param id the value for watermelon_task_like.id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_task_like.task_id
     *
     * @return the value of watermelon_task_like.task_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_task_like.task_id
     *
     * @param taskId the value for watermelon_task_like.task_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_task_like.member_id
     *
     * @return the value of watermelon_task_like.member_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_task_like.member_id
     *
     * @param memberId the value for watermelon_task_like.member_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_task_like.create_time
     *
     * @return the value of watermelon_task_like.create_time
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_task_like.create_time
     *
     * @param createTime the value for watermelon_task_like.create_time
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_task_like
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
        sb.append(", taskId=").append(taskId);
        sb.append(", memberId=").append(memberId);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}