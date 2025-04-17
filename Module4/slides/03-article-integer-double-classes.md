# Using Built-In Classes: Integer and Double Classes

Learn how the `Integer` and `Double` classes differ from primitive data types.

---

# Introduction to Wrapper Classes

-   `Integer` and `Double` are wrapper classes for primitive `int` and `double` types
-   Main purpose: Convert between primitive data and objects
-   Necessary for using primitive data with data structures or methods requiring objects
-   Example: `ArrayList` only accepts objects, not primitives

---

# Autoboxing and Unboxing with ArrayList

-   **Autoboxing**: Automatic conversion from primitive to wrapper object
-   **Unboxing**: Automatic conversion from wrapper object to primitive
-   Example with `ArrayList<Integer>`:

![](../src/examples/ArrayListExample.java)

---

# Initializing Wrapper Objects

-   Wrapper objects can be initialized in multiple ways:
    -   Direct assignment (autoboxing)
    -   Using constructors
    -   Using static `valueOf()` method
-   Example:

![](../src/examples/WrapperInitialization.java)

---

# Unboxing Examples

-   Unboxing can be done via direct assignment or specific methods like `intValue()`
-   Example:

![](../src/examples/WrapperUnboxing.java)

-   Key takeaway: Use `Integer` and `Double` when working with object-requiring structures

---

# Autoboxing and Unboxing in Methods

-   Autoboxing/unboxing occurs when passing values to methods
-   Example: Method expecting primitive can receive wrapper object (unboxed automatically)
-   Example: Method expecting wrapper can receive primitive (autoboxed automatically)
-   Code example:

![](../src/examples/AutoboxingUnboxingMethods.java)

---

# Quiz: Wrapper Class Definitions

-   Match the terms to their definitions:
    -   **Wrapper classes**: Convert between primitive data and objects
    -   **Primitive data types**: Standard values like `int`, `char`, `double`
    -   **Autoboxing**: Automatic conversion from primitive to wrapper object
    -   **Unboxing**: Automatic conversion from wrapper object to primitive

---

# Integer Class Details

-   Located in `java.lang` package
-   Contains static and non-static methods for comparisons, conversions, calculations
-   Key methods: `intValue()`, `parseInt()`, constructors for `int` and `String`
-   Static fields: `MAX_VALUE` (2³¹-1), `MIN_VALUE` (-2³¹)
-   Example:

![](../src/examples/IntegerClassExample.java)

-   Full documentation: [Java API: Integer Class](https://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html)

---

# Double Class Details

-   Also in `java.lang` package
-   Similar to `Integer` with constructors for `double` and `String`
-   Key methods: `doubleValue()`, `parseDouble()`, `valueOf()`
-   Static fields: `MAX_VALUE`, `MIN_VALUE`, `POSITIVE_INFINITY`, `NEGATIVE_INFINITY`
-   Example:

![](../src/examples/DoubleClassExample.java)

-   Full documentation: [Java API: Double Class](https://docs.oracle.com/javase/7/docs/api/java/lang/Double.html)

---

# Coding Challenge: Infinity Conversion

-   Task: Convert `POSITIVE_INFINITY` from `Double` to `int` and compare with `Integer.MAX_VALUE`
-   Example:

![](../src/examples/InfinityConversionChallenge.java)

---

# Key Takeaways

-   `Integer` and `Double` classes in `java.lang` package wrap primitive `int` and `double` for object use
-   **Autoboxing**: Converts primitive to wrapper (e.g., `int` to `Integer`)
-   **Unboxing**: Converts wrapper to primitive (e.g., `Double` to `double`)
-   Important static fields:
    -   `Integer.MAX_VALUE`, `Integer.MIN_VALUE`
    -   `Double.POSITIVE_INFINITY`, `Double.NEGATIVE_INFINITY`
