package model.shape;

public class Diamond extends GeometricPrimitive {

    private double side;
    private double firstDiagonal;
    private double secondDiagonal;

    public Diamond(double side, double firstDiagonal, double secondDiagonal) {
        validateDiamondInput(side, firstDiagonal, secondDiagonal);
        this.side = side;
        this.firstDiagonal = firstDiagonal;
        this.secondDiagonal = secondDiagonal;
    }

    @Override
    double perimeter() {
        return side * 4;
    }

    @Override
    double area() {
        return (firstDiagonal * secondDiagonal) / 2;
    }

    void validateDiamondInput(double side, double firstDiagonal, double secondDiagonal) {
        if (side <= 0 || firstDiagonal <= 0 || secondDiagonal <= 0) {
            throw new IllegalArgumentException("The arguments you have provided cannot be <= 0");
        }
    }
}
