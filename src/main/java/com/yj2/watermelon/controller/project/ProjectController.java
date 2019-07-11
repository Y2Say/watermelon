package com.yj2.watermelon.controller.project;

import com.yj2.watermelon.entity.WatermelonProject;
import com.yj2.watermelon.service.project.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @ClassName ProjectController
 * @Description 项目控制器
 * @Author JYJ
 * @Date 2019/6/6 10:59
 **/
@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private HttpSession session;

    @Autowired
    private ProjectService projectService;

    @PostMapping("/add")
    public String addProject(WatermelonProject watermelonProject){
        String userId = session.getAttribute("user_id").toString();
        projectService.addNewProject(userId,watermelonProject);
        return "新增成功！";
    }
    
}
