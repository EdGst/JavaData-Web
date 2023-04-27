package org.example.Animals;

import java.util.Date;

public class Dog extends Animal{
    Dog(String name, Date birthdate) {
        super(name, birthdate);
    }

    @Override
    public void move(){
        System.out.println("I'm a dog and i run...");
    }

    public void bark(){
        System.out.println("Wouf !");
    }

}
