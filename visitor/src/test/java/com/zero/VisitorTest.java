package com.zero;


import com.zero.element.Bill;
import com.zero.element.ConsumerBill;
import com.zero.element.IncomeBill;
import com.zero.object_structure.AccountBook;
import com.zero.visitor.Boss;
import com.zero.visitor.CPA;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class VisitorTest {
    @Test

    public void testVisitor()  {
        // 创建消费和收入单子
        Bill consumerBill = new ConsumerBill("消费", 3000);
        Bill incomeBill = new IncomeBill("收入", 5000);
        Bill consumerBill2 = new ConsumerBill("消费", 4000);
        Bill incomeBill2 = new IncomeBill("收入", 8000);
        // 添加单子
        AccountBook accountBook = new AccountBook();
        accountBook.add(consumerBill);
        accountBook.add(incomeBill);
        accountBook.add(consumerBill2);
        accountBook.add(incomeBill2);

        //boss访问
        Boss boss=new Boss();
        accountBook.show(boss);
        System.out.println("合计消费"+boss.getTotalConsumer());
        System.out.println("合计支出"+boss.getTotalIncome());

        //会计访问
        CPA cpa=new CPA();
        accountBook.show(cpa);
    }
}
