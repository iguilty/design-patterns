package com.zero;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeepStudent implements Cloneable{
    private String name;
    private Teacher teacher;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepStudent clone=(DeepStudent)super.clone();
        clone.setTeacher((Teacher)this.getTeacher().clone());
        return clone;
    }
}
