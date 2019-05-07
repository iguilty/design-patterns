package com.zero;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ObserverTest {
    @Test
    public void observerTest(){
        //创建一个被观察者
        Teacher teacher=new Teacher();

        //创建几个观察者
        Student s1=new Student("小白");
        Student s2=new Student("小黑");
        Student s3=new Student("小狗");

        //观察者订阅被观察者
        teacher.registerObserver(s1);
        teacher.registerObserver(s2);
        teacher.registerObserver(s3);

        //老师发布消息上课
        teacher.setInfomation("上课");

        //听说要上课，小白逃课，取消订阅
        teacher.removeObserver(s1);

        //老师发布消息下课
        teacher.setInfomation("下课");

    }



}
