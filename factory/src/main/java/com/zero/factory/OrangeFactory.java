package com.zero.factory;

import com.zero.fruit.Fruit;
import com.zero.fruit.Orange;

public class OrangeFactory implements Factory {
    @Override
    public Fruit getFruit() {
        return new Orange();
    }
}
