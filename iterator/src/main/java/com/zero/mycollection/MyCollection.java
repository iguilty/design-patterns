package com.zero.mycollection;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class MyCollection implements Collection {
    private Object[]objects;
    public MyCollection (Object[]objects){
        this.objects=objects;
    }
    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return objects[i];
    }

    @Override
    public int size() {
        return objects.length;
    }
}
