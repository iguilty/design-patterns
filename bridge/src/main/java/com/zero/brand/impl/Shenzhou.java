package com.zero.brand.impl;

import com.zero.brand.Brand;

public class Shenzhou implements Brand {
    @Override
    public void sale() {
        System.out.println("还不上船？");
    }
}
