package com.zero;

public class MyApp extends AbsCreateApp {
    @Override
    public void design() {
        System.out.println("自己设计App");
    }

    @Override
    public void develop() {
       System.out.println("独立开发App");
    }

    @Override
    public void release() {
        System.out.println("发布到google");
    }
}