package com.java_univer;
import com.java_univer.task1.book.BookTest;
import com.java_univer.task1.ball.BallTest;
import com.java_univer.task1.dog.DogTest;
import com.java_univer.task2.author.AuthorTest;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task 1 test");
        new BallTest().Test();
        new BookTest().Test();
        new DogTest().Test();
        System.out.println("-------------------");
        System.out.println("Task 2 test");
        new BallTest().Test();
        new AuthorTest().Test();
        System.out.println("-------------------");
    }
}
