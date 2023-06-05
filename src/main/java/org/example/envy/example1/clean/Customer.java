package org.example.envy.example1.clean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {
    private final String name;
    private final int age;
    private final double balance;

    // Method to calculate the service fee
    public double calculateServiceFee() {
        if (age >= 60) {
            return balance * 0.02;  // Service fee for customers aged 60 or above
        } else {
            return balance * 0.05;  // Service fee for customers below 60
        }
    }
}