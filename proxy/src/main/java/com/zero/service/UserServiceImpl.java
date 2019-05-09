package com.zero.service;

import com.zero.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public void login() {
        System.out.println("这是登录操作");
    }
}
