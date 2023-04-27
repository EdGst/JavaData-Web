package org.example.compte.models;

import org.example.compte.exceptions.MontantNegatifException;
import org.example.compte.exceptions.SoldeInsuffisantException;
import org.example.compte.interfaces.PassageEnNegatifSubscriber;

import java.util.ArrayList;
import java.util.List;

public class Compte {

    private final List<PassageEnNegatifSubscriber> passageEnNegatifEvent = new ArrayList<>();

    private String numero;

    private double solde;

    private double ligneDeCredit;

    public Compte(String numero, double ligneDeCredit) {
        this.numero = numero;
        this.solde = 0;
        this.ligneDeCredit = ligneDeCredit;
    }

    public double getLigneDeCredit() {
        return ligneDeCredit;
    }

    public double getSolde() {
        return solde;
    }

    public String getNumero() {
        return numero;
    }

    private void setSolde(double solde){

        this.solde = solde;
    }

    private void setLigneDeCredit(double ligneDeCredit) throws MontantNegatifException {

        if (ligneDeCredit < 0)
            throw new MontantNegatifException("Ligne de crédit doit être positive");
        this.ligneDeCredit = ligneDeCredit;
    }

    public void retrait(double montant) throws Exception {

        double ancientSolde = getSolde();

        if(montant < 0)
            throw new MontantNegatifException("Le montant doit être positif");
        if(solde - montant < -getLigneDeCredit())
            throw new SoldeInsuffisantException("Solde insuffisant");

        setSolde(getSolde()-montant);

        if(ancientSolde > 0 && getSolde() < 0)
            raisePassageEnNegatifEvent();
    }

    public void depot (double montant) throws Exception{

        if(montant < 0)
            throw new MontantNegatifException();

        setSolde(getSolde()+montant);
    }

    public void addPassageEnNegatifSubscriber(PassageEnNegatifSubscriber subscriber){

        passageEnNegatifEvent.add(subscriber);
    }
    public void delPassageEnNegatifSubscriber(PassageEnNegatifSubscriber subscriber){

        passageEnNegatifEvent.remove(subscriber);
    }



    public void raisePassageEnNegatifEvent(){

        for(PassageEnNegatifSubscriber subscriber : passageEnNegatifEvent){

            subscriber.execute(this); // this car on est dans une instance de compte !!
        }
    }


}
