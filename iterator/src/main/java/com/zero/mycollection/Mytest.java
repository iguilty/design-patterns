package com.zero.mycollection;

public class Mytest {
    public static void main(String[] args) {
        Object[]objects={6,5,5,2,5,6,4,3,8,9};
        Collection collection=new MyCollection(objects);
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
