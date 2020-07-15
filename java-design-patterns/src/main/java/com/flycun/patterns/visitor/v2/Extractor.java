package com.flycun.patterns.visitor.v2;

//...PPTFile、WordFile代码省略...
public class Extractor implements Visitor {
    public void visit(PPTFile pptFile) {
        System.out.println("Extract PPT.");
    }

    public void visit(PdfFile pdfFile) {
        System.out.println("Extract PDF.");
    }

    public void visit(WordFile wordFile) {
        System.out.println("Extract WORD.");
    }
}