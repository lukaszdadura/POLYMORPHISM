package model.shape;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

class CircleTest {

    private Circle circle;

    @BeforeEach
    void setUp() throws Exception {
        circle = new Circle(4.5);
    }

    @Test
    void ShouldCheckCirclePerimeter() throws Exception {
        assertEquals(circle.perimeter(), 28.274333882308138);
    }

    @Test
    void ShouldCheckCircleArea() throws Exception {
        assertEquals(circle.area(), 63.61725123519331);
    }

    @Test
    void ShouldThrowExceptionIfRadiusIsZero() throws Exception {
        assertThrowsExactly(IllegalArgumentException.class, () -> new Circle(0.0));
    }
}