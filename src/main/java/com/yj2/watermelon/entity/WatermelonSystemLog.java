package com.yj2.watermelon.entity;

import java.io.Serializable;
import java.util.Date;

public class WatermelonSystemLog implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_system_log.id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_system_log.ip
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String ip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_system_log.node
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String node;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_system_log.operator_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String operatorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_system_log.operation
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String operation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_system_log.create_time
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_system_log.content
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table watermelon_system_log
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_system_log.id
     *
     * @return the value of watermelon_system_log.id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_system_log.id
     *
     * @param id the value for watermelon_system_log.id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_system_log.ip
     *
     * @return the value of watermelon_system_log.ip
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_system_log.ip
     *
     * @param ip the value for watermelon_system_log.ip
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_system_log.node
     *
     * @return the value of watermelon_system_log.node
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getNode() {
        return node;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_system_log.node
     *
     * @param node the value for watermelon_system_log.node
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setNode(String node) {
        this.node = node == null ? null : node.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_system_log.operator_id
     *
     * @return the value of watermelon_system_log.operator_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_system_log.operator_id
     *
     * @param operatorId the value for watermelon_system_log.operator_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId == null ? null : operatorId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_system_log.operation
     *
     * @return the value of watermelon_system_log.operation
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getOperation() {
        return operation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_system_log.operation
     *
     * @param operation the value for watermelon_system_log.operation
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_system_log.create_time
     *
     * @return the value of watermelon_system_log.create_time
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_system_log.create_time
     *
     * @param createTime the value for watermelon_system_log.create_time
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_system_log.content
     *
     * @return the value of watermelon_system_log.content
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_system_log.content
     *
     * @param content the value for watermelon_system_log.content
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_system_log
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
        sb.append(", ip=").append(ip);
        sb.append(", node=").append(node);
        sb.append(", operatorId=").append(operatorId);
        sb.append(", operation=").append(operation);
        sb.append(", createTime=").append(createTime);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}