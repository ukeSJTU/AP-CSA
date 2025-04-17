# Project: A Simple Car Loan Payment Calculator

## Overview

-   **Objective**: Calculate monthly car payment after taking out a loan.
-   **Key Concepts**: Use conditionals, Boolean expressions, and arithmetic operations.
-   **Components**:
    -   Car loan amount
    -   Interest rate
    -   Loan length (years)
    -   Down payment

---

# Project Requirements

## Step 1: Initialize Variables

-   Set `carLoan` to 10000 (loan amount).
-   Set `loanLength` to 3 (years).
-   Set `interestRate` to 5 (percent).
-   Set `downPayment` to 2000.

-v-

## Step 2: Validate Loan Conditions

-   Check if `loanLength` <= 0 OR `interestRate` <= 0.
    -   If true, print error: "Error! You must take out a valid car loan."
-   Check if `downPayment` >= `carLoan`.
    -   If true, print: "The car can be paid in full."

-v-

## Step 3: Calculate Monthly Payment

-   If conditions above are false:
    -   Compute `remainingBalance` as `carLoan - downPayment`.
    -   Convert `loanLength` to months (`loanLength * 12`).
    -   Calculate `monthlyBalance` as `remainingBalance / months`.
    -   Compute `interest` as `(monthlyBalance * interestRate) / 100`.
    -   Final `monthlyPayment` as `monthlyBalance + interest`.
    -   Print the monthly payment (should be 233).

---

# Code Structure

-   Use `if-else` statements for validation.
-   Perform arithmetic operations for payment calculation.
-   Ensure proper variable initialization and logic flow.

-v-

## Starter Template

-   Available in: `../src/projects/CarLoanCalculator_Starter/`
-   Contains basic structure with TODO comments for student implementation.

-v-

## Solution Implementation

-   Available in: `../src/projects/CarLoanCalculator_Solution/`
-   Full implementation with all calculations and validations.
