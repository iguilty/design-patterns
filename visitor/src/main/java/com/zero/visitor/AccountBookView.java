package com.zero.visitor;

import com.zero.element.ConsumerBill;
import com.zero.element.IncomeBill;

public interface AccountBookView {
    // 查看消费的单子
    void view(ConsumerBill consumerBill);

    // 查看收入单子
    void view(IncomeBill incomeBill);
}
