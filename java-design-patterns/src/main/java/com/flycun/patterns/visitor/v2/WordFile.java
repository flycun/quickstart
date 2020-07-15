package com.flycun.patterns.visitor.v2;

public class WordFile extends ResourceFile {
    public WordFile(String filePath) {
        super(filePath);
    }

    //...
    @Override
    public void accept(Visitor visitor) {
      visitor.visit(this);
    }
}