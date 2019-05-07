package com.zero.factory;

import com.zero.fruit.Apple;
import com.zero.vegetable.Cabbage;

public class ZeroBrandFactoryPrototype implements AbstractFactoryPrototype {
    @Override
    public Apple getApple() {
        return new Apple();
    }

    @Override
    public Cabbage geCabbage() {
        return new Cabbage();
    }
}
