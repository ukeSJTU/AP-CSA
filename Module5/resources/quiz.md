# Quiz: Conditionals and Control Flow

## Question 1: Break Keyword in Switch

-   **Question**: The `break` keyword is important in a `switch` statement due to which of the following?
    -   It is necessary whenever the `switch` statement contains more than 4 cases.
    -   Java will return an error if it is not specified.
    -   Without break, Java will continue to check other cases in the switch statement.
    -   Without it, the `switch` statement will not execute.
-   **Correct Answer**: Without break, Java will continue to check other cases in the switch statement.
-   **Explanation**: The `break` statement prevents fall-through behavior in a `switch` statement, ensuring that only the matching case executes.

## Question 2: Code Output Prediction

-   **Question**: What will the following code print?
    ```java
    if (5 > 6) {
        System.out.println("C. Senor");
    } else if (6 < 5) {
        System.out.println("Sue Yu");
    } else {
        System.out.println("Jim Sox");
    }
    ```
    -   Jim Sox
    -   A blank line
    -   C. Senor
    -   Sue Yu
-   **Correct Answer**: Jim Sox
-   **Explanation**: `5 > 6` returns `false` and `6 < 5` also returns `false`. Therefore, the `else` block executes, printing "Jim Sox".

## Question 3: AND Operator

-   **Question**: The AND logical operator is represented in Java by which operator?
    -   `!`
    -   `||`
    -   `&&`
    -   `and`
-   **Correct Answer**: `&&`
-   **Explanation**: In Java, the AND logical operator is represented by `&&`, which evaluates to `true` only if both operands are `true`.

## Question 4: Boolean Expression Evaluation

-   **Question**: The following Boolean expression will be evaluated to what value?
    ```java
    !(false) && (5 > 4)
    ```
    -   `false`
    -   `unknown`
    -   `true`
    -   `(5 > 4)`
-   **Correct Answer**: `true`
-   **Explanation**: `!(false)` returns `true` and `(5 > 4)` is also `true`. Therefore, `true && true` evaluates to `true`.

## Question 5: OR Operator

-   **Question**: The OR logical operator is represented in Java by which operator?
    -   `!`
    -   `&&`
    -   `OR`
    -   `||`
-   **Correct Answer**: `||`
-   **Explanation**: In Java, the OR logical operator is represented by `||`, which evaluates to `true` if at least one operand is `true`.

## Question 6: Operator Precedence

-   **Question**: If multiple conditional operators are placed in a single expression, which operator gets evaluated first?
    -   The AND operator - `&&`
    -   The NOT operator - `!`
    -   An expression cannot contain more than one conditional operator.
    -   The OR operator - `||`
-   **Correct Answer**: The NOT operator - `!`
-   **Explanation**: The order of evaluation for conditional operators in Java is: NOT (`!`), AND (`&&`), then OR (`||`).

## Question 7: Switch Statement Output

-   **Question**: What will the following code print?
    ```java
    int choice = 5;
    switch (choice) {
      case 4:
        System.out.println("Jo Fraizer");
        break;
      case 5:
        System.out.println("Laila A. Lee");
        break;
      case 6:
        System.out.println("Hall E. Home");
        break;
      default:
        System.out.println(200);
    }
    ```
    -   `Jo Fraizer`
    -   `Laila A. Lee`
    -   `Hall E. Home`
    -   `200`
-   **Correct Answer**: `Laila A. Lee`
-   **Explanation**: `choice` is `5`, so the `case 5` block executes, printing "Laila A. Lee".
