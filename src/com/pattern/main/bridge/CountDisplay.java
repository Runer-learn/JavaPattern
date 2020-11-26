package com.pattern.main.bridge;

import com.pattern.bridge.Display;
import com.pattern.bridge.DisplayImpl;

public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl display) {
        super(display);
    }

    public void multiDisplay(int times){
        open();
        for(int i=0;i<times;i++){
            print();
        }
        close();
    }
}
