package com.yj2.watermelon.service.project;

import com.yj2.watermelon.entity.WatermelonProject;

/**
 * @ClassName ProjectService
 * @Description
 * @Author JYJ
 * @Date 2019/6/3 16:23
 **/

public interface ProjectService {

    /**
     * 新增一个项目
     * @param userId
     * @param watermelonProject
     */
    void addNewProject(String userId, WatermelonProject watermelonProject);

    /**
     * 根据项目ID删除一个项目
     * @param userId
     * @param projectId
     */
    void deleteProject(String userId,String projectId);

    /**
     * 根据ID修改项目
     * @param userId
     * @param watermelonProject
     * @return
     */
    WatermelonProject updateById(String userId,WatermelonProject watermelonProject);
}
