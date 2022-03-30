package model.shape;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

class TrapeziumTest {

    private Trapezium trapezium;

    @BeforeEach
    void setUp() throws Exception {
        trapezium = new Trapezium(8.0, 14.0, 5.0, 5.0, 4.0);
    }

    @Test
    void ShouldCheckTrapeziumPerimeter() throws Exception {
        assertEquals(trapezium.perimeter(), 32.0);
    }

    @Test
    void ShouldCheckTrapeziumArea() throws Exception {
        assertEquals(trapezium.area(), 60.0);
    }

    @Test
    void ShouldThrowExceptionIfHeightIsZero() throws Exception {
        assertThrowsExactly(IllegalArgumentException.class, () -> new Trapezium(8.0, 14.0, 5.0, 5.0, 0.0));
    }
}