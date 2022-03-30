package model.shape;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

class DiamondTest {

    private Diamond diamond;

    @BeforeEach
    void setUp() throws Exception {
        diamond = new Diamond(4.5, 5.5, 6.5);
    }

    @Test
    void ShouldCheckDiamondPerimeter() throws Exception {
        assertEquals(diamond.perimeter(), 18.0);
    }

    @Test
    void ShouldCheckDiamondArea() throws Exception {
        assertEquals(diamond.area(), 17.875);
    }

    @Test
    void ShouldThrowExceptionIfSideIsZero() throws Exception {
        assertThrowsExactly(IllegalArgumentException.class, () -> new Diamond(0.0, 5.5, 6.5));
    }
}