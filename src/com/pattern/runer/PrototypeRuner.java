package com.pattern.runer;

import com.pattern.main.prototype.Manager;
import com.pattern.main.prototype.MessageBox;
import com.pattern.main.prototype.UnderlinePen;
import com.pattern.prototype.Product;

public class PrototypeRuner {
    public static void main(String[] args) {
        Manager manager=new Manager();
        UnderlinePen underlinePen=new UnderlinePen('~');
        MessageBox messageBox1=new MessageBox('*');
        MessageBox messageBox2=new MessageBox('/');
        manager.register("strong message",underlinePen);
        manager.register("warning box",messageBox1);
        manager.register("slash box",messageBox2);

        Product p1=manager.create("strong message");
        p1.use("Hello World");
        Product p2=manager.create("warning box");
        p2.use("Hello World");
        Product p3=manager.create("slash box");
        p3.use("Hello World");
    }
}
