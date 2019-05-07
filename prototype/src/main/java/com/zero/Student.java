package com.zero;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Cloneable{
    private String name;
    private Teacher teacher;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
