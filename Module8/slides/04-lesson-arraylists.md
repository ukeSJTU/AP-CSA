---
marp: true
---

# Introduction to ArrayLists

-   Arrays have a fixed size, limiting flexibility.
-   `ArrayList` allows dynamic, mutable lists in Java.
-   Features:
    -   Store object references as elements.
    -   Store elements of the same type.
    -   Access elements by index.
    -   Add and remove elements.
-   Import required: `import java.util.ArrayList;`

---

# Creating ArrayLists

-   Declare the type of objects using generics: `ArrayList<String> babyNames;`
-   Can't use primitive types directly; use wrapper classes like `Integer` instead of `int`.
-   Initialize with `new`: `babyNames = new ArrayList<String>();`
-   Or in one line: `ArrayList<String> babyNames = new ArrayList<String>();`

-v-

## Exercise Prompt

-   Create an `ArrayList` to store to-do items.

---

# Adding an Item

-   Use `add()` to insert elements at the end: `carShow.add(ferrari);`
-   Or at a specific index: `carShow.add(1, corvette);` (shifts other elements).
-   Error if index doesn't exist.
-   Type must match `ArrayList` declaration.

-v-

## Exercise Prompt

-   Add multiple to-do items to an `ArrayList`.

---

# ArrayList Size

-   Use `size()` to get the number of elements: `shoppingCart.size();`
-   Useful for tracking dynamic content like a shopping cart.

-v-

## Exercise Prompt

-   Compare sizes of different `ArrayList`s to determine workload.

---

# Accessing an Index

-   Use `get()` instead of bracket notation: `shoppingCart.get(2);`
-   Returns the element at the specified index.

-v-

## Exercise Prompt

-   Access specific to-do items from `ArrayList`s.

---

# Changing a Value

-   Use `set()` to replace an element at an index: `shoppingCart.set(0, "Tweed Cape");`
-   Unlike arrays, no bracket notation for reassignment.

-v-

## Exercise Prompt

-   Update specific tasks in to-do lists.

---

# Removing an Item

-   Use `remove()` to delete by index: `shoppingCart.remove(1);`
-   Or by value: `shoppingCart.remove("Trench Coat");` (removes first instance).
-   More flexible than creating a new array.

-v-

## Exercise Prompt

-   Remove completed tasks from to-do lists.

---

# Getting an Item's Index

-   Use `indexOf()` to find the position of an element: `detectives.indexOf("Fletcher");`
-   Returns the index of the first occurrence.

-v-

## Exercise Prompt

-   Find the position of a specific task in a to-do list.

---

# Review

-   Key `ArrayList` operations:
    -   Create with generics.
    -   Add items with `add()`.
    -   Get size with `size()`.
    -   Access items with `get()`.
    -   Update with `set()`.
    -   Remove with `remove()`.
    -   Find index with `indexOf()`.

---
