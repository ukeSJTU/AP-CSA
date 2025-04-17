# Simplifying Boolean Expressions

## Introduction

-   Complex boolean expressions can be simplified without changing their value.
-   Useful for manual evaluation, especially in exams like AP Computer Science A.
-   Methods like DeMorgan’s Laws and operator negation help rewrite expressions.

---

# Applying DeMorgan’s Laws

-   Rules to transform boolean expressions while preserving value.
-   First Law: `!(exp1 && exp2) == !(exp1) || !(exp2)`
-   Second Law: `!(exp1 || exp2) == !(exp1) && !(exp2)`
-   Simplifies complex negated expressions by changing operators.

-v-

## Example: DeMorgan’s Laws

-   Original: `!(a > b && a == b)`
-   Simplified: `!(a > b) || !(a == b)`

---

# Removing Negation with Opposite Operators

-   Eliminate NOT operators (`!`) by using opposite operators.
-   Conversion table for negated operators:
    -   `==` to `!=`, `!=` to `==`
    -   `>` to `<=`, `<` to `>=`
    -   `<=` to `>`, `>=` to `<`
-   Further simplifies expressions for clarity.

-v-

## Example: Operator Negation

-   From: `!(a > b) || !(a == b)`
-   To: `a <= b || a != b`
-   Both expressions are equivalent in value.

---

# Practical Exercise

-   Task: Simplify a boolean expression using DeMorgan’s Laws and operator negation.
-   Compare original and simplified forms to confirm equivalence.

-v-

## Example: Simplification Exercise

![](../src/examples/SimplifyBooleanExpression.java)

---

# Review

-   Simplification methods maintain boolean expression equivalence.
-   DeMorgan’s Laws transform combined negations.
-   Operator negation removes NOT by using opposite operators.
-   Essential skill for manual logic evaluation.
