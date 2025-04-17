# Project: Continents and Cities

## Overview

-   **Objective**: Practice Java `switch` statement by mapping continents to their largest cities.
-   **Key Concept**: Use `switch` to handle multiple cases based on an integer input.
-   **Goal**: Output a continent and its largest city based on a given number.

---

# Project Requirements

## Step 1: Setup Program Structure

-   Create a basic Java class `Continents` with a `main` method.
-   Add a descriptive comment at the top about the program's purpose.

-v-

## Step 2: Initialize Variable

-   Create an `int` variable `continent` and set it to 4 (representing Africa).

-v-

## Step 3: Implement Switch Statement

-   Use a `switch` statement on `continent` to handle values 1 to 7.
-   Each case should print the corresponding continent and largest city:
    -   1: North America: Mexico City, Mexico
    -   2: South America: Sao Paulo, Brazil
    -   3: Europe: Moscow, Russia
    -   4: Africa: Lagos, Nigeria
    -   5: Asia: Shanghai, China
    -   6: Australia: Sydney, Australia
    -   7: Antarctica: McMurdo Station, US
-   Include a `default` case to print "Undefined continent!" for other values.
-   Use `break` after each case to prevent fall-through.

-v-

## Expected Output

-   For `continent = 4`, output should be: "Africa: Lagos, Nigeria".

---

# Code Structure

-   Simple `switch` statement structure for case-based logic.
-   Proper use of `break` to control flow.
-   Clear output formatting for readability.

-v-

## Starter Template

-   Available in: `../src/projects/ContinentsCities_Starter/`
-   Contains basic structure with TODO comments for student implementation.

-v-

## Solution Implementation

-   Available in: `../src/projects/ContinentsCities_Solution/`
-   Full implementation with all continent-city mappings.
