package com.zero;

import java.util.HashSet;
import java.util.Set;

//懒汉式双重锁
public class SingletonLLock {
    private SingletonLLock(){
        System.out.println("实例被创建");
    }
    private static SingletonLLock instance=null;
    public static SingletonLLock getInstance() {
        if(instance==null){
            synchronized (SingletonLLock.class){
                if (instance==null){
                instance=new SingletonLLock();
                }
            }
        }
        return instance;
    }
}
