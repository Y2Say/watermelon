package com.yj2.watermelon.entity;

import java.io.Serializable;

public class WatermelonTaskMember implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_task_member.id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_task_member.task_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String taskId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_task_member.is_executor
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private Boolean isExecutor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_task_member.member_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String memberId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_task_member.join_time
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String joinTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_task_member.is_owner
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private Boolean isOwner;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table watermelon_task_member
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_task_member.id
     *
     * @return the value of watermelon_task_member.id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_task_member.id
     *
     * @param id the value for watermelon_task_member.id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_task_member.task_id
     *
     * @return the value of watermelon_task_member.task_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_task_member.task_id
     *
     * @param taskId the value for watermelon_task_member.task_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_task_member.is_executor
     *
     * @return the value of watermelon_task_member.is_executor
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public Boolean getIsExecutor() {
        return isExecutor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_task_member.is_executor
     *
     * @param isExecutor the value for watermelon_task_member.is_executor
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setIsExecutor(Boolean isExecutor) {
        this.isExecutor = isExecutor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_task_member.member_id
     *
     * @return the value of watermelon_task_member.member_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_task_member.member_id
     *
     * @param memberId the value for watermelon_task_member.member_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_task_member.join_time
     *
     * @return the value of watermelon_task_member.join_time
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getJoinTime() {
        return joinTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_task_member.join_time
     *
     * @param joinTime the value for watermelon_task_member.join_time
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setJoinTime(String joinTime) {
        this.joinTime = joinTime == null ? null : joinTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_task_member.is_owner
     *
     * @return the value of watermelon_task_member.is_owner
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public Boolean getIsOwner() {
        return isOwner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_task_member.is_owner
     *
     * @param isOwner the value for watermelon_task_member.is_owner
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setIsOwner(Boolean isOwner) {
        this.isOwner = isOwner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_task_member
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
        sb.append(", isExecutor=").append(isExecutor);
        sb.append(", memberId=").append(memberId);
        sb.append(", joinTime=").append(joinTime);
        sb.append(", isOwner=").append(isOwner);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}