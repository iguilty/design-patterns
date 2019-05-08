package com.zero;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SingleTonTest {
    //测试饿汉模式

    public void testSingleTon1()  {
        SingletonH s1 = SingletonH.getSingletonH();
        SingletonH s2 = SingletonH.getSingletonH();
        System.out.println(s1==s2);
    }

    //测试懒汉单例模式

    public void testSingleTon2()  {
        SingletonL s1 = SingletonL.getInstance();
        SingletonL s2 = SingletonL.getInstance();
        System.out.println(s1==s2);

    }

    //测试静态单例模式
    public void testSingleTon3()  {
        SingletonS s1 = SingletonS.getInstance();
        SingletonS s2= SingletonS.getInstance();
        System.out.println(s1==s2);
    }

    //测试懒汉单例模式线程不安全

    public void testSingleTon4()  {
        SingletonLThread s = new SingletonLThread();
        new Thread(s).start();
        new Thread(s).start();
        new Thread(s).start();
        new Thread(s).start();
        new Thread(s).start();
        new Thread(s).start();
        new Thread(s).start();
        new Thread(s).start();
        new Thread(s).start();
        new Thread(s).start();
    }

    //双重锁懒汉模式
    public void testSingleTon5()  {
        SingletonLLock s1 = SingletonLLock.getInstance();
        SingletonLLock s2= SingletonLLock.getInstance();
        System.out.println(s1==s2);
    }

    @Test
    //测试双重锁懒汉模式线程安全
    public void testSingleTon6()  {
        SingletonLLockThread s = new SingletonLLockThread();
        new Thread(s).start();
        new Thread(s).start();
        new Thread(s).start();
        new Thread(s).start();
        new Thread(s).start();
        new Thread(s).start();
        new Thread(s).start();
        new Thread(s).start();
        new Thread(s).start();
        new Thread(s).start();
    }
}
