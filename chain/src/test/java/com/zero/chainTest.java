package com.zero;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
public class chainTest {

    @Test
    public void testChain() {
        //创建责任人
        VillageHandler villageHandler=new VillageHandler();
        TownHandler townHandler=new TownHandler();
        CountyHandler countyHandler=new CountyHandler();
        //创建责任链
        villageHandler.setNext(townHandler);
        townHandler.setNext(countyHandler);
        //开始执行任务
        villageHandler.handleRequest(12000);
    }


}

