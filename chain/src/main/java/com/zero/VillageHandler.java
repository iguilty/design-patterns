package com.zero;

public class VillageHandler extends Handler {
    @Override
    public void handleRequest(int trouble) {
        if(trouble<=100){
            System.out.println("村长解决了这次事情");
        }else {
            System.out.println("村长无能为力");
            this.next.handleRequest(trouble);
        }

    }
}
