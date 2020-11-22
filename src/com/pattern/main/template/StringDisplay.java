package com.pattern.main.template;

import com.pattern.template.AbstractDisplay;

/**
 * StringDisplay 具体行为
 */
public class StringDisplay extends AbstractDisplay {
    private String string;
    private int width;
    public StringDisplay(String string){
        this.string=string;
        this.width=this.string.getBytes().length;
    }
    @Override
    public void open() {
        printLine();
    }

    @Override
    public void close() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|"+string+"|");
    }

    void printLine(){
        System.out.print("+");
        for(int i=0;i<width;i++){
            System.out.print("-");
        }
        System.out.println("+");
    }
}
