package com.java_univer;

public abstract class AbstractPerson implements HumanInterface{
    String name;
    public String getName(){
       return name;
    };
    public abstract String think();
    AbstractPerson(String name){
        this.name = name;
    }
}
