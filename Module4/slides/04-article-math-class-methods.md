# Using Built-In Classes: Static Methods of the Math Class

Learn how to use static methods from the `Math` class for numerical calculations in Java.

---

# Introduction to the Math Class

-   `Math` class is part of the `java.lang` package
-   Contains methods for performing numerical calculations
-   All methods are static, allowing use without creating an object
-   Simplifies complex mathematical operations in programs

---

# Calling Static Methods

-   **Static Methods**: Can be called without creating an object of the class
-   Two ways to call `Math` class methods:
    -   Use class name: `Math.methodName(arguments)`
    -   Import class: `import static java.lang.Math.*;` then use `methodName(arguments)`
-   Example with `Math.min()`:

![](../src/examples/MathMinExample.java)

-v-

## Static vs Non-Static Methods

-   **Non-Static Methods**: Require an object instance to be called
-   Example of non-static method usage:

![](../src/examples/NonStaticMethodExample.java)

---

# Useful Math Methods: abs()

-   **`int abs(int x)`**: Returns absolute value of an int
-   **`double abs(double x)`**: Returns absolute value of a double
-   Absolute value is always positive, representing distance from 0
-   Example:

![](../src/examples/MathAbsExample.java)

-v-

## Quiz: abs() Method

-   What will `int x = Math.abs(-15) + 5; System.out.println(x);` output?
    -   Correct Answer: `20`
    -   Explanation: Absolute value of `-15` is `15`, and `15 + 5` equals `20`

---

# Useful Math Methods: pow()

-   **`double pow(double base, double exponent)`**: Returns base raised to the power of exponent
-   Example: `5` to power `3` is `5 * 5 * 5 = 125`
-   Example:

![](../src/examples/MathPowExample.java)

-v-

## Quiz: pow() Method

-   What will `double x = Math.pow(2, 4); System.out.println(x);` output?
    -   Correct Answer: `16.0`
    -   Explanation: `2 * 2 * 2 * 2` equals `16.0`

---

# Useful Math Methods: sqrt()

-   **`double sqrt(double x)`**: Returns positive square root of a double
-   Square root is the value that, when multiplied by itself, equals the input
-   Example: Square root of `49` is `7` because `7 * 7 = 49`
-   Example:

![](../src/examples/MathSqrtExample.java)

-v-

## Quiz: sqrt() Method

-   Fill in the blank to output `9.0`: `double area = 81.0; double side = Math.____(area); System.out.println(side);`
    -   Correct Answer: `sqrt`
    -   Explanation: `sqrt` calculates the square root of a number

---

# Useful Math Methods: random()

-   **`double random()`**: Returns a double between `0.0` (inclusive) and `1.0` (exclusive)
-   Used for probability and randomization
-   Can be manipulated to create random values in specific ranges
-   Examples:

![](../src/examples/MathRandomExample.java)

-v-

## Quiz: random() Method

-   Which produces a random `int` from `3` to `8` (inclusive)?
    -   Correct Answer: `int x = (int)(Math.random() * 6) + 3;`
    -   Explanation: Uses the algorithm `(Math.random() * (maxValue - minValue + 1)) + minValue`

---

# Additional Math Methods

-   Many more methods available in the `Math` class
-   Full list: [Math Class Documentation](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html)
-   Quiz: Which is not a method in the `Math` class?
    -   Correct Answer: `roundDown(float x)`
    -   Explanation: This is not a real method in the `Math` class

---

# Conclusion

-   `Math` class in `java.lang` package offers static methods for mathematical operations
-   Call methods with `Math.methodName()` or import `Math` for direct use
-   Key methods for AP CSA exam are in the [Java Quick Reference Guide](https://apstudents.collegeboard.org/ap/pdf/ap-computer-science-a-java-quick-reference_0.pdf)
