package com.pattern.runer;

import com.pattern.main.builder.Director;
import com.pattern.main.builder.HtmlBuilder;
import com.pattern.main.builder.TextBuilder;

public class BuilderRuner {
    public static void main(String[] args) {
        TextBuilder textBuilder=new TextBuilder();
        Director director=new Director(textBuilder);
        director.construct();
        String result=textBuilder.getResult();
        System.out.println(result);

        HtmlBuilder htmlBuilder=new HtmlBuilder();
        Director director1=new Director(htmlBuilder);
        director1.construct();
        String filename=htmlBuilder.getResult();
        System.out.println(filename+"文件编写完成");
    }
}
