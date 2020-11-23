package com.pattern.runer;

import com.pattern.factory.Factory;
import com.pattern.factory.Product;
import com.pattern.main.factory.IDCardFactory;

public class FactoryRuner {
    public static void main(String[] args) {
        Factory factory=new IDCardFactory();
        Product card1=factory.create("小明");
        Product card2=factory.create("小黑");
        Product card3=factory.create("小国");

        card1.use();
        card2.use();
        card3.use();
    }
}
