# Project: Build A Droid

## Overview

-   **Objective**: Study for the AP Computer Science A Exam (Java).
-   **Goal**: Create a `Droid` class to simulate robot behavior using instance fields and methods.
-   **State** (Instance Fields):
    -   Name
    -   Battery Level
-   **Behavior** (Methods):
    -   Perform a task
    -   Report energy (battery level)

---

# Project Requirements

## Key Tasks

-   Define a `Droid` class with `main()` method.
-   Declare instance fields:
    -   `name` (String)
    -   `batteryLevel` (int)
-   Create a constructor with `name` parameter, initializing `batteryLevel` to 100.
-   Implement `toString()` for descriptive output.
-   Add `performTask()` method to simulate actions and reduce battery level.

-v-

## Implementation Steps

-   Instantiate `Droid` objects in `main()` (e.g., named "Codey").
-   Print object details using `toString()` output.
-   Test `performTask()` with various actions (e.g., "dancing").
-   Expected behavior:
    -   Task performance prints action statement.
    -   Battery level decreases by 10 per task.

---

# Exploration and Improvement

-   **Suggestions for Enhancement**:
    -   Create `energyReport()` to display current battery level.
    -   Instantiate multiple droids for interaction.
    -   Implement `energyTransfer()` to exchange battery levels between droids.
-   **Learning Opportunity**: Experiment with additional methods or state variables (e.g., droid type, special abilities).
-   Refer to starter and solution code in:
    -   Starter: `../src/projects/BuildADroid_Starter/`
    -   Solution: `../src/projects/BuildADroid_Solution/`
