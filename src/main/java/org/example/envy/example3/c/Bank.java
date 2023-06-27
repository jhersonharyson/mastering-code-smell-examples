package org.example.envy.example3.c;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<BankAccount> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public double calculateTotalInterest(double interestRate) {
        double totalInterest = 0.0;
        for (BankAccount account : accounts) {
            totalInterest += account.calculateInterest(interestRate);
        }
        return totalInterest;
    }
}
