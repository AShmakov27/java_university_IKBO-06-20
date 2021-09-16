package com.java_univer;
public class Person {
    int age;
    float height;
    String name;
    public static final int MAX_AGE=200;
    public static final float MAX_HEIGHT=3.2F;
    public Person() {};
    public boolean setAge(int age) {
        if ((age < MAX_AGE)) {
            this.age = age;
            return true;
        }
        else {
            return false;
        }
    };
    public boolean setHeight(float height) {
        if ((height < MAX_HEIGHT)) {
            this.height = height;
            return true;
        }
        else {
            return false;
        }
    };
    public boolean setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
            return true;
        }
        else {
            return false;
        }
    };
    public String getName() {
        return name;
    };
    public int getAge() {
        return age;
    };
    public float getHeight() {
        return height;
    };
}
