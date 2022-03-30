package model.shape;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

class TriangleTest {

    private Triangle triangle;

    @BeforeEach
    void setUp() throws Exception {
        triangle = new Triangle(4.0, 5.0, 6.0);
    }

    @Test
    void ShouldCheckTrianglePerimeter() throws Exception {
        assertEquals(triangle.perimeter(), 15.0);
    }

    @Test
    void ShouldCheckTriangleArea() throws Exception {
        assertEquals(triangle.area(), 9.921567416492215);
    }

    @Test
    void ShouldThrowExceptionIfBaseIsZero() throws Exception {
        assertThrowsExactly(IllegalArgumentException.class, () -> new Triangle(0.0, 5.0, 6.0));
    }
}