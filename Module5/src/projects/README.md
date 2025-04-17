# Projects in Module 5

## Car Loan Payment Calculator Project

### Overview

This project involves creating a simple car loan payment calculator in Java. The objective is to calculate the monthly payment a user should expect to make after taking out a car loan, incorporating concepts such as conditionals, Boolean expressions, and arithmetic operations.

### Project Requirements

#### Objective

-   Calculate the monthly car payment based on loan details.

#### Components

-   **Car Loan Amount**: The total amount of the loan.
-   **Interest Rate**: The annual interest rate of the loan.
-   **Loan Length**: The duration of the loan in years.
-   **Down Payment**: The initial payment made by the user.

#### Tasks

1. Initialize variables:
    - Set `carLoan` to 10000.
    - Set `loanLength` to 3 (years).
    - Set `interestRate` to 5 (percent).
    - Set `downPayment` to 2000.
2. Validate loan conditions:
    - Check if `loanLength` <= 0 OR `interestRate` <= 0, print error message if true.
    - Check if `downPayment` >= `carLoan`, print full payment message if true.
3. Calculate monthly payment if conditions are valid:
    - Compute remaining balance (`carLoan - downPayment`).
    - Convert loan length to months (`loanLength * 12`).
    - Calculate monthly balance without interest (`remainingBalance / months`).
    - Compute interest (`monthlyBalance * interestRate / 100`).
    - Calculate final monthly payment (`monthlyBalance + interest`).
    - Print monthly payment (expected output: 233).

### Project Files

-   **Starter Template**: Located in `CarLoanCalculator_Starter/` folder. Contains the basic structure with TODO comments for student implementation.
-   **Solution Implementation**: Located in `CarLoanCalculator_Solution/` folder. Contains the complete implementation with all calculations and validations.

### Instructions

-   Start with the starter template to implement the car loan calculator.
-   Follow the tasks outlined above to complete the project.
-   Refer to the solution implementation for guidance or to check your work.

## Continents and Cities Project

### Overview

This project focuses on practicing the Java `switch` statement by mapping continents to their largest cities based on an integer input. The goal is to output a continent and its largest city corresponding to a given number.

### Project Requirements

#### Objective

-   Use a `switch` statement to display a continent and its largest city based on an integer value.

#### Tasks

1. Setup program structure:
    - Create a basic Java class `Continents` with a `main` method.
    - Add a descriptive comment at the top about the program's purpose.
2. Initialize variable:
    - Create an `int` variable `continent` and set it to 4 (representing Africa).
3. Implement switch statement:
    - Use a `switch` statement on `continent` to handle values 1 to 7.
    - Each case should print the corresponding continent and largest city:
        - 1: North America: Mexico City, Mexico
        - 2: South America: Sao Paulo, Brazil
        - 3: Europe: Moscow, Russia
        - 4: Africa: Lagos, Nigeria
        - 5: Asia: Shanghai, China
        - 6: Australia: Sydney, Australia
        - 7: Antarctica: McMurdo Station, US
    - Include a `default` case to print "Undefined continent!" for other values.
    - Use `break` after each case to prevent fall-through.
4. Expected output for `continent = 4` should be: "Africa: Lagos, Nigeria".

### Project Files

-   **Starter Template**: Located in `ContinentsCities_Starter/` folder. Contains the basic structure with TODO comments for student implementation.
-   **Solution Implementation**: Located in `ContinentsCities_Solution/` folder. Contains the complete implementation with all continent-city mappings.

### Instructions

-   Start with the starter template to implement the continents and cities mapping.
-   Follow the tasks outlined above to complete the project.
-   Refer to the solution implementation for guidance or to check your work.
