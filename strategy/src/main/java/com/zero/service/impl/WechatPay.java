package com.zero.service.impl;

import com.zero.pojo.PayState;
import com.zero.service.Payment;
import org.springframework.stereotype.Service;

@Service
public class WechatPay implements Payment {
    @Override
    public PayState pay(String uid, double amount) {
        System.out.println("这是微信支付方式");
         return new PayState(200,"支付成功",uid,amount);
    }
}
