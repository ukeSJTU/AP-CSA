---
marp: true
---

# Project: Java Variables - Mad Libs

-   **Objective**: Create a Mad Libs word game to study for the AP Computer Science A Exam (Java)
-   **Description**: Develop a short story with blank spaces filled by player input, resulting in funny or strange outcomes
-   **Key Concepts**: Variables, data types, string concatenation, user interaction

---

# Project Requirements

-   **Story Template**: Use a provided story with blanks for different word types
-   **Variables**: Declare and initialize variables for names, adjectives, verbs, nouns, numbers, and places
-   **Output**: Print the completed story using `System.out.println()`

-v-

## Tasks Overview

-   Create a program description comment with purpose, author, and date
-   Declare variables for main character (`name1`), secondary character (`name2`), adjectives, verbs, nouns, a number, and a place
-   Ensure all variables are initialized to compile without errors
-   Print the story with variables inserted in the correct places
-   Optionally, make it interactive by hiding the story and having friends fill in variables

-v-

## Important Code Structures

-   Use `String` for text data (names, adjectives, verbs, nouns, places)
-   Use `int` for numerical data (number)
-   Concatenate strings using `+` operator to build the story
-   Example snippet:
    ```java
    String story = "This morning " + name1 + " woke up feeling " + adjective1 + ".";
    System.out.println(story);
    ```

---
