---
marp: true
---

# String Methods

## Introduction to String Methods

-   A `String` in Java is an object representing a sequence of characters, widely used for storing information.
-   The `String` class, part of the `java.lang` package, offers numerous useful methods for operations and data manipulation.
-   No import needed for `String` class as it's available by default.

---

## Methods Covered

-   `length()`
-   `concat()`
-   `equals()`
-   `indexOf()`
-   `charAt()`
-   `substring()`
-   `toUpperCase()` / `toLowerCase()`

---

## length()

-   Returns the total number of characters in a `String`.
-   Example: For `String str = "Hello World!";`, `str.length()` returns `12`.

**Exercise Prompt:** Check if a tweet meets Twitter's 280 character limit.

![](../src/exercises/solution/TweetCounter.java)

-v-

## length() - Explanation

-   The length is equivalent to the Unicode units of the `String`.
-   Escape sequences like `\n` count as one character.

---

## concat()

-   Concatenates one string to the end of another, joining them together.
-   Example: `String name = "Code"; name = name.concat("cademy");` results in `"Codecademy"`.

**Exercise Prompt:** Combine your first and last name with a space in between.

![](../src/exercises/solution/CombineNames.java)

-v-

## concat() - Notes

-   `String`s are immutable; methods like `concat()` create a new object.
-   Without reassignment, the original `String` remains unchanged.
-   When concatenating with objects, the `toString()` method result is used.

---

## equals()

-   Used to test equality between two strings, as `==` doesn't work for objects.
-   Example: `String flavor1 = "Mango"; flavor1.equals("Mango");` returns `true`.
-   Also, `equalsIgnoreCase()` ignores case differences.

**Exercise Prompt:** Check if a password matches a specific string.

![](../src/exercises/solution/Password.java)

-v-

## equals() - Additional Info

-   `compareTo()` method for lexicographical comparison (dictionary order).
-   Returns `0` for equal strings, negative if the first string is less, positive if greater.
-   `compareToIgnoreCase()` ignores case in comparison.

---

## indexOf()

-   Returns the index of the first occurrence of a character or substring in a string.
-   Example: `String letters = "ABCDEFGHIJKLMN"; letters.indexOf("C");` returns `2`.
-   Returns `-1` if not found.

**Exercise Prompt:** Find the index of a Morse code substring.

![](../src/exercises/solution/MorseCode.java)

---

## charAt()

-   Returns the character at a specified index in a `String`.
-   Example: `String str = "qwer"; str.charAt(2);` returns `e`.
-   Throws `IndexOutOfBoundsException` if index is out of range.

**Exercise Prompt:** Print initials from first and last names.

![](../src/exercises/solution/Initials.java)

---

## substring()

-   Extracts a part of a string starting from a specified index to the end, or between two indices.
-   Example: `String line = "The Heav'ns and all the Constellations rung"; line.substring(24);` returns `Constellations rung`.
-   With two arguments, first is inclusive, second is exclusive.

**Exercise Prompt:** Extract "Heav'ns" from a line of poetry.

![](../src/exercises/solution/Poetry.java)

---

## toUpperCase() / toLowerCase()

-   Converts string to uppercase or lowercase.
-   Example: `String input = "Cricket!"; input.toUpperCase();` returns `CRICKET!`, `input.toLowerCase();` returns `cricket!`.
-   Useful for data consistency in databases.

**Exercise Prompt:** Convert a hashtag to lowercase.

![](../src/exercises/solution/Hashtag.java)

---

## Review

-   Congratulations on learning key `String` methods:
    -   `length()`
    -   `concat()`
    -   `indexOf()`
    -   `charAt()`
    -   `equals()` / `equalsIgnoreCase()`
    -   `substring()`
    -   `toUpperCase()` / `toLowerCase()`
-   Experiment with these methods to solidify understanding.

---
