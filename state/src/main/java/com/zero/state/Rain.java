package com.zero.state;

public class Rain implements State {
    @Override
    public void handle() {
        System.out.println("打开伞");
    }
}
