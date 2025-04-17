# Java ArrayList Quiz

## Question 1: ArrayList Content After Set

What will the `ArrayList` `kidsMovies` hold after the code is run?

```
import java.util.ArrayList;
public class Rankings {
    public static void main(String[] args) {
        ArrayList<String> kidsMovies = new ArrayList<String>();
        kidsMovies.add("Moana");
        kidsMovies.add("Up");
        kidsMovies.add("WALL-E");
        kidsMovies.set(0, "Babe");
    }
}
```

### Answer Choices

-   `["Babe", "Moana", "Up", "WALL-E"]`
-   `["Babe", "Up", "WALL-E"]` **(Correct: "Babe" replaces the value at position 0 of the ArrayList.)**
-   `["Babe", "Moana", "Up"]`
-   `["Moana", "Up", "WALL-E", "Babe"]`

## Question 2: Output After Remove

What does the following code print?

```
import java.util.ArrayList;
public class RatingMachine {
    public static void main(String[] args) {
        ArrayList<Double> ratings = new ArrayList<Double>();
        ratings.add(1.7);
        ratings.add(2.5);
        ratings.add(3.5);
        ratings.remove(1);
        System.out.println(ratings.get(1));
    }
}
```

### Answer Choices

-   `3.5` **(Correct: 3.5 is the value at index 1 after 2.5 is removed.)**
-   `1.7`
-   `2.5` (Explanation: Not quite! 2.5 is removed, and 3.5 becomes the element at position 1 of the ArrayList.)
-   Error

## Question 3: Declare ArrayList Type

Fill in the blank to declare the `ArrayList` to hold the correct type.

```
import java.util.ArrayList;
public class Gradebook {
    public static void main(String[] args) {
        ArrayList<Integer> quizGrades;    // we will add the values 96, 87, and 46 later in the method
    }
}
```

### Answer Choices

-   `<int>`
-   `<Char>`
-   `[Integer]`
-   `[int]`
-   `<char>` **(Correct: <Integer> is the correct type for the ArrayList.)**

## Question 4: ArrayList Content After Add

What will the `ArrayList` `usernames` hold after this code runs?

```
import java.util.ArrayList;
public class LogIn {
    public static void main(String[] args) {
        ArrayList<String> usernames = new ArrayList<String>();
        usernames.add("teraCoder");
        usernames.add("javaKnight");
    }
}
```

### Answer Choices

-   It will be empty.
-   `["teraCoder", "javaKnight"]` **(Correct: Both elements will be held in order.)**
-   `["javaKnight", "teraCoder"]`
-   This code has an error.

## Question 5: Finding Element Position

What method can you use to find the position of a specific element in an `ArrayList`?

### Answer Choices

-   `get()`
-   `remove()`
-   `indexOf()` **(Correct: When you pass an element into indexOf(), it will return the position of that element in the ArrayList.)**
-   `size()`

## Question 6: Output of Get Method

What will the following code print?

```
import java.util.ArrayList;
public class Temperatures {
    public static void main(String[] args) {
        ArrayList<Integer> temperatures = new ArrayList<Integer>();
        temperatures.add(78);
        temperatures.add(67);
        temperatures.add(89);
        temperatures.add(94);
        System.out.println(temperatures.get(2));
    }
}
```

### Answer Choices

-   `2`
-   `67`
-   `89` **(Correct: 89 is the element at index 2 of the temperatures ArrayList.)**
-   `94`

## Question 7: Printing ArrayList Size

Fill in the code to print out how many elements are stored in the `grades` `ArrayList`.

```
import java.util.ArrayList;
public class TemperaturesC {
    public static void main(String[] args) {
        ArrayList<Character> grades = new ArrayList<Character>();
        grades.add('B');
        grades.add('B');
        grades.add('D');
        System.out.println(grades.size());
    }
}
```

### Answer Choices

-   `grades.length`
-   `grades.length()`
-   `grades.size()` **(Correct: size() is the correct method to get the number of elements in an ArrayList.)**
