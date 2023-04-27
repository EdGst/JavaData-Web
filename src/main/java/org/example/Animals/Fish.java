package org.example.Animals;

import java.util.Date;

public class Fish extends Animal{
    Fish(String name, Date birthdate) {
        super(name, birthdate);
    }

    @Override
    public void move(){
        System.out.println("I'm a fish and i swim really fast !");
    }

    public void gloops(){
        System.out.println("Gloups");
    }
}
