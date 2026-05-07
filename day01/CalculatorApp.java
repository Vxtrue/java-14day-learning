import java.util.Scanner;

/**
 * Entry point for a minimal command-line calculator.
 * Supports: +, -, *, /
 */
public class CalculatorApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("=== Java CLI Calculator ===");
        System.out.println("Input example: 12.5 * 3");
        System.out.println("Type exit to quit");

        while (true) {
            System.out.print("\nEnter expression: ");
            String input = scanner.nextLine().trim();

            if ("exit".equalsIgnoreCase(input)) {
                System.out.println("Program exited.");
                break;
            }

            if (input.isEmpty()) {
                System.out.println("Input cannot be empty.");
                continue;
            }

            // Expected minimal format: number operator number (for example: 10 + 2)
            String[] parts = input.split("\\s+");
            if (parts.length != 3) {
                System.out.println("Invalid format. Use: number operator number, for example: 10 + 2");
                continue;
            }

            try {
                double a = Double.parseDouble(parts[0]);
                String operator = parts[1];
                double b = Double.parseDouble(parts[2]);

                double result = calculate(calculator, a, operator, b);
                System.out.println("Result: " + result);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format.");
            } catch (IllegalArgumentException e) {
                System.out.println("Input error: " + e.getMessage());
            }
        }

        scanner.close();
    }

    /** Dispatches to the corresponding arithmetic method by operator. */
    private static double calculate(Calculator calculator, double a, String operator, double b) {
        switch (operator) {
            case "+":
                return calculator.add(a, b);
            case "-":
                return calculator.subtract(a, b);
            case "*":
                return calculator.multiply(a, b);
            case "/":
                return calculator.divide(a, b);
            default:
                throw new IllegalArgumentException("Unsupported operator. Only + - * / are allowed");
        }
    }
}
