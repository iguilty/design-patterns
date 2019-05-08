package com.zero.element;

import com.zero.visitor.AccountBookView;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ConsumerBill implements Bill {
    private String item;
    private double amount;

    @Override
    public void accept(AccountBookView viewer) {
        viewer.view(this);
    }
}
