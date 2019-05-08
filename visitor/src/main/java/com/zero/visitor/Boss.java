package com.zero.visitor;

import com.zero.element.ConsumerBill;
import com.zero.element.IncomeBill;
import lombok.Getter;

@Getter
public class Boss implements AccountBookView {
    private double totalConsumer;
    private double totalIncome;
    //查看收入
    @Override
    public void view(ConsumerBill consumerBill) {
        totalConsumer=totalConsumer+consumerBill.getAmount();
    }
    //查看支出
    @Override
    public void view(IncomeBill incomeBill) {
        totalIncome=totalIncome+incomeBill.getAmount();
    }
}
