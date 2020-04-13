package com.flycun.patterns.handler.chain.v2;

public class HandlerA implements IHandler {
    @Override
    public boolean handle() {
        boolean handled = false;
        //...
        return handled;
    }
}