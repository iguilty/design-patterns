package com.zero;

import com.zero.pojo.Order;
import com.zero.pojo.PayState;
import com.zero.service.Payment;
import com.zero.service.impl.AliPay;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StrategyTest {
    @Test
    public void strategyTest(){
        Order order=new Order();
        order.setOid("订单编号1");
        order.setUid("用户ID1");
        order.setAmount(400);

        Payment payment=new AliPay();
        PayState result = order.pay(payment);
        System.out.println(result);

    }




}
