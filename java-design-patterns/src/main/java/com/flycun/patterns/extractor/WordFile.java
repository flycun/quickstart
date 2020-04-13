package com.flycun.patterns.extractor;

public class WordFile extends ResourceFile {
  public WordFile(String filePath) {
    super(filePath);
  }
  //...
  @Override  public void accept(Extractor extractor) {    extractor.extract2txt(this);  }
}