package com.zero;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class prototypeTest {
    //浅复制

    public void prototypeTest() throws CloneNotSupportedException {
        Teacher teacher=new Teacher("张三",28);
        Student origin=new Student("小白",teacher);
        Student clone = (Student)origin.clone();
        System.out.println("刚复制时的状态"+clone);
        origin.getTeacher().setAge(88);
        System.out.println("修改原型后复制对象的状态"+clone);
    }

    @Test
    //深复制
    public void testDeepCopy() throws CloneNotSupportedException {
        Teacher teacher=new Teacher("张三",28);
        DeepStudent origin=new DeepStudent("小白",teacher);
        DeepStudent clone = (DeepStudent)origin.clone();
        System.out.println("刚复制时的状态"+clone);
        origin.getTeacher().setAge(88);
        System.out.println("修改原型后复制对象的状态"+clone);
    }


}
