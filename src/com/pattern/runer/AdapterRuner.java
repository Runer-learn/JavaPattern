package com.pattern.runer;

import com.pattern.adapter.Print;
import com.pattern.main.adapter.PrintBanner;

/**
 * 测试Adapter模式运行
 */
public class AdapterRuner {
    public static void main(String[] args) {
        Print print=new PrintBanner("Hello");
        print.printStrong();
        print.printWeak();
    }
}
