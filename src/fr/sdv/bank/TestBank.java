package fr.sdv.bank;

import fr.sdv.bank.entities.Compte;
import fr.sdv.bank.entities.CompteTaux;

public class TestBank {
    public static void main(String[] args) {
        Compte monCompte2 = new Compte(2, 851.3);
        System.out.println(monCompte2.toString());
        CompteTaux monCompte3 = new CompteTaux(2, 851.3, 7);
        System.out.println(monCompte3.toString());
    }
}
