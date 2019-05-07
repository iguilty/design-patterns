package com.zero;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements Subject {
    //定义一个存储观察者的容器
    private List<Observer> list=new ArrayList<>();
    private String msg;

    @Override
    public void registerObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        list.remove(o);
    }
    //通知所有观察者
    @Override
    public void notifyObserver() {
        for (Observer observer:list) {
            observer.update(msg);
        }
    }

    public void setInfomation(String s) {
        this.msg = s;
        System.out.println("同学们： " + s);
        //消息更新，通知所有观察者
        notifyObserver();
    }
}
