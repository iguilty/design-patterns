package com.zero.colleague;

import com.zero.mediator.Mediator;

public class Tenant extends Colleague {
    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    /**
     * @desc 与中介者联系
     * @param message
     * @return voidpublic void getMessage(String message)
     */
    public void constact(String message){
        mediator.contact(message,this);
    }

    /**
     * @desc 获取信息
     * @param message
     * @return void
     */
    public void getMessage(String message){
        System.out.println("租房者:" + name +",获得信息：" + message);
    }
}
