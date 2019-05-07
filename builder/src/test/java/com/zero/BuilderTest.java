package com.zero;


import com.zero.builder.Builder;
import com.zero.builder.impl.ConcreteBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BuilderTest {
    @Test
    public void builderTest(){
        //创建组装者
        Builder builder=new ConcreteBuilder();
        //创建指挥者并持有组装者
        Director director=new Director(builder);
        //指挥者指挥组装者去组装
        Product product = director.construct();
        //查看组装结果
        System.out.println(product);

    }



}
