package org.example.Animals;

import java.util.Date;

public class Bird extends Animal{
    Bird(String name, Date birthdate) {
        super(name, birthdate);
    }

    @Override
    public void move() {
        System.out.println("I'm a bird and I fly !");
    }

    public void shit(){
        System.out.println("Take that !");
    }
}
