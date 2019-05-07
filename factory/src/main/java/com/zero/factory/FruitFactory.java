package com.zero.factory;

import com.zero.fruit.Apple;
import com.zero.fruit.Fruit;
import com.zero.fruit.Orange;

/**
 *普通工厂模式
 */
public class FruitFactory {
    public static Fruit getFruit(String fruit) {
        if ("Apple".equals(fruit)) {
            return new Apple();
        } else if ("Orange".equals(fruit)) {
            return new Orange();
        } else {
            System.out.println("请输入正确类型");
            return null;
        }
    }
}
