package fr.sdv.bank;

import fr.sdv.bank.entities.Compte;

public class TestBank {
    public static void main(String[] args) {
        Compte monCompte2 = new Compte(2, 851.3);
        System.out.println(monCompte2.toString());
    }
}
