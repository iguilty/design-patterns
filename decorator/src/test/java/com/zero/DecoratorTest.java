package com.zero;


import com.zero.decorator.RedShapeDecorator;
import com.zero.decorator.ShapeDecorator;
import com.zero.shape.Circle;
import com.zero.shape.Rectangle;
import com.zero.shape.Shape;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DecoratorTest {
    @Test

    public void testDecorator()  {
        Shape rectangle=new Rectangle();
        ShapeDecorator shapeDecorator1=new RedShapeDecorator(rectangle);
        shapeDecorator1.draw();

        Shape circle=new Circle();
        ShapeDecorator shapeDecorator2=new RedShapeDecorator(circle);
        shapeDecorator2.draw();

    }




}
