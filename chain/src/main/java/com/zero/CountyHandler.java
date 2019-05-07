package com.zero;


public class CountyHandler extends Handler {
    @Override
    public void handleRequest(int trouble) {
        if (trouble<10000){
            System.out.println("县长解决了这次事件");
        }else {
            System.out.println("县长无能为力");
            if (this.next==null){
                System.out.println("没人能解决这次事件");
            }else{
                this.next.handleRequest(trouble);
            }


        }
    }
}
