package com.pattern.main.builder;

import com.pattern.builder.Builder;

public class TextBuilder extends Builder {
    private StringBuffer buffer=new StringBuffer();

    @Override
    public void makeTitle(String title) {
        buffer.append("==============================");
        buffer.append("["+title+"]\n");
        buffer.append("\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append("$"+str+"\n");
        buffer.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (int i=0;i<items.length;i++){
            buffer.append(" ."+items[i]+"\n");
        }
        buffer.append("\n");
    }

    @Override
    public void close() {
        buffer.append("================================");
    }

    public String getResult(){
        return buffer.toString();
    }
}
