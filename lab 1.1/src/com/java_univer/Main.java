package com.java_univer;
import java.util.Scanner;
import com.java_univer.Person;
import com.java_univer.PersonEx;
import com.java_univer.HumanInterface;
import com.java_univer.AbstractPerson;
import com.java_univer.Employer;
import com.java_univer.Client;
public class Main {
    public static void main(String[] args) {
        PersonEx p = new PersonEx();
        System.out.println("Enter the data of new person: ");
        Scanner scan = new Scanner(System.in);
        try {
            p.setAge(scan.nextInt());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        finally {
            System.out.println(p.getAge());
        }
        try {
            p.setHeight(scan.nextFloat());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        finally {
            System.out.println(p.getHeight());
        }
        p.setGender(PersonEx.Gender.MALE);
        try {
            p.setName(scan.nextLine());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        finally {
            System.out.println(p.getName());
        }
        Employer employer = new Employer("employer");
        Client client = new Client("client");
        System.out.println(employer.getName());
        System.out.println(client.getName());
        System.out.println(employer.think());
        System.out.println(client.think());
    }
}
