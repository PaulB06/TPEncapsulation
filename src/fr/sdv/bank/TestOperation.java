package fr.sdv.bank;

import fr.sdv.bank.entities.Credit;
import fr.sdv.bank.entities.Debit;
import fr.sdv.bank.entities.Operation;

import java.util.ArrayList;
import java.util.List;

public class TestOperation {
    public static void main(String[] args) {
        List<Operation> operations = new ArrayList<>();
        double totalOperation = 0;
        operations.add(new Credit("5 janvier",215.3));
        operations.add(new Debit("28 janvier", 2581));
        operations.add(new Debit("6 juillet", 1203.45));
        operations.add(new Credit("5 décembre", 854.1));
        for (Operation operation : operations) {
            System.out.println(operation.toString());
            if (operation instanceof Credit) {
                totalOperation += operation.getAmount();
            }
            else if (operation instanceof Debit) {
                totalOperation -= operation.getAmount();
            }
        }
        System.out.println("Total operation: " + totalOperation);

    }
}
