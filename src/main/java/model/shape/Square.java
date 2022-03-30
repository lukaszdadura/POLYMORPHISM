package model.shape;

public class Square extends GeometricPrimitive {

    private double side;

    public Square(double side) {
        validateSquareInput(side);
        this.side = side;
    }

    @Override
    double perimeter() {
        return side * 4;
    }

    @Override
    double area() {
        return Math.pow(side, 2.0);
    }

    void validateSquareInput(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("The arguments you have provided cannot be <= 0");
        }
    }
}
