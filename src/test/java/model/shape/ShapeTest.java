package model.shape;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeTest {

    private List<GeometricPrimitive> shapes;

    @BeforeEach
    void setUp() throws Exception {
        shapes = Arrays
                .asList(new Triangle(4.0, 5.0, 6.0),
                        new Diamond(4.5, 5.5, 6.5),
                        new Parallelogram(4.5, 5.5, 6.5),
                        new Rectangle(3.5, 5.5),
                        new Circle(4.5),
                        new Trapezium(8.0, 14.0, 5.0, 5.0, 4.0),
                        new Square(4.5));
    }

    @Test
    void ShouldCheckShapesPerimeter() throws Exception {
        assertEquals(shapes.stream().mapToDouble(s -> s.perimeter()).sum(), 149.27433388230813);
    }

    @Test
    void ShouldCheckShapesArea() throws Exception {
        assertEquals(shapes.stream().mapToDouble(s -> s.area()).sum(), 220.16381865168552);
    }
}
