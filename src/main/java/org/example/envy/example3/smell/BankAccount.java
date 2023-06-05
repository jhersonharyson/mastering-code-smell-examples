package org.example.envy.example3.smell;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BankAccount {
    private final String accountNumber;
    private double balance;


    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double calculateInterest(double interestRate) {
        return balance * interestRate;
    }
}


