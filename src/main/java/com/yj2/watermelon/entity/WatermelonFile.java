package com.yj2.watermelon.entity;

import java.io.Serializable;
import java.util.Date;

public class WatermelonFile implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_file.id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_file.path_name
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String pathName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_file.title
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_file.extension
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String extension;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_file.size
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private Integer size;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_file.object_type
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private Byte objectType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_file.organization_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String organizationId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_file.task_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String taskId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_file.project_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String projectId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_file.create_by
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_file.create_time
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_file.downloads
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private Integer downloads;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_file.extra_info
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String extraInfo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_file.deleted
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private Boolean deleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_file.file_type
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private Byte fileType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_file.deleted_time
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private Date deletedTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_file.file_url
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private String fileUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table watermelon_file
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_file.id
     *
     * @return the value of watermelon_file.id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_file.id
     *
     * @param id the value for watermelon_file.id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_file.path_name
     *
     * @return the value of watermelon_file.path_name
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getPathName() {
        return pathName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_file.path_name
     *
     * @param pathName the value for watermelon_file.path_name
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setPathName(String pathName) {
        this.pathName = pathName == null ? null : pathName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_file.title
     *
     * @return the value of watermelon_file.title
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_file.title
     *
     * @param title the value for watermelon_file.title
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_file.extension
     *
     * @return the value of watermelon_file.extension
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getExtension() {
        return extension;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_file.extension
     *
     * @param extension the value for watermelon_file.extension
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setExtension(String extension) {
        this.extension = extension == null ? null : extension.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_file.size
     *
     * @return the value of watermelon_file.size
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public Integer getSize() {
        return size;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_file.size
     *
     * @param size the value for watermelon_file.size
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_file.object_type
     *
     * @return the value of watermelon_file.object_type
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public Byte getObjectType() {
        return objectType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_file.object_type
     *
     * @param objectType the value for watermelon_file.object_type
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setObjectType(Byte objectType) {
        this.objectType = objectType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_file.organization_id
     *
     * @return the value of watermelon_file.organization_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_file.organization_id
     *
     * @param organizationId the value for watermelon_file.organization_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId == null ? null : organizationId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_file.task_id
     *
     * @return the value of watermelon_file.task_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_file.task_id
     *
     * @param taskId the value for watermelon_file.task_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_file.project_id
     *
     * @return the value of watermelon_file.project_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_file.project_id
     *
     * @param projectId the value for watermelon_file.project_id
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_file.create_by
     *
     * @return the value of watermelon_file.create_by
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_file.create_by
     *
     * @param createBy the value for watermelon_file.create_by
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_file.create_time
     *
     * @return the value of watermelon_file.create_time
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_file.create_time
     *
     * @param createTime the value for watermelon_file.create_time
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_file.downloads
     *
     * @return the value of watermelon_file.downloads
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public Integer getDownloads() {
        return downloads;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_file.downloads
     *
     * @param downloads the value for watermelon_file.downloads
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setDownloads(Integer downloads) {
        this.downloads = downloads;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_file.extra_info
     *
     * @return the value of watermelon_file.extra_info
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getExtraInfo() {
        return extraInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_file.extra_info
     *
     * @param extraInfo the value for watermelon_file.extra_info
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo == null ? null : extraInfo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_file.deleted
     *
     * @return the value of watermelon_file.deleted
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_file.deleted
     *
     * @param deleted the value for watermelon_file.deleted
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_file.file_type
     *
     * @return the value of watermelon_file.file_type
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public Byte getFileType() {
        return fileType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_file.file_type
     *
     * @param fileType the value for watermelon_file.file_type
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setFileType(Byte fileType) {
        this.fileType = fileType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_file.deleted_time
     *
     * @return the value of watermelon_file.deleted_time
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public Date getDeletedTime() {
        return deletedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_file.deleted_time
     *
     * @param deletedTime the value for watermelon_file.deleted_time
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setDeletedTime(Date deletedTime) {
        this.deletedTime = deletedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_file.file_url
     *
     * @return the value of watermelon_file.file_url
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public String getFileUrl() {
        return fileUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_file.file_url
     *
     * @param fileUrl the value for watermelon_file.file_url
     *
     * @mbg.generated Wed Jul 03 15:24:32 CST 2019
     */
    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_file
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
        sb.append(", pathName=").append(pathName);
        sb.append(", title=").append(title);
        sb.append(", extension=").append(extension);
        sb.append(", size=").append(size);
        sb.append(", objectType=").append(objectType);
        sb.append(", organizationId=").append(organizationId);
        sb.append(", taskId=").append(taskId);
        sb.append(", projectId=").append(projectId);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", downloads=").append(downloads);
        sb.append(", extraInfo=").append(extraInfo);
        sb.append(", deleted=").append(deleted);
        sb.append(", fileType=").append(fileType);
        sb.append(", deletedTime=").append(deletedTime);
        sb.append(", fileUrl=").append(fileUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}