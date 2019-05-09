package com.zero;


import com.zero.context.Context;
import com.zero.expression.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class InterpreterTest {
    @Test
    public void testIntepreter(){
        Context ctx = new Context();
        Variable x = new Variable("x");
        Variable y = new Variable("y");
        Constant c = new Constant(1);
        ctx.assign(x, 2);
        ctx.assign(y, 3);

        Expression exp = new Plus(new Plus(c,x) , new Minus(y,x));
        System.out.println(exp.toString() + "=" + exp.interpret(ctx));

    }
}
