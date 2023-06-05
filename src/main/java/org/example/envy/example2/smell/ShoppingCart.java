package org.example.envy.example2.smell;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ShoppingCart {
    private List<Item> items;

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (Item item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
}