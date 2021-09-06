package com.java_univer;
import java.util.Scanner;
class constants{
    public static final int MAX_AGE = 200;
    public static final float MAX_HEIGHT = 3.2F;
}
class person{
    int age;
    float height;
    String name;
    public person(int age, float height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }
    public void check_valid(){
        if ((age < constants.MAX_AGE) & (height < constants.MAX_HEIGHT)) {
            System.out.println("Data is correct");
            this.out_data();
        }
        else {
            System.out.println("Error, age or height isn't real");
            this.out_data();
        }
    };
    public void out_data(){
        System.out.println("age: " + this.age + " height: " + this.height + " name: " + this.name);
    };
}
public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the data of new person: ");
        Scanner scan = new Scanner(System.in);
        person p = new person(scan.nextInt(), scan.nextFloat(), scan.nextLine());
        p.check_valid();
    }
}
