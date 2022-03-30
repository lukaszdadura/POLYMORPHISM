package model.shape;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

class RectangleTest {

    private Rectangle rectangle;

    @BeforeEach
    void setUp() throws Exception {
        rectangle = new Rectangle(3.5, 5.5);
    }

    @Test
    void ShouldCheckRectanglePerimeter() throws Exception {
        assertEquals(rectangle.perimeter(), 18.0);
    }

    @Test
    void ShouldCheckRectangleArea() throws Exception {
        assertEquals(rectangle.area(), 19.25);
    }

    @Test
    void ShouldThrowExceptionIfLengthIsZero() throws Exception {
        assertThrowsExactly(IllegalArgumentException.class, () -> new Rectangle(0.0, 5.5));
    }
}