package com.java_univer;

public class Pract5_task2 {
    public int counter = 1;
    public void printNumbers(int n) {
        System.out.println(counter);
        if (counter == n) return;
        counter++;
        printNumbers(n);
    }
}
