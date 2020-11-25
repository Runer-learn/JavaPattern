package com.pattern.main.builder;

import com.pattern.builder.Builder;

public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder=builder;
    }

    public void construct(){
        builder.makeTitle("Greeting");
        builder.makeString("from early to later");
        builder.makeItems(new String[]{
                "Good morining",
                "Gooe latter"
        });
        builder.makeString("Good afternoon");
        builder.makeItems(new String[]{
                "晚上好",
                "晚安",
                "再见"
        });
        builder.close();
    }
}
