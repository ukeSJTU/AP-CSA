# Conditionals and Control Flow

## Introduction to Control Flow

-   Conditionals, or control flow statements, allow selective execution of code blocks.
-   Unlike linear execution, conditionals enable decision-making in programs.
-   Example scenario: Enrolling students in courses based on prerequisites.

---

# If-Then Statement

-   The simplest control flow structure.
-   Tests a boolean condition and executes code if true.
-   Structure: `if (condition) { /* code */ }`
-   Can use variables or comparisons that evaluate to boolean.
-   Curly braces can be omitted for brief statements.

-v-

## Example: If-Then

![](../src/examples/IfThenExample.java)

---

# If-Then-Else Statement

-   Provides an alternate path if the initial condition is false.
-   Ensures exactly one of two code blocks runs.
-   Structure: `if (condition) { /* code if true */ } else { /* code if false */ }`

-v-

## Example: If-Then-Else

![](../src/examples/IfThenElseExample.java)

---

# If-Then-Else-If Statement

-   Chains multiple conditions for evaluation from top to bottom.
-   Only the first true condition's block executes.
-   Useful for multiple possible outcomes like grading or course selection.

-v-

## Example: If-Then-Else-If

![](../src/examples/IfThenElseIfExample.java)

---

# Nested Conditional Statements

-   Places conditional statements inside others for complex logic.
-   Outer condition evaluated first; if true, nested condition is checked.
-   Useful for multi-layered decision-making like weather-based clothing choices.

-v-

## Example: Nested Conditionals

![](../src/examples/NestedConditionalsExample.java)

---

# Switch Statement

-   Alternative to chained if-then-else for matching a value against multiple cases.
-   Executes the block where the value matches a case label.
-   Uses `break` to exit the switch; without it, subsequent cases execute.
-   `default` block runs if no match is found, similar to `else`.

-v-

## Example: Switch Statement

![](../src/examples/SwitchStatementExample.java)

---

# Review

-   Conditionals add branching paths to programs for decision-making.
-   Different inputs produce different results using control flow.
-   Key structures:
    -   `if-then`: Executes if condition is true.
    -   `if-then-else`: Two paths based on condition.
    -   Chained `if-then-else`: Multiple conditions.
    -   `switch`: Matches value to case.
