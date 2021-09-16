package com.java_univer;
import com.java_univer.HumanInterface;
import com.java_univer.AbstractPerson;
import com.java_univer.Employee;
import com.java_univer.Client;
public class HumanInterfaceTest {
    void test()
    {
        Employee employee = new Employee("employee");
        Client client = new Client("client");
        System.out.println(employee.getName());
        System.out.println(client.getName());
        System.out.println(employee.think());
        System.out.println(client.think());
    }
}
