# Algorithms: Searching and Sorting Cheatsheet

## Merge Sort

### Merging in Merge Sort

Merge Sort is a divide-and-conquer algorithm with two main parts:

1. Splitting the original list into smaller sorted lists recursively until each list contains only one element.
2. Merging back the pre-sorted single-element lists into two-element lists, four-element lists, and so on, recursively.

During the merging portion, which is iterative, two sublists are compared. The first element of the left sublist is compared to the first element of the right sublist. If smaller, it is added to a new sorted list and removed from the left sublist. If larger, the first element of the right sublist is added instead and removed. This repeats until one sublist is empty, then the remaining non-empty sublist is appended to the sorted list.

![Merging of Sublists in Merge Sort](https://content.codecademy.com/practice/art-for-practice/new-pngs/merge_ex_2.png)

### Big-O Runtime for Merge Sort

Merge Sort has two phases:

-   **Splitting**: Repeatedly divides the input list into smaller lists, with a best, worst, and average runtime of Θ(log N).
-   **Merging**: Repeatedly merges and sorts single-element lists into larger lists, with a best, worst, and average runtime of Θ(N).

The combined runtime for Merge Sort is Θ(N log N) in all cases.

## Binary Search

### Complexity of Binary Search

A dataset of length `n` can be divided `log n` times until fully segmented. Therefore, the search complexity of binary search is O(log n).

### Iterative Binary Search

Binary search can be implemented iteratively using a loop instead of recursion. The method uses `left` and `right` pointers to track the search range and calculates the middle index to compare with the target.

```java
public static int binSearchIterative(int target, int[] array, int left, int right) {
  while (left < right) {
    int mid = (right + left) / 2;
    if (target < array[mid]) {
      right = mid;
    } else if (target > array[mid]) {
      left = mid;
    } else {
      return mid;
    }
  }
  return -1;
}
```

### Base Case in Recursive Binary Search

In a recursive binary search, there are two base cases where recursion stops:

1. When the middle element equals the target.
2. When the target is absent from the list (left pointer exceeds right pointer).

```pseudo
binary_search(sorted_list, left_pointer, right_pointer, target)
  if (left_pointer >= right_pointer)
    base case 1: return not found
  mid_val and mid_idx defined here
  if (mid_val == target)
    base case 2: return mid_idx
  if (mid_val > target)
    recursive call with left pointer
  if (mid_val < target)
    recursive call with right pointer
```

### Updating Pointers in Recursive Binary Search

If the target is not found, recursion continues by updating pointers:

-   If the target is less than the middle value, update the right pointer to the middle index.
-   If the target is greater, update the left pointer to the middle index.

```java
public static int binarySearchRecursive(int[] array, int first, int last, int target) {
  int middle = (first + last) / 2;
  // Base case implementation here
  if (target < array[middle]) {
    return binarySearchRecursive(array, first, middle, target);
  } else {
    return binarySearchRecursive(array, middle, last, target);
  }
}
```

### Binary Search Requirements and Operation

Binary search requires a sorted dataset. It starts by comparing the middle element with the target. If they match, the search is complete. Otherwise, it eliminates the half where the target cannot exist and repeats on the remaining half.

### Binary Search Performance

The worst-case time complexity of binary search is O(log N). As the dataset size increases, the number of comparisons grows as the base-2 logarithm of the number of elements. For example, searching a list of 64 elements takes at most `log2(64) = 6` comparisons.

![Binary Search Performance Graph](https://content.codecademy.com/courses/search-course/visualizations/binaryComplexity.png)

![Binary Search Animation](https://content.codecademy.com/courses/search-course/visualizations/binarySearch.gif)

## Insertion Sort

### Insertion Sort Algorithm

Insertion sort works by repeatedly taking the next unsorted item and inserting it into the correct location in the sorted sub-list.

```java
public static void sort(int[] array) {
  for (int i = 1; i < array.length; i++) {
    int current = array[i];
    int j = i - 1;
    while (j >= 0 && array[j] > current) {
      array[j + 1] = array[j];
      j--;
    }
    array[j + 1] = current;
  }
}
```

### Insertion Sort Nested Loops

Insertion sort uses nested loops. The inner loop iterates through the sorted sub-list to find the correct insertion point for the current unsorted item, happening `n` times.

```java
public static void sort(int[] array) {
  for (int i = 1; i < array.length; i++) {
    // outer loop iterates through input array starting with second element
    int current = array[i];
    int j = i - 1;
    while (j >= 0 && array[j] > current) {
      // inner loop compares current element to predecessor(s)
      array[j + 1] = array[j];
      j--;
    }
    // insert current element
  }
}
```

### Insertion Sort Best Case Runtime

In the best-case scenario (an ascending array), the runtime of insertion sort is O(n). Each element requires only one comparison to confirm its position.

```java
int[] ascendingNumbers = {2, 4, 6, 8};
insertionSort(ascendingNumbers);
// sort second element - 4 is greater than 2 - no shift or further comparisons
// sort third element - 6 is greater than 4 - no shift or further comparisons
// sort fourth element - 8 is greater than 6 - no shift or further comparisons
```

### Insertion Sort Runtime

Nested loops indicate quadratic complexity. As `n` increases, runtime increases quadratically (if `n` doubles, time quadruples), resulting in O(n^2).

```java
public static void sort(int[] array) {
  for (int i = 1; i < array.length; i++) {
    // nested loop structure indicates O(n^2)
    while (j >= 0 && array[j] > current) {
      // compare current element to predecessor
    }
    // code to insert
  }
}
```

### Insertion Sort Worst Case

In the worst-case scenario (a descending array), insertion sort makes approximately n^2 comparisons. Each item must be compared to every item in the sorted sub-list.

```java
int[] descendingNumbers = {8, 6, 4, 2};
insertionSort(descendingNumbers);
// result of first sort - {6, 8, 4, 2}
// result of second sort - {4, 6, 8, 2}
// comparisons to sort last element - 2 is less than 8, 6, 4, insert 2
```

## Selection Sort

### Selection Sort Algorithm

Selection sort works by repeatedly finding the minimum element of an unsorted array and moving it to the end of the "sorted" part.

```java
public static void selectionSort(int arr[]) {
  int size = arr.length;
  for (int i = 0; i < size - 1; i++) {
    int currentMinimumIndex = i;
    for (int j = i + 1; j < arr.length; j++) {
      if (arr[j] < arr[currentMinimumIndex]) {
        currentMinimumIndex = j;
      }
    }
    int temp = arr[currentMinimumIndex];
    arr[currentMinimumIndex] = arr[i];
    arr[i] = temp;
  }
}
```

### Selection Sort Nested Loops

Selection sort uses nested for loops. The inner loop finds the smallest number in the unsorted section and moves it to the sorted section, repeating `n` times.

```java
public static void selectionSort(int arr[]) {
  for (int i = 0; i < size - 1; i++) {
    // for loop to loop through all unsorted elements
    for (int j = i + 1; j < arr.length; j++) {
      // for loop to find the smallest value of unsorted elements
    }
    // Code that swaps the smallest value to the correct place
  }
}
```

### Selection Sort Runtime

Nested loops indicate quadratic complexity. As `n` increases, runtime increases quadratically, resulting in O(n^2).

```java
public static void selectionSort(int arr[]) {
  for (int i = 0; i < size - 1; i++) {
    // nested for loop indicates runtime of O(n^2)
    for (int j = i + 1; j < arr.length; j++) {
    }
  }
}
```

### Selection Sort Number of Comparisons

The number of comparisons in selection sort is less than n^2 since the inner loop only searches remaining unsorted values. Nevertheless, the runtime remains O(n^2).

```java
public static void selectionSort(int arr[]) {
  for (int i = 0; i < size - 1; i++) {
    // outer for loop makes n - 1 comparisons
    for (int j = i + 1; j < arr.length; j++) {
      // inner for loop only searches remaining unsorted values
    }
    // code that swaps elements
  }
}
```

### Selection Sort Best and Worst Case Comparisons

In both best and worst cases, selection sort makes approximately n^2 comparisons. Even if already sorted, it must search all unsorted values.

```java
// worst case scenario
int[] inputArray1 = {19, 15, 12, 7};
selectionSort(inputArray1);
// determine 1st index
// compare 19 to 15, then 15 to 12, then 12 to 7
// 7 is the lowest value, swap with 19
// 3 comparisons were made

// best case scenario
int[] inputArray2 = {7, 12, 15, 19};
selectionSort(inputArray2);
// determine 1st index
// compare 7 to 12, then 7 to 15, then 7 to 19
// 7 is the lowest, no swap
// 3 comparisons were made
```

### Selection Sort Swap

Selection sort swaps the first unsorted element with the smallest value found in the unsorted sub-list.

```java
public static void selectionSort(int arr[]) {
  for (int i = 0; i < size - 1; i++) {
    // for loop to loop through all unsorted elements
    for (int j = i + 1; j < arr.length; j++) {
      // Code that keeps track of the smallest value
    }
    // Code that swaps the smallest value to the correct place
    int temp = arr[currentMinimumIndex];
    arr[currentMinimumIndex] = arr[i];
    arr[i] = temp;
  }
}
```

## Linear Search

### Java Linear Search Algorithm

Linear search starts with the first element and checks if it matches the target, continuing until a match is found or the list ends.

```pseudo
for each element in the search_list
  if element equal target value then
    print location and return index
if element is not found then
  print message not found and return -1
```

### Return Value of Linear Search

A linear search method can return the index of a matched value with a success message if found, or return `-1` with a "not found" message if unsuccessful.

```java
public static int linearSearch(int[] arr, int target) {
  // loop through the input array
  for (int i = 0; i < arr.length; i++) {
    // check if array at current index is equal to `target`
    if (arr[i] == target) {
      System.out.println("Element is present at index " + i);
      return i;
    }
  }
  // if we finish looping through our array and the element is not found
  System.out.println("Element is not present in the array");
  return -1;
}
```

### Linear Search Best and Worst Cases

The best-case performance for linear search is O(1) when the target is the first element. The worst-case performance is O(N) when the target is at the end or not in the list, requiring N comparisons.

![Best Case](https://content.codecademy.com/courses/search-course/visualizations/best%20case.png)
![Worst Case 1](https://content.codecademy.com/courses/search-course/visualizations/worst%20case.png)
![Worst Case 2](https://content.codecademy.com/courses/search-course/visualizations/worst%20case%202.png)

### 2D Array Linear Search

In Java, linear search on a 2D array uses nested for loops to check each row and column.

```pseudo
for each row in the search_list
  for each column of that row
    if element at that row and column equals the target value then
      print the index of the row and column and return 1
print message that element is not found and return -1
```

### Linear Search Complexity and Runtime

Linear search has a Big-O runtime of O(N), making at most `n` comparisons, where `n` is the list length. Runtime increases linearly with input size, making it inefficient for large datasets.

![Linear Search Runtime Graph](https://content.codecademy.com/practice/art-for-practice/new-pngs/linear-search-graph.png)

### Linear Search Average Runtime

On average, linear search has a Big-O runtime of O(N), even if the target is found halfway through (average comparisons = N/2).

### Linear Search as a Function

Linear search can be expressed as a function that compares each item with the target until a match is found.

```pseudo
For each element in the array
  if element equal target value then
    return its index
  if element is not found, return
    "Value Not Found" message
```

### Return Value Variations

A linear search function can return a success message and index if found, or a failure message and `-1` if not.

```pseudo
For each element in the array
  if element equal target value then
    print success message
    return its index
  if element is not found
    print Value not found message
    return -1
```

### Modification for Multiple Instances

Linear search can be modified to return all instances of a target by not breaking on a match and collecting indices.

```pseudo
For each element in the searchList
  if element equal target value then
    Add its index to a list of occurrences
if the list of occurrences is empty
  raise ValueError
otherwise
  return the list occurrences
```

### Linear Search Overview

Linear search sequentially checks each element for the target value until a match is found or all elements are checked. For `n` items, finding a target at position `n-5` requires checking `n-5` items.

### Linear Search in Complex Problems

Despite its simplicity, linear search is often a subroutine in complex searching problems, making it convenient to implement as a reusable function.

### Searching for Extremes with Linear Search

Linear search can find the smallest or largest value in an unsorted list by tracking the extreme value and updating as it iterates.

```pseudo
Create a variable called max_value_index
Set max_value_index to the index of the first element of the search list
  For each element in the search list
    if element is greater than the element at max_value_index
      Set max_value_index equal to the index of the element
return max_value_index
```
