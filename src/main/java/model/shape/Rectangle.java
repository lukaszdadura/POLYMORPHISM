package model.shape;

public class Rectangle extends GeometricPrimitive {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        validateRectangleInput(length, width);
        this.length = length;
        this.width = width;
    }

    @Override
    double perimeter() {
        return (length + width) * 2;
    }

    @Override
    double area() {
        return length * width;
    }

    void validateRectangleInput(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("The arguments you have provided cannot be <= 0");
        }
    }
}
