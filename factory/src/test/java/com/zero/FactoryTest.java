package com.zero;

import com.zero.factory.*;
import com.zero.fruit.Apple;
import com.zero.fruit.Fruit;
import com.zero.vegetable.Vegetable;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FactoryTest {
    //测试简单工厂

    public void simpleFactory(){
        Fruit apple = FruitFactory.getFruit("Apple");
        apple.eatFruit();
    }

    //工厂方法模式

    public  void facrotyMethod(){
        Factory factory=new AppleFactory();
        Fruit fruit = factory.getFruit();
        fruit.eatFruit();
    }

    //抽象工厂模式
    @Test
    public void abstractFactoryPrototype(){
        AbstractFactoryPrototype factoryPrototype=new ZeroBrandFactoryPrototype();
        Apple apple = factoryPrototype.getApple();
        apple.eatFruit();
    }




    //抽象工厂模式结合简单工厂模式

    public void abstractFactory(){
        AbstractFactory factory=new ZeroBrandFactory();
        Fruit apple = factory.getFruit("Apple");
            apple.eatFruit();
        Vegetable cabbage = factory.getVegetable("Cabbage");
            cabbage.eatV();

    }


}
