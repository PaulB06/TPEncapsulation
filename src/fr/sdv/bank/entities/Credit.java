package fr.sdv.bank.entities;

public class Credit extends Operation {

    public Credit(String date, double amount) {
        super(date, amount);
    }

    public String AfficherType() {
        return "Crédit";
    }
}
