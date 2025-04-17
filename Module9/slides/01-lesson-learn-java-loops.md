# Learn Java: Loops

## Introduction to Loops

-   Loops are programming tools that repeat a block of code until a specific condition is met.
-   They save time and minimize errors by scaling programs efficiently.
-   Types of loops covered:
    -   `while` loops
    -   `for` loops
    -   `for-each` loops

---

# While We're Here

-   A `while` loop repeats code as long as a condition is `true`.
-   Syntax resembles an `if` statement but repeats until the condition is `false`.

![](../src/examples/WhileLoopExample1.java)

-   Beware of infinite loops if the condition never becomes `false`.

![](../src/examples/WhileLoopInfinite.java)

-v-

## Exercise: Lucky Five

-   Create a `while` loop in **LuckyFive.java** that continues while `dieRoll` is NOT `5`.
-   Inside the loop, reset `dieRoll` with a new random value (1-6) and print it.

---

# Incrementing While Loops

-   Counter variables (iterators) are common in loops for conditional logic.
-   Counters can be incremented or decremented each iteration.

![](../src/examples/WhileLoopCounter.java)

-v-

## Exercise: Coffee

-   In **Coffee.java**, use a `while` loop to print drinking 100 cups of coffee.
-   Initialize `cupsOfCoffee` to 1, loop while <= 100, increment inside loop.

---

# For Loops

-   `for` loops are designed for incrementing/decrementing with a counter.
-   Syntax includes initialization, condition, and increment/decrement.

![](../src/examples/ForLoopExample.java)

-   Helps prevent infinite loops by ensuring counter updates.

-v-

## Off-by-One Errors

-   Incorrect loop headers can cause "off by one" errors.
-   Example: Summing first 10 numbers but stopping at 9.

![](../src/examples/ForLoopOffByOne.java)

-v-

## Exercise: Refactor Coffee

-   Refactor the `while` loop in **Coffee.java** to a `for` loop (1 to 100).

---

# Iterating Over Arrays and ArrayLists

-   Loops are used to traverse arrays or `ArrayList` for actions on each item.
-   Use index to access elements, starting from 0.

![](../src/examples/ArrayTraversal.java)

![](../src/examples/ArrayListTraversal.java)

-v-

## Exercise: Calculate Total

-   In **CalculateTotal.java**, use a `for` loop to sum expenses in an `ArrayList`.

---

# break and continue

-   `break` exits a loop before completion.
-   `continue` skips the current iteration.

![](../src/examples/BreakExample.java)

![](../src/examples/ContinueExample.java)

-v-

## For AP CSA Students: return in Loops

-   A `return` statement in a loop within a method stops the loop and exits the method.

![](../src/examples/ReturnInLoop.java)

-v-

## Exercise: Numbers

-   In **Numbers.java**, use `continue` to print only numbers divisible by 5 from 0 to 99.

---

# For-Each Loops

-   For-each loops iterate directly over list items without needing indices.
-   Simplifies actions on each element.

![](../src/examples/ForEachLoop.java)

-v-

## Exercise: Most Expensive

-   In **MostExpensive.java**, use a for-each loop to find the priciest item in `expenses`.

---

# Removing Elements During Traversal

-   Caution needed when removing elements from `ArrayList` during traversal.
-   Indices shift after removal, requiring counter adjustment.

![](../src/examples/RemoveWhileLoop.java)

![](../src/examples/RemoveForLoop.java)

-v-

## Exercise: Lunch

-   In **Lunch.java**, remove all `"ant"` elements from `lunchBox` using a loop.

---

# Review

-   `while` loops repeat until a condition is met (unknown iterations).
-   `for` loops are ideal for known iterations with counters.
-   For-each loops simplify list traversal.
