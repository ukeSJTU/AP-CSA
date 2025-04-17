# Math Magic Project

## Objective

Study for the AP Computer Science A Exam (Java) by creating a small program that performs a mathematical magic trick. This project involves performing arithmetic operations on an integer of your choice to achieve a surprising result.

## Project Description

In this project, you will write a program that takes an initial number and performs a series of arithmetic operations to always result in the same final value, demonstrating a mathematical trick.

## Project Requirements

-   **Initialize**: Set an original number (`myNumber`) between -46,341 and 46,340 to avoid integer overflow.
-   **Steps**: Perform the following operations in sequence:
    1. Square the number.
    2. Add the original number.
    3. Divide by the original number.
    4. Add 17.
    5. Subtract the original number.
    6. Divide by 6.
-   **Output**: Print the final result, which should always be the same (3) regardless of the initial number chosen within the specified range.
-   **Challenge**: Recreate the project using only two variables (`myNumber` and `magicNumber`) with compound assignment operators.

## Implementation Notes

-   **Starter Code**: Located in `MathMagic_Starter/Magic.java`. This file provides the basic structure with TODO comments for areas to implement.
-   **Solution Code**: Located in `MathMagic_Solution/Magic.java`. This file contains the complete implementation, including the challenge using two variables.
-   **Testing**: Test your program with different numbers within the specified range to verify the "magic" result.
-   **Note**: Due to the range of the `int` data type, ensure `myNumber` is within -46,341 to 46,340 to prevent overflow during calculations.

## Why It Works

The sequence of operations is designed to always result in 3, no matter the initial number chosen (within the range). Here's the mathematical breakdown, where `x` is `myNumber`:

-   **( ( ( x² + x ) / x ) + 17 - x ) / 6**
-   **= ( ( x + 1 ) + 17 - x ) / 6**
-   **= ( x + 18 - x ) / 6**
-   **= 18 / 6**
-   **= 3**
