package com.java_univer;
import com.java_univer.AbstractPerson;
final public class Employee extends AbstractPerson{
    String department;
    String position;

    public Employee(String name, String department, String position) {
        super(name);
        this.department = department;
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }
    @Override
    public String think() {
        return "I'm a employee";
    }
}
