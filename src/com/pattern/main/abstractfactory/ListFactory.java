package com.pattern.main.abstractfactory;

import com.pattern.abstractfactory.Factory;
import com.pattern.abstractfactory.Link;
import com.pattern.abstractfactory.Page;
import com.pattern.abstractfactory.Tray;

public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption,url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title,author);
    }
}
