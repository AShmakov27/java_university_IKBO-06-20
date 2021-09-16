package com.java_univer;
import com.java_univer.Person;

import java.util.Scanner;

public class PersonTest {
    void test() {
        Person p = new Person();
        System.out.println("Enter the data of new person: ");
        Scanner scan = new Scanner(System.in);
        if (!p.setAge(scan.nextInt()))
        {
            System.out.println("Error");
            System.exit(0);
        }
        if (!p.setHeight(scan.nextFloat()))
        {
            System.out.println("Error");
            System.exit(0);
        }
        if (!p.setName(scan.nextLine()))
        {
            System.out.println("Error");
            System.exit(0);
        }
        System.out.println("Age: " + p.getAge() + " Height: " + p.getHeight() + " Name:" + p.getName());
    }
}
