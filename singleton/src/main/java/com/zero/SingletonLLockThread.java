package com.zero;

import java.util.HashSet;
import java.util.Set;

public class SingletonLLockThread implements Runnable {
    private Set<SingletonLLock>set=new HashSet<>();
    @Override
    public void run() {
        SingletonLLock instance = SingletonLLock.getInstance();

        set.add(instance);
        System.out.println(set.size());

    }
}
