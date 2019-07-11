package com.yj2.watermelon.service.member;

import com.yj2.watermelon.bean.MemberBean;
import com.yj2.watermelon.entity.WatermelonMember;

/**
 * @ClassName MemberService
 * @Description
 * @Author JYJ
 * @Date 2019/6/3 16:22
 **/

public interface MemberService {


    /**
     * 修改成员信息
     * @param watermelonMember
     * @return
     */
    WatermelonMember updateMember(WatermelonMember watermelonMember);

    /**
     * 用户登录验证
     * @param account
     * @param password
     * @return
     */
    MemberBean userLogin(String account, String password);

    /**
     * 运营人员新增用户
     * @param systemId
     * @param account
     * @param name
     * @param departmentId
     * @param roleId
     */
    void register(String systemId, String account, String name, String departmentId,String roleId);

    /**
     * 修改密码
     * @param userId
     * @param password
     */
    void updatePassword(String userId,String password);

    WatermelonMember queryMemberByAccount(String account);
}
