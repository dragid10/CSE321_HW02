import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Name: Alex Oladele
 * Unique-ID: OLADELAA
 * Date: 2/28/18
 * Project: HW02
 */
class CalcTest {

    @Test
    void add() {
        assertEquals(-4, Calc.add(-2, -2));
    }

    @Test
    void subtract() {
        assertEquals(100, Calc.subtract(50, -50));
    }

    @Test
    void multiply() {
        assertEquals(-25, Calc.multiply(5, -5));
    }

    @Test
    void divide() {
        assertEquals(-1, Calc.divide(5, -5));
    }
}