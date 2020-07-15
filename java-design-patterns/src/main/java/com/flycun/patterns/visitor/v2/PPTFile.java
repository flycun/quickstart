package com.flycun.patterns.visitor.v2;

public class PPTFile extends ResourceFile {
    public PPTFile(String filePath) {
        super(filePath);
    }
    //...

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}