---
marp: true
---

# Static Variables and Methods

-   Understanding the `static` keyword in Java
-   Applying static variables and methods in class design

---

# Static Methods Refresher

-   Static methods belong to the class, not a specific object
-   Called using the class name and `.` operator
-   Examples:
    -   `Math.random()`
    -   `Double.valueOf("2.5")`
    -   `main()` method is static

---

# Static Variables

-   Belong to the class, not a specific object
-   Accessed using class name and `.` operator
-   Declared with `static` keyword

![](../src/examples/DogStatic.java)

-v-

## Accessing Static Variables

-   Can be accessed via class name or any object instance
-   Value remains the same across all instances

![](../src/examples/DogStaticAccess.java)

---

# Modifying Static Variables

-   Static variables can be modified from constructors, non-static methods, or static methods
-   Often used to track information across all objects of a class
-   Example: Counting total instances or shared resources

---

# Writing Your Own Static Methods

-   Declared with `static` keyword
-   Often used as accessors or mutators for static variables
-   Cannot interact with non-static instance variables (no `this` reference)

![](../src/examples/ATMStaticMethods.java)

---

# Review

-   Static methods and variables are associated with the class, not objects
-   Declared using the `static` keyword
-   Static methods cannot access non-static instance variables
-   Both static and non-static methods can interact with static variables
