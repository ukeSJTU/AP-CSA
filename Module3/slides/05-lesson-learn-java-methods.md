# Learn Java: Methods

## Introduction

-   Objects have **state** (instance fields) and **behavior** (methods).
-   Example: Savings Account
    -   **State**: Balance of money available.
    -   **Behavior**: Depositing, withdrawing, checking balance.
-   Methods are reusable, modular code blocks for specific tasks.
-   **Method Decomposition**: Break large problems into smaller, manageable tasks.
-   Methods are reusable, reducing code duplication (e.g., `makeSandwich()`).

---

# Defining Methods

-   Methods define behavior for objects.
-   Example: `checkBalance()` for a Savings Account:

![](../src/examples/CheckBalanceMethod.java)

-   **Method Declaration**: `public void checkBalance()`
    -   `public`: Accessible by other classes.
    -   `void`: No specific output (for now).
    -   `checkBalance()`: Method name.
-   **Method Signature**: `checkBalance()` (name + parameter types).
-   Method body is within curly braces `{}`.

---

# Calling Methods

-   Non-static methods are called on objects using the dot operator (`.`).
-   Example: Adding `startEngine()` to `Car` class and calling it:

![](../src/examples/CarStartEngine.java)

-   **Method Call**: `myFastCar.startEngine();`
    -   References object (`myFastCar`), uses dot operator, includes parentheses `()`.
-   **Execution Order**: Methods execute when called, then return to top-down order.
-   Output:
    -   "Starting the car!"
    -   "Vroom!"
    -   "That was one fast car!"

---

# Scope

-   Scope defines the domain of a method (within curly braces `{}`).
-   Variables declared inside a method are not accessible outside its scope.
-   Example: Variable scope in `Car` class:

![](../src/examples/CarScopeExample.java)

-   `message` (inside `drive()`) is inaccessible in `main()`.
-   `milesDriven` (class level) is accessible in all methods.

---

# Adding Parameters

-   Methods can accept parameters to pass data between scopes.
-   Example: `startRadio()` with parameters for station number and name:

![](../src/examples/CarStartRadio.java)

-   **Method Signature**: `startRadio(double, String)` includes parameter types.
-   Parameters must match in order and type when called.
-   Output:
    -   "Turning on the radio to 103.7, Meditation Station!"
    -   "Enjoy!"

---

# Reassigning Instance Fields

-   Methods can change object state by reassigning instance fields.
-   Example: `deposit()` and `withdraw()` for `SavingsAccount`:

![](../src/examples/SavingsAccountMethods.java)

-   **Reassignment**: Update `balance` using assignment operator `=`.
-   Example usage:

![](../src/examples/SavingsAccountUsage.java)

-   Output:
    -   Initial balance: 2000
    -   After deposit: 2100

---

# Returns

-   Use `return` to send a value outside a method’s scope.
-   Example: Returning a value from `numberOfTires()`:

![](../src/examples/CarNumberOfTires.java)

-   **Return Type**: Replace `void` with data type (e.g., `int`).
-   `return` exits the method; subsequent code is ignored.
-   Non-void methods can be used in variables or expressions:

![](../src/examples/CarNumberOfTiresUsage.java)

-   Output: Stores returned value (4) in `numTires`.

---

# The toString() Method

-   Default object printout (e.g., `Store@6bc7c054`) is uninformative.
-   Define `toString()` to return a descriptive string when printing objects.
-   Example: Custom `toString()` for `Car`:

![](../src/examples/CarToString.java)

-   Output when printing `myCar`: "This is a red car!"

---

# Review

-   **Key Concepts of Methods:**
    -   **Defining**: Declare return type, name, parameters.
    -   **Calling**: Invoke with `.` and `()`.
    -   **Parameters**: Inputs declared in signature.
    -   **Changing Fields**: Update instance fields to change state.
    -   **Scope**: Variables limited to their declaration domain.
    -   **Return**: Output values with specified type.
-   Methods abstract tasks, making them repeatable and manageable for class behavior.
