package com.zero.mediator;

import com.zero.colleague.Colleague;

public interface Mediator {
    //中介者要知道所有同事
    public void add(Colleague colleague);
    //声明联络方法
    public void contact(String message, Colleague coll);

}
