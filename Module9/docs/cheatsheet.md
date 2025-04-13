# Arrays and Loops: Loops Cheatsheet | Codecademy

# Loops

Print Cheatsheet

Share

## Topics

-   [Arrays and ArrayLists](/learn/paths/ap-computer-science-a/tracks/apcs-arrays-and-loops/modules/apcs-arrays-and-arraylists/cheatsheet)
-   Loops
-   [Two-Dimensional Arrays](/learn/paths/ap-computer-science-a/tracks/apcs-arrays-and-loops/modules/apcs-two-dimensional-arrays/cheatsheet)

### Java `while` Loop

The `while` statement in Java repeatedly runs code as long as the given condition remains `true`.

int count \= 0;

while (count < 5) {

    System.out.println("Count is: " + count);

    count++;

}

to clipboard

### `For` Loop in Java

The `for` loop repeats code over a range of values by initializing a variable, checking a condition, and updating the variable each iteration.

public class LoopExample {

    public static void main(String\[\] args) {

        for (int i \= 0; i < 5; i++) {

            System.out.println("Iteration " + i);

        }

    }

}

/\*

Iteration 0

Iteration 1

Iteration 2

Iteration 3

Iteration 4

\*/

to clipboard

### For-each statement in Java

In Java, the `for-each` statement allows you to directly loop through each item in an array or `ArrayList` and perform some action with each item.

When creating a `for-each` statement, you must include the `for` keyword and two expressions inside of parentheses, separated by a colon. These include:

1.  The handle for an element we’re currently iterating over.
2.  The source array or `ArrayList` we’re iterating over.

// array of numbers

int\[\] numbers \= {1, 2, 3, 4, 5};

// for-each loop that prints each number in numbers

// int num is the handle while numbers is the source array

for (int num : numbers) {

    System.out.println(num);

}

to clipboard

[

Previous

](/learn/paths/ap-computer-science-a/tracks/apcs-arrays-and-loops/modules/apcs-arrays-and-arraylists/cheatsheet)[

Next

](/learn/paths/ap-computer-science-a/tracks/apcs-arrays-and-loops/modules/apcs-two-dimensional-arrays/cheatsheet)

Print Cheatsheet

Share
