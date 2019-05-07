package com.zero;


import com.zero.Shape.Shape;
import com.zero.Shape.impl.Circle;
import com.zero.Shape.impl.Rectangle;
import com.zero.Shape.impl.Square;

public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;
    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }
    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
