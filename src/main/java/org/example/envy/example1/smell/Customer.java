package org.example.envy.example1.smell;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {
    private String name;
    private int age;
    private double balance;
}