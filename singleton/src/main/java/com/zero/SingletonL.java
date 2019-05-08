package com.zero;

import java.util.HashSet;
import java.util.Set;

//懒汉式单例模式
public class SingletonL {

    private SingletonL(){
        System.out.println("实例被创建");
    }
    private static SingletonL instance=null;

    public static SingletonL getInstance() {
        if (instance==null){
        instance=new SingletonL();
        }
        return instance;
    }



}
