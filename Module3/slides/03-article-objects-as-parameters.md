# Objects as Parameters

## Overview

-   Discusses best practices for sending objects as constructor parameters in Java.
-   Covers how to send an object as a parameter and the importance of creating copies to avoid modifying originals.

---

# Using an Object as a Parameter

-   **Example Setup:**
    -   Create a `Cupcake` class with flavor and sprinkles attributes.
    -   Create a `Bakery` class that accepts a `Cupcake` object as a parameter.
-   **Code Examples:**
    -   `Cupcake` class definition:

![](../src/examples/CupcakeBasic.java)

-   `Bakery` class with constructor accepting `Cupcake`:

![](../src/examples/BakeryWithParameter.java)

-   **Usage in Main Method:**
    -   Create a `Cupcake` object and pass it to `Bakery`:

![](../src/examples/BakeryUsage.java)

-   **Output:** "The chocolate cupcake is €3.25"

---

# Creating a Copy of an Object

## Why Copy?

-   Avoid modifying the original object unless necessary.
-   Passing an object as a parameter sends a reference, not a copy.
-   Changes to the parameter affect the original object.

-v-

## Issue with Direct Modification

-   Example: Changing flavor in `Bakery` constructor affects original `Cupcake`.
-   Code snippet showing modification:

![](../src/examples/BakeryModifyOriginal.java)

-v-

## Solution: Copy Constructor

-   Use a copy constructor to create a duplicate of the object.
-   Example: Add a copy constructor to `Cupcake` class:

![](../src/examples/CupcakeCopyConstructor.java)

-   Update `Bakery` constructor to use the copy:

![](../src/examples/BakeryWithCopy.java)

-   **Output with Copy:** Original object remains unchanged.
    -   Parameter object: "vanilla"
    -   Original object: "chocolate"

---

# Conclusion

-   **Key Takeaways:**
    -   Objects can be sent as parameters to constructors.
    -   Best practice: Create a copy to avoid altering the original object.
    -   Use copy constructors to duplicate object attributes into a new instance.
