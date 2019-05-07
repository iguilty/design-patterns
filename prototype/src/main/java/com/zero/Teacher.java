package com.zero;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher implements Cloneable{
    private String name;
    private int Age;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
