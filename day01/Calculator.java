/**
 * Core calculator class that encapsulates arithmetic operations.
 */
public class Calculator {

    /** Addition. */
    public double add(double a, double b) {
        return a + b;
    }

    /** Subtraction. */
    public double subtract(double a, double b) {
        return a - b;
    }

    /** Multiplication. */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Division.
     *
     * @throws IllegalArgumentException when divisor is zero
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor cannot be 0");
        }
        return a / b;
    }
}
