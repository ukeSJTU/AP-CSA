---
marp: true
---

# Quiz: Access, Encapsulation, and Scope

-   Test your understanding of access modifiers, encapsulation, and scope

---

# Question 1: Access Modifiers

-   Fill in the code so the `String` instance variable named `name` is accessible from other classes, but the `int` variable named `age` isn't.

-v-

## Answer 1

-   **Correct Code:**

    ```java
    public class Student {
      public String name;
      private int age;
    }
    ```

---

# Question 2: Encapsulation Definition

-   What does encapsulation mean?

-v-

## Answer 2

-   **Correct Answer:** The concept of separating methods and variables into distinct bundles of logic.
    -   Explanation: We encapsulate our classes to help organize our code.

---

# Question 3: Local vs. Instance Variables

-   What value will be printed given the following code snippet?

    ```java
    public class Human {
      public String name;
      public Human(String inputName) {
        this.name = inputName;
      }
      public void sayName(String name) {
        System.out.println("My name is " + name);
      }
      public static void main(String[] args) {
        Human hero = new Human("Clark Kent");
        hero.sayName("Superman");
      }
    }
    ```

-v-

## Answer 3

-   **Correct Answer:** `My name is Superman`
    -   Explanation: Since we're not using `this.name`, the local variable `name` will be printed.

---

# Question 4: Using `this` Keyword

-   How would you increase only the instance variable `age` by `5` in a method named `increaseAgeByFive()` when there is also a local variable named `age`?

-v-

## Answer 4

-   **Correct Answer:**

    ```java
    this.age += 5;
    ```

    -   Explanation: By using `this.`, we are modifying the instance variable named `age`.

---

# Question 5: Understanding `this` in Method Calls

-   Explain the body of the `methodOne()` method in simple terms.

    ```java
    class myDemoClass {
      int demoInstanceVariable;
      public void methodOne() {
        this.methodTwo(this);
      }
      public void methodTwo(myDemoClass a) {
        System.out.println(a.demoInstanceVariable);
      }
    }
    ```

-v-

## Answer 5

-   **Correct Answer:** Whatever object (`this`) that called `methodOne()` proceeds to call `methodTwo()`. `methodTwo()` takes a `myDemoClass` object as a parameter, so in addition to calling the method, `this` passes itself as a parameter to `methodTwo()`.
    -   Explanation: This describes the behavior of `methodOne()`, where `this` is used both to call `methodTwo()` and to pass the current object as a parameter.

---

# Question 6: Mutator Methods

-   Which of the following is NOT true about mutator methods?

-v-

## Answer 6

-   **Correct Answer:** Mutator methods return the value of an instance variable.
    -   Explanation: This is the job of an accessor method, not a mutator method.

---

# Question 7: Accessor Methods

-   Given the following instance variables for a `Dog` class, which of the following methods is an accessor method for the `age` variable?

    ```java
    public class Dog {
      private String name;
      private int age;
    }
    ```

-v-

## Answer 7

-   **Correct Answer:**

    ```java
    public int getAge() {
      return this.age;
    }
    ```

    -   Explanation: An accessor method should be `public` and return the correct instance variable with the matching return type.
