package fr.sdv.bank.entities;

public abstract class Operation {
    private String date;
    private double amount;

    public Operation(String date, double amount) {
        this.date = date;
        this.amount = amount;
    }

    public abstract String AfficherType ();

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Operation{");
        sb.append("date='").append(date).append('\'');
        sb.append(", amount=").append(amount);
        sb.append(", type=").append(AfficherType());
        sb.append('}');
        return sb.toString();
    }
}
