package com.pattern.runer;

import com.pattern.abstractfactory.Factory;
import com.pattern.abstractfactory.Link;
import com.pattern.abstractfactory.Page;
import com.pattern.abstractfactory.Tray;

public class AbstractFactoryRuner {
    public static void main(String[] args) {
        /*
        if(args.length!=1){
            System.out.println("Usage: Java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1:Java Main listfactory.ListFactory");
            System.out.println("Example 2:Java Main tablefactory.TableFactory");
            System.exit(0);
        }
         */
//        Factory factory=Factory.getFactory(args[0]);
        Factory factory=Factory.getFactory("ListFactory");
        Link people=factory.createLink("人民日报","http://www.people.com.cn/");
        Link gmw=factory.createLink("光明日报","http://www.gmw.cn/");

        Link us_yahoo=factory.createLink("Yahoo!","http://yahoo.com/");
        Link jp_yahoo=factory.createLink("Yahoo!Japan","http://www.yahoo.co.jp/");
        Link excite=factory.createLink("Excite","http://www.excite.com/");
        Link google=factory.createLink("Google","http://www.google.com/");

        Tray traynews=factory.createTray("日报");
        traynews.add(people);
        traynews.add(gmw);

        Tray trayahoo=factory.createTray("Yahoo!");
        trayahoo.add(us_yahoo);
        trayahoo.add(jp_yahoo);

        Tray traysearch=factory.createTray("检索引擎");
        traysearch.add(trayahoo);
        traysearch.add(excite);
        traysearch.add(google);

        Page page=factory.createPage("LinkPage","Test");
        page.add(traynews);
        page.add(traysearch);

        page.output();

    }
}
