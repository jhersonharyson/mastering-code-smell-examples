package org.example.envy.example5.c;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private final List<Product> products;

    public Inventory() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Product getProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public void sellProduct(String productName, int quantityToSell) {
        Product product = getProductByName(productName);
        if (product != null) {
            try {
                product.reduceQuantity(quantityToSell);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Product not found in inventory.");
        }
    }
}
