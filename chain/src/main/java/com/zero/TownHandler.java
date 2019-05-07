package com.zero;

public class TownHandler extends Handler {
    @Override
    public void handleRequest(int trouble) {
        if (trouble<1000){
            System.out.println("镇长解决了这次事件");
        }else{
            System.out.println("镇长无能为力");
            this.next.handleRequest(trouble);
        }
    }
}
