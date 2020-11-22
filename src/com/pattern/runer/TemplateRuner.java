package com.pattern.runer;

import com.pattern.main.template.CharDisplay;
import com.pattern.main.template.StringDisplay;
import com.pattern.template.AbstractDisplay;

/**
 * template 模式运行测试
 */
public class TemplateRuner {
    public static void main(String[] args) {
        AbstractDisplay d1=new CharDisplay('H');
        AbstractDisplay d2=new StringDisplay("Hello,World!");
        AbstractDisplay d3=new StringDisplay("你好，世界!\t");
        d1.display();
        d2.display();
        d3.display();
    }
}
