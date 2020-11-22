package com.pattern.main.adapter;

import com.pattern.adapter.Print;

/**
 * 使用委托代理
 */
public class DelegationPrintBanner implements Print {
    private Banner banner;
    public DelegationPrintBanner(Banner banner){
        this.banner=banner;
    }

    @Override
    public void printWeak() {
        this.banner.showWithParen();
    }

    @Override
    public void printStrong() {
        this.banner.showWithAster();
    }
}
