---
marp: true
---

# Quiz: Java Variables

---

# Question 1: Valid `char` Value

Which one of the following values is a valid `char`?

-   "a"
-   'ab'
-   7
-   'F'

-v-

## Answer 1

-   'F'  
    This is a single character within single quotes.

---

# Question 2: Value of `num`

What is the value of `num` in the following code?

```java
int num = (10 - (4 + 3)) * 6;
```

-   -32
-   18
-   24
-   20

-v-

## Answer 2

-   18  
    Using the order of operations, `(4 + 3)` is evaluated first. Then, `(10 - 7)` is evaluated. Finally, `3 * 6` is evaluated producing a value of `18`.

---

# Question 3: Invalid `double` Value

What value CANNOT be assigned to a variable with the datatype `double`?

-   "60"
-   -.2
-   6.7
-   5

-v-

## Answer 3

-   "60"  
    Since there are double quotes, this is a String instead of a `double`.

---

# Question 4: Declaring a Whole Number Variable

What line of code declares a variable called `numRabbits` to store a whole number?

-   `number numRabbits;`
-   `int numRabbits;`
-   `numRabbits int;`
-   `numRabbits = int;`

-v-

## Answer 4

-   `int numRabbits;`  
    The `int` type stores whole numbers!

---

# Question 5: Declaring and Initializing a String Variable

Which line declares the variable `bestProgrammingLanguage` and initializes it to be `"Java"`?

-   `String bestProgrammingLanguage = "Java";`
-   `"Java" = String bestProgrammingLanguage;`
-   `bestProgrammingLanguage = String "Java";`
-   `string bestProgrammingLanguage = "Java";`

-v-

## Answer 5

-   `String bestProgrammingLanguage = "Java";`  
    This declares the type `String` and initializes the value to be `"Java"`.

---

# Question 6: Datatype with Two Values

What datatype can only be assigned one of two values?

-   `boolean`
-   `int`
-   `char`
-   `double`

-v-

## Answer 6

-   `boolean`  
    `boolean` variables can only either hold `true` or `false`.

---

# Question 7: Compilation Error

Which of the following lines would throw a compilation error?

-   `String gradeOnTest = "A";`
-   `char grade_on_test = 'F';`
-   `double isRaining = false;`
-   `int balance = -30;`

-v-

## Answer 7

-   `double isRaining = false;`  
    The variable is declared to be of type `double` but initialized to `false`, which is a boolean.

---

# Question 8: Valid Variable Name

Which option is a valid variable name and follows the Java naming conventions?

-   `2ndPhoneNumber`
-   `TimeUntilLaunch`
-   `timeUntilLaunch`
-   `second_phone_number`

-v-

## Answer 8

-   `timeUntilLaunch`  
    The first letter is uncapitalized, there are no underscores, and each non-starting word is capitalized.

---
