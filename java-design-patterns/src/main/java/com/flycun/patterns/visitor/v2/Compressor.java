package com.flycun.patterns.visitor.v2;

//...PPTFile、WordFile代码省略...
public class Compressor implements Visitor {
    public void visit(PPTFile pptFile) {
        System.out.println("Compressor  PPT.");
    }

    public void visit(PdfFile pdfFile) {
        System.out.println("Compressor  PDF.");
    }

    public void visit(WordFile wordFile) {
        System.out.println("Compressor  WORD.");
    }
}