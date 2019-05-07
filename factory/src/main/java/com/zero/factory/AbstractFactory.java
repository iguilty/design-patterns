package com.zero.factory;

import com.zero.fruit.Fruit;
import com.zero.vegetable.Vegetable;

public interface AbstractFactory {
    Vegetable getVegetable(String vegetable);
    Fruit getFruit(String fruit);
}
