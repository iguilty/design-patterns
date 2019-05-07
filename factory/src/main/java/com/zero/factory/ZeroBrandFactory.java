package com.zero.factory;

import com.zero.fruit.Fruit;
import com.zero.vegetable.Vegetable;


public class ZeroBrandFactory implements AbstractFactory{

    @Override
    public Vegetable getVegetable(String vegetable) {
        return VegetableFactory.getVegetable(vegetable);
    }

    @Override
    public Fruit getFruit(String fruit) {
        return FruitFactory.getFruit(fruit);
    }
}
