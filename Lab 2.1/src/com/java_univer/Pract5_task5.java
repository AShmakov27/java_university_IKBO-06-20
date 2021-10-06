package com.java_univer;

public class Pract5_task5 {
    private int sum;
    public void sumDigits(int n) {
        sum += n % 10;
        if (n == 0) {
            System.out.println(sum);
        } else {
            sumDigits(n / 10);
        }
    }
}
