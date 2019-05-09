package com.zero.service;

import com.zero.service.UserService;

public class UserServiceProxy implements UserService {
    //构造时初始化被代理对象
    private UserService userService;
    public UserServiceProxy(UserService userService){
        this.userService=userService;
    }
    @Override
    public void login() {
        System.out.println("小白发起登录请求");
        userService.login();
        System.out.println("小白登录成功");
    }
}
