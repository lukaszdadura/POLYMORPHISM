package model.shape;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

class ParallelogramTest {

    private Parallelogram parallelogram;

    @BeforeEach
    void setUp() throws Exception {
        parallelogram = new Parallelogram(4.5, 5.5, 6.5);
    }

    @Test
    void ShouldCheckParallelogramPerimeter() throws Exception {
        assertEquals(parallelogram.perimeter(), 20.0);
    }

    @Test
    void ShouldCheckParallelogramArea() throws Exception {
        assertEquals(parallelogram.area(), 29.25);
    }

    @Test
    void ShouldThrowExceptionIfBaseIsZero() throws Exception {
        assertThrowsExactly(IllegalArgumentException.class, () -> new Parallelogram(0.0, 5.5, 6.5));
    }
}