package com.yj2.watermelon.mapper;

import com.yj2.watermelon.entity.WatermelonProjectMenu;

import java.util.List;

/**
 * @ClassName WatermelonMemberMenuDefinedMapper
 * @Description
 * @Author JYJ
 * @Date 2019/7/5 14:32
 **/

public interface WatermelonMemberMenuDefinedMapper {
    //获取用户所有角色
    List<String> queryRoleIdsByUserId(String userId);

    List<String> queryMenuIdsByRoleIds(List<String> roles);

    List<WatermelonProjectMenu> queryMenusByIds(List<String> menuIds);
}
