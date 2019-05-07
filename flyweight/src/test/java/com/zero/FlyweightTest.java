package com.zero;

import com.zero.shape.Circle;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

@SpringBootTest
@RunWith(SpringRunner.class)
public class FlyweightTest {
    @Test
    public void testFlyweight(){
       String[]colors=  { "Red", "Green", "Blue", "White", "Black" };
        for (int i = 0; i <20 ; i++) {
            Circle circle=new Circle(colors[(int)(Math.random()*colors.length)]);
            circle.setX((int)(Math.random()*100));
            circle.setY((int)(Math.random()*100));
            circle.setRadius((int)(Math.random()*100));
            circle.draw();
        }
    }
}
