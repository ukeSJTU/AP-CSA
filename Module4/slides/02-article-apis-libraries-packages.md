# Using Built-In Classes: APIs, Libraries, and Packages

This article explains what APIs, libraries, and packages are, their differences, and how they are used in Java.

---

# Understanding APIs

-   **API** stands for Application Program Interface
-   Allows applications to interact with other software
-   In Java, describes the list of available libraries and packages
-   Provides specifications on how to interact with software, not the actual code
-   Enables abstraction by hiding underlying code
-   Java API documentation: [Java 8 API](https://docs.oracle.com/javase/8/docs/api/)

-v-

## API Role

-   Contains information about libraries, packages, and classes you can use
-   Does not include the implementation code, only the specifications

---

# Understanding Libraries

-   Libraries are collections of code that implement the API specifications
-   Contain multiple packages with code for the classes described in the API
-   Provide the actual functionality that APIs describe

---

# Understanding Packages

-   A package is a group of related classes and interfaces in Java
-   Organizes related files together for easy access to specific functionality
-   Examples:
    -   `java.util`: Contains utility classes like `Random`, `Array`, and `ArrayList`
    -   `java.io`: Contains input/output classes like `File`, `Reader`, and `Writer`

---

# Relationship Between Components

-   APIs define libraries
-   Libraries contain packages
-   Packages are made up of classes

![Diagram connecting these components together - APIs define libraries which contain packages which are made up of classes](https://static-assets.codecademy.com/Paths/ap-computer-science/apis/api_relationship.png)

---

# Quiz: APIs, Libraries, and Packages

-   **What does an API do?**
    -   Correct Answer: Lets us know details about classes and packages in a library, but not the code itself
    -   Explanation: An API describes how to interact with software, providing specifications without the actual code

-v-

## Quiz Continued

-   **What is the purpose of a library?**
    -   Correct Answer: A location for the code that implements API specifications, containing all packages and classes
    -   Explanation: Libraries hold the actual code organized into packages and classes

-v-

## Quiz Continued

-   **What is a package used for?**
    -   Correct Answer: Contains a group of related classes and interfaces
    -   Explanation: Packages organize related classes and interfaces to provide specific functionality

---

# Using APIs, Libraries, and Packages

-   Used whenever you import code into your project
-   Example: Importing `ArrayList` from `java.util` package in the Java Class Library (JCL)
-   Each part works together to allow reuse of existing code
-   Simplifies complex tasks by using pre-written code
-   Example: Using `File` class from JCL instead of manually coding file access logic

---

# Example: Using the File Class

-   Task: Read a hidden message from `message.txt` using `File` and `Scanner` classes
-   Refer to the Java API for usage: [Java API](https://docs.oracle.com/javase/8/docs/api/)
-   Code example embedded below:

![](../src/examples/MessageReader.java)
