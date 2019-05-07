package com.zero.pojo;

import com.zero.service.Payment;
import com.zero.service.impl.AliPay;
import com.zero.service.impl.UnionPay;
import com.zero.service.impl.WechatPay;
import lombok.Getter;

@Getter
public enum PayType {
    ALI_PAY(new AliPay()),
    WECHAT_PAY(new WechatPay()),
    UNION_PAY(new UnionPay());
    private Payment payment;
    PayType(Payment payment) {
        this.payment=payment;
    }
}
