package com.java_univer;
import com.java_univer.AbstractPerson;
final public class Employee extends AbstractPerson{
    String department;
    public Employee(String name) {
        super(name);
    }
    @Override
    public String think() {
        return "I'm a employee";
    }
}
