package Calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test void addWorks() {
        assertEquals(7.5, Calculator.add(5.0, 2.5), 1e-9);
    }

    @Test void subtractWorks() {
        assertEquals(2.5, Calculator.subtract(5.0, 2.5), 1e-9);
    }

    @Test void multiplyWorks() {
        assertEquals(12.5, Calculator.multiply(5.0, 2.5), 1e-9);
    }

    @Test void divideWorks() {
        assertEquals(2.0, Calculator.divide(5.0, 2.5), 1e-9);
    }

    @Test void divideByZeroThrows() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(1.0, 0.0));
    }
}
