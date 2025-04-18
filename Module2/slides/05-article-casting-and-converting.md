# Casting and Converting in Java

## Introduction

-   Learn how to transform a value of one data type to another in Java.
-   Similar to transforming clothing in _The Little Glass Slipper_, we use **type casting** to change data types.

---

# Numerical-Based Casting

-   Casting changes the data type of number-based values, affecting data amount.
-   **Narrow type casting**: Less data after casting.
-   **Widening type casting**: More data after casting.
-   Use casting operators like `(int)` and `(double)` to convert data types.

-v-

## Narrow Type Casting

-   Convert `double` to `int` using `(int)` operator.
-   Digits right of the decimal are truncated.
-   Example: ![](../src/examples/NarrowCasting.java)
-   Output:
    ```
    Double value: 12.99
    Int value: 12
    ```

-v-

## Rounding in Narrow Casting

-   Java does not round automatically.
-   For positive numbers, use `(int)(value + 0.5)` to round to nearest integer.
-   For negative numbers, use `(int)(value - 0.5)`.
-   Example: ![](../src/examples/RoundingNarrowCasting.java)
-   Output:
    ```
    Double value: 12.99
    Int value: 13
    ```

---

# Integer Range and Overflow

-   `int` values are limited to 4 bytes.
-   Use `Integer.MIN_VALUE` and `Integer.MAX_VALUE` to check limits.
-   Example: ![](../src/examples/IntegerRangeLimits.java)
-   Output:
    ```
    Min: -2147483648
    Max: 2147483647
    ```
-   Values outside this range cause overflow, leading to errors or incorrect results.
-   Example: ![](../src/examples/IntegerOverflow.java)
-   Output:
    ```
    -2147483648
    ```

---

# Widening Type Casting

-   Convert `int` to `double` using `(double)` operator.
-   Example: ![](../src/examples/WideningCasting.java)
-   Output:
    ```
    Int value: 9
    Double value: 9.0
    ```
-   Widening casting can occur automatically in Java, e.g., in arithmetic expressions.
-   Example: ![](../src/examples/AutoWideningCasting.java)
-   Output:
    ```
    20.0
    ```
-   Cast expressions as `double` even with `int` values.
-   Example: ![](../src/examples/ExpressionWideningCasting.java)
-   Output:
    ```
    20.0
    ```

---

# Converting Integer and String Values

-   Convert `int` to `String` using `String.valueOf()`.
-   Example: ![](../src/examples/IntToString.java)
-   Output:
    ```
    Int value: 15
    String value: 15
    ```
-   Convert `String` to `int` using `Integer.parseInt()`.
-   Example: ![](../src/examples/StringToInt.java)
-   Output:
    ```
    The int value: 12
    13
    ```
-   Note: `String` must contain a numerical value to avoid errors.

---

# Conclusions

-   Casting converts a value from one primitive data type to another.
-   **Narrow type casting**: Decreases data, requires manual casting.
-   **Widening type casting**: Increases data, can be automatic.
-   Use `(int)` for `double` to `int`, `(double)` for `int` to `double`.
-   Convert `String` to `int` with `Integer.parseInt()`, and `int` to `String` with `String.valueOf()`.
