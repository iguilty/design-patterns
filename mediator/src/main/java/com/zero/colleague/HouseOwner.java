package com.zero.colleague;

import com.zero.mediator.Mediator;
//具体同事类：房东
public class HouseOwner extends Colleague {
    public HouseOwner(String name,Mediator mediator) {
        super(name,mediator);
    }
    //与中介者联系
    public void constact(String message){
       mediator.contact(message,this);
    }

    //获得信息
    public void getMessage(String message){
        System.out.println("房主:"+name+",获得信息:"+message);
    }

}
