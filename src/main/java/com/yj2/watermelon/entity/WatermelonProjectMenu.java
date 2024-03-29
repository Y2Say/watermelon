package com.yj2.watermelon.entity;

import java.io.Serializable;
import java.util.Date;

public class WatermelonProjectMenu implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_project_menu.id
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_project_menu.p_id
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    private String pId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_project_menu.title
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_project_menu.icon
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    private String icon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_project_menu.url
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_project_menu.file_path
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    private String filePath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_project_menu.params
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    private String params;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_project_menu.node
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    private String node;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_project_menu.sort
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    private Integer sort;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_project_menu.status
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_project_menu.create_by
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_project_menu.create_time
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_project_menu.is_inner
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    private Integer isInner;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_project_menu.param_value
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    private String paramValue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column watermelon_project_menu.show_slider
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    private Integer showSlider;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table watermelon_project_menu
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_project_menu.id
     *
     * @return the value of watermelon_project_menu.id
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_project_menu.id
     *
     * @param id the value for watermelon_project_menu.id
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_project_menu.p_id
     *
     * @return the value of watermelon_project_menu.p_id
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public String getpId() {
        return pId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_project_menu.p_id
     *
     * @param pId the value for watermelon_project_menu.p_id
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public void setpId(String pId) {
        this.pId = pId == null ? null : pId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_project_menu.title
     *
     * @return the value of watermelon_project_menu.title
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_project_menu.title
     *
     * @param title the value for watermelon_project_menu.title
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_project_menu.icon
     *
     * @return the value of watermelon_project_menu.icon
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_project_menu.icon
     *
     * @param icon the value for watermelon_project_menu.icon
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_project_menu.url
     *
     * @return the value of watermelon_project_menu.url
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_project_menu.url
     *
     * @param url the value for watermelon_project_menu.url
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_project_menu.file_path
     *
     * @return the value of watermelon_project_menu.file_path
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_project_menu.file_path
     *
     * @param filePath the value for watermelon_project_menu.file_path
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_project_menu.params
     *
     * @return the value of watermelon_project_menu.params
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public String getParams() {
        return params;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_project_menu.params
     *
     * @param params the value for watermelon_project_menu.params
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public void setParams(String params) {
        this.params = params == null ? null : params.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_project_menu.node
     *
     * @return the value of watermelon_project_menu.node
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public String getNode() {
        return node;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_project_menu.node
     *
     * @param node the value for watermelon_project_menu.node
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public void setNode(String node) {
        this.node = node == null ? null : node.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_project_menu.sort
     *
     * @return the value of watermelon_project_menu.sort
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_project_menu.sort
     *
     * @param sort the value for watermelon_project_menu.sort
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_project_menu.status
     *
     * @return the value of watermelon_project_menu.status
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_project_menu.status
     *
     * @param status the value for watermelon_project_menu.status
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_project_menu.create_by
     *
     * @return the value of watermelon_project_menu.create_by
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_project_menu.create_by
     *
     * @param createBy the value for watermelon_project_menu.create_by
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_project_menu.create_time
     *
     * @return the value of watermelon_project_menu.create_time
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_project_menu.create_time
     *
     * @param createTime the value for watermelon_project_menu.create_time
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_project_menu.is_inner
     *
     * @return the value of watermelon_project_menu.is_inner
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public Integer getIsInner() {
        return isInner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_project_menu.is_inner
     *
     * @param isInner the value for watermelon_project_menu.is_inner
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public void setIsInner(Integer isInner) {
        this.isInner = isInner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_project_menu.param_value
     *
     * @return the value of watermelon_project_menu.param_value
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public String getParamValue() {
        return paramValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_project_menu.param_value
     *
     * @param paramValue the value for watermelon_project_menu.param_value
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public void setParamValue(String paramValue) {
        this.paramValue = paramValue == null ? null : paramValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column watermelon_project_menu.show_slider
     *
     * @return the value of watermelon_project_menu.show_slider
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public Integer getShowSlider() {
        return showSlider;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column watermelon_project_menu.show_slider
     *
     * @param showSlider the value for watermelon_project_menu.show_slider
     *
     * @mbg.generated Fri Jul 05 16:52:58 CST 2019
     */
    public void setShowSlider(Integer showSlider) {
        this.showSlider = showSlider;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table watermelon_project_menu
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
        sb.append(", pId=").append(pId);
        sb.append(", title=").append(title);
        sb.append(", icon=").append(icon);
        sb.append(", url=").append(url);
        sb.append(", filePath=").append(filePath);
        sb.append(", params=").append(params);
        sb.append(", node=").append(node);
        sb.append(", sort=").append(sort);
        sb.append(", status=").append(status);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", isInner=").append(isInner);
        sb.append(", paramValue=").append(paramValue);
        sb.append(", showSlider=").append(showSlider);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}