# Arrays and ArrayLists Cheatsheet

## Java ArrayList

In Java, an `ArrayList` is used to represent a dynamic list. While Java arrays are fixed in size (the size cannot be modified), an `ArrayList` allows flexibility by being able to both add and remove elements.

```java
// Import the ArrayList package
import java.util.ArrayList;

// Create an ArrayList called students
ArrayList<String> students = new ArrayList<String>();
```

## Index

An index refers to an element's position within an array. The index of an array starts from 0 and goes up to one less than the total length of the array.

```java
int[] marks = {50, 55, 60, 70, 80};
System.out.println(marks[0]); // Output: 50
System.out.println(marks[4]); // Output: 80
```

## Arrays

In Java, an array is used to store a list of elements of the same datatype. Arrays are fixed in size and their elements are ordered.

```java
// Create an array of 5 int elements
int[] marks = {10, 20, 30, 40, 50};
```

## Array Creation in Java

In Java, an array can be created in the following ways:

-   Using the `{}` notation, by adding each element all at once.
-   Using the `new` keyword, and assigning each position of the array individually.

```java
int[] age = {20, 21, 30};

int[] marks = new int[3];
marks[0] = 50;
marks[1] = 70;
marks[2] = 93;
```

## Changing an Element Value

To change an element value, select the element via its index and use the assignment operator to set a new value.

```java
int[] nums = {1, 2, 0, 4};
// Change value at index 2
nums[2] = 3;
```

## Modifying ArrayLists in Java

An `ArrayList` can easily be modified using built-in methods. To add elements to an `ArrayList`, you use the `add()` method. To remove elements from an `ArrayList`, you use the `remove()` method. Inside the `()` you can specify the index of the element that you want to remove, or directly specify the element itself.

```java
import java.util.ArrayList;

public class Students {
    public static void main(String[] args) {
        // Create an ArrayList called studentList, which initially holds []
        ArrayList<String> studentList = new ArrayList<String>();

        // Add students to the ArrayList
        studentList.add("John");
        studentList.add("Lily");
        studentList.add("Samantha");
        studentList.add("Tony");

        // Remove John from the ArrayList, then Lily
        studentList.remove(0);
        studentList.remove("Lily");

        // studentList now holds [Samantha, Tony]
        System.out.println(studentList);
    }
}
```
