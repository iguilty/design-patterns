package com.zero.target;

public class UPan implements USB {
    @Override
    public String readUSB() {
        String msg="这是存在U盘中的数据";
        System.out.println("读取了U盘的数据");
        return msg;
    }

    @Override
    public int wirteUSB(String msg) {
        System.out.println("向U盘中存了一条数据"+msg);
        return 1;
    }
}
