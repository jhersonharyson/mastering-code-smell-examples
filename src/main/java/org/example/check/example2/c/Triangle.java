package org.example.check.example2.c;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
class Triangle extends Shape {
    private final double base;
    private final double height;

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}