package com.yj2.watermelon.controller.member;

import com.alibaba.fastjson.JSON;
import com.yj2.watermelon.bean.MemberBean;
import com.yj2.watermelon.entity.WatermelonMember;
import com.yj2.watermelon.exception.ControllerException;
import com.yj2.watermelon.exception.ExceptionEnum;
import com.yj2.watermelon.service.member.MemberService;
import com.yj2.watermelon.util.TokenUtil;
import com.yj2.watermelon.util.aop.RequireLogin;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;

/**
 * @ClassName MemberController
 * @Description  成员控制器
 * @Author JYJ
 * @Date 2019/6/6 10:58
 **/
@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    protected HttpSession httpSession;

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private MemberService memberService;


    @PostMapping("/login")
    @ApiOperation("登录")
    public MemberBean userLogin(@RequestBody WatermelonMember member) {

        if(member==null){
            throw new ControllerException(ExceptionEnum.INFO_NULL);
        }
        MemberBean user = memberService.userLogin(member.getAccount(),member.getPassword());
        if (user != null) {
            httpSession.setAttribute("account_id", user.getId());
            httpSession.setAttribute("x-auth-token", user.getToken());

            return user;
        } else {
            return null;
        }
    }

    /**
     * 退出登录
     *
     * @return
     */
    @GetMapping(value = "/logout")
    @ApiOperation("登出")
    public String logout()  {
        Enumeration<String> eume = httpSession.getAttributeNames();
        while (eume.hasMoreElements()) {
            String name = eume.nextElement();
            httpSession.removeAttribute(name);
        }
        return "200";
    }

    @GetMapping(value = "/info")
    @ApiOperation("根据账号获取用户信息")
    public String allUserInfo(String account){
        WatermelonMember user = memberService.queryMemberByAccount(account);
        return JSON.toJSONString(user);
    }

    @PostMapping("/register")
    @ApiOperation("添加人员")
    public String register(@RequestParam("account") String account,@RequestParam("name") String name,@RequestParam("departmentId") String departmentId,@RequestParam("roleId") String roleId){
        String token = (String) httpSession.getAttribute("x-auth-token");
        if(StringUtils.isEmpty(token)){
            throw new ControllerException(ExceptionEnum.ERROR_TOKEN);
        }
        if(StringUtils.isEmpty(account) || StringUtils.isEmpty(name) || StringUtils.isEmpty(departmentId)){
            throw new ControllerException(ExceptionEnum.INFO_NULL);
        }
        HashMap<String,Object> map = new HashMap<String,Object>();

        String systemId = TokenUtil.getAccountIdByToken(token);
        memberService.register(systemId, account, name, departmentId,roleId);
        map.put("message","添加成功！");
        return JSON.toJSONString(map);
    }

    @RequireLogin
    @PostMapping("/addPremission")
    @ApiOperation("添加权限")
    public String addPremission(){

        return null;
    }

    @RequireLogin
    @PutMapping("/password")
    @ApiOperation("修改密码")
    public String updatePassword(@RequestParam("password") String password) {
        String token = request.getHeader("x-auth-token");

        if(StringUtils.isEmpty(token)){
            throw new ControllerException(ExceptionEnum.ERROR_TOKEN);
        }
        if(StringUtils.isEmpty(password)){
            throw new ControllerException(ExceptionEnum.ERROR＿PASSWORD);
        }
        if(password.length()<6 || password.length()>18){
            throw new ControllerException(ExceptionEnum.PASSWORD_ERROE);
        }
        HashMap<String,Object> map = new HashMap<String,Object>();

        String managerId = TokenUtil.getAccountIdByToken(token);
        memberService.updatePassword(managerId, password);
        map.put("message","修改成功！");
        return JSON.toJSONString(map);
    }


    /*public List<WatermelonMember> getMemberList(){

    } */
}
