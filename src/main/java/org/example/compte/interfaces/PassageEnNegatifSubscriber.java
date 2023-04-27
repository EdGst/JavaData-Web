package org.example.compte.interfaces;

import org.example.compte.models.Compte;

public interface PassageEnNegatifSubscriber {

    void execute(Compte c);// gràce à ça, on pourra passer une méthode en paramètre et le type sera PassageEnNegatifSubscriber
}
