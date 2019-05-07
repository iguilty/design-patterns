package com.zero.Computer;

import com.zero.brand.Brand;




public class Desktop extends Computer {

        public Desktop(Brand brand){
            super(brand);
        }
        @Override
        public void sale() {
            super.sale();
            System.out.println("这是台式机");
        }
}
