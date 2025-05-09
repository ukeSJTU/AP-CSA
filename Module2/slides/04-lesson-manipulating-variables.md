---
marp: true
---

# Learn Java: Manipulating Variables

-   **Objective**: Learn to manipulate variable values using expressions and operators
-   **Key Concepts**: Arithmetic operations, relational operators, compound assignments, order of operations, string concatenation

---

# Introduction to Manipulating Variables

-   Variables store data, but how do we change their values?
-   Use expressions and operators to perform calculations and comparisons
-   Example: Bank account balance manipulation
    ```java
    double balance = 20000.99;
    double depositAmount = 1000.00;
    balance = balance + depositAmount;
    ```

-v-

## Importance of Data Types

-   Data type determines possible operations
-   Expression results depend on data types involved
    -   Two `int`s result in an `int`
    -   Any `double` in expression results in a `double`

---

# Addition and Subtraction

-   Use `+` for addition and `-` for subtraction
-   Works with `int` and `double` types
-   Example: Bank account transactions
    ```java
    double balance = 20000.99;
    double depositAmount = 1000.0;
    balance = balance + depositAmount; // 21000.99
    double withdrawAmount = 500;
    balance = balance - withdrawAmount; // 20500.99
    ```

-v-

## Increment and Decrement Operators

-   `++` increases value by 1
-   `--` decreases value by 1
-   Example: Counting pictures
    ```java
    int numPicturesOfCats = 60 + 24;
    numPicturesOfCats++; // Now 85
    numPicturesOfCats--; // Now 84
    ```

---

# Multiplication and Division

-   Use `*` for multiplication and `/` for division
-   Integer division with `/` floors the result (loses remainder)
-   Example: Paycheck calculation
    ```java
    double paycheckAmount = 40 * 15.50; // 620.0
    double balance = 20010.5;
    double hourlyRate = 15.5;
    double hoursWorked = balance / hourlyRate; // 1291.0
    ```

-v-

## Integer Division Caveat

-   Division with `int` types discards decimal remainder
-   Example: Integer division
    ```java
    int evenlyDivided = 10 / 5; // 2
    int unevenlyDivided = 10 / 4; // 2 (not 2.5)
    ```

---

# Modulo Operator

-   Use `%` to find the remainder after division
-   Useful for determining even/odd numbers or leftovers
-   Example: Cookies distribution
    ```java
    int cookiesBaked = 10;
    int cookiesLeftover = 10 % 3; // 1
    ```

-v-

## Even/Odd Check with Modulo

-   Check if a number is even or odd
-   Example: Even/Odd determination
    ```java
    7 % 2 // 1, odd!
    8 % 2 // 0, even!
    9 % 2 // 1, odd!
    ```

---

# Compound Assignment Operators

-   Shorten syntax for operations and reassignment
-   Examples: `+=`, `-=`, `*=`, `/=`, `%=`
-   Example: Updating cupcake count
    ```java
    int numCupcakes = 12;
    numCupcakes += 8; // Now 20
    ```

---

# Order of Operations

-   Determines evaluation order in expressions
-   Order: Parentheses -> Exponents -> Modulo/Multiplication/Division -> Addition/Subtraction
-   Example: Complex expression
    ```java
    int num = 5 * (10 - 4) + 4 / 2; // Evaluates to 32
    ```

---

# Relational Operators: Greater Than and Less Than

-   Compare values with `<` (less than) and `>` (greater than)
-   Returns `boolean` result
-   Example: Bank account withdrawal check
    ```java
    double balance = 20000.01;
    double amountToWithdraw = 5000.01;
    boolean canWithdraw = amountToWithdraw < balance; // true
    ```

---

# Relational Operators: Equals and Not Equals

-   Use `==` to check equality, `!=` for inequality
-   Returns `boolean` result
-   Example: Paycheck validation
    ```java
    double paycheckAmount = 620;
    double calculatedPaycheck = 15.50 * 40;
    boolean isCorrectPay = paycheckAmount == calculatedPaycheck; // true
    ```

---

# Relational Operators: Greater/Less Than or Equal To

-   Use `>=` (greater than or equal to) and `<=` (less than or equal to)
-   Returns `boolean` result
-   Example: Paycheck verification
    ```java
    double paycheckAmount = 620;
    double calculatedPaycheck = 15.50 * 40;
    boolean isAtLeastCorrect = paycheckAmount >= calculatedPaycheck; // true
    ```

---

# String Comparison with .equals()

-   Use `.equals()` to compare `String` objects, not `==`
-   Returns `boolean` result
-   Example: Username comparison
    ```java
    String person1 = "Paul";
    String person2 = "John";
    boolean areEqual = person1.equals(person2); // false
    ```

---

# String Concatenation

-   Use `+` to join `String`s together
-   Can concatenate primitives as well (converts to `String`)
-   Example: User message
    ```java
    String username = "PrinceNelson";
    System.out.println("Your username is: " + username);
    ```

---

# Final Keyword

-   Use `final` to make variables unchangeable
-   Prevents reassignment after initialization
-   Example: Unchangeable value
    ```java
    final int yearBorn = 1968;
    // yearBorn = 1970; // Error: cannot assign a value to final variable
    ```

---

# Review of Manipulating Variables

-   Operations covered:
    -   Arithmetic: `+`, `-`, `*`, `/`, `%`
    -   Compound assignments: `+=`, `-=`, `*=`, `/=`, `%=`
    -   Relational: `>`, `<`, `==`, `!=`, `>=`, `<=`
    -   String operations: `.equals()`, concatenation with `+`
    -   `final` keyword for constants
-   Understand order of operations for complex expressions

---
