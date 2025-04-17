# Module 3 Projects

This directory contains project implementations for Module 3 of the AP Computer Science A Exam preparation course. Each project is designed to reinforce concepts learned in the module through practical application.

## Project: A Basic Calculator

### Overview

-   **Objective**: Create a simple arithmetic calculator to practice using classes, methods, and objects in Java.
-   **Functionality**: The calculator should perform basic operations on integers:
    -   Addition
    -   Subtraction
    -   Multiplication
    -   Division
    -   Modulo (remainder)

### Project Structure

-   **BasicCalculator_Starter/**: Contains the starter code for students to complete.
    -   `Calculator.java`: A template file with TODO comments indicating areas for implementation. Students are tasked with completing the arithmetic methods and testing them in the `main()` method.
-   **BasicCalculator_Solution/**: Contains the complete solution for reference.
    -   `Calculator.java`: A fully implemented version of the calculator with all arithmetic operations coded and sample tests in the `main()` method.

### Instructions

1. Start with the starter code in `BasicCalculator_Starter/Calculator.java`.
2. Implement each method (`add`, `subtract`, `multiply`, `divide`, `modulo`) to perform the respective arithmetic operation.
3. Test your implementation in the `main()` method with sample inputs (e.g., add 5 and 7, subtract 45 and 11).
4. Compare your results with the expected output (e.g., 12 for addition, 34 for subtraction).
5. Refer to the solution in `BasicCalculator_Solution/Calculator.java` if needed for guidance or to check your work.

### Additional Notes

-   Ensure to handle potential issues like division by zero in future enhancements (not implemented in the basic solution).
-   Explore extending the calculator to support `double` values or additional operations as a learning exercise.

## Project: Build A Droid

### Overview

-   **Objective**: Create a `Droid` class to simulate robot behavior, practicing instance fields and methods in Java.
-   **State** (Instance Fields):
    -   Name (String)
    -   Battery Level (int)
-   **Behavior** (Methods):
    -   Perform a task
    -   Report energy (battery level)

### Project Structure

-   **BuildADroid_Starter/**: Contains the starter code for students to complete.
    -   `Droid.java`: A template file with TODO comments indicating areas for implementation. Students are tasked with defining fields, constructor, and methods like `toString()` and `performTask()`.
-   **BuildADroid_Solution/**: Contains the complete solution for reference.
    -   `Droid.java`: A fully implemented version of the Droid class with state, behavior, and additional features like energy reporting and transfer.

### Instructions

1. Start with the starter code in `BuildADroid_Starter/Droid.java`.
2. Define instance fields for `name` and `batteryLevel`.
3. Implement the constructor to initialize `name` and set `batteryLevel` to 100.
4. Create `toString()` for descriptive output and `performTask()` to simulate actions with battery reduction.
5. Test your implementation in the `main()` method by creating Droid instances and performing tasks.
6. Refer to the solution in `BuildADroid_Solution/Droid.java` if needed for guidance or to check your work.

### Additional Notes

-   Explore enhancements like `energyReport()` to display battery level or `energyTransfer()` to exchange battery between droids.
-   Experiment with additional state or behavior to extend the Droid's capabilities as a learning exercise.
