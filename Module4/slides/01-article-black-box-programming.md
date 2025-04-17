# Using Built-In Classes: Black Box Programming

Learn some best practices for writing methods.

---

# What Is A Black Box

-   Often, programmers write methods as "black boxes"
-   Implementation details are hidden from the user
-   Users know the input and can predict the output, but not the internal process
-   Example: A television remote
    -   Input: Pressing "Volume Up"
    -   Output: Volume increases
    -   Inner workings (how remote communicates with TV) are hidden

![Image of a black box - input goes into a black box and output comes out.](https://static-assets.codecademy.com/Paths/ap-computer-science/blackBox/blackBox.png)

---

# Preconditions and Postconditions

-   **Preconditions**: Conditions that must be true for a method to work as expected
    -   Example: TV must be on for the remote to work
    -   Java example: A method might require a positive number as input
-   Methods can check preconditions and handle errors (e.g., print error for negative input)
-   Preconditions should be communicated to users

-v-

## Postconditions

-   **Postconditions**: Conditions guaranteed to be true after a method call, if preconditions are met
    -   Example: Volume increases by 1 after pressing "Volume Up" (if TV is on and not at max volume)
-   Postconditions should also be communicated, often through documentation

-v-

## Java Documentation Examples

-   Explore official Java documentation for preconditions and postconditions:
    -   [indexOf() from the String class](<https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#indexOf(int)>)
    -   [pow() from the Math class](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#pow-double-double-)
    -   [nextDouble() from the Random class](https://docs.oracle.com/javase/8/docs/api/java/util/Random.html#nextDouble--)

---

# Learning More About Black Boxes

-   Some documentation reveals more implementation details than others
-   A black box doesn't have to remain black forever
    -   If curious, dive deeper into code or documentation
-   When writing methods, at minimum, clearly state:
    -   Preconditions
    -   Postconditions
