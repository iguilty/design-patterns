package com.zero.pojo;

import com.zero.service.Payment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private String uid;
    private  String oid;
    private  double amount;

    //为订单支付(枚举方式)
//    public PayState pay(PayType payType){
//        return  payType.getPayment().pay(uid,amount);
//    }
    //为订单支付
    public PayState pay(Payment payment){
        return payment.pay(uid,amount);
    }



}
