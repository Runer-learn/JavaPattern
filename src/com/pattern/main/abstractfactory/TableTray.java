package com.pattern.main.abstractfactory;

import com.pattern.abstractfactory.Item;
import com.pattern.abstractfactory.Tray;

import java.util.Iterator;

public class TableTray extends Tray {
    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer=new StringBuffer();
        buffer.append("<td>");
        buffer.append("<table with=\"100%\" border=\"1\"><tr>");
        buffer.append("<td bgcolor=\"#cccccc\" align=\"center\" colspan=\""+tray.size()+"\"><b>"+caption+"</b></td>");
        buffer.append("</tr>");
        buffer.append("<tr>\n");
        Iterator iterator=tray.iterator();
        while (iterator.hasNext()){
            Item item=(Item)iterator.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</tr></table>");
        buffer.append("</td>");
        return buffer.toString();
    }
}
