package com.yj2.watermelon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PageController {

    //首页-工作台
    @RequestMapping("/home")
    public String home(){
        return "home/home";
    }

    //项目管理
    @RequestMapping("/project")
    public String project(){
        return "project/main";
    }

    //我的项目
    @RequestMapping("/project_list")
    public String projectList(){
        return "project/list";
    }

    //项目分析
    @RequestMapping("/project_analysis")
    public String projectAnalysis(){
        return "project/analysis";
    }

    //收藏
    @RequestMapping("/project_collection")
    public String projectCollection(){
        return "project/collection";
    }

    //已归档项目
    @RequestMapping("/project_archived")
    public String projectArchived(){
        return "project/archived";
    }

    //回收站
    @RequestMapping("/project_recycle")
    public String projectRecycle(){
        return "project/recycle";
    }

    //我的组织
    @RequestMapping("/project_organization")
    public String projectOrganization(){
        return "project/organization";
    }

/*
    @RequestMapping("/login")
    public String login(){
        return "common/login";
    }

    @RequestMapping("/article_detail")
    public String ceshi(){
        return "article/article_detail";
    }


    *//*首页*//*
    @RequestMapping("/system/index")
    public String index(){
        return "admin/system/index/index";
    }

    @RequestMapping("/admin/index")
    public String index1(){
        return "admin/index";
    }

    *//*会员管理*//*
    @RequestMapping("/system/member")
    public String member(){
        return "admin/system/member/member";
    }
    @RequestMapping("/system/list")
    public String list(){
        return "admin/system/member/list";
    }
    @RequestMapping("/system/disable")
    public String disable(){
        return "admin/system/member/disable";
    }

    *//*帖子管理*//*
    @RequestMapping("/system/administration")
    public String administration(){
        return "admin/system/post/administration";
    }
    @RequestMapping("/system/online")
    public String online(){
        return "admin/system/post/online";
    }
    @RequestMapping("/system/shield")
    public String shield(){
        return "admin/system/post/shield";
    }

    *//*举报管理*//*
    @RequestMapping("/system/report")
    public String report(){
        return "admin/system/report/report";
    }
    @RequestMapping("/system/pend")
    public String pend(){
        return "admin/system/report/pend";
    }
    @RequestMapping("/system/audited")
    public String audited(){
        return "admin/system/report/audited";
    }

    *//*规则管理*//*
    @RequestMapping("/system/rule")
    public String rule(){
        return "admin/system/rule/rule";
    }
    @RequestMapping("/system/persona")
    public String persona(){
        return "admin/system/rule/persona";
    }
    @RequestMapping("/system/attribute")
    public String attribute(){
        return "admin/system/rule/attribute";
    }
    @RequestMapping("/system/integral")
    public String integral(){
        return "admin/system/rule/integral";
    }

    *//*消息管理*//*
    @RequestMapping("/system/message")
    public String message(){
        return "admin/system/news/message";
    }
    @RequestMapping("/system/template")
    public String template(){
        return "admin/system/news/template";
    }
    @RequestMapping("/system/send")
    public String send(){
        return "admin/system/news/send";
    }


    *//*充值管理*//*
    @RequestMapping("/system/recharge")
    public String recharge(){
        return "admin/system/recharge/recharge";
    }

    *//*系统设置*//*
    @RequestMapping("/system/settings")
    public String settings(){
        return "admin/system/system/settings";
    }
    @RequestMapping("/system/third")
    public String third(){
        return "admin/system/system/third";
    }
    @RequestMapping("/system/sensitive")
    public String sensitive(){
        return "admin/system/system/sensitive";
    }



    *//* #######超级管理员 ####### *//*

    *//* 操作日志 *//*
    @RequestMapping("/super/index")
    public String operation(){
        return "admin/super/operation/operation";
    }
    @RequestMapping("/super/operateDetail")
    public String operateDetail(){
        return "admin/super/operation/operationDetail";
    }


    *//* 运营人员管理 *//*
    @RequestMapping("/super/personnel")
    public String personnel(){
        return "admin/super/added/personnel";
    }
    @RequestMapping("/super/added")
    public String added(){
        return "admin/super/added/added";
    }
    @RequestMapping("/super/operate")
    public String operate(){
        return "admin/super/added/operate";
    }
    @RequestMapping("/super/edit")
    public String edit(){
        return "admin/super/added/edit";
    }

    *//* 运营修改密码 *//*
    @RequestMapping("/system/password")
    public String password(){
        return "admin/system/personal/password";
    }
    *//* 管理员修改密码 *//*
    *//* 修改密码 *//*
    @RequestMapping("/super/password")
    public String Administration(){
        return "admin/super/personal/password";
    }
    *//* 审核详情 *//*
    @RequestMapping("/system/auditDetail")
    public String Detail(){return "admin/system/report/audit_info";}
    @RequestMapping("/system/reportPost")
    public String Report(){return "admin/system/report/reportPost";}
    *//*消息详情*//*
    @RequestMapping("/system/mesDetail")
    public String Mes(){return "admin/system/news/detailMsg";}*/

}
