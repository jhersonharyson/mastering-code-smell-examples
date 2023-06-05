package org.example.envy.example1.smell;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ServiceCustomer {
    public static double calculateServiceFee(Customer customer) {
        if (customer.getAge() >= 60) {
            return customer.getBalance() * 0.02;  // Service fee for customers aged 60 or above
        } else {
            return customer.getBalance() * 0.05;  // Service fee for customers below 60
        }
    }
}