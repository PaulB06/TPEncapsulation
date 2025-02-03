package fr.sdv.bank;

import fr.sdv.bank.entities.Compte;

public class Main {


    public static void main(String[] args) {
        Compte monCompte = new Compte(1, 851.3);
        System.out.println(monCompte.getSolde());
    }
}