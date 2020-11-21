package com.pattern.main.iterator;

import com.pattern.iterator.Iterator;

/**
 * 遍历书架的类
 */
public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf){
        this.bookShelf=bookShelf;
        this.index=0;
    }
    @Override
    public boolean hasNext() {
        if(index<bookShelf.getLength()){
            return true;
        }
        return false;
    }

    @Override
    public Object getNext() {
        Book book=this.bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
