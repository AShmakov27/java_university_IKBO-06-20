package com.java_univer;

public class Pract5_task3 {
    public void printRange(int a, int b) {
        if (a < b) {
            System.out.println(a);
            a = ++a;
            printRange(a, b);
        } else if (a > b) {
            System.out.println(a);
            a = --a;
            printRange(a, b);
        }
        else {System.out.println(a);}
    }
}
