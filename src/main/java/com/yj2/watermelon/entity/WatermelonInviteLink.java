package com.yj2.watermelon.entity;

import java.io.Serializable;
import java.util.Date;

public class WatermelonInviteLink implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_invite_link.id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_invite_link.create_by
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_invite_link.invite_type
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private Byte inviteType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_invite_link.source_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String sourceId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_invite_link.create_time
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_invite_link.over_time
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private Date overTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table watermelon_invite_link
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_invite_link.id
     *
     * @return the value of watermelon_invite_link.id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_invite_link.id
     *
     * @param id the value for watermelon_invite_link.id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_invite_link.create_by
     *
     * @return the value of watermelon_invite_link.create_by
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_invite_link.create_by
     *
     * @param createBy the value for watermelon_invite_link.create_by
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_invite_link.invite_type
     *
     * @return the value of watermelon_invite_link.invite_type
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public Byte getInviteType() {
        return inviteType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_invite_link.invite_type
     *
     * @param inviteType the value for watermelon_invite_link.invite_type
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setInviteType(Byte inviteType) {
        this.inviteType = inviteType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_invite_link.source_id
     *
     * @return the value of watermelon_invite_link.source_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_invite_link.source_id
     *
     * @param sourceId the value for watermelon_invite_link.source_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId == null ? null : sourceId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_invite_link.create_time
     *
     * @return the value of watermelon_invite_link.create_time
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_invite_link.create_time
     *
     * @param createTime the value for watermelon_invite_link.create_time
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_invite_link.over_time
     *
     * @return the value of watermelon_invite_link.over_time
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public Date getOverTime() {
        return overTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_invite_link.over_time
     *
     * @param overTime the value for watermelon_invite_link.over_time
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setOverTime(Date overTime) {
        this.overTime = overTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_invite_link
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
        sb.append(", createBy=").append(createBy);
        sb.append(", inviteType=").append(inviteType);
        sb.append(", sourceId=").append(sourceId);
        sb.append(", createTime=").append(createTime);
        sb.append(", overTime=").append(overTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}