package com.zero;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<RoleStateMemento> list=new ArrayList<>();
    public void add(RoleStateMemento roleStateMemento){
        list.add(roleStateMemento);
    }
    public RoleStateMemento getByIndex(int index){
        return list.get(index);
    }

}
