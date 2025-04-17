---
marp: true
---

# Introduction to Arrays

-   Arrays store a fixed number of values of one type.
-   Useful for managing lists of data, like student names or lottery numbers.
-   Indexes start at 0, so the first element is at index 0.

---

# Creating an Array Explicitly

-   Declare an array with the type of data it holds: `double[] prices;`
-   Initialize explicitly with values: `double[] prices = {13.15, 15.87, 14.22, 16.66};`
-   Can hold primitives, Strings, and object references.

-v-

## Example

-   See how arrays are used in the `Newsfeed` class to manage articles.

![](../src/examples/Newsfeed.java)

---

# Importing Arrays

-   Use `java.util.Arrays` for helpful methods like `toString()` to print array contents.
-   Import at the top of the file: `import java.util.Arrays;`
-   Example: `String betterPrintout = Arrays.toString(lotteryNumbers);`

---

# Get Element By Index

-   Access elements using square brackets: `prices[1]` retrieves the second element.
-   Index out of bounds causes `ArrayIndexOutOfBoundsException`.

-v-

## Exercise Prompt

-   Implement methods to access and update array elements.

---

# Creating an Empty Array

-   Initialize with a fixed size: `String[] menuItems = new String[5];`
-   Size cannot be changed after declaration.
-   Fill elements individually: `menuItems[0] = "Veggie hot dog";`
-   Default values depend on data type (e.g., `int` initializes to 0, `String` to null).

---

# Array Length

-   Access length with `length` field: `System.out.println(prices.length);`
-   Returns the number of elements or slots in the array.

---

# String[] args

-   `String[] args` in `main()` method holds command-line arguments.
-   Access arguments like any array: `args[0]` for the first argument.
-   Useful for customizing program behavior based on input.

---

# Review

-   Arrays store lists of values.
-   Create explicitly or as empty with fixed size.
-   Access elements by index, get length with `length`.
-   Use `String[] args` for command-line input.

---
