package com.yj2.watermelon.bean;

import lombok.Data;

/**
 * @ClassName MemberBean
 * @Description
 * @Author JYJ
 * @Date 2019/7/5 11:30
 **/
@Data
public class MemberBean {
    private String id;
    private String account;
    private String name;
    private String token;
    private String password;
    private String power;//菜单列表

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }
}
