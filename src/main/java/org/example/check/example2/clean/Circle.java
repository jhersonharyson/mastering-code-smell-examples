package org.example.check.example2.clean;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
class Circle extends Shape {
    private final double radius;

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
