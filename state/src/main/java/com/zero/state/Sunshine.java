package com.zero.state;

import com.zero.state.State;

public class Sunshine implements State {
    @Override
    public void handle() {
        System.out.println("把伞收起来");
    }
}
