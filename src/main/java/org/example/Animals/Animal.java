package org.example.Animals;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter @Setter
public abstract class Animal { //cette classe ne sera jamais instanciée

    private String name;
    private Date birthdate;

    public Animal(String name, Date birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public abstract void move();
}
