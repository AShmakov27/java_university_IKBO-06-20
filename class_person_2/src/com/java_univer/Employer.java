package com.java_univer;
import com.java_univer.AbstractPerson;
final public class Employer extends AbstractPerson{
    String department;
    public Employer(String name) {
        super(name);
    }
    @Override
    public String think() {
        return Employer.class.getName();
    }
}
