# Comparing Objects in Java

## Introduction

-   Understanding object comparison in Java is crucial to avoid buggy code.
-   Different methods apply to primitives versus objects, especially Strings.
-   Key focus: Using `equals()` method for reliable comparisons.

---

# Comparing Primitives

-   Relational operators (`==`, `!=`) work directly with primitive types.
-   Primitives include `int`, `char`, `double`, etc.
-   Comparison is straightforward based on value equality.

-v-

## Example: Comparing Primitives

![](../src/examples/ComparePrimitives.java)

---

# Comparing Strings with Operators

-   **Disclaimer**: Always use `equals()` for String comparisons.
-   Using `==` and `!=` can lead to unexpected results due to memory location checks.
-   String literals may work with `==` due to interning, but not reliable.

-v-

## Example: String Literals

![](../src/examples/ComparingStringLiterals.java)

-v-

## Example: String Objects

![](../src/examples/CompareStringObjects.java)

---

# Object Aliases and Null Checks

-   Aliases: Multiple references to the same object return `true` with `==`.
-   Comparing with `null` using `==` or `!=` is safe to avoid `NullPointerException`.

-v-

## Example: Comparing Aliases

![](../src/examples/ComparingAliases.java)

-v-

## Example: Null Check

![](../src/examples/NullCheckExample.java)

---

# Using equals() Method

-   `equals()` compares content, not memory location, unlike `==`.
-   Essential for String and custom object comparisons.
-   Works reliably regardless of how objects are created.

-v-

## Example: equals() with Strings

![](../src/examples/EqualsMethodComparison.java)

---

# Custom equals() in Classes

-   Default `equals()` in custom classes inherits from `Object`, behaves like `==`.
-   Must override `equals()` to compare content based on specific attributes.

-v-

## Example: Default equals() in Custom Class

![](../src/examples/PersonDefaultEquals.java)

-v-

## Example: Custom equals() Override

![](../src/examples/PersonCustomEquals.java)

---

# Practical Exercise: Timecard Comparison

-   Challenge: Override `equals()` to match employee ID and date for timecards.
-   Demonstrates real-world application of custom equality checks.

-v-

## Example: Timecard Comparison

![](../src/examples/TimecardComparison.java)

---

# Review

-   Use `==` for primitives and alias checks, `equals()` for content comparison.
-   Always use `equals()` for Strings to avoid memory location pitfalls.
-   Override `equals()` in custom classes for meaningful equality based on content.
-   Essential for robust and bug-free code.
