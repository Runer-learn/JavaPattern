package com.pattern.main.template;

import com.pattern.template.AbstractDisplay;

/**
 * CharDisplay 具体行为
 */
public class CharDisplay extends AbstractDisplay {
    private char ch;
    public CharDisplay(char ch){
        this.ch=ch;
    }
    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void close() {
        System.out.println(">>");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }
}
