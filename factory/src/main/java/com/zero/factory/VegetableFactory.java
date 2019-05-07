package com.zero.factory;



import com.zero.vegetable.Cabbage;
import com.zero.vegetable.Radish;
import com.zero.vegetable.Vegetable;

public class VegetableFactory {
    public static Vegetable getVegetable(String vegetable) {
        if ("Cabbage".equals(vegetable)) {
            return new Cabbage();
        } else if ("Radish".equals(vegetable)) {
            return new Radish();
        } else {
            System.out.println("请输入正确类型");
            return null;
        }
    }
}
