package org.example.Animals;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();

        animals.add(new Chiwawa("Dogo", new Date(2005, 3,20)));
        animals.add(new Fish("Fisho", new Date(2006, 4,21)));
        animals.add(new Bird("Birdo", new Date(2007, 5,22)));

        for (Animal a : animals){
            a.move();

            if (a instanceof Dog d)   // si "a" est une instance chien. "d" est une variable temporaire qui va contenir a qu'on parcourt
                d.bark();
            if (a instanceof Bird b)
                b.shit();
            if (a instanceof Fish f)
                f.gloops();

        }
    }
}
