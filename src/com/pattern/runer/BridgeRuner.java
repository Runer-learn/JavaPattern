package com.pattern.runer;

import com.pattern.bridge.Display;
import com.pattern.main.bridge.CountDisplay;
import com.pattern.main.bridge.StringDisplayImpl;

public class BridgeRuner {
    public static void main(String[] args) {
        Display d1=new Display(new StringDisplayImpl("Hello，China."));
        Display d2=new Display(new StringDisplayImpl("Hello,world"));

        CountDisplay d3=new CountDisplay(new StringDisplayImpl("Hello Universe"));

        d1.display();
        d2.display();
        d3.display();

        d3.multiDisplay(5);
    }
}
