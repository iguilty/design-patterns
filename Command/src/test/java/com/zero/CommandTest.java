package com.zero;


import com.zero.command.impl.LightOnCommand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommandTest {
    @Test
    public void commandTest(){
        //创建命令搬运工
        White white=new White();
        //创建命令接受者
        Light light=new Light();
        //创建命令
        LightOnCommand on=new LightOnCommand();
        on.setLight(light);
        //让搬运工带着消息去找接收者
        white.setCommand(on);
        //接收者执行命令
        white.doCommand();
    }




}
