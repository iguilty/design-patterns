package com.zero.shape;

import lombok.Data;

@Data
public class Circle implements Shape {
    private String color;
    private int x;
    private int y;
    private int radius;
    public Circle(String color){
        this.color=color;
    }
    @Override
    public void draw() {
        System.out.println("画了一个圆心横坐标"+x+"纵坐标"+y+"半径为"+radius+"cm"+color+"的圆");
    }
}
