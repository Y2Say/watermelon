package com.yj2.watermelon.entity;

import java.io.Serializable;
import java.util.Date;

public class WatermelonSourceLink implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_source_link.id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_source_link.source_type
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private Byte sourceType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_source_link.source_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String sourceId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_source_link.link_type
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private Byte linkType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_source_link.link_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String linkId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_source_link.organization_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String organizationId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_source_link.create_by
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_source_link.create_time
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_source_link.sort
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private Integer sort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table watermelon_source_link
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_source_link.id
     *
     * @return the value of watermelon_source_link.id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_source_link.id
     *
     * @param id the value for watermelon_source_link.id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_source_link.source_type
     *
     * @return the value of watermelon_source_link.source_type
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public Byte getSourceType() {
        return sourceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_source_link.source_type
     *
     * @param sourceType the value for watermelon_source_link.source_type
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setSourceType(Byte sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_source_link.source_id
     *
     * @return the value of watermelon_source_link.source_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_source_link.source_id
     *
     * @param sourceId the value for watermelon_source_link.source_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId == null ? null : sourceId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_source_link.link_type
     *
     * @return the value of watermelon_source_link.link_type
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public Byte getLinkType() {
        return linkType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_source_link.link_type
     *
     * @param linkType the value for watermelon_source_link.link_type
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setLinkType(Byte linkType) {
        this.linkType = linkType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_source_link.link_id
     *
     * @return the value of watermelon_source_link.link_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getLinkId() {
        return linkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_source_link.link_id
     *
     * @param linkId the value for watermelon_source_link.link_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setLinkId(String linkId) {
        this.linkId = linkId == null ? null : linkId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_source_link.organization_id
     *
     * @return the value of watermelon_source_link.organization_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_source_link.organization_id
     *
     * @param organizationId the value for watermelon_source_link.organization_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId == null ? null : organizationId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_source_link.create_by
     *
     * @return the value of watermelon_source_link.create_by
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_source_link.create_by
     *
     * @param createBy the value for watermelon_source_link.create_by
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_source_link.create_time
     *
     * @return the value of watermelon_source_link.create_time
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_source_link.create_time
     *
     * @param createTime the value for watermelon_source_link.create_time
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_source_link.sort
     *
     * @return the value of watermelon_source_link.sort
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_source_link.sort
     *
     * @param sort the value for watermelon_source_link.sort
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_source_link
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
        sb.append(", sourceType=").append(sourceType);
        sb.append(", sourceId=").append(sourceId);
        sb.append(", linkType=").append(linkType);
        sb.append(", linkId=").append(linkId);
        sb.append(", organizationId=").append(organizationId);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}