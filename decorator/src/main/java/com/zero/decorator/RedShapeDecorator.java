package com.zero.decorator;

import com.zero.shape.Shape;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        setRedBorder();
    }

    private void setRedBorder(){
        System.out.println("这是红色的边框");
    }
}
