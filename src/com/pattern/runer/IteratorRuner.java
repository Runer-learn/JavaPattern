package com.pattern.runer;

import com.pattern.iterator.Iterator;
import com.pattern.main.iterator.Book;
import com.pattern.main.iterator.BookShelf;

/**
 * 测试Iterator模式的主类
 */
public class IteratorRuner {
    public static void main(String[] argv){
        BookShelf bookShelf=new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));

        Iterator it=bookShelf.iterator();
        while (it.hasNext()){
            Book book=(Book) it.getNext();
            System.out.println("The Book's name is:"+book.getName());
        }
    }
}
