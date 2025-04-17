package projects.BasicCalculator_Solution;

/**
 * A Basic Calculator implementation for AP Computer Science A Exam preparation.
 * This class provides methods for basic arithmetic operations on integers.
 * It serves as a solution reference for the project.
 */
public class Calculator {
    // Constructor
    public Calculator() {
        // No initialization needed for this basic calculator
    }

    /**
     * Adds two integers and returns their sum.
     * 
     * @param a First integer
     * @param b Second integer
     * @return Sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts the second integer from the first and returns their difference.
     * 
     * @param a First integer
     * @param b Second integer
     * @return Difference of a and b
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers and returns their product.
     * 
     * @param a First integer
     * @param b Second integer
     * @return Product of a and b
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides the first integer by the second and returns their quotient.
     * 
     * @param a First integer (numerator)
     * @param b Second integer (denominator)
     * @return Quotient of a divided by b
     */
    public int divide(int a, int b) {
        // Note: This implementation does not handle division by zero
        return a / b;
    }

    /**
     * Returns the remainder when the first integer is divided by the second.
     * 
     * @param a First integer (numerator)
     * @param b Second integer (denominator)
     * @return Remainder of a divided by b
     */
    public int modulo(int a, int b) {
        // Note: This implementation does not handle division by zero
        return a % b;
    }

    // Main method to test the Calculator functionality
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        // Test the arithmetic methods with sample inputs
        System.out.println(myCalculator.add(5, 7)); // Output: 12
        System.out.println(myCalculator.subtract(45, 11)); // Output: 34
        // Additional test cases can be added here
    }
}
