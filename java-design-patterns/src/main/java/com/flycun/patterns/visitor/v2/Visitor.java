package com.flycun.patterns.visitor.v2;

public interface Visitor {
    void visit(PdfFile pdfFile);

    void visit(PPTFile pdfFile);

    void visit(WordFile pdfFile);
}