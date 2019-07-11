package com.yj2.watermelon.util.aop;

import com.auth0.jwt.interfaces.Claim;
import com.yj2.watermelon.exception.ExceptionEnum;
import com.yj2.watermelon.exception.ServiceException;
import com.yj2.watermelon.service.member.MemberService;
import com.yj2.watermelon.util.TokenUtil;
import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * 验证登录状态
 */
@Log4j2
@Aspect
@Order(1)
@Component("com.bcjy.qywork.util.aop.CheckLogin")
public class CheckLogin {

    @Autowired
    private HttpSession session;

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private MemberService memberService;

    @Pointcut("execution(public * com.yj2.watermelon.controller.*.*.*(..))")
    public void check() {

    }

    @Around("check()")
    public Object arround(ProceedingJoinPoint pjp) throws Throwable {
        //log.debug("检查session");
        boolean isCheck;
        boolean require;

        Signature signature = pjp.getSignature();
        // 获取类上的注解
        RequireLogin classAnnotation = (RequireLogin) signature.getDeclaringType().getAnnotation(RequireLogin.class);

        MethodSignature methodSignature = (MethodSignature) signature;
        Method targetMethod = methodSignature.getMethod();
        // 获取方法上的注解
        RequireLogin methodAnnotation = targetMethod.getAnnotation(RequireLogin.class);
        if (methodAnnotation == null && classAnnotation == null) {
            return pjp.proceed();
        }
        // 如果方法上没有注解，以类上注解为准
        if (methodAnnotation == null) {
            isCheck = classAnnotation.check();
            require = classAnnotation.require();
        } else {
            // 如果方法上有注解，以方法注解为准
            isCheck = methodAnnotation.check();
            require = methodAnnotation.require();
        }
        // 如果不需要检查，就放过
        if (!isCheck) {
            return pjp.proceed();
        }
        String token1 = request.getHeader("x-auth-token");
        if (StringUtils.isEmpty(token1)) {
            return check(pjp, require);
        }

        Map<String, Claim> claims = TokenUtil.getClaim(token1);
        String userid = claims.get("userid").asString();
        int type = claims.get("type").asInt();
        if (StringUtils.isEmpty(userid)) {//验证失败
            return check(pjp, require);
        }
      /*  QyUser qyUserBean = new QyUser();
        if(2==type){
            qyUserBean.setWxuserid(userid);
        }else{
            qyUserBean.setQyuserid(userid);
        }
        QyUser qyUser = qyUserService.getByQyUser(qyUserBean);
        if (qyUser == null) {
            return check(pjp, require);
        }*/
        session.setAttribute("userid", userid);
        return pjp.proceed();
    }

    private Object check(ProceedingJoinPoint pjp, boolean require) throws Throwable {
        if (require) {
            throw new ServiceException(ExceptionEnum.TOKEN_ERROR);
        } else {
            session.removeAttribute("userid");
            return pjp.proceed();
        }
    }
}
