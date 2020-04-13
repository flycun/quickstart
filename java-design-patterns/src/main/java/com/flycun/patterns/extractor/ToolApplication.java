package com.flycun.patterns.extractor;

import java.util.ArrayList;
import java.util.List;

public class ToolApplication {


    public static void main(String[] args) {
        Extractor extractor = new Extractor();
        List<ResourceFile> resourceFiles = listAllResourceFiles(args[0]);

        /**
         * 多态是一种动态绑定，可以在运行时获取对象的实际类型，来运行实际类型对应的方法。
         * 而函数重载是一种静态绑定，在编译时并不能获取对象的实际类型，而是根据声明类型执行声明类型对应的方法。在下面代码中，
         * resourceFiles 包含的对象的声明类型都是 ResourceFile，而我们并没有在 Extractor 类中定义参数类型是 ResourceFile 的 extract2txt() 重载函数，
         * 所以在编译阶段就通过不了，更别说在运行时根据对象的实际类型执行不同的重载函数了
         */
//        for (ResourceFile resourceFile : resourceFiles) {
//            extractor.extract2txt(resourceFile);
//        }

        for (ResourceFile resourceFile : resourceFiles) {
            resourceFile.accept(extractor);
        }
    }

    private static List<ResourceFile> listAllResourceFiles(String resourceDirectory) {
        List<ResourceFile> resourceFiles = new ArrayList<>();
        //...根据后缀(pdf/ppt/word)由工厂方法创建不同的类对象(PdfFile/PPTFile/WordFile)
        resourceFiles.add(new PdfFile("a.pdf"));
//        resourceFiles.add(new WordFile("b.word"));
//        resourceFiles.add(new PPTFile("c.ppt"));
        return resourceFiles;
    }
}
