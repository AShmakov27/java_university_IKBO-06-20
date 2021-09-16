package com.java_univer;
import java.lang.Exception;
public class PersonEx {
    int age;
    float height;
    String name;
    Gender gender;
    public static final int MAX_AGE=200;
    public static final float MAX_HEIGHT=3.2F;
    public enum Gender{
        MALE(1, "Мужчина"),
        FEMALE(2, "Женщина"),
        OTHER(1024, "Другое");
        private int value;
        private String strvalue;
        private Gender(int value, String strgvalue)
        {
        this.value=value;
        this.strvalue = strvalue;
        };
        public int getValue() {
            return value;
        };
        public String getStringvalue() {
            return strvalue;
        };
    };
    public PersonEx() {};
    public void setGender(Gender gender)
    {
        this.gender = gender;
    };
    public void setAge(int age) throws Exception{
        if (age >= MAX_AGE){
            throw new Exception("Ошибка ввода возраста");
        }
        else
            this.age = age;
    };
    public void setHeight(float height) throws Exception{
        if (height >= MAX_HEIGHT){
            throw new Exception("Ошибка ввода роста");
        }
        else
            this.height = height;
    };
    public void setName(String name) throws Exception{
        if (name.isEmpty()){
            throw new Exception("Строка пуста");
        }
        else
            this.name = name;
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
