# Quiz: Learn Java Loops

## Question 1: Infinite While Loop

How can you modify this code to prevent an infinite `while` loop?

```java
int i = 7;
while (i > 0) {
  System.out.println(i);
}
```

**Answer**: Add `i--` inside the `while` loop.

**Explanation**: Decrementing `i` ensures that the condition `i > 0` will eventually become `false`, preventing an infinite loop.

## Question 2: Loop Iterations

How many times will `"Hello, I.T. Have you tried turning it off and on again?"` be printed?

```java
int i = 1;
while (i < 100) {
  System.out.println("Hello, I.T. Have you tried turning it off and on again?");
  i++;
}
```

**Answer**: 99 times

**Explanation**: This would print 100 times if the condition were `i <= 100` or if `i` were initialized to `0`. Since `i` starts at 1 and increments until it reaches 100, it prints 99 times.

## Question 3: Rebuild While as For

Rebuild the `while` loop as a `for` loop.

```java
int i = 99;
while (i > 0) {
  System.out.println(i + " bottles of soda on the wall.");
  i--;
}
```

**Answer**:

```java
for (int j = 99; j > 0; j--) {
  System.out.println(j + " bottles of soda on the wall.");
}
```

**Explanation**: The provided `for` loop is correct, mirroring the behavior of the `while` loop by decrementing from 99 to 1.

## Question 4: Infinite For Loop

Complete the `for` loop so that it won’t cause an infinite loop.

```java
for (int i = 0; i < 5; i++) {
  System.out.println(i);
}
```

**Answer**: The loop is already correctly structured with `i++` to prevent an infinite loop.

**Explanation**: The increment `i++` ensures the loop condition `i < 5` will eventually be false after 5 iterations.

## Question 5: For-Each Loop Syntax

Complete the for-each loop.

```java
for (String llama : llamas) {
  sayHello(llama);
}
```

**Answer**: The syntax is correct, using `:` to indicate iteration over the collection `llamas`.

**Explanation**: This for-each loop iterates over each element in `llamas`, calling `sayHello()` for each one.

## Question 6: For vs For-Each

When would it be helpful to use a `for` loop instead of a for-each loop when iterating over an `ArrayList` of items?

**Answer**: When you aren’t starting from the beginning of the `ArrayList`.

**Explanation**: It can also be helpful when you need to know the index of each item, which a for-each loop does not provide.
