package com.zero;

import lombok.Data;

@Data
public class Student implements Observer {
    private String name;
    public Student(String name){
        this.name=name;
    }
    @Override
    public void update(String msg) {
        System.out.println(name+"收到通知："+msg);
    }
}
