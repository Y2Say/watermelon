package com.yj2.watermelon.service.member.impl;

import com.yj2.watermelon.bean.MemberBean;
import com.yj2.watermelon.entity.WatermelonMember;
import com.yj2.watermelon.entity.WatermelonProjectMenu;
import com.yj2.watermelon.exception.ExceptionEnum;
import com.yj2.watermelon.exception.ServiceException;
import com.yj2.watermelon.mapper.WatermelonMemberDefinedMapper;
import com.yj2.watermelon.mapper.WatermelonMemberMapper;
import com.yj2.watermelon.mapper.WatermelonMemberMenuDefinedMapper;
import com.yj2.watermelon.service.member.MemberService;
import com.yj2.watermelon.util.EncryDigestUtil;
import com.yj2.watermelon.util.TokenUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @ClassName MemberServiceImpl
 * @Description 成员信息
 * @Author JYJ
 * @Date 2019/6/3 16:24
 **/

@Service("com.yj2.watermelon.service.member.impl.MemberServiceImpl")
public class MemberServiceImpl implements MemberService {

    @Autowired
    private WatermelonMemberMapper memberMapper;

    @Autowired
    private WatermelonMemberDefinedMapper memberDefinedMapper;

    @Autowired
    private WatermelonMemberMenuDefinedMapper memberMenuDefinedMapper;

    @Override
    public WatermelonMember updateMember(WatermelonMember watermelonMember) {
        return null;
    }

    @Override
    public MemberBean userLogin(String account, String password) {
        WatermelonMember member = memberDefinedMapper.queryMemberByAccount(account);
        if (member == null) {
            throw new ServiceException(ExceptionEnum.NOT_EXIST);
        }
        int status = member.getStatus();
        if (status == 0 || status == 1) {
            String ps = member.getPassword();
            if (!ps.equals(EncryDigestUtil.digest(password))) {
                throw new ServiceException(ExceptionEnum.ERROR＿PASSWORD);
            }
            //生成token
            String token;
            try {
                token = TokenUtil.createJwt(member.getId());
            } catch (ServiceException e) {
                throw new ServiceException(ExceptionEnum.ERROE_CREATE_TOKEN);
            }

            memberMapper.updateByPrimaryKeySelective(member);
            List<WatermelonProjectMenu> menus = getMemberMenuTree(member);
            MemberBean memberBean = new MemberBean();
            memberBean.setId(member.getId());
            memberBean.setAccount(member.getAccount());
            memberBean.setToken(token);
            memberBean.setPower(menus.toString());
            return memberBean;
        } else {
            throw new ServiceException(ExceptionEnum.NOT_EXIST);
        }
    }

    @Transactional
    @Override
    public void register(String systemId, String account, String name, String departmentId, String roleId) {
        WatermelonMember user1 = memberDefinedMapper.queryMemberByAccount(account);
        if (user1 != null) {
            throw new ServiceException(ExceptionEnum.ACCOUNT_EXIST);
        }
        //添加用户
        WatermelonMember user = new WatermelonMember();
        String userId = "U-" + UUID.randomUUID().toString().replace("-", "");

        user.setId(userId);
        user.setAccount(account);
        user.setName(name);
        user.setStatus(0);
        user.setDepartmentId(departmentId);
        user.setPassword(EncryDigestUtil.digest("123123"));//默认密码
        user.setCreateBy(systemId);
        user.setCreateTime(new Date());
        memberMapper.insert(user);

        //添加角色
        /*UserRole userRole = new UserRole();
        userRole.setUserId(userId);
        userRole.setRoleId(roleId);
        userRole.setCreateTime(new Date());
        userRoleMapper.insert(userRole);*/
    }

    @Override
    public void updatePassword(String userId, String password) {
        WatermelonMember member = memberMapper.selectByPrimaryKey(userId);
        if (member != null) {
            member.setPassword(EncryDigestUtil.digest(password));
            member.setUpdateTime(new Date());
            member.setUpdateBy(userId);
            memberMapper.updateByPrimaryKeySelective(member);
        }
    }

    @Override
    public WatermelonMember queryMemberByAccount(String account) {
        return null;
    }

    /**
     * 生成用户的资源权限的树结构
     *
     * @param
     * @return
     */
    public List<WatermelonProjectMenu> getMemberMenuTree(WatermelonMember member) {


        //获取用户所有角色
        List<String> roles = memberMenuDefinedMapper.queryRoleIdsByUserId(member.getId());
        //获取用户所有权限菜单Ids
        List<String> menuIds = memberMenuDefinedMapper.queryMenuIdsByRoleIds(roles);

        List<WatermelonProjectMenu> menus = memberMenuDefinedMapper.queryMenusByIds(menuIds);


        return menus;
    }
}
