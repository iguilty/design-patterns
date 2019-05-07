package com.zero.fruit;

public class Apple implements Fruit {
    @Override
    public void plantFruit() {
        System.out.println("种苹果");
    }

    @Override
    public void eatFruit() {
        System.out.println("吃苹果");
    }
}
