package com.pattern.main.prototype;

import com.pattern.prototype.Product;

import java.util.HashMap;

public class Manager {
    private HashMap showcase=new HashMap();
    public void register(String name, Product product){
        showcase.put(name,product);
    }
    public Product create(String name){
        Product product=(Product)showcase.get(name);
        return product.createClone();
    }
}
