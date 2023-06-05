package org.example.check.example2.smell;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
class Triangle extends Shape {
    private final double base;
    private final double height;
}