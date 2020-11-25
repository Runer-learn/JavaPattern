package com.pattern.main.abstractfactory;

import com.pattern.abstractfactory.Factory;
import com.pattern.abstractfactory.Link;
import com.pattern.abstractfactory.Page;
import com.pattern.abstractfactory.Tray;

public class TableFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return null;
    }

    @Override
    public Tray createTray(String caption) {
        return null;
    }

    @Override
    public Page createPage(String title, String author) {
        return null;
    }
}
