package com.zero;

import com.zero.shape.Circle;
import com.zero.shape.Shape;

import java.util.HashMap;

public class ShapeFactory {
    //生成一个容器
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    //根据颜色获得相应的Shape对象
    public static Circle getCircle(String color){
        Circle circle = (Circle)circleMap.get(color);
        if (circle==null){
            circle=new Circle(color);
            circleMap.put(color,circle);
        }

        return  circle;
    }



}
