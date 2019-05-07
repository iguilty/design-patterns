package com.zero;

import lombok.Data;

@Data
public abstract class Handler {
    protected Handler next;
    public abstract void handleRequest(int trouble);
}
