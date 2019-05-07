package com.zero.adapter;

import com.zero.destination.TFCard;
import com.zero.target.USB;

public class USBAdapterTF implements USB {
    private TFCard tfCard;
    public USBAdapterTF(TFCard tfCard){
        this.tfCard=tfCard;
    }
    @Override
    public String readUSB() {
        String msg = tfCard.readTF();
        return msg;
    }

    @Override
    public int wirteUSB(String msg) {
        int index = tfCard.writeTF(msg);
        return index;
    }
}
