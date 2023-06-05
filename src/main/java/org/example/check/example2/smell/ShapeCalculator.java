package org.example.check.example2.smell;

public class ShapeCalculator {
    public static double calculateArea(Shape shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return Math.PI * Math.pow(circle.getRadius(), 2);
        } else if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.getLength() * rectangle.getWidth();
        } else if (shape instanceof Triangle) {
            Triangle triangle = (Triangle) shape;
            return 0.5 * triangle.getBase() * triangle.getHeight();
        } else {
            throw new IllegalArgumentException("Unsupported shape type: " + shape.getClass());
        }
    }
}
