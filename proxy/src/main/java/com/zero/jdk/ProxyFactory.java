package com.zero.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
//代理对象不需要实现接口,但是目标对象一定要实现接口,否则不能用动态代理
public class ProxyFactory implements InvocationHandler {
    //维护一个被代理对象
    private Object target;
    public ProxyFactory(Object target){
        this.target=target;
    }
    //给目标对象生成代理对象
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("小黑发起登录");
        //执行目标对象方法
        Object returnValue = method.invoke(target, args);
        System.out.println("小黑登录成功");
        return returnValue;
    }
}
