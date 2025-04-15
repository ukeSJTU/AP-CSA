# Loops Cheatsheet

## Java `while` Loop

The `while` statement in Java repeatedly runs code as long as the given condition remains `true`.

```java
int count = 0;
while (count < 5) {
    System.out.println("Count is: " + count);
    count++;
}
```

## `For` Loop in Java

The `for` loop repeats code over a range of values by initializing a variable, checking a condition, and updating the variable each iteration.

```java
public class LoopExample {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration " + i);
        }
    }
}
```

Output:

```plaintext
Iteration 0
Iteration 1
Iteration 2
Iteration 3
Iteration 4
```

## For-each Statement in Java

In Java, the `for-each` statement allows you to directly loop through each item in an array or `ArrayList` and perform some action with each item. When creating a `for-each` statement, you must include the `for` keyword and two expressions inside parentheses, separated by a colon:

1. The handle for an element we’re currently iterating over.
2. The source array or `ArrayList` we’re iterating over.

```java
// array of numbers
int[] numbers = {1, 2, 3, 4, 5};
// for-each loop that prints each number in numbers
// int num is the handle while numbers is the source array
for (int num : numbers) {
    System.out.println(num);
}
```
