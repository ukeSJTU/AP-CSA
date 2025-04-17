---
marp: true
---

# Java Arrays Quiz

---

# Question 1: Array Type

What type is the following object?

```
{4, 5, 2, 1, 7}
```

-v-

## Answer Choices

-   `int`
-   `String[]`
-   `java.util.Arrays`
-   `int[]` **(Correct: This is an array holding integer values.)**

---

# Question 2: Command Output

What would be printed out by the following code if a user ran the command: `java Restaurant 6 vegetarians`?

```
class Restaurant {
    public static void main(String[] args) {
        System.out.println("Table for a party of " + args[0]);
        if(args[1].equals("vegetarians")) {
            // Do something for vegetarian eaters
        } else {
            // Do something for meat eaters
        }
    }
}
```

-v-

## Answer Choices

-   `Table for a party of Restaurant`
-   Error – `args` is not defined
-   `Table for a party of vegetarians`
-   `Table for a party of 6` **(Correct: `args[0]` is the first element in the arguments array.)**

---

# Question 3: Empty Array Initialization

Fill in the code to set `taxRates` to be an empty array of size 10, holding doubles.

```
class Tax {
    public static void main(String[] args) {
        double[] taxRates = new double[10];
    }
}
```

-v-

## Answer Choices

-   `double[10]`
-   `Arrays.new(10)`
-   `{1.0, 2.5, 3.5}`
-   `double.length(10)`

**(Correct: You got it!)**

---

# Question 4: Accessing Array Element

How would you access the element `"Gorgeous"` of the following array?

```
String[] tsSongs = {"Delicate", "Gorgeous", "All Too Well", "Hey Stephen"};
```

-v-

## Answer Choices

-   `tsSongs[1]` **(Correct: `"Gorgeous"` is at index 1 of the array.)**
-   `tsSongs[2]`
-   `tsSongs["Gorgeous"]`
-   `String[1]`

---

# Question 5: Array Property

What property holds the number of elements in an array?

-v-

## Answer Choices

-   `.length` **(Correct: You can access `.length` on an array to get the number of elements it holds.)**
-   `.size`
-   `.numElements`
-   `.toString`

---

# Question 6: Printing Array Values

Fill in the code to print the array so that its actual values display, instead of the memory address.

```
import java.util.Arrays;
class Restaurant {
    public void printSpecials() {
        String[] specials = {"Chicken Mountain", "Lake of Broth", "Wishbone Tower"};
        System.out.println(Arrays.toString(specials));
    }
    public static void main(String[] args) {
        Restaurant chickenKitchen = new Restaurant();
        chickenKitchen.printSpecials();
    }
}
```

-v-

## Answer Choices

-   `specials.length`
-   `specials`
-   `specials.toString()`
-   `specials[0]`

**(Correct: You got it!)**
