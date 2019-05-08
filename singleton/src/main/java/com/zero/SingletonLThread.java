package com.zero;

import java.util.HashSet;
import java.util.Set;

public class SingletonLThread implements Runnable {
    private Set<SingletonL>set=new HashSet<>();
    @Override
    public void run() {
        SingletonL instance = SingletonL.getInstance();

        set.add(instance);
        System.out.println(set.size());

    }
}
