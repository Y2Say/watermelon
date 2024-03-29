package com.yj2.watermelon.entity;

import java.io.Serializable;
import java.util.Date;

public class WatermelonDepartmentMember implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_department_member.id
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_department_member.department_id
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    private String departmentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_department_member.organization_id
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    private String organizationId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_department_member.member_id
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    private String memberId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_department_member.join_time
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    private Date joinTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_department_member.is_principal
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    private Integer isPrincipal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_department_member.is_owner
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    private Integer isOwner;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_department_member.authorize
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    private String authorize;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table watermelon_department_member
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_department_member.id
     *
     * @return the value of watermelon_department_member.id
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_department_member.id
     *
     * @param id the value for watermelon_department_member.id
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_department_member.department_id
     *
     * @return the value of watermelon_department_member.department_id
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public String getDepartmentId() {
        return departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_department_member.department_id
     *
     * @param departmentId the value for watermelon_department_member.department_id
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_department_member.organization_id
     *
     * @return the value of watermelon_department_member.organization_id
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_department_member.organization_id
     *
     * @param organizationId the value for watermelon_department_member.organization_id
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId == null ? null : organizationId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_department_member.member_id
     *
     * @return the value of watermelon_department_member.member_id
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_department_member.member_id
     *
     * @param memberId the value for watermelon_department_member.member_id
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_department_member.join_time
     *
     * @return the value of watermelon_department_member.join_time
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public Date getJoinTime() {
        return joinTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_department_member.join_time
     *
     * @param joinTime the value for watermelon_department_member.join_time
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_department_member.is_principal
     *
     * @return the value of watermelon_department_member.is_principal
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public Integer getIsPrincipal() {
        return isPrincipal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_department_member.is_principal
     *
     * @param isPrincipal the value for watermelon_department_member.is_principal
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public void setIsPrincipal(Integer isPrincipal) {
        this.isPrincipal = isPrincipal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_department_member.is_owner
     *
     * @return the value of watermelon_department_member.is_owner
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public Integer getIsOwner() {
        return isOwner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_department_member.is_owner
     *
     * @param isOwner the value for watermelon_department_member.is_owner
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public void setIsOwner(Integer isOwner) {
        this.isOwner = isOwner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_department_member.authorize
     *
     * @return the value of watermelon_department_member.authorize
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public String getAuthorize() {
        return authorize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_department_member.authorize
     *
     * @param authorize the value for watermelon_department_member.authorize
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public void setAuthorize(String authorize) {
        this.authorize = authorize == null ? null : authorize.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_department_member
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", departmentId=").append(departmentId);
        sb.append(", organizationId=").append(organizationId);
        sb.append(", memberId=").append(memberId);
        sb.append(", joinTime=").append(joinTime);
        sb.append(", isPrincipal=").append(isPrincipal);
        sb.append(", isOwner=").append(isOwner);
        sb.append(", authorize=").append(authorize);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}