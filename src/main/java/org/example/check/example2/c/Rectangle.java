package org.example.check.example2.c;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
class Rectangle extends Shape {
    private final double length;
    private final double width;

    @Override
    public double calculateArea() {
        return length * width;
    }
}

