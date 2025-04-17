# Quiz: Intro to Java Classes

This document contains all questions and answers from the "Intro to Java Classes" quiz for Module 3, provided for reference.

## Question 1: Constructor Parameter Requirement

-   **Question:** The following class definition requires a parameter to be passed in to the constructor to make an instance.
-   **Code:**
    ```java
    public class Dinosaur {
        boolean isExtinct;
        public Dinosaur(boolean extinct) {
            isExtinct = extinct;
        }
        public static void main(String[] args) {
            // program tasks
        }
    }
    ```
-   **Answer:** True. To make an instance of `Dinosaur`, we need to pass a `boolean` into the constructor invocation.

## Question 2: Completing Constructor Method

-   **Question:** The `Bank` class has one instance field: `branchLocationCount`. Complete the constructor method for this class.
-   **Code:**
    ```java
    public class Bank {
        int branchLocationCount;
        public Bank(int numLocations) {
            branchLocationCount = numLocations;
        }
        public static void main(String[] args) {
            // program tasks
        }
    }
    ```
-   **Answer:** `int numLocations`

## Question 3: Error in Program

-   **Question:** Why will the following program produce an error?
-   **Code:**
    ```java
    public class Shelf {
        String material;
        public Shelf() {
        }
        public static void main(String[] args) {
            Shelf bureau = new Shelf("pine");
        }
    }
    ```
-   **Answer:** The constructor does not have a parameter listed. We cannot invoke the constructor with a parameter unless it has been listed in the method.

## Question 4: Data Type of Variable

-   **Question:** What is the data type of the variable `hedwig`?
-   **Code:**
    ```java
    public class Owl {
        String speak;
        boolean nocturnal;
        public Owl() {
            speak = "Hoot";
            nocturnal = true;
        }
        public static void main(String[] args) {
            Owl hedwig = new Owl();
        }
    }
    ```
-   **Answer:** `Owl`. The `hedwig` variable has a reference data type. When declaring a variable with a reference data type, the variable’s type is the name of a class.

## Question 5: Completing Class Definition

-   **Question:** Complete the following class definition for a `Bank` class.
-   **Code:**
    ```java
    public class Bank {
        public static void main(String[] args) {
            // program tasks
        }
    }
    ```
-   **Answer:** `field`

## Question 6: Java Program Requirement

-   **Question:** Every Java program contains at least one class.
-   **Answer:** True. Java programs always require one class, and real-world programs can contain hundreds!

## Question 7: Main Method Execution

-   **Question:** The `main()` method is automatically run when the **.class** file is executed.
-   **Answer:** True. We never need to call `main()` ourselves.

## Question 8: Qualities of Java Class Instances

-   **Question:** Instances of a Java class represent the real world with what two qualities?
-   **Answer:** State and behavior. State is represented with instance fields and behavior is represented with methods.

## Question 9: Declaring an Instance

-   **Question:** An instance is declared in the `main()` function. Complete the method call.
-   **Code:**
    ```java
    public class Window {
        boolean isOpen;
        int height;
        int width;
        public Window(boolean open, int windowHeight, int windowWidth) {
            isOpen = open;
            height = windowHeight;
            width = windowWidth;
        }
        public static void main(String[] args) {
            Window bedroomWindow = new Window(true, 72, 34);
        }
    }
    ```
-   **Answer:** `new Window(true, 72, 34)`

## Question 10: Constructor Signature

-   **Question:** What is the signature of the following constructor?
-   **Code:**
    ```java
    public class Bug {
        String name;
        boolean ableToFly;
        int numberOfLegs;
        public Bug(String bugName, boolean canFly, int numLegs) {
            name = bugName;
            ableToFly = canFly;
            numberOfLegs = numLegs;
        }
        public static void main(String[] args) {
            Bug ladybug = new Bug("Lady Bug", true, 6);
        }
    }
    ```
-   **Answer:** `Bug(String bugName, boolean canFly, int numLegs)`. A signature consists of the constructor’s name and then the data type and name of each of its parameters.
