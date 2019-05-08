package com.zero;


import com.zero.colleague.Colleague;
import com.zero.colleague.HouseOwner;
import com.zero.colleague.Tenant;
import com.zero.mediator.Mediator;
import com.zero.mediator.MediatorStructure;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MediatorTest {
    @Test

    public void testMediator()  {
        //创建一个中介者对象
        Mediator mediator=new MediatorStructure();
        //创建同事
        HouseOwner h1=new HouseOwner("小白",mediator);
        HouseOwner h2=new HouseOwner("小黑",mediator);
        HouseOwner h3=new HouseOwner("小红",mediator);
        Tenant t1=new Tenant("小明",mediator);
        Tenant t2=new Tenant("小狗",mediator);
        //中介结构要知道房主和租房者
        mediator.add(h1);
        mediator.add(h2);
        mediator.add(h3);
        mediator.add(t1);
        mediator.add(t2);
        //开始通信
        t1.constact("我要一份儿童套餐");
        h1.constact("新房出租，只要998");
    }
}
