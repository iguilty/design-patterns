package com.zero;

public class SingletonH {
    private SingletonH(){
        System.out.println("单例被创建");
    }
    private static SingletonH instance=new SingletonH();

    public static SingletonH getSingletonH(){
        return instance;
    }

}
