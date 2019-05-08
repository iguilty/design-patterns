package com.zero;

public class SingletonS {
    private SingletonS(){
        System.out.println("单例被创建");
    }
    //内部类声明静态变量
    private static class Inner{
        private static SingletonS instance=new SingletonS();
    }
    public static SingletonS getInstance(){
        return Inner.instance;
    }
}
