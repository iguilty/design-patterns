package com.zero.Computer;

import com.zero.brand.Brand;




public class Laptop extends Computer {
    public Laptop (Brand brand){
        super(brand);
    }
    @Override
    public void sale() {
        super.sale();
        System.out.println("这是平板电脑");
    }
}
