package com.java_univer;
import com.java_univer.AbstractPerson;
final public class Client extends AbstractPerson{
    String service;
    float price;
    public Client(String name) {
        super(name);
    }
    @Override
    public String think() {
        return "I'm a client";
    }
}
