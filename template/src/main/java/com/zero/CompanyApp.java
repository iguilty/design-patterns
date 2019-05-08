package com.zero;

public class CompanyApp extends AbsCreateApp {
    @Override
    public void design() {
        System.out.println("产品设计App原型");
        System.out.println("设计师设计App UI");
    }

    @Override
    public void develop() {
        System.out.println("团队共同开发app");
    }

    @Override
    public void release() {
        System.out.println("发布到各大市场");
    }
}
