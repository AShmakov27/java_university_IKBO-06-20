package com.java_univer.task1.dog;

import com.java_univer.task1.dog.Dog;

public class DogTest {
    public void Test() {
        Dog dog1 = new Dog("FirstTest", 4);
        Dog dog2 = new Dog("SecondTest", 8);
        Dog dog3 = new Dog("ThirdTest");
        dog3.setAge(1);
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        System.out.println(dog3.toString());
        dog1.intoHumanAge();
        dog2.intoHumanAge();
        dog3.intoHumanAge();
    }
}
