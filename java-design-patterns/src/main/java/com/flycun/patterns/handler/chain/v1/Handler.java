package com.flycun.patterns.handler.chain.v1;

public abstract class Handler {
    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handle();
}




