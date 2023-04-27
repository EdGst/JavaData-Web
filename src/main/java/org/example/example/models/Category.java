package org.example.example.models;

public enum Category {


    action(1),
    aventure(2),
    horreur(4),
    fantasy(8);

    public Integer value;

    Category(int value){
        this.value = value;
    }

}
