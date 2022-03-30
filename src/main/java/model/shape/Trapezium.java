package model.shape;

public class Trapezium extends GeometricPrimitive {

    private double firstBase;
    private double secondBase;
    private double firstSide;
    private double secondSide;
    private double height;

    public Trapezium(double firstBase, double secondBase, double firstSide, double secondSide, double height) {
        validateTrapeziumInput(firstBase, secondBase, firstSide, secondSide, height);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    double perimeter() {
        return firstBase + secondBase + firstSide + secondSide;
    }

    @Override
    double area() {
        return (firstBase + secondBase / 2.0) * height;
    }

    void validateTrapeziumInput(double firstBase, double secondBase, double firstSide, double secondSide, double height) {
        if (firstBase <= 0 || secondBase <= 0 || firstSide <= 0 || secondSide <= 0 || height <= 0) {
            throw new IllegalArgumentException("The arguments you have provided cannot be <= 0");
        }
    }
}
