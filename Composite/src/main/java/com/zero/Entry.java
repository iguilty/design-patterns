package com.zero;


public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();

    public Entry add(Entry entry) throws Exception {
        throw new Exception();
    }

    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);

    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}
