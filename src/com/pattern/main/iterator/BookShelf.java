package com.pattern.main.iterator;

import com.pattern.iterator.Aggregate;
import com.pattern.iterator.Iterator;

/**
 * 书架
 */
public class BookShelf implements Aggregate {
    private Book[] books;
    private int last=0;
    public BookShelf(int maxsize){
        this.books=new Book[maxsize];
    }

    public Book getBookAt(int index){
        return books[index];
    }

    public void appendBook(Book book){
        this.books[this.last]=book;
        this.last++;
    }

    public int getLength(){
        return this.last;
    }

    public Iterator iterator(){
        return new BookShelfIterator(this);
    }
}
