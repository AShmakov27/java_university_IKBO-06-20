package com.java_univer;
import com.java_univer.PersonTest;
import com.java_univer.PersonExTest;
import com.java_univer.HumanInterface;
import com.java_univer.AbstractPerson;
import com.java_univer.Employee;
import com.java_univer.Client;
public class Main {
    public static void main(String[] args) {
        PersonTest test1 = new PersonTest();
        PersonExTest test2 = new PersonExTest();
        HumanInterfaceTest test3 = new HumanInterfaceTest();
        System.out.println("Test of class Person");
        test1.test();
        System.out.println("---------------------------------");
        System.out.println("Test of class PersonEx");
        test2.test();
        System.out.println("---------------------------------");
        System.out.println("Test of class HumanInterface");
        test3.test();
        System.out.println("---------------------------------");
    }
}
