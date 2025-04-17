---
marp: true
---

# Access, Encapsulation, and Scope

-   Understanding access and scope in Java
-   Key concepts for larger programs with multiple objects and classes

---

# What are Access and Scope?

-   **Access**: Determines which parts of your program can interact with specific variables or methods
-   **Scope**: Defines the visibility of variables within different parts of your code

-v-

## Access Topics

-   `public` and `private` keywords
-   Encapsulation
-   Accessor methods ("getters")
-   Mutator methods ("setters")

-v-

## Scope Topics

-   Local variables vs. instance variables
-   The `this` keyword

---

# The `public` Keyword

-   Declaring something as `public` allows any part of the code to interact with it
-   Applies to classes, variables, constructors, and methods

![](../src/examples/Dog.java)

-v-

## Example Usage

-   Any class can access `public` elements of another class
-   Public methods can call other public methods

![](../src/examples/DogSchool.java)

---

# The `private` Keyword and Encapsulation

-   `private` elements can only be accessed within the same class
-   Restricts access from other classes

-v-

## Why Use `private`?

-   Encapsulation: Hiding implementation details
-   Creates neat bundles of logic
-   Prevents unintended changes from other classes

---

# Accessor and Mutator Methods

-   **Accessor Methods** ("getters"): Allow access to `private` variables
-   **Mutator Methods** ("setters"): Allow modification of `private` variables

![](../src/examples/DogGetSetExample.java)

---

# Scope: Local Variables

-   Variables declared inside a method are local to that method
-   Scope is limited to where the variable is declared
-   Applies to conditionals and loops as well

![](../src/examples/ScopeExample.java)

---

# Scope: The `this` Keyword

-   Used to refer to the current object's instance variables
-   Differentiates between local and instance variables with the same name

![](../src/examples/DogThisExample.java)

---

# Using `this` With Methods

-   `this` can be used to call other methods within the same class
-   Acts as a placeholder for the current object

![](../src/examples/Computer.java)

---

# Other Private Methods

-   Often used as helper methods for larger public methods
-   Keeps complex logic hidden from external classes

![](../src/examples/CheckingAccountHelper.java)

---

# Review

-   `public` and `private` define access levels
-   Encapsulation hides implementation details
-   `this` distinguishes instance variables from local ones
-   Local variables are scoped to their declaration block
-   `this` can call methods within the same class
