package com.zero.service;

import com.zero.pojo.PayState;

public interface Payment {
    /**
     *
     * @param uid   表示人的uid
     * @param amount  表示支付的金额
     * @return
     */
    PayState pay(String uid, double amount);
}
