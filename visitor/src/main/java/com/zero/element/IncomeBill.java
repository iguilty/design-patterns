package com.zero.element;

import com.zero.visitor.AccountBookView;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class IncomeBill implements Bill{
    private String item;
    private double amount;
    @Override
    public void accept(AccountBookView viewer) {
        viewer.view(this);
    }
}
