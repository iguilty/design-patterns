package com.zero.element;

import com.zero.visitor.AccountBookView;

public interface Bill {
    void accept(AccountBookView viewer);

}
