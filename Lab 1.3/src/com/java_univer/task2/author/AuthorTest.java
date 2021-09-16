package com.java_univer.task2.author;

import com.java_univer.task2.author.Author;

public class AuthorTest {
    public void Test() {
        Author author = new Author("name", "example@for.test", 'M');
        System.out.println(author.getEmail());
        System.out.println(author.getName());
        System.out.println(author.getGender());
        author.setEmail("example2@for.test");
        System.out.println(author.toString());
    }
}
