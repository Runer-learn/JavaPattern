package com.pattern.runer;

import com.pattern.main.adapter.Banner;
import com.pattern.main.adapter.DelegationPrintBanner;

/**
 * 委托适配器测试
 */
public class DelegationAdapterRuner {
    public static void main(String[] args) {
        Banner banner=new Banner("Delegation Hello");
        DelegationPrintBanner delegationPrintBanner=new DelegationPrintBanner(banner);
        delegationPrintBanner.printStrong();
        delegationPrintBanner.printWeak();
    }
}
