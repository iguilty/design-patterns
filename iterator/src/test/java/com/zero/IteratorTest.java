package com.zero;




import com.zero.white.Aggregate;
import com.zero.white.ConcreteAggregate;
import com.zero.white.Iterator;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
public class IteratorTest {


    public void testIterator() {
        Object[] objArray = {"One","Two","Three","Four","Five","Six"};
        //创建聚合对象
        Aggregate agg = new ConcreteAggregate(objArray);
        //循环输出聚合对象中的值
        Iterator it = agg.createIterator();
        //循环输出聚合对象中的值

        while(!it.isDone()){
            System.out.println(it.currentItem());
            it.next();
        }
    }


}

