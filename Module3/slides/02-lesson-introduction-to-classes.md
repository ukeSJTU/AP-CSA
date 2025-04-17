# Introduction to Classes

## Overview

-   Classes in Java represent real-world entities.
-   A class is a template or blueprint for creating objects.
-   Example: A program for student test scores might have `Student` and `Grade` classes.

---

# Real-World Example: Savings Account

-   **Details of a Savings Account:**
    -   Name of the owner
    -   Bank account number
    -   Amount of money in the account
-   **Functions:**
    -   Deposit money
    -   Withdraw money
-   Represented as a `SavingsAccount` class with multiple instances.

---

# Classes: Syntax

-   Define a class in Java with the `public` keyword.
-   Example of a basic `Car` class definition:

![../src/examples/Car.java](../src/examples/Car.java)

-   Inside the class body, add fields and functions for interaction.

---

# Classes: Constructors

-   Constructors are special methods to initialize fields when creating an instance.
-   Must have the same name as the class and are generally `public`.
-   Example of a `Car` class with a constructor:

![](../src/examples/CarConstructor.java)

-   Creating an instance: `Car ferrari = new Car();`

---

# Constructors: Notes for AP Students

-   Printing an object shows its memory address (e.g., `Car@76ed5528`).
-   Objects are reference data types, holding memory address references.
-   Using `null` initializes a reference without a value:

![](../src/examples/CarNullReference.java)

-   Using a null reference to call methods results in `NullPointerException`.

---

# Classes: Instance Fields

-   Represent characteristics of an object (e.g., a `Car` has color, year, model).
-   Declared with a "has-a" relationship.
-   Example of `Car` with instance fields:

![](../src/examples/CarInstanceFields.java)

-   Fields are specific to each instance and can be set via public access, class methods, or constructors.

---

# Classes: Constructor Parameters

-   Constructors can take parameters to assign values to fields.
-   Example of `Car` with a parameter in the constructor:

![](../src/examples/CarConstructorParameters.java)

-   Method signature (e.g., `Car(String carColor)`) defines name and parameters.

---

# Constructor Parameters: Notes for AP Students

-   Classes can have multiple constructors differentiated by parameters.
-   Example with two constructors for `Car`:

![](../src/examples/CarMultipleConstructors.java)

-   Default constructor assigns default values if none is defined:

![](../src/examples/CarDefaultValues.java)

---

# Classes: Assigning Values to Instance Fields

-   Use constructors to initialize fields with arguments.
-   Example of assigning a value to a `Car` instance:

![](../src/examples/CarAssignValues.java)

-   Access fields using the dot operator (e.g., `ferrari.color`).

---

# Assigning Values: Notes for AP Students

-   Arguments are actual values passed during method calls; parameters are variables in the method signature.
-   Java uses call-by-value, passing copies of argument values.

---

# Classes: Multiple Fields

-   Objects can have multiple instance fields.
-   Example of `Car` with additional fields:

![](../src/examples/CarMultipleFields.java)

-   Ensure arguments match parameter order and type when creating instances:

![](../src/examples/CarMultipleFieldsUsage.java)

---

# Classes: Review

-   **Key Concepts:**
    -   Class as a blueprint for instances.
    -   Constructors initialize instance state.
    -   Instance fields define object characteristics.
    -   Use dot operator (`.`) to access fields.
-   Programs can have multiple classes and fields as needed.
-   Example of a simple `Dog` class:

![](../src/examples/DogExample.java)
