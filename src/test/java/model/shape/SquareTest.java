package model.shape;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

class SquareTest {

    private Square square;

    @BeforeEach
    void setUp() throws Exception {
        square = new Square(4.5);
    }

    @Test
    void ShouldCheckSquarePerimeter() throws Exception {
        assertEquals(square.perimeter(), 18.0);
    }

    @Test
    void ShouldCheckSquareArea() throws Exception {
        assertEquals(square.area(), 20.25);
    }

    @Test
    void ShouldThrowExceptionIfSideIsZero() throws Exception {
        assertThrowsExactly(IllegalArgumentException.class, () -> new Square(0.0));
    }
}