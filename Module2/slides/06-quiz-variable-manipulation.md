# Quiz: Java Variable Manipulation

---

# Question 1: Not Equal Expression

-   The expression `5 != 6` will evaluate to what value?
    -   `6`
    -   `false`
    -   `5`
    -   `true`

-v-

## Answer 1

-   **Correct Answer**: `true`
-   **Explanation**: Since `5` is not equal to `6`, this line evaluates to `true`.

---

# Question 2: Variable Manipulation Output

-   What will the following program output?
    ```java
    int num = 12;
    num *= 2;
    num -= 4;
    num++;
    System.out.println(num);
    ```
    -   `20`
    -   `9`
    -   `12`
    -   `21`

-v-

## Answer 2

-   **Correct Answer**: `21`
-   **Explanation**: `num` was declared with a value of `12`. Then, `num` was multiplied by `2`. Next, `4` was subtracted from `num`. Finally, `num` was increased by `1`.

---

# Question 3: String Concatenation

-   To what value does the following string concatenation evaluate?
    ```java
    "It's " + 5 + "pm"
    ```
    -   Error
    -   `"It's 5pm"`
    -   `"It's pm"`
    -   `11`

-v-

## Answer 3

-   **Correct Answer**: `"It's 5pm"`
-   **Explanation**: The `+` will turn `5` into a String and then concatenate it.

---

# Question 4: Modulo Operation

-   After the following code is run, what value will the variable `endpoint` be assigned to?
    ```java
    int endpoint = 11 % 3;
    ```
    -   `2`
    -   `11`
    -   `2.66`
    -   `1`

-v-

## Answer 4

-   **Correct Answer**: `2`
-   **Explanation**: The modulo operator `%` returns the remainder. The remainder of `11` divided by `3` is `2`.

---

# Question 5: String Equality Check

-   What is the best way to tell if the following two Strings are equal?
    ```java
    String username1 = "teracoder";
    String username2 = "gigacoder";
    ```
    -   `username1.isEqualTo(username2)`
    -   `System.out.println(username1)`
    -   `username1==username2`
    -   `username1.equals(username2)`

-v-

## Answer 5

-   **Correct Answer**: `username1.equals(username2)`
-   **Explanation**: This command will compare the usernames against each other.

---

# Question 6: Less Than or Equal To

-   What does the following code do?
    ```java
    System.out.println(8 <= 8);
    ```
    -   Prints `8`.
    -   Prints `true`.
    -   Prints `false`.
    -   Prints `0`.

-v-

## Answer 6

-   **Correct Answer**: Prints `true`.
-   **Explanation**: 8 is less than or equal to 8, so the code inside the `System.out.println()` evaluates to `true`.

---

# Question 7: Type Error in Comparison

-   Are there any errors in this Java statement?
    ```java
    int status = 7 < 8;
    ```
    -   There are no errors.
    -   Yes, `int` should be `boolean`.
    -   Yes, there should be no semicolon.
    -   Yes, `int` should be `char`.

-v-

## Answer 7

-   **Correct Answer**: Yes, `int` should be `boolean`.
-   **Explanation**: The expression `7 < 8` will evaluate to `true`, which must be stored as a `boolean`, not an `int`.

---

# Question 8: Achieving a Specific Result

-   How could we get a result of `10`, given the following variable?
    ```java
    double a = 2;
    ```
    -   `a - 12`
    -   `a % 10`
    -   `a / 2`
    -   `a * 5`

-v-

## Answer 8

-   **Correct Answer**: `a * 5`
-   **Explanation**: `2` multiplied by `5` will give us `10`.

---

# Question 9: String Concatenation Operator

-   Which operator can be used to concatenate two Strings?
    -   `*`
    -   `-`
    -   `+`
    -   `.equals()`

-v-

## Answer 9

-   **Correct Answer**: `+`
-   **Explanation**: The plus sign will create a new combined String from two Strings.

---

# Question 10: Final Keyword

-   True or False: The value of a variable declared with the `final` keyword can be changed after its initial declaration.
    -   True
    -   False

-v-

## Answer 10

-   **Correct Answer**: False
-   **Explanation**: If a variable is declared with the `final` keyword, its value cannot be changed.
