package com.yj2.watermelon.service.project.impl;

import com.yj2.watermelon.entity.WatermelonMember;
import com.yj2.watermelon.entity.WatermelonProject;
import com.yj2.watermelon.mapper.WatermelonMemberMapper;
import com.yj2.watermelon.mapper.WatermelonProjectMapper;
import com.yj2.watermelon.service.project.ProjectService;
import com.yj2.watermelon.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;

/**
 * @ClassName ProjectServiceImpl
 * @Description 项目信息
 * @Author JYJ
 * @Date 2019/6/3 16:30
 **/
@Service("com.yj2.watermelon.service.project.impl.ProjectServiceImpl")
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private WatermelonMemberMapper memberMapper;

    @Autowired
    private WatermelonProjectMapper projectMapper;

    /**
     * @Description 新增一个项目
     * @Date 2019/7/3 15:17
     **/
    @Override
    public void addNewProject(String userId, WatermelonProject watermelonProject) {
        WatermelonMember watermelonMember = memberMapper.selectByPrimaryKey(userId);
        if(watermelonMember!=null && !StringUtils.isEmpty(watermelonMember.getOrganizationId())){
            watermelonProject.setOrganizationId(watermelonMember.getOrganizationId());
        }
        watermelonProject.setId("WP_"+ UUIDUtil.randomString(18));
        watermelonProject.setCreateTime(new Date());
        watermelonProject.setOrganizationId(userId);
        projectMapper.updateByPrimaryKeySelective(watermelonProject);
    }

    /**
     * 删除一个项目
     * @param userId
     * @param projectId
     */
    @Override
    public void deleteProject(String userId, String projectId) {
        WatermelonMember watermelonMember = memberMapper.selectByPrimaryKey(userId);
        if(watermelonMember!=null && !StringUtils.isEmpty(watermelonMember.getOrganizationId()) && watermelonMember.getRoleId().equals("")){
          WatermelonProject watermelonProject = projectMapper.selectByPrimaryKey(projectId);
          if(watermelonProject!=null && watermelonMember.getOrganizationId().equals(watermelonProject.getOrganizationId())){
              projectMapper.deleteByPrimaryKey(projectId);
          }
        }
    }

    /**
     * 修改项目
     * @param userId
     * @param watermelonProject
     * @return
     */
    @Override
    public WatermelonProject updateById(String userId, WatermelonProject watermelonProject) {
        WatermelonMember watermelonMember = memberMapper.selectByPrimaryKey(userId);
        if(watermelonMember!=null && !StringUtils.isEmpty(watermelonMember.getOrganizationId())){
            WatermelonProject project = projectMapper.selectByPrimaryKey(watermelonProject.getId());
            if(project!=null){

            }
        }

        return null;
    }

}
