---
marp: true
---

# Learn Java: Variables

-   Variables are named locations in memory to store information
-   Naming provides context and meaning to data (e.g., `42` could be `age` or `numOrdersPlaced`)
-   Java requires specifying the type of information stored

---

# Introduction to Variables

-   Used to store data like user's name, salary, employment status
-   Variables allow referencing stored data by name
-   Example declaration:
    ![](../src/examples/Creator.java)

-v-

## Assigning Values

-   Use the assignment operator `=` to set a value
-   Example from Creator.java:
    ![](../src/examples/Creator.java)
-   Declaration and assignment in one line, also in Creator.java:
    ![](../src/examples/Creator.java)

---

# Primitive Data Types: int

-   Stores whole numbers (positive, negative, zero)
-   Range: -2,147,483,648 to 2,147,483,647
-   Does not store fractions or decimals
-   Declaration:
    ![](../src/examples/CountComment.java)

---

# Primitive Data Types: double

-   Stores large numbers and decimals
-   Range: Very small (4.9E-324) to very large (1.797E+308)
-   Useful for prices, population, etc.
-   Declaration:
    ![](../src/examples/MarketShare.java)

---

# Primitive Data Types: boolean

-   Stores `true` or `false` values
-   Used for yes/no questions (e.g., Is the oven on?)
-   Declaration:
    ![](../src/examples/Booleans.java)

---

# Primitive Data Types: char

-   Stores single characters (letters, spaces, punctuation)
-   Must be surrounded by single quotes (`'`)
-   Declaration:
    ![](../src/examples/Char.java)

---

# Objects: String

-   Stores sequences of characters
-   Not a primitive type, but an object with built-in behavior
-   Declaration using String literal:
    ![](../src/examples/Song.java)
-   Or as a new String object, also in Song.java:
    ![](../src/examples/Song.java)

-v-

## Escape Sequences in Strings

-   Special symbols for formatting output
-   Examples:
    -   `\"` for quotation marks
    -   `\\` for backslash
    -   `\n` for newline
-   Usage:
    ```java
    System.out.println("\"Hello World\"");
    System.out.println("This is the backslash symbol: \\");
    System.out.println("Hello\nGoodbye");
    ```

---

# Static Typing in Java

-   Java has static typing to prevent type mismatch bugs
-   Incorrect type assignment won't compile:
    ```java
    int greeting = "Hello World"; // Error
    ```
-   Helps catch errors during programming, not execution
-   Prevents runtime crashes due to type errors

---

# Variable Naming Conventions

-   Case-sensitive (e.g., `myHeight` ≠ `myheight`)
-   Starts with letter, `$`, or `_` (no numbers or other symbols)
-   Use camelCase for multi-word names:
    ```java
    boolean isHuman; // Good
    boolean ishuman; // Bad: no capitalization
    boolean IsHuman; // Bad: first word capitalized
    boolean is_human; // Bad: underscores
    ```
-   Clear, meaningful names improve readability

---

# Review of Variables

-   Variables track data in programs
-   Data types covered:
    -   `int` for whole numbers
    -   `double` for decimals and large numbers
    -   `boolean` for true/false
    -   `char` for single characters
    -   `String` for text
-   Static typing ensures type safety
-   Naming conventions aid code clarity

---
