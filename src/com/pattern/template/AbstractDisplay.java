package com.pattern.template;

/**
 * 抽象行为模板
 */
public abstract class AbstractDisplay {
    public abstract void open();
    public abstract void close();
    public abstract void print();

    public final void display(){
        open();
        for(int i=0;i<5;i++){
            print();
        }
        close();
    }
}
