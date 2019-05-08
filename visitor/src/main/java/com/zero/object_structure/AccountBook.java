package com.zero.object_structure;

import com.zero.element.Bill;
import com.zero.visitor.AccountBookView;

import java.util.ArrayList;
import java.util.List;

public class AccountBook {
    private List<Bill> listBill = new ArrayList<Bill>();
    // 添加单子
    public void add(Bill bill) {
        listBill.add(bill);
    }

    // 开始访问
    public void show(AccountBookView viewer) {
        for (Bill b : listBill) {
            b.accept(viewer);
        }
    }
}
