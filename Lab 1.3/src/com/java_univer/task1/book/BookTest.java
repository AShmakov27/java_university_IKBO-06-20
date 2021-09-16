package com.java_univer.task1.book;

import com.java_univer.task1.book.Book;

public class BookTest {
    public void Test() {
        Book book1 = new Book("book1", "author1", 1991);
        Book book2 = new Book("book2", "author2", 2008);
        System.out.println(book1.toString());
        book1.setName("another");
        System.out.println(book1.toString());
        System.out.println(book2.toString());
    }
}
