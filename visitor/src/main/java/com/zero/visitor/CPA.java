package com.zero.visitor;

import com.zero.element.ConsumerBill;
import com.zero.element.IncomeBill;

public class CPA implements AccountBookView {
    int count = 0;
    @Override
    public void view(ConsumerBill consumerBill) {
        count++;
        System.out.println("第"+count+"个消费了"+consumerBill.getAmount());
    }

    @Override
    public void view(IncomeBill incomeBill) {
        count++;
        System.out.println("第"+count+"个收入了"+incomeBill.getAmount());
    }
}
