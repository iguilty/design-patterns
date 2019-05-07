package com.zero.factory;

import com.zero.fruit.Apple;
import com.zero.fruit.Fruit;

public class AppleFactory implements Factory {
    @Override
    public Fruit getFruit() {
        return new Apple();
    }
}
