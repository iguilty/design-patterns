package com.zero;

import com.zero.target.USB;

public class ComputerA implements Computer {
    @Override
    public String readUSB(USB usb) {
        String msg = usb.readUSB();
        return msg;
    }
}
