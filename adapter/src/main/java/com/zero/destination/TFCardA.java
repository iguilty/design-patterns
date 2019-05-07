package com.zero.destination;



public class TFCardA implements TFCard {
    @Override
    public String readTF() {
        String msg="这是存在TF卡上的数据";
        return msg;
    }

    @Override
    public int writeTF(String msg) {
        System.out.println("TF保存了一条数据 : " + msg);

        return 1;
    }
}
