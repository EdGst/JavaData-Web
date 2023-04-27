package org.example.compte;

import org.example.compte.exceptions.MontantNegatifException;
import org.example.compte.exceptions.SoldeInsuffisantException;
import org.example.compte.models.Compte;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Compte c1 = new Compte("1", 1000);
        c1.addPassageEnNegatifSubscriber( compte -> System.out.println("le compte numero " + compte.getNumero() + " est passé en négatif"));
        c1.addPassageEnNegatifSubscriber( toto -> System.out.println("Nouveau solde" + toto.getSolde()));
        c1.addPassageEnNegatifSubscriber( compte -> System.out.println("C'est quand même pas mal...."));
        c1.addPassageEnNegatifSubscriber( compte -> System.out.println("Il est capable de retenir tout ce que je veux executer"));
        Compte c2 = new Compte("2", 1000);
        c2.addPassageEnNegatifSubscriber( compte -> System.out.println("le compte numero " + compte.getNumero() + " est passé en négatif"));


        List<Integer> ints = new ArrayList<>();

        ints.stream()
                .filter(i -> i % 2 == 0 )
                .toList();


        System.out.println("La vie est belle");
        System.out.println("La vie est belle");
        System.out.println("La vie est belle");
        System.out.println("La vie est belle");
        System.out.println("La vie est belle");
        System.out.println("La vie est belle");
        System.out.println("La vie est belle");
        System.out.println("La vie est belle");
        try {
            c2.depot(10);
            c2.retrait(100);
            System.out.println("Ok");
        }
        catch (MontantNegatifException e){
            System.out.println("T'es con ou quoi ?");
            System.out.println(e.getMessage());
        }
        catch (SoldeInsuffisantException e){
            System.out.println("Va travailler ou faire une formation pour devenir un super dev");
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Finis");

    }
}
