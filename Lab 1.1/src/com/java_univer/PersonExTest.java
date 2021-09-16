package com.java_univer;
import java.util.Scanner;
import com.java_univer.PersonEx;
public class PersonExTest {
    void test() {
        PersonEx p = new PersonEx();
        System.out.println("Enter the data of new person: ");
        Scanner scan = new Scanner(System.in);
        try {
            p.setAge(scan.nextInt());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        } finally {
            System.out.println(p.getAge());
        }
        try {
            p.setHeight(scan.nextFloat());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        } finally {
            System.out.println(p.getHeight());
        }
        p.setGender(PersonEx.Gender.MALE);
        try {
            p.setName(scan.nextLine());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        } finally {
            System.out.println(p.getName());
        }
    }
}