package com.zero.decorator;

import com.zero.shape.Shape;

public abstract class ShapeDecorator {
    protected Shape shape;
    public ShapeDecorator(Shape shape){
        this.shape = shape;
    }
    public void draw(){
        shape.draw();
    }
}
