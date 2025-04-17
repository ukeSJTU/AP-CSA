# Quiz: Static Variables and Methods

## Question 1: Accessing Static Variables

Given the code block, which line(s) of code will successfully print the value `5`?

**Code:**

```java
public class ATM {
  public static int totalMoney = 0;

  public ATM() {
    totalMoney += 5;
  }

  public static void main(String[] args) {
    System.out.println(ATM.totalMoney); // Line 1
    ATM myATM = new ATM();
    System.out.println(ATM.totalMoney); // Line 2
    System.out.println(myATM.totalMoney); // Line 3
    ATM mySecondATM = new ATM();
    System.out.println(ATM.totalMoney); // Line 4
    System.out.println(myATM.totalMoney); // Line 5
  }
}
```

-   **Correct Answer:** Lines 2 and 3
    -   Explanation: You can access a static variable using either the class name or an object of the class (although we usually use the class name).
-   **Other Choices:**
    -   Lines 2, 3, 4, and 5
    -   Line 2
    -   Lines 1, 2, and 3

## Question 2: Static Method Error

What is the mistake in the code block?

**Code:**

```java
public class ATM {
  public static int totalMoney = 0;
  public int money;

  public ATM(int money) {
    this.money = money;
  }

  public static int getMoney() {
    return this.money;
  }

  public int getTotalMoney() {
    return totalMoney;
  }
}
```

-   **Correct Answer:** The static method `getMoney()` is trying to access the non-static variable `money`.
    -   Explanation: Remember, static methods have no `this` reference, and so they can't access instance variables.
-   **Other Choices:**
    -   The non-static method `getTotalMoney()` is trying to access the static variable `totalMoney`.
    -   The variable `totalMoney` can't be given the value of `0` when it is declared.
    -   The constructor is incorrectly setting the value of an instance variable due to incorrectly using a local variable.

## Question 3: Modifying Static Variables

Fill in the code so the value `5` will be printed.

**Code:**

```java
public class MyDemoClass {
  public static int variableA = 4;
  public int variableB;

  public MyDemoClass() {
    variableA += 1;
    this.variableB = 4;
  }

  public static void main(String[] args) {
    MyDemoClass myObject = new MyDemoClass();
    System.out.println(MyDemoClass.variableA);
  }
}
```

-   **Correct Answer:** The code is already correct and will print `5` due to the increment in the constructor.

## Question 4: Declaring Static vs. Instance Variables

What is the difference between declaring static variables and instance variables?

-   **Correct Answer:** When declaring static variables, you use the `static` keyword. For instance variables, you use the `this` keyword, or no keyword.
    -   Explanation: You would declare a static variable like `public static int myVariable`.
-   **Other Choices:**
    -   When declaring static variables, you use the `this` keyword along with the variable type.
    -   When declaring static variables, you use keywords like `private` or `public` to make the variable static.
    -   When declaring static variables, you use no keywords, but when declaring instance variables you use the `this` keyword.

## Question 5: Static Methods and Instance Variables

Why are static methods unable to interact with instance variables and non-static methods?

-   **Correct Answer:** Static methods are associated with a class, not an object of the class. As a result, static methods have no `this` reference.
    -   Explanation: You can't ask for something like `this.variable` or `this.method()`.
-   **Other Choices:**
    -   Static methods _can_ interact with non-static variables and methods. However, non-static methods can't interact with static variables.
    -   Static methods are associated with an object, not the class itself. As a result, static methods have no `this` reference.
