package model.shape;

public class Circle extends GeometricPrimitive {

    private double radius;

    public Circle(double radius) {
        validateCircleInput(radius);
        this.radius = radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2.0);
    }

    void validateCircleInput(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("The arguments you have provided cannot be <= 0");
        }
    }
}
