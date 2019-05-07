package com.zero.Computer;

import com.zero.brand.Brand;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Computer {
    private Brand brand;
    public void sale(){
        brand.sale();
    }
}
