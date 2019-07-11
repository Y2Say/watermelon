package com.yj2.watermelon.mapper;

import com.yj2.watermelon.entity.WatermelonMember;

/**
 * @ClassName WatermelonMemberDefinedMapper
 * @Description
 * @Author JYJ
 * @Date 2019/7/5 13:39
 **/

public interface WatermelonMemberDefinedMapper {

    WatermelonMember queryMemberByAccount(String account);

}
