package com.java_univer;
import com.java_univer.AbstractPerson;
final public class Client extends AbstractPerson{
    String service;
    float price;
    public Client(String name, String service, float price) {
        super(name);
        this.service = service;
        this.price = price;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
    @Override
    public String think() {
        return "I'm a client";
    }
}
