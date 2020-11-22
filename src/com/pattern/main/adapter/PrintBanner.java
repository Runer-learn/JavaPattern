package com.pattern.main.adapter;

import com.pattern.adapter.Print;

/**
 * PrintBanner 适配Print接口
 */
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String string){
        super(string);
    }
    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
