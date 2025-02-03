package fr.sdv.bank.entities;

public class Debit extends Operation {
    public Debit(String date, double amount) {
        super(date, amount);
    }

    public String AfficherType() {
        return "Débit";
    }
}
