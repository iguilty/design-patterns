package com.zero;


import com.zero.state.Rain;
import com.zero.state.Sunshine;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class StateTest {
    @Test

    public void testState(){
        Context context=new Context(new Rain());
        context.handle();

        context.setState(new Sunshine());
        context.handle();
    }
}
