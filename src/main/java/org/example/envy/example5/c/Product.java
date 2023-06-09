package org.example.envy.example5.c;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private final String name;
    private final double price;
    private int quantity;

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    };

    public void reduceQuantity(int quantityToReduce) {
        if (quantityToReduce <= quantity) {
            quantity -= quantityToReduce;
            System.out.println("Reduced " + quantityToReduce + " units of " + name);
        } else {
            throw new IllegalArgumentException("Quantity to reduce exceeds available quantity.");
        }
    }
}

