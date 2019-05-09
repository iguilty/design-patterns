package com.zero;


import com.zero.cglib.ProxyFactoryC;
import com.zero.cglib.ZeroService;
import com.zero.jdk.ProxyFactory;
import com.zero.service.UserService;
import com.zero.service.UserServiceImpl;
import com.zero.service.UserServiceProxy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProxyTest {

    //测试静态代理
    public void testProxy()  {
        //创建被代理对象
        UserService target=new UserServiceImpl();
        //创建代理对象
        UserService proxy=new UserServiceProxy(target);
        proxy.login();
    }


    //测试jdk动态代理
    public void testJDK()  {
        //创建被代理对象
        UserService target=new UserServiceImpl();
        //查看原始类型
        System.out.println(target.getClass());
        //由代理工厂生成代理对象
        UserService proxy = (UserService)new ProxyFactory(target).getProxyInstance();
        //查看代理类型
        System.out.println(proxy);
        //执行登录操作
        proxy.login();
    }

    @Test
    //测试Cglib动态代理
    public void testCglib()  {
        //创建被代理对象
        ZeroService target=new ZeroService();
        //查看原始类型
        System.out.println(target.getClass());
        //由代理工厂生成代理对象
        ZeroService proxy = (ZeroService)new ProxyFactoryC(target).getProxyInstance();
        //查看代理类型
        System.out.println(proxy);
        //执行登录操作
        proxy.login();
    }
}
