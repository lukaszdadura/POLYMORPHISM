package model.shape;

public class Parallelogram extends GeometricPrimitive {

    private double base;
    private double side;
    private double height;

    public Parallelogram(double base, double side, double height) {
        validateParallelogramInput(base, side, height);
        this.base = base;
        this.side = side;
        this.height = height;
    }

    @Override
    double perimeter() {
        return (base + side) * 2;
    }

    @Override
    double area() {
        return base * height;
    }

    void validateParallelogramInput(double base, double side, double height) {
        if (base <= 0 || side <= 0 || height <= 0) {
            throw new IllegalArgumentException("The arguments you have provided cannot be <= 0");
        }
    }
}
