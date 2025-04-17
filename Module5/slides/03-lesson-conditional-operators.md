# Conditional Operators

## Introduction to Conditional Operators

-   Java provides operators for boolean values to simplify complex expressions.
-   These operators reduce multiple boolean values to a single `true` or `false`.
-   Key operators:
    -   AND (`&&`): True if both conditions are true.
    -   OR (`||`): True if at least one condition is true.
    -   NOT (`!`): Reverses the boolean value.
-   Truth tables help understand these relationships.

---

# Conditional-And: &&

-   Used when multiple conditions must all be true.
-   Evaluates to `true` only if both sides are `true`.
-   Simplifies nested if-then statements into a single condition.

-v-

## Example: Conditional-And

![](../src/examples/ConditionalAndExample.java)

---

# Conditional-Or: ||

-   Used when at least one of multiple conditions must be true.
-   Evaluates to `true` if either side is `true`.
-   Combines multiple if-then statements with the same outcome.

-v-

## Example: Conditional-Or

![](../src/examples/ConditionalOrExample.java)

-v-

## Note: Short-Circuited Evaluation

-   Compiler may evaluate only the first operand if it determines the result.
-   Applies to `&&` and `||` expressions.
-   Example: Avoids errors like division by zero if first condition suffices.

---

# Logical NOT: !

-   Unary operator that reverses a single boolean value.
-   Useful for expressing intent clearly, especially for negative conditions.
-   Avoids empty if-then blocks by negating the condition.

-v-

## Example: Logical NOT

![](../src/examples/LogicalNotExample.java)

---

# Combining Conditional Operators

-   Multiple operators can be used in a single expression.
-   Order of evaluation:
    1. Parentheses `()`
    2. NOT `!`
    3. AND `&&`
    4. OR `||`
-   Allows complex boolean logic in concise expressions.

-v-

## Example: Combining Operators

![](../src/examples/CombiningOperatorsExample.java)

---

# Review

-   Conditional operators simplify boolean logic in code.
-   `&&` (AND): True if both sides are true.
-   `||` (OR): True if at least one side is true.
-   `!` (NOT): Reverses the boolean value.
-   Combine operators for complex conditions, respecting evaluation order.
