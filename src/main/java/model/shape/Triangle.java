package model.shape;

public class Triangle extends GeometricPrimitive {

    private double base;
    private double firstSide;
    private double secondSide;
    private double height;

    public Triangle(double base, double firstSide, double secondSide) {
        validateTriangleInput(base, firstSide, secondSide);
        this.base = base;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = calculateHeightFromHeronsFormula(base, firstSide, secondSide);
    }

    private double calculateHeightFromHeronsFormula(double base, double firstSide, double secondSide) {

        double semiPerimeter = (firstSide + secondSide + base) / 2;
        return (2 * (Math.sqrt(semiPerimeter * (semiPerimeter - base) * (semiPerimeter - firstSide) * (semiPerimeter - secondSide)))) / base;
    }

    @Override
    double perimeter() {
        return firstSide + secondSide + base;
    }

    @Override
    double area() {
        return (base * height) / 2;
    }

    void validateTriangleInput(double base, double firstSide, double secondSide) {
        if (base <= 0 || firstSide <= 0 || secondSide <= 0) {
            throw new IllegalArgumentException("The arguments you have provided cannot be <= 0");
        }
    }
}
