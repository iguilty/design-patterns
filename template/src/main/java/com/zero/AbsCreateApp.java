package com.zero;

public abstract class AbsCreateApp {
    /**设计*/
    public abstract void design();
    /**开发*/
    public abstract void develop();
    /**发布*/
    public abstract void release();

    public void execute(){
        design();
        develop();
        release();
    }
}
