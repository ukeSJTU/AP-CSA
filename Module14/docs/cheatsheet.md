# Algorithms: Searching and Sorting Cheatsheet | Codecademy

[Skip to Content](#cheatsheets-page-heading)

-   [Codecademy Logo](/)
-   [My Home](/learn)
-   Catalog

    -   ## Popular course topics

        Explore free or paid courses in topics that interest you.

        [Explore all courses](/catalog)

        -   [

            Python

            ](/catalog/language/python)

        -   [

            JavaScript

            ](/catalog/language/javascript)

        -   [

            HTML & CSS

            ](/catalog/language/html-css)

        -   [

            SQL

            ](/catalog/language/sql)

        -   [

            Java

            ](/catalog/language/java)

        -   [

            C++

            ](/catalog/language/c-plus-plus)

        -   [

            C#

            ](/catalog/language/c-sharp)

        -   [

            C

            ](/catalog/language/c)

        -   [

            PHP

            ](/catalog/language/php)

        -   [

            R

            ](/catalog/language/r)

        -   [

            IT

            ](/catalog/subject/information-technology)

        -   [

            Cybersecurity

            ](/catalog/subject/cybersecurity)

        -   [Cloud computing](/catalog/subject/cloud-computing)
        -   [AI](/catalog/subject/artificial-intelligence)
        -   [Web development](/catalog/subject/web-development)
        -   [Data science](/catalog/subject/data-science)
        -   [Web design](/catalog/subject/web-design)
        -   [Professional skills](/catalog/subject/professional-skills)

        [

        New

        Prepare for top industry certifications — explore certification prep paths​.

        ](/catalog/certification-prep)

    -   ## Top career paths

        Choose your career. We'll teach you the skills to get job-ready.

        -   [Full-Stack Engineer](/learn/paths/full-stack-engineer-career-path)
        -   [Back-End Engineer](/learn/paths/back-end-engineer-career-path)
        -   [iOS Developer](/learn/paths/ios-developer)
        -   [Front-End Engineer](/learn/paths/front-end-engineer-career-path)
        -   [Computer Science](/learn/paths/computer-science)
        -   [Data Scientist](/pages/data-science-career-specializations)

    Not sure where to begin?

    [Take our quiz →](/explore/sorting-quiz)

-   Resources

    -   ## Docs

        Find definitions, code syntax, and more -- or contribute your own code documentation.

        [View all docs →](/resources/docs)[Contribute to docs →](/pages/contribute-docs)

        -   [C](/resources/docs/c)
        -   [HTML](/resources/docs/html)
        -   [Python](/resources/docs/python)
        -   [C++](/resources/docs/cpp)
        -   [Java](/resources/docs/java)
        -   [React](/resources/docs/react)
        -   [CSS](/resources/docs/css)
        -   [JavaScript](/resources/docs/javascript)
        -   [SQL](/resources/docs/sql)
        -   [Git](/resources/docs/git)
        -   [PHP](/resources/docs/php)
        -   [UI/UX](/resources/docs/uiux)

    -   ## Learning & practice tools

        -   [

            ### Articles

            Learn about technical concepts.](/articles)

        -   [

            ### Cheatsheets

            Review concepts from your courses.](/resources/cheatsheets/all)

        -   [

            ### Code challenges

            Test your knowledge and prep for interviews.](/code-challenges)

        -   [

            ### Projects

            Practice and build your portfolio.](/projects)

        -   [

            ### Videos

            Watch tutorials, project walkthroughs, and more.](/resources/videos)

        -   [

            ### Workspaces

            Build and share projects in your browser.](/pages/workspaces)

    -   ## Inspiration & career

        [View all blog topics →](/resources/blog)

        -   [

            ### Career advice

            Get answers to questions about coding careers.](/resources/blog/category/career/)

        -   [

            ### Learning tips

            Learn where to start and how to stay motivated.](/resources/blog/category/learning-tips/)

        -   [

            ### Job-readiness checker

            New

            Analyze your compatibility with tech roles using AI.](/job-readiness)

-   Community

    -   [Visit Community](https://community.codecademy.com/c/start-here/)
    -   [Events](/events)
    -   [Learner Stories](/resources/blog/category/learner-stories/)
    -   [Code Crew](https://try.codecademy.com/code-crew/)

-   [Career Center](/career-center)
-   [For Business](/business)

-   no unread
-   ![User profile avatar](https://www.gravatar.com/avatar/cd8b9b41556f394741302dec7a289d34?s=140&d=retro)

    -   [Profile Link](/profiles/me)
    -   [Account + Billing Link](/account)
    -   [My Home Link](/learn)
    -   [Help Center Link](/help)
    -   [Give Feedback Link](https://a.sprig.com/ZTFvMkttQTI0fnNpZDo4YzNkNDBiYS0zZDBmLTQyZDktOGQ3Yy00YzRhZWUxYzZkOGU=)
    -   [Log Out Link](/sign_out)

-   [Codecademy Logo](/)

-   no unread

Codecademy Logo

1.  [Cheatsheets](/resources/cheatsheets/all)/
2.  Algorithms

# Searching and Sorting

Print Cheatsheet

Share

## Topics

-   [Recursion](/learn/paths/ap-computer-science-a/tracks/apcs-algorithms/modules/apcs-recursion/cheatsheet)
-   [Algorithmic Complexity](/learn/paths/ap-computer-science-a/tracks/apcs-algorithms/modules/apcs-algorithmic-complexity/cheatsheet)
-   Searching and Sorting

### Merge Sort Merging

Merge Sort is a divide and conquer algorithm. It consists of two parts:

```
1) splitting the original list into smaller sorted lists recursively until there is only 1 element in the list,
2) merging back the presorted 1-element lists into 2-element lists, 4-element lists, and so on recursively.
```

The merging portion is iterative and takes 2 sublists. The first element of the left sublist is compared to the first element of the right sublist. If it is smaller, it is added to a new sorted list, and removed from the left sublist. If it is bigger, the first element of the right sublist is added instead to the sorted list and then removed from the right sublist. This is repeated until either the left or right sublist is empty. The remaining non-empty sublist is appended to the sorted list.

![Merging of sublists in Merge Sort algorithm](https://content.codecademy.com/practice/art-for-practice/new-pngs/merge_ex_2.png)

### Big-O Runtime for Merge Sort

The Merge Sort algorithm is divided into two parts. The first part repeatedly splits the input list into smaller lists to eventually produce single-element lists. The best, worst and average runtime for this part is Θ(log N). The second part repeatedly merges and sorts the single-element lists to twice its size until the original input size is achieved. The best, worst and average runtime for this part is Θ(N). Therefore, the combined runtime is Θ(N log N).

### Complexity of Binary Search

A dataset of length n can be divided _log n_ times until everything is completely divided. Therefore, the search complexity of binary search is O(log n).

### Iterative Binary Search

A binary search can be performed in an iterative approach. Unlike calling a function within the function in a recursion, this approach uses a loop.

function binSearchIterative(target, array, left, right) {

while(left < right) {

    let mid \= (right + left) / 2;

    if (target < array\[mid\]) {

      right \= mid;

    } else if (target \> array\[mid\]) {

      left \= mid;

    } else {

      return mid;

    }

}

return \-1;

}

to clipboard

### Base case in a binary search using recursion

In a recursive binary search, there are two cases for which that is no longer recursive. One case is when the middle is equal to the target. The other case is when the search value is absent in the list.

```
binary_search(sorted_list, left_pointer, right_pointer, target)
  if (left_pointer >= right_pointer)
    base case 1
  mid_val and mid_idx defined here
  if (mid_val == target)
    base case 2
  if (mid_val > target)
    recursive call with left pointer
  if (mid_val < target)
    recursive call with right pointer
```

### Updating pointers in a recursive binary search

In a recursive binary search, if the value has not been found then the recursion must continue on the list by updating the left and right pointers after comparing the target value to the middle value.

If the target is less than the middle value, you know the target has to be somewhere on the left, so, the right pointer must be updated with the middle index. The left pointer will remain the same. Otherwise, the left pointer must be updated with the middle index while the right pointer remains the same. The given code block is a part of a function `binarySearchRecursive()`.

function binarySearchRecursive(array, first, last, target) {

let middle \= (first + last) / 2;

// Base case implementation will be in here.

if (target < array\[middle\]) {

    return binarySearchRecursive(array, first, middle, target);

} else {

    return binarySearchRecursive(array, middle, last, target);

}

}

to clipboard

### Binary Search Sorted Dataset

Binary search performs the search for the target within a sorted array. Hence, to run a binary search on a dataset, it must be sorted prior to performing it.

### Operation of a Binary Search

The binary search starts the process by comparing the middle element of a sorted dataset with the target value for a match. If the middle element is equal to the target value, then the algorithm is complete. Otherwise, the half in which the target cannot logically exist is eliminated and the search continues on the remaining half in the same manner.

The decision of discarding one half is achievable since the dataset is sorted.

### Binary Search Performance

The binary search algorithm takes time to complete, indicated by its `time complexity`. The worst-case time complexity is `O(log N)`. This means that as the number of values in a dataset increases, the performance time of the algorithm (the number of comparisons) increases as a function of the base-2 logarithm of the number of values.

Example: Binary searching a list of 64 elements takes at MOST `log2(64)` = 6 comparisons to complete.

![An example graph used to illustrate the binary search algorithm's performance.
The x-axis is labeled 'Number of elements'. The y-axis is labeled 'Number of comparisons'. The axes and their labels are white. There is a blue line on the graph starting where the X and Y axis intersect and curving up and to the right. The line flattens out as the number of elements increases. The blue line is labeled 'Binary Search O(log N)'. ](https://content.codecademy.com/courses/search-course/visualizations/binaryComplexity.png)

### Binary Search

The binary search algorithm efficiently finds a goal element in a sorted dataset. The algorithm repeatedly compares the goal with the value in the middle of a subset of the dataset. The process begins with the whole dataset; if the goal is smaller than the middle element, the algorithm repeats the process on the smaller (left) half of the dataset. If the goal is larger than the middle element, the algorithm repeats the process on the larger (right) half of the dataset. This continues until the goal is reached or there are no more values.

![A gif animation of a binary search, searching for the number 41.
There is a list of numbers in square boxes, from left to right the numbers are 1, 2, 7, 8, 22, 28, 41, 58, 67, 71, and 94. Under each of the square boxes there is a label number corresponding to the index of the boxes of numbers, in order from left to right those labels are 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, and 10.
In the first animation of the binary search we start at index 5 which has a value of 28. In the second animation of the binary search we search the last five indices 6 through 10. In the third animation we start with the number at index 8 which is 67 and we keep the 6th and 7th indices, 41 and 58 respectively. In the last animation of the gif we find the number 41 at index 6.](https://content.codecademy.com/courses/search-course/visualizations/binarySearch.gif)A gif animation of a binary search, searching for the number 41. There is a list of numbers in square boxes, from left to right the numbers are 1, 2, 7, 8, 22, 28, 41, 58, 67, 71, and 94. Under each of the square boxes there is a label number corresponding to the index of the boxes of numbers, in order from left to right those labels are 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, and 10. In the first animation of the binary search we start at index 5 which has a value of 28. In the second animation of the binary search we search the last five indices 6 through 10. In the third animation we start with the number at index 8 which is 67 and we keep the 6th and 7th indices, 41 and 58 respectively. In the last animation of the gif we find the number 41 at index 6., playing

### Insertion Sort Algorithm

Insertion sort algorithm works by repeatedly taking the next unsorted item in an unsorted list and inserting that item into the correct location in a sorted list.

class InsertionSort {

public static void sort(int\[\] array) {

for (int i \= 1; i < array.length; i++) {

     int current \= array\[i\];

     int j \= i \-1;

     while (j \>= 0 && array\[j\] \> current) {

       array\[j + 1\] \= array\[j\];

       j\--;

     }

     array\[j+1\] \= current;

}

}

public static void main(String\[\] args) {

}

}

to clipboard

### Insertion Sort Nested Loops

Insertion sort uses nested loops. The inner loop iterates through the list of items that are already sorted looking for the correct place to insert the most recent unsorted item. This loop happens `n` times - once for each item that needs to be inserted.

class InsertionSort {

public static void sort(int\[\] array) {

// outer loop iterates through input array starting with second element

for (int i \= 1; i < array.length; i++) {

     // store value of current element

     // inner loop

     while (j \>= 0 && array\[j\] \> current) {

       // compare current element to predecessor(s)

     }

     // move the greater element(s) one position to make space for swapped element

}

}

}

to clipboard

### Insertion Sort Best Case Runtime

In the case of an ascending array, the best case scenario, the runtime of insertion sort is O(n). As each element gets picked for insertion into the sorted list, it will only take one comparison to find the correct place to insert the new item. `1` comparison will happen `n` times, for a total runtime of O(n).

int\[\] ascendingNumbers \= {2, 4, 6, 8};

insertionSort(ascendingNumbers);

// sort second element - 4 is greater than 2 - no shift or further comparisons

// sort third element - 6 is greater than 4 - no shift or further comparisons

// sort fourth element - 8 is greater than 6 - no shift or further comparisons

to clipboard

### Java Insertion Sort Runtime

Nested loops are generally an indicator of quadratic complexity. This means that as the number of elements `n` increases, the running time increases quadratically. This means that if `n` doubles, we know that sorting time will quadruple, resulting in a runtime of O(n^2) due to the nested loop structure.

class InsertionSort {

public static void sort(int\[\] array) {

for (int i \= 1; i < array.length; i++) {

     // nested loop structure indicates O(n^2)

     while (j \>= 0 && array\[j\] \> current) {

         // compare current element to predecessor

     }

     // code to swap

}

}

}

to clipboard

### Insertion Sort Worst Case

In the case of a descending array, our worst case scenario, insertion sort will have to make approximately n^2 comparisons. This happens when the list to sort is in perfect reverse order. All `n` items that need to be inserted into the sorted section of the list will be compared to every item in the already sorted section of the list.

int\[\] descendingNumbers \= {8, 6, 4, 2};

insertionSort(descendingNumbers);

// result of first sort - {6, 8, 4, 2}

// result of second sort - {4, 6, 8, 2}

// comparisons to sort last element - 2 is less than 8, 2 is less than 6, 2 is less than 4, insert 2

to clipboard

### Selection Sort Algorithm

Selection sort works by repeatedly finding the minimum element of an unsorted array, and moving that element to the end of the “sorted” part of the array. It “selects” the smallest element and places it in the correct spot.

class Main {

public static void selectionSort (int arr\[\]) {

    int size \= arr.length;

    for (int i \= 0; i < size \- 1; i++) {

      int currentMinimumIndex \= i;

      for (int j \= i + 1; j < arr.length; j++) {

        if (arr\[j\] < arr\[currentMinimumIndex\]) {

          currentMinimumIndex \= j;

        }

      }

      int temp \= arr\[currentMinimumIndex\];

      arr\[currentMinimumIndex\] \= arr\[i\];

      arr\[i\] \= temp;

}

}

public static void main(String args\[\]) {

}

}

to clipboard

### Selection Sort Nested Loops

Selection sort makes use of nested for loops. The inner for loop finds the smallest number from the section of the unsorted array and moves it to the end of the sorted section of the array. The outer for loop makes this process happen `n` times - once for each element that needs to be put into the sorted section of the array

public static void selectionSort (int arr\[\]) {

    //for loop to loop through all unsorted elements

    for (int i \= 0; i < size \- 1; i++) {

        // for loop to find the smallest value of unsorted elements

        for (int j \= i + 1; j < arr.length; j++) {

             // Code that keeps track of the smallest value

        }

        // Code that swaps the smallest value to the correct place

    }

}

to clipboard

### Selection Sort Runtime

Nested loops are generally an indicator of quadratic complexity. This means that as the number of elements `n` increases, the running time increases quadratically. This means that if `n` doubles, we know that sorting time will quadruple, resulting in a runtime of O(n^2) due to the nested loop structure.

public static void selectionSort (int arr\[\]) {

    // nested for loop indicates runtime of O(n^2)

    for (int i \= 0; i < size \- 1; i++) {

        for (int j \= i + 1; j < arr.length; j++) {

        }

    }

}

to clipboard

### Selection Sort Number of Comparison Statements

The number of comparison statements made by selection sort is less than n^2. This is because the inner for loop that searches for the smallest remaining value in the unsorted section of the list does not have to search through all `n` items. It only needs to search through the remaining unsorted values.

Nevertheless, the runtime remains O(n^2).

class Main {

public static void selectionSort (int arr\[\]) {

    // outer for loop makes n - 1 comparisons

    for (int i \= 0; i < size \- 1; i++) {

     // inner for loop only searches remaining unsorted values

      for (int j \= i + 1; j < arr.length; j++) {

       // code that keeps track of the smallest value

      }

     // code that swaps elements

}

}

public static void main(String args\[\]) {

}

}

to clipboard

### Selection Sort Best and Worst Case Comparisons

In both best case and worst case scenarios, selection sort makes approximately n^2 comparisons. Even if the list is already sorted, the inner for loop will have to make n comparisons to find the smallest remaining unsorted item.

// worst case scenario

int\[\] inputArray1 \= { 19, 15, 12, 7 };

selectionSort(inputArray1);

// determine 1st index

// compare 19 to 15, then 15 to 12, then 12 to 7

// 7 is the lowest value, swap with 19

// 3 comparisons were made

// best case scenario

int\[\] inputArray2 \= { 7, 12, 15, 19 };

selectionSort(inputArray2);

// determine 1st index

// compare 7 to 12, then 7 to 15, then 7 to 19

// 7 is the lowest, no swap

// 3 comparisons were made

to clipboard

### Selection Sort Swap

Sorting occurs as selection sort swaps the element in the first position of the unsorted sub-list with the element with the lowest value in the remainder of the unsorted sub-list.

public static void selectionSort (int arr\[\]) {

// for loop to loop through all unsorted elements

for (int i \= 0; i < size \- 1; i++) {

      // for loop to find the smallest value of unsorted elements

      for (int j \= i + 1; j < arr.length; j++) {

           // Code that keeps track of the smallest value

      }

      // Code that swaps the smallest value to the correct place

      int temp \= arr\[currentMinimumIndex\];

      arr\[currentMinimumIndex\] \= arr\[i\];

      arr\[i\] \= temp;

}

}

to clipboard

### Java Linear Search Algorithm

Linear search will start with the first element and check if it is a match for our target element, and will continue the search till it finds a match. The steps are:  
Step 1: Examine the current element in the list.  
Step 2: If the current element is equal to the target value, stop.  
Step 3: If the current element is not equal to the target value, check the next element in the list.  
Continue steps 1 - 3 until the element is found or the end of the list is reached.

```
for each element in the search_list
    if element equal target value then
       print location and return index
if element is not found then
    print message not found and return -1
```

### Return Value of a Linear Search

A method that performs a linear search can return a message of success and the index of the matched value if the search can successfully match the target with an element of the dataset. In the event of a failure, a message indicating the value was not found along with returning a `-1`.

class LinearSearch

{

public static int linearSearch(int\[\] arr, int target)

{

      // loop through the input array

        // check if array at current index is equal to \`target\`

          // if true

          System.out.println("Element is present at index " + i);

          return i;

      // if we finish looping through our array and the element is not found

      System.out.println("Element is not present in the array");

      return \-1;

}

public static void main(String args\[\])

{

      int arr\[\] \= { 2, 3, 4, 10, 40 };

      int target \= 10;

      linearSearch(arr, target);

}

}

to clipboard

### Linear Search Best and Worst Cases

The best-case performance for the Linear Search algorithm is when the search item appears at the beginning of the list and is O(1). The worst-case performance is when the search item appears at the end of the list or not at all. This would require N comparisons, hence, the worse case is O(N).

![alt text](https://content.codecademy.com/courses/search-course/visualizations/best%20case.png)

![](https://content.codecademy.com/courses/search-course/visualizations/worst%20case.png)

![](https://content.codecademy.com/courses/search-course/visualizations/worst%20case%202.png)

### 2D Array Linear Search

In Java, a linear search on a 2D array is usually accomplished with nested for loops.

```
for each row in the search_list
  for each column of that row
    if element at that row and column equals the target value then
      print the index of the row and column and return 1
   print message that element is not found and return -1
```

### Iterative Binary Search Middle Index

The iterative binary search method take a `sorted array`, and `target`, as arguments. When the method runs the first time the `left`, the first index of the input array is `0`, while the `right`, the last index of the input array, is equal to its length - 1. The `mid` is the middle index of the input array. Now, the algorithm runs a while loop comparing the `target` with the array value of the `mid` index of the input array.

class BinarySearch

{

public static int binarySearch(int\[\] arr, int target)

{

     int left \= 0;

     int right \= array.length \- 1;

    while (left <= right)

    {

      int mid \= (left + right) / 2;

      if (target \== array\[mid\]) {

        return mid;

      }

     // code to run if \`target\` is greater or lesser than \`array\[mid\]\`

    }

    return \-1;

}

}

to clipboard

### Iterative Binary Search Algorithm

The iterative `binarySearch()` algorithm is implemented with the following steps:

-   Accepts a sorted array and target value as parameters
-   Sets a `left` integer to `0` and `right` integer to `arr.length`
-   Executes a `while` loop as long as `right` is greater than `left`
-   Inside the `while` loop, finds the value in the array at the middle index, equal to the average of `left` and `right`
-   If the current mid-value equals the target value, return the middle index
-   If the target value is greater than the value being checked, set `left` equal to the middle index + 1
-   If the target value is less than the value being checked, set `right` equal to the middle index
-   Outside of the `while` loop, return `-1`

public class BinarySearch {

public static int search(int\[\] arr, int target) {

    int left \= 0;

    int right \= arr.length;

    while (left < right) {

      int mid \= Math.floorDiv(left + right, 2);

      int midValue \= arr\[mid\];

      if (midValue \== target) {

        return mid;

      } else if (midValue < target) {

        left \= mid + 1;

      } else {

        right \= mid;

      }

    }

    return \-1;

}

}

to clipboard

### Searching for smallest or largest value using linear search

Linear search can be used to search for the smallest or largest value in an unsorted list rather than searching for a match. It can do so by keeping track of the largest (or smallest) value and updating as necessary as the algorithm iterates through the dataset.

```
Create a variable called max_value_index
Set max_value_index to the index of the first element of the search list
  For each element in the search list
    if element is greater than the element at max_value_index
      Set max_value_index equal to the index of the element
return max_value_index
```

### Linear Search best case

For a list that contains `n` items, the best case for a linear search is when the target value is equal to the first element of the list. In such cases, only one comparison is needed. Therefore, the best case performance is O(1).

### Linear Search Complexity

Linear search runs in linear time and makes a maximum of `n` comparisons, where `n` is the length of the list. Hence, the computational complexity for linear search is O(N).

The running time increases, at most, linearly with the size of the items present in the list.

### Linear Search expressed as a Function

A linear search can be expressed as a function that compares each item of the passed dataset with the target value until a match is found.

The given pseudocode block demonstrates a function that performs a linear search. The relevant index is returned if the target is found and -1 with a message that a value is not found if it is not.

```
For each element in the array
  if element equal target value then
    return its index
  if element is not found, return
    “Value Not Found” message
```

### Return value of a linear search

A function that performs a linear search can return a message of success and the index of the matched value if the search can successfully match the target with an element of the dataset. In the event of a failure, a message as well as `-1` is returned as well.

```
For each element in the array
  if element equal target value then
    print success message
    return its index
  if element is not found
    print Value not found message
    return -1
```

### Modification of linear search function

A linear search can be modified so that all instances in which the target is found are returned. This change can be made by not ‘breaking’ when a match is found.

```
For each element in the searchList
  if element equal target value then
    Add its index to a list of occurrences
if the list of occurrences is empty
  raise ValueError
otherwise
  return the list occurrences
```

### Linear search

_Linear search_ sequentially checks each element of a given list for the target value until a match is found. If no match is found, a linear search would perform the search on all of the items in the list.

For instance, if there are `n` number of items in a list, and the target value resides in the `n-5`th position, a linear search will check `n-5` items total.

### Linear search as a part of complex searching problems

Despite being a very simple search algorithm, linear search can be used as a subroutine for many complex searching problems. Hence, it is convenient to implement linear search as a function so that it can be reused.

### Linear Search Best and Worst Cases

The best-case performance for the Linear Search algorithm is when the search item appears at the beginning of the list and is O(1). The worst-case performance is when the search item appears at the end of the list or not at all. This would require N comparisons, hence, the worse case is O(N).

### Linear Search Average Runtime

The Linear Search Algorithm performance runtime varies according to the item being searched. On average, this algorithm has a Big-O runtime of O(N), even though the average number of comparisons for a search that runs only halfway through the list is N/2.

### Linear Search Runtime

The Linear Search algorithm has a Big-O (worst case) runtime of O(N). This means that as the input size increases, the speed of the performance decreases linearly. This makes the algorithm not efficient to use for large data inputs.

![Linear Search Algorithm Big-O runtime, O(N)](https://content.codecademy.com/practice/art-for-practice/new-pngs/linear-search-graph.png)

[

Previous

](/learn/paths/ap-computer-science-a/tracks/apcs-algorithms/modules/apcs-algorithmic-complexity/cheatsheet)

Print Cheatsheet

Share

## Learn more on Codecademy

-   [

    Free course

    ### Java: Algorithms

    Learn the basics of recursion and how to implement and analyze important algorithms in Java.

    Checker Dense

    **Beginner** Friendly

    **3** hours

    ![](https://static-assets.codecademy.com/Courses/Course-Cards/pillars.svg)

    ](/learn/java-algorithms)

-   [

    Skill path

    ### Study for the AP Computer Science A Exam (Java)

    Master the core concepts covered in AP Computer Science A Exam and gain a solid understanding of programming and fluency in Java.

    Checker Dense

    Includes **8 Courses**

    Checker Dense

    With **Certificate**

    Checker Dense

    **Beginner** Friendly

    **19** hours

    ![](https://static-assets.codecademy.com/components/curriculum/path/ap-computer-science-a/curriculum-card.svg)

    ](/learn/paths/ap-computer-science-a)

## Company

-   [About](/about)
-   [Careers](/about/careers)
-   [Affiliates](/pages/codecademy-affiliate-program)
-   [Partnerships](/pages/partnerships)
-   -   [](https://twitter.com/Codecademy)
    -   [](https://codecademy.com/users/redirect?redirect_url=https://www.facebook.com/groups/codecademy.community)
    -   [](https://instagram.com/codecademy)
    -   [](https://www.youtube.com/channel/UC5CMtpogD_P3mOoeiDHD5eQ)
    -   [](https://www.tiktok.com/@codecademy)

## Resources

-   [Articles](/articles)
-   [Blog](https://codecademy.com/resources/blog)
-   [Cheatsheets](/resources/cheatsheets/all)
-   [Code challenges](/code-challenges)
-   [Docs](/resources/docs)
-   [Projects](/projects)
-   [Videos](/resources/videos)
-   [Workspaces](https://codecademy.com/pages/workspaces)

## Support

-   [Help Center](https://help.codecademy.com)
-   [Give feedback](https://a.sprig.com/ZTFvMkttQTI0fnNpZDo4YzNkNDBiYS0zZDBmLTQyZDktOGQ3Yy00YzRhZWUxYzZkOGU=)

## Resources

-   [Articles](/articles)
-   [Blog](https://codecademy.com/resources/blog)
-   [Cheatsheets](/resources/cheatsheets/all)
-   [Code challenges](/code-challenges)
-   [Docs](/resources/docs)
-   [Projects](/projects)
-   [Videos](/resources/videos)
-   [Workspaces](https://codecademy.com/pages/workspaces)

## Support

-   [Help Center](https://help.codecademy.com)
-   [Give feedback](https://a.sprig.com/ZTFvMkttQTI0fnNpZDo4YzNkNDBiYS0zZDBmLTQyZDktOGQ3Yy00YzRhZWUxYzZkOGU=)

## Plans

-   [For individuals](/pages/paid-plans)
-   [For students](/student-center)
-   [For business](/business)
-   [Discounts](/pages/codecademy-discount-codes)

## Community

-   [Visit community](https://community.codecademy.com/c/start-here/)
-   [Code Crew](https://try.codecademy.com/code-crew/)
-   [Events](/events)
-   [Learner Stories](https://www.codecademy.com/resources/blog/category/learner-stories)

Codecademy from Skillsoft

Codecademy from Skillsoft

## Subjects

-   [AI](/catalog/subject/artificial-intelligence)
-   [Cloud computing](/catalog/subject/cloud-computing)
-   [Code foundations](/catalog/subject/code-foundations)
-   [Computer science](/catalog/subject/computer-science)
-   [Cybersecurity](/catalog/subject/cybersecurity)
-   [Data analytics](/catalog/subject/data-analytics)
-   [Data science](/catalog/subject/data-science)
-   [Data visualization](/catalog/subject/data-visualization)
-   [Developer tools](/catalog/subject/developer-tools)
-   [DevOps](/catalog/subject/devops)
-   [Game development](/catalog/subject/game-development)
-   [IT](/catalog/subject/information-technology)
-   [Machine learning](/catalog/subject/machine-learning)
-   [Math](/catalog/subject/math)
-   [Mobile development](/catalog/subject/mobile-development)
-   [Web design](/catalog/subject/web-design)
-   [Web development](/catalog/subject/web-development)

## Languages

-   [Bash](/catalog/language/bash)
-   [C](/catalog/language/c)
-   [C++](/catalog/language/c-plus-plus)
-   [C#](/catalog/language/c-sharp)
-   [Go](/catalog/language/go)
-   [HTML & CSS](/catalog/language/html-css)
-   [Java](/catalog/language/java)
-   [JavaScript](/catalog/language/javascript)
-   [Kotlin](/catalog/language/kotlin)
-   [PHP](/catalog/language/php)
-   [Python](/catalog/language/python)
-   [R](/catalog/language/r)
-   [Ruby](/catalog/language/ruby)
-   [SQL](/catalog/language/sql)
-   [Swift](/catalog/language/swift)

## Career building

-   [Career paths](/catalog/all)
-   [Career Center](/career-center)
-   [Interview prep](/pages/interview-prep)
-   [Professional certification](/pages/pro-certifications)
-   [Compare to bootcamps](https://try.codecademy.com/bootcamps)
-   —
-   [Full catalog](/catalog/all)
-   [Beta content](/catalog/subject/beta)
-   [Roadmap](https://trello.com/b/vAgDXtT6/codecademy-releases-roadmap)

## Mobile

-   [![Download on the App Store](/_portal/_next/static/images/download-on-the-app-store.49ed17e50605b713ba01c8cd74032cae.svg)](https://itunes.apple.com/us/app/codecademy-go/id1376029326)
-   [![Get it on Google Play](/_portal/_next/static/images/get-it-on-google-play.a88e7c96e43f2f1a91b8cfd36104a3dc.png)](https://play.google.com/store/apps/details?id=com.ryzac.codecademygo)

## Mobile

-   [![Download on the App Store](/_portal/_next/static/images/download-on-the-app-store.49ed17e50605b713ba01c8cd74032cae.svg)](https://itunes.apple.com/us/app/codecademy-go/id1376029326)
-   [![Get it on Google Play](/_portal/_next/static/images/get-it-on-google-play.a88e7c96e43f2f1a91b8cfd36104a3dc.png)](https://play.google.com/store/apps/details?id=com.ryzac.codecademygo)

-   [Privacy Policy](/policy)
-   [Cookie Policy](/cookie-policy)
-   [Do Not Sell My Personal Information](https://privacy.codecademy.com)
-   [Terms](/terms)

Made with ❤️in NYC © 2025 Codecademy

<script id="__NEXT_DATA__" type="application/json">{"props":{"pageProps":{"course":{"__typename":"Track","id":"4a4f129e80e7720973874c1ddc7c098c","slug":"apcs-algorithms","title":"Algorithms","contentModules":[{"__typename":"ContentModule","id":"7981ffef47b6f712f28d9bfbfa03cd16","slug":"apcs-recursion","title":"Recursion"},{"__typename":"ContentModule","id":"602160c87820ec639bc2a21eb00a0b1d","slug":"apcs-algorithmic-complexity","title":"Algorithmic Complexity"},{"__typename":"ContentModule","id":"1f1308eff69f6659bc0a93c3a3fa014e","slug":"apcs-searching-and-sorting","title":"Searching and Sorting"}]},"module":{"__typename":"ContentModule","id":"1f1308eff69f6659bc0a93c3a3fa014e","slug":"apcs-searching-and-sorting","title":"Searching and Sorting","reviewCards":[{"__typename":"ReviewCard","id":"5e17e5f0ffc5cb00142b26d3","title":"Merge Sort Merging","body":"Merge Sort is a divide and conquer algorithm. It consists of two parts:\n```\n1) splitting the original list into smaller sorted lists recursively until there is only 1 element in the list,\n2) merging back the presorted 1-element lists into 2-element lists, 4-element lists, and so on recursively.\n```\nThe merging portion is iterative and takes 2 sublists. The first element of the left sublist is compared to the first element of the right sublist. If it is smaller, it is added to a new sorted list, and removed from the left sublist. If it is bigger, the first element of the right sublist is added instead to the sorted list and then removed from the right sublist.\nThis is repeated until either the left or right sublist is empty. The remaining non-empty sublist is appended to the sorted list.\n","images":[{"__typename":"Image","alt":"Merging of sublists in Merge Sort algorithm","url":"https://content.codecademy.com/practice/art-for-practice/new-pngs/merge_ex_2.png"}],"codeSnippets":[]},{"__typename":"ReviewCard","id":"5e1cddaceb841d0011cd75a1","title":"Big-O Runtime for Merge Sort","body":"The Merge Sort algorithm is divided into two parts. The first part repeatedly splits the input list into smaller lists to eventually produce single-element lists. The best, worst and average runtime for this part is Θ(log N). The second part repeatedly merges and sorts the single-element lists to twice its size until the original input size is achieved. The best, worst and average runtime for this part is Θ(N). Therefore, the combined runtime is Θ(N log N).","images":[],"codeSnippets":[]},{"__typename":"ReviewCard","id":"5c8bebe6a2bddf5dc2a8458b","title":"Complexity of Binary Search","body":"A dataset of length n can be divided _log n_ times until everything is completely divided. Therefore, the search complexity of binary search is O(log n).","images":[],"codeSnippets":[]},{"__typename":"ReviewCard","id":"5c8e96a55f1de80f514f65d1","title":"Iterative Binary Search","body":"A binary search can be performed in an iterative approach. Unlike calling a function within the function in a recursion, this approach uses a loop.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5c94f4baa2bddf5d7fa85576","language":"javascript","text":"function binSearchIterative(target, array, left, right) {\n while(left \u003c right) {\n let mid = (right + left) / 2;\n if (target \u003c array[mid]) {\n right = mid;\n } else if (target \u003e array[mid]) {\n left = mid;\n } else {\n return mid;\n }\n }\n return -1;\n}"}]},{"__typename":"ReviewCard","id":"5c8e7029a2bddf5d7fa846f1","title":"Base case in a binary search using recursion","body":"In a recursive binary search, there are two cases for which that is no longer recursive. One case is when the middle is equal to the target. The other case is when the search value is absent in the list.\n\n```pseudo\nbinary_search(sorted_list, left_pointer, right_pointer, target)\n if (left_pointer \u003e= right_pointer)\n base case 1\n mid_val and mid_idx defined here\n if (mid_val == target)\n base case 2\n if (mid_val \u003e target)\n recursive call with left pointer\n if (mid_val \u003c target)\n recursive call with right pointer\n```","images":[],"codeSnippets":[]},{"__typename":"ReviewCard","id":"5c8e83a0a2bddf5d95a848f3","title":"Updating pointers in a recursive binary search","body":"In a recursive binary search, if the value has not been found then the recursion must continue on the list by updating the left and right pointers after comparing the target value to the middle value. \n\nIf the target is less than the middle value, you know the target has to be somewhere on the left, so, the right pointer must be updated with the middle index. The left pointer will remain the same. Otherwise, the left pointer must be updated with the middle index while the right pointer remains the same. The given code block is a part of a function `binarySearchRecursive()`.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5c94efcdaf246d0a74431a2e","language":"javascript","text":"function binarySearchRecursive(array, first, last, target) {\n let middle = (first + last) / 2;\n // Base case implementation will be in here.\n \n if (target \u003c array[middle]) {\n return binarySearchRecursive(array, first, middle, target); \n } else {\n return binarySearchRecursive(array, middle, last, target);\n }\n}"}]},{"__typename":"ReviewCard","id":"5c8be2a8af246d0ab94308be","title":"Binary Search Sorted Dataset","body":"Binary search performs the search for the target within a sorted array. Hence, to run a binary search on a dataset, it must be sorted prior to performing it.","images":[],"codeSnippets":[]},{"__typename":"ReviewCard","id":"5c8be5bd3709022d02ee4950","title":"Operation of a Binary Search","body":"The binary search starts the process by comparing the middle element of a sorted dataset with the target value for a match. If the middle element is equal to the target value, then the algorithm is complete. Otherwise, the half in which the target cannot logically exist is eliminated and the search continues on the remaining half in the same manner.\n\nThe decision of discarding one half is achievable since the dataset is sorted.","images":[],"codeSnippets":[]},{"__typename":"ReviewCard","id":"5e1e1622bd4e220011945be6","title":"Binary Search Performance","body":"The binary search algorithm takes time to complete, indicated by its `time complexity`. The worst-case time complexity is `O(log N)`. This means that as the number of values in a dataset increases, the performance time of the algorithm (the number of comparisons) increases as a function of the base-2 logarithm of the number of values. \n\nExample: Binary searching a list of 64 elements takes at MOST `log2(64)` = 6 comparisons to complete.","images":[{"__typename":"Image","alt":"An example graph used to illustrate the binary search algorithm's performance.\n\nThe x-axis is labeled 'Number of elements'. The y-axis is labeled 'Number of comparisons'. The axes and their labels are white. There is a blue line on the graph starting where the X and Y axis intersect and curving up and to the right. The line flattens out as the number of elements increases. The blue line is labeled 'Binary Search O(log N)'. ","url":"https://content.codecademy.com/courses/search-course/visualizations/binaryComplexity.png"}],"codeSnippets":[]},{"__typename":"ReviewCard","id":"5e1beb8e9f60b100119b4eaf","title":"Binary Search","body":"The binary search algorithm efficiently finds a goal element in a sorted dataset. The algorithm repeatedly compares the goal with the value in the middle of a subset of the dataset. The process begins with the whole dataset; if the goal is smaller than the middle element, the algorithm repeats the process on the smaller (left) half of the dataset. If the goal is larger than the middle element, the algorithm repeats the process on the larger (right) half of the dataset. This continues until the goal is reached or there are no more values.","images":[{"__typename":"Image","alt":"A gif animation of a binary search, searching for the number 41.\n\nThere is a list of numbers in square boxes, from left to right the numbers are 1, 2, 7, 8, 22, 28, 41, 58, 67, 71, and 94. Under each of the square boxes there is a label number corresponding to the index of the boxes of numbers, in order from left to right those labels are 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, and 10.\n\nIn the first animation of the binary search we start at index 5 which has a value of 28. In the second animation of the binary search we search the last five indices 6 through 10. In the third animation we start with the number at index 8 which is 67 and we keep the 6th and 7th indices, 41 and 58 respectively. In the last animation of the gif we find the number 41 at index 6.","url":"https://content.codecademy.com/courses/search-course/visualizations/binarySearch.gif"}],"codeSnippets":[]},{"__typename":"ReviewCard","id":"5fc127d061cfc900126e0dc8","title":"Insertion Sort Algorithm","body":"Insertion sort algorithm works by repeatedly taking the next unsorted item in an unsorted list and inserting that item into the correct location in a sorted list.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fc64838caf7dc0012e3bb78","language":"java","text":"class InsertionSort {\n public static void sort(int[] array) {\n for (int i = 1; i \u003c array.length; i++) {\n int current = array[i];\n int j = i -1;\n while (j \u003e= 0 \u0026\u0026 array[j] \u003e current) {\n array[j + 1] = array[j];\n j--;\n }\n array[j+1] = current;\n\n }\n }\n public static void main(String[] args) {\n }\n}"}]},{"__typename":"ReviewCard","id":"5fc134c510320c00128be851","title":"Insertion Sort Nested Loops","body":"Insertion sort uses nested loops. The inner loop iterates through the list of items that are already sorted looking for the correct place to insert the most recent unsorted item. This loop happens `n` times - once for each item that needs to be inserted.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fc1376113026f0012695b18","language":"java","text":"class InsertionSort {\n public static void sort(int[] array) {\n // outer loop iterates through input array starting with second element\n for (int i = 1; i \u003c array.length; i++) {\n // store value of current element\n \n // inner loop\n while (j \u003e= 0 \u0026\u0026 array[j] \u003e current) {\n // compare current element to predecessor(s)\n }\n // move the greater element(s) one position to make space for swapped element\n }\n }\n}"}]},{"__typename":"ReviewCard","id":"5fc157b3e42b8a0017364ce1","title":"Insertion Sort Best Case Runtime","body":"In the case of an ascending array, the best case scenario, the runtime of insertion sort is O(n). As each element gets picked for insertion into the sorted list, it will only take one comparison to find the correct place to insert the new item. `1` comparison will happen `n` times, for a total runtime of O(n).","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fc64ac0b6945d001206b8c9","language":"java","text":"int[] ascendingNumbers = {2, 4, 6, 8};\ninsertionSort(ascendingNumbers);\n// sort second element - 4 is greater than 2 - no shift or further comparisons\n// sort third element - 6 is greater than 4 - no shift or further comparisons\n// sort fourth element - 8 is greater than 6 - no shift or further comparisons\n"}]},{"__typename":"ReviewCard","id":"5fc13c89e81674001272b457","title":"Java Insertion Sort Runtime","body":"Nested loops are generally an indicator of quadratic complexity. This means that as the number of elements `n` increases, the running time increases quadratically. This means that if `n` doubles, we know that sorting time will quadruple, resulting in a runtime of O(n^2) due to the nested loop structure.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fc6497e51456b0012861e41","language":"java","text":"class InsertionSort {\n public static void sort(int[] array) {\n for (int i = 1; i \u003c array.length; i++) {\n // nested loop structure indicates O(n^2)\n while (j \u003e= 0 \u0026\u0026 array[j] \u003e current) {\n // compare current element to predecessor\n }\n // code to swap\n }\n }\n}"}]},{"__typename":"ReviewCard","id":"5fc164bae42b8a0017364cf2","title":"Insertion Sort Worst Case","body":"In the case of a descending array, our worst case scenario, insertion sort will have to make approximately n^2 comparisons. This happens when the list to sort is in perfect reverse order. All `n` items that need to be inserted into the sorted section of the list will be compared to every item in the already sorted section of the list.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fc64a7dcaf7dc0012e3bb92","language":"java","text":"int[] descendingNumbers = {8, 6, 4, 2};\ninsertionSort(descendingNumbers);\n// result of first sort - {6, 8, 4, 2}\n// result of second sort - {4, 6, 8, 2}\n// comparisons to sort last element - 2 is less than 8, 2 is less than 6, 2 is less than 4, insert 2"}]},{"__typename":"ReviewCard","id":"5fbebb4bbfffcd001268431d","title":"Selection Sort Algorithm","body":"Selection sort works by repeatedly finding the minimum element of an unsorted array, and moving that element to the end of the \"sorted\" part of the array. It \"selects\" the smallest element and places it in the correct spot.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fbebbd7e42b8a001215319f","language":"java","text":"class Main {\n public static void selectionSort (int arr[]) {\n \n int size = arr.length;\n\n for (int i = 0; i \u003c size - 1; i++) {\n\n int currentMinimumIndex = i;\n for (int j = i + 1; j \u003c arr.length; j++) {\n if (arr[j] \u003c arr[currentMinimumIndex]) {\n currentMinimumIndex = j;\n }\n }\n\n int temp = arr[currentMinimumIndex];\n arr[currentMinimumIndex] = arr[i];\n arr[i] = temp;\n }\n}\n\n public static void main(String args[]) {\n }\n}"}]},{"__typename":"ReviewCard","id":"5fbebc91e304650012472772","title":"Selection Sort Nested Loops","body":"Selection sort makes use of nested for loops. The inner for loop finds the smallest number from the section of the unsorted array and moves it to the end of the sorted section of the array. The outer for loop makes this process happen `n` times - once for each element that needs to be put into the sorted section of the array","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fbebd5dbc76c90012ee455e","language":"java","text":"public static void selectionSort (int arr[]) {\n \n //for loop to loop through all unsorted elements\n for (int i = 0; i \u003c size - 1; i++) {\n // for loop to find the smallest value of unsorted elements \n for (int j = i + 1; j \u003c arr.length; j++) {\n // Code that keeps track of the smallest value\n }\n // Code that swaps the smallest value to the correct place \n }\n\n }"}]},{"__typename":"ReviewCard","id":"5fbec142e81674001265cbd2","title":"Selection Sort Runtime","body":"Nested loops are generally an indicator of quadratic complexity. This means that as the number of elements `n` increases, the running time increases quadratically. This means that if `n` doubles, we know that sorting time will quadruple, resulting in a runtime of O(n^2) due to the nested loop structure.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fc16478a01c350012981868","language":"java","text":" public static void selectionSort (int arr[]) {\n \n // nested for loop indicates runtime of O(n^2)\n for (int i = 0; i \u003c size - 1; i++) {\n for (int j = i + 1; j \u003c arr.length; j++) {\n }\n }\n }"}]},{"__typename":"ReviewCard","id":"5fbedea7bfffcd0012684656","title":"Selection Sort Number of Comparison Statements","body":"The number of comparison statements made by selection sort is less than n^2. This is because the inner for loop that searches for the smallest remaining value in the unsorted section of the list does not have to search through all `n` items. It only needs to search through the remaining unsorted values.\n\nNevertheless, the runtime remains O(n^2).","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fc68bf435525c00124abf37","language":"java","text":"class Main {\n public static void selectionSort (int arr[]) {\n \n // outer for loop makes n - 1 comparisons\n for (int i = 0; i \u003c size - 1; i++) {\n\n // inner for loop only searches remaining unsorted values\n for (int j = i + 1; j \u003c arr.length; j++) {\n // code that keeps track of the smallest value\n }\n // code that swaps elements\n }\n}\n\n public static void main(String args[]) {\n }\n}"}]},{"__typename":"ReviewCard","id":"5fc1221710320c001249e5d2","title":"Selection Sort Best and Worst Case Comparisons","body":"In both best case and worst case scenarios, selection sort makes approximately n^2 comparisons. Even if the list is already sorted, the inner for loop will have to make n comparisons to find the smallest remaining unsorted item.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fc1243a91609a00137fdbc8","language":"java","text":"// worst case scenario\nint[] inputArray1 = { 19, 15, 12, 7 };\nselectionSort(inputArray1);\n// determine 1st index \n // compare 19 to 15, then 15 to 12, then 12 to 7\n // 7 is the lowest value, swap with 19\n // 3 comparisons were made \n\n// best case scenario \nint[] inputArray2 = { 7, 12, 15, 19 };\nselectionSort(inputArray2);\n// determine 1st index\n // compare 7 to 12, then 7 to 15, then 7 to 19\n // 7 is the lowest, no swap\n // 3 comparisons were made\n"}]},{"__typename":"ReviewCard","id":"5fc1258b3d410f00170de909","title":"Selection Sort Swap","body":"Sorting occurs as selection sort swaps the element in the first position of the unsorted sub-list with the element with the lowest value in the remainder of the unsorted sub-list. ","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fc126313d410f00170de912","language":"java","text":"public static void selectionSort (int arr[]) {\n\n // for loop to loop through all unsorted elements\n for (int i = 0; i \u003c size - 1; i++) {\n // for loop to find the smallest value of unsorted elements \n for (int j = i + 1; j \u003c arr.length; j++) {\n // Code that keeps track of the smallest value\n }\n // Code that swaps the smallest value to the correct place \n int temp = arr[currentMinimumIndex];\n arr[currentMinimumIndex] = arr[i];\n arr[i] = temp;\n }\n}"}]},{"__typename":"ReviewCard","id":"5fbd8c8ce81674001265ba61","title":"Java Linear Search Algorithm","body":"Linear search will start with the first element and check if it is a match for our target element, and will continue the search till it finds a match. The steps are: \nStep 1: Examine the current element in the list. \nStep 2: If the current element is equal to the target value, stop. \nStep 3: If the current element is not equal to the target value, check the next element in the list. \nContinue steps 1 - 3 until the element is found or the end of the list is reached. \n\n```pseudo\nfor each element in the search_list\n if element equal target value then\n print location and return index\nif element is not found then \n print message not found and return -1\n```","images":[],"codeSnippets":[]},{"__typename":"ReviewCard","id":"5fbe7fb810320c0012a874f7","title":"Return Value of a Linear Search","body":"A method that performs a linear search can return a message of success and the index of the matched value if the search can successfully match the target with an element of the dataset. In the event of a failure, a message indicating the value was not found along with returning a `-1`.\n","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fbe8541bc76c90012ee418a","language":"java","text":"class LinearSearch\n{\n public static int linearSearch(int[] arr, int target)\n {\n // loop through the input array\n // check if array at current index is equal to `target`\n // if true\n System.out.println(\"Element is present at index \" + i);\n return i;\n // if we finish looping through our array and the element is not found \n System.out.println(\"Element is not present in the array\");\n return -1;\n }\n public static void main(String args[])\n {\n int arr[] = { 2, 3, 4, 10, 40 };\n int target = 10;\n linearSearch(arr, target);\n }\n}"}]},{"__typename":"ReviewCard","id":"5fbe9767e42b8a0012152f85","title":"Linear Search Best and Worst Cases","body":"The best-case performance for the Linear Search algorithm is when the search item appears at the beginning of the list and is O(1). The worst-case performance is when the search item appears at the end of the list or not at all. This would require N comparisons, hence, the worse case is O(N).\n\n![alt text](https://content.codecademy.com/courses/search-course/visualizations/best%20case.png)\n\n![](https://content.codecademy.com/courses/search-course/visualizations/worst%20case.png)\n\n![](https://content.codecademy.com/courses/search-course/visualizations/worst%20case%202.png)","images":[],"codeSnippets":[]},{"__typename":"ReviewCard","id":"5fc7e032d064990017ba816b","title":"2D Array Linear Search","body":"In Java, a linear search on a 2D array is usually accomplished with nested for loops.\n\n```pseudo\nfor each row in the search_list\n for each column of that row\n if element at that row and column equals the target value then\n print the index of the row and column and return 1\n print message that element is not found and return -1\n```","images":[],"codeSnippets":[]},{"__typename":"ReviewCard","id":"5fc1734ee304650012a088d8","title":"Iterative Binary Search Middle Index","body":"The iterative binary search method take a `sorted array`, and `target`, as arguments. When the method runs the first time the `left`, the first index of the input array is `0`, while the `right`, the last index of the input array, is equal to its length - 1. The `mid` is the middle index of the input array. Now, the algorithm runs a while loop comparing the `target` with the array value of the `mid` index of the input array.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fc1874483b83a001403eefc","language":"java","text":"class BinarySearch\n{\n public static int binarySearch(int[] arr, int target)\n {\n int left = 0; \n int right = array.length - 1;\n \n while (left \u003c= right)\n {\n \n int mid = (left + right) / 2;\n \n if (target == array[mid]) {\n return mid;\n }\n // code to run if `target` is greater or lesser than `array[mid]`\n }\n \n return -1;\n }\n}"}]},{"__typename":"ReviewCard","id":"5fc18a9a7611f6001217bc64","title":"Iterative Binary Search Algorithm","body":"The iterative `binarySearch()` algorithm is implemented with the following steps: \n* Accepts a sorted array and target value as parameters \n* Sets a `left` integer to `0` and `right` integer to `arr.length` \n* Executes a `while` loop as long as `right` is greater than `left` \n* Inside the `while` loop, finds the value in the array at the middle index, equal to the average of `left` and `right` \n* If the current mid-value equals the target value, return the middle index \n* If the target value is greater than the value being checked, set `left` equal to the middle index + 1 \n* If the target value is less than the value being checked, set `right` equal to the middle index \n* Outside of the `while` loop, return `-1`","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fc18b2cbc76c90012927f19","language":"java","text":"public class BinarySearch {\n public static int search(int[] arr, int target) {\n int left = 0;\n int right = arr.length;\n while (left \u003c right) {\n int mid = Math.floorDiv(left + right, 2);\n int midValue = arr[mid];\n if (midValue == target) {\n return mid;\n } else if (midValue \u003c target) {\n left = mid + 1;\n } else {\n right = mid;\n }\n }\n\n return -1;\n }\n}"}]},{"__typename":"ReviewCard","id":"5c8bfec5a2bddf5dcba84645","title":"Searching for smallest or largest value using linear search","body":"Linear search can be used to search for the smallest or largest value in an unsorted list rather than searching for a match. It can do so by keeping track of the largest (or smallest) value and updating as necessary as the algorithm iterates through the dataset.\n\n```pseudo\nCreate a variable called max_value_index \nSet max_value_index to the index of the first element of the search list\n For each element in the search list\n if element is greater than the element at max_value_index\n Set max_value_index equal to the index of the element\nreturn max_value_index\n```","images":[],"codeSnippets":[]},{"__typename":"ReviewCard","id":"5c8b6ef63709022d26ee4800","title":"Linear Search best case","body":"For a list that contains `n` items, the best case for a linear search is when the target value is equal to the first element of the list. In such cases, only one comparison is needed. Therefore, the best case performance is O(1).","images":[],"codeSnippets":[]},{"__typename":"ReviewCard","id":"5c8b3f10a2bddf5dbaa8461f","title":"Linear Search Complexity","body":"Linear search runs in linear time and makes a maximum of `n` comparisons, where `n` is the length of the list. Hence, the computational complexity for linear search is O(N). \n\nThe running time increases, at most, linearly with the size of the items present in the list.\n","images":[],"codeSnippets":[]},{"__typename":"ReviewCard","id":"5c8bef0c3709022d26ee487a","title":"Linear Search expressed as a Function","body":"A linear search can be expressed as a function that compares each item of the passed dataset with the target value until a match is found. \n\nThe given pseudocode block demonstrates a function that performs a linear search. The relevant index is returned if the target is found and -1 with a message that a value is not found if it is not.\n\n```pseudo\nFor each element in the array\n if element equal target value then\n return its index\n if element is not found, return \n “Value Not Found” message\n```","images":[],"codeSnippets":[]},{"__typename":"ReviewCard","id":"5c8bf34caf246d0a66430869","title":"Return value of a linear search","body":"A function that performs a linear search can return a message of success and the index of the matched value if the search can successfully match the target with an element of the dataset. In the event of a failure, a message as well as `-1` is returned as well.\n\n```pseudo\nFor each element in the array\n if element equal target value then\n print success message\n return its index\n if element is not found \n print Value not found message\n return -1\n```","images":[],"codeSnippets":[]},{"__typename":"ReviewCard","id":"5c8bfcb93709022cbaee48f3","title":"Modification of linear search function","body":"A linear search can be modified so that all instances in which the target is found are returned. This change can be made by not 'breaking' when a match is found.\n\n```pseudo\nFor each element in the searchList\n if element equal target value then\n Add its index to a list of occurrences\nif the list of occurrences is empty\n raise ValueError\notherwise\n return the list occurrences\n```","images":[],"codeSnippets":[]},{"__typename":"ReviewCard","id":"5c8b3bfaa2bddf5d83a845cd","title":"Linear search","body":"_Linear search_ sequentially checks each element of a given list for the target value until a match is found. If no match is found, a linear search would perform the search on all of the items in the list.\n\nFor instance, if there are `n` number of items in a list, and the target value resides in the `n-5`th position, a linear search will check `n-5` items total.\n","images":[],"codeSnippets":[]},{"__typename":"ReviewCard","id":"5c8bf6d4a2bddf5ddca8461b","title":"Linear search as a part of complex searching problems","body":"Despite being a very simple search algorithm, linear search can be used as a subroutine for many complex searching problems. Hence, it is convenient to implement linear search as a function so that it can be reused.","images":[],"codeSnippets":[]},{"__typename":"ReviewCard","id":"5e20c422bff5f400176ad3dd","title":"Linear Search Best and Worst Cases","body":"The best-case performance for the Linear Search algorithm is when the search item appears at the beginning of the list and is O(1). The worst-case performance is when the search item appears at the end of the list or not at all. This would require N comparisons, hence, the worse case is O(N).","images":[],"codeSnippets":[]},{"__typename":"ReviewCard","id":"5e20acbf9f60b100119b58e5","title":"Linear Search Average Runtime","body":"The Linear Search Algorithm performance runtime varies according to the item being searched. On average, this algorithm has a Big-O runtime of O(N), even though the average number of comparisons for a search that runs only halfway through the list is N/2.","images":[],"codeSnippets":[]},{"__typename":"ReviewCard","id":"5e1f7fe985e4fd00115909dc","title":"Linear Search Runtime","body":"The Linear Search algorithm has a Big-O (worst case) runtime of O(N). This means that as the input size increases, the speed of the performance decreases linearly. This makes the algorithm not efficient to use for large data inputs.","images":[{"__typename":"Image","alt":"Linear Search Algorithm Big-O runtime, O(N)","url":"https://content.codecademy.com/practice/art-for-practice/new-pngs/linear-search-graph.png"}],"codeSnippets":[]}],"tracks":[{"__typename":"Track","released":false,"id":"4a4f129e80e7720973874c1ddc7c098c","slug":"apcs-algorithms","title":"Algorithms","lessonCount":8,"contentModuleIds":["7981ffef47b6f712f28d9bfbfa03cd16","602160c87820ec639bc2a21eb00a0b1d","1f1308eff69f6659bc0a93c3a3fa014e"],"grantsCertificate":true,"enrollmentStatus":"none","pro":false,"shortDescription":"What is an algorithm? How do we know if an algorithm is efficient? Let's dive into some of these Computer Science concepts.","difficulty":"Beginner","metrics":{"__typename":"TrackMetricsType","medianDurationHours":null}},{"__typename":"Track","released":true,"id":"ab8dec2a7871eddeca66f873f58ee750","slug":"java-algorithms","title":"Java: Algorithms","lessonCount":8,"contentModuleIds":["1d2d12c69c02e33a97f36ce40cf7053c","602160c87820ec639bc2a21eb00a0b1d","1f1308eff69f6659bc0a93c3a3fa014e"],"grantsCertificate":true,"enrollmentStatus":"none","pro":false,"shortDescription":"Learn the basics of recursion and how to implement and analyze important algorithms in Java.","difficulty":"Beginner","metrics":{"__typename":"TrackMetricsType","medianDurationHours":2.6}}],"paths":[{"__typename":"Path","released":true,"id":"5fc508b822eca90012fb25eb","slug":"ap-computer-science-a","goal":"skill","title":"Study for the AP Computer Science A Exam (Java)","lessonCount":23,"trackCount":8,"enrollmentStatus":"none","shortDescription":"Master the core concepts covered in AP Computer Science A Exam and gain a solid understanding of programming and fluency in Java.","difficulty":"Beginner","metrics":{"__typename":"PathMetricsType","medianDurationHours":19.34}}]},"reviewCards":[{"id":"5e17e5f0ffc5cb00142b26d3","title":"Merge Sort Merging","body":"Merge Sort is a divide and conquer algorithm. It consists of two parts:\n```\n1) splitting the original list into smaller sorted lists recursively until there is only 1 element in the list,\n2) merging back the presorted 1-element lists into 2-element lists, 4-element lists, and so on recursively.\n```\nThe merging portion is iterative and takes 2 sublists. The first element of the left sublist is compared to the first element of the right sublist. If it is smaller, it is added to a new sorted list, and removed from the left sublist. If it is bigger, the first element of the right sublist is added instead to the sorted list and then removed from the right sublist.\nThis is repeated until either the left or right sublist is empty. The remaining non-empty sublist is appended to the sorted list.\n","images":[{"alt":"Merging of sublists in Merge Sort algorithm","url":"https://content.codecademy.com/practice/art-for-practice/new-pngs/merge_ex_2.png"}],"codeSnippets":[]},{"id":"5e1cddaceb841d0011cd75a1","title":"Big-O Runtime for Merge Sort","body":"The Merge Sort algorithm is divided into two parts. The first part repeatedly splits the input list into smaller lists to eventually produce single-element lists. The best, worst and average runtime for this part is Θ(log N). The second part repeatedly merges and sorts the single-element lists to twice its size until the original input size is achieved. The best, worst and average runtime for this part is Θ(N). Therefore, the combined runtime is Θ(N log N).","images":[],"codeSnippets":[]},{"id":"5c8bebe6a2bddf5dc2a8458b","title":"Complexity of Binary Search","body":"A dataset of length n can be divided _log n_ times until everything is completely divided. Therefore, the search complexity of binary search is O(log n).","images":[],"codeSnippets":[]},{"id":"5c8e96a55f1de80f514f65d1","title":"Iterative Binary Search","body":"A binary search can be performed in an iterative approach. Unlike calling a function within the function in a recursion, this approach uses a loop.","images":[],"codeSnippets":[{"id":"5c94f4baa2bddf5d7fa85576","language":"javascript","text":"function binSearchIterative(target, array, left, right) {\n while(left \u003c right) {\n let mid = (right + left) / 2;\n if (target \u003c array[mid]) {\n right = mid;\n } else if (target \u003e array[mid]) {\n left = mid;\n } else {\n return mid;\n }\n }\n return -1;\n}"}]},{"id":"5c8e7029a2bddf5d7fa846f1","title":"Base case in a binary search using recursion","body":"In a recursive binary search, there are two cases for which that is no longer recursive. One case is when the middle is equal to the target. The other case is when the search value is absent in the list.\n\n```pseudo\nbinary_search(sorted_list, left_pointer, right_pointer, target)\n if (left_pointer \u003e= right_pointer)\n base case 1\n mid_val and mid_idx defined here\n if (mid_val == target)\n base case 2\n if (mid_val \u003e target)\n recursive call with left pointer\n if (mid_val \u003c target)\n recursive call with right pointer\n```","images":[],"codeSnippets":[]},{"id":"5c8e83a0a2bddf5d95a848f3","title":"Updating pointers in a recursive binary search","body":"In a recursive binary search, if the value has not been found then the recursion must continue on the list by updating the left and right pointers after comparing the target value to the middle value. \n\nIf the target is less than the middle value, you know the target has to be somewhere on the left, so, the right pointer must be updated with the middle index. The left pointer will remain the same. Otherwise, the left pointer must be updated with the middle index while the right pointer remains the same. The given code block is a part of a function `binarySearchRecursive()`.","images":[],"codeSnippets":[{"id":"5c94efcdaf246d0a74431a2e","language":"javascript","text":"function binarySearchRecursive(array, first, last, target) {\n let middle = (first + last) / 2;\n // Base case implementation will be in here.\n \n if (target \u003c array[middle]) {\n return binarySearchRecursive(array, first, middle, target); \n } else {\n return binarySearchRecursive(array, middle, last, target);\n }\n}"}]},{"id":"5c8be2a8af246d0ab94308be","title":"Binary Search Sorted Dataset","body":"Binary search performs the search for the target within a sorted array. Hence, to run a binary search on a dataset, it must be sorted prior to performing it.","images":[],"codeSnippets":[]},{"id":"5c8be5bd3709022d02ee4950","title":"Operation of a Binary Search","body":"The binary search starts the process by comparing the middle element of a sorted dataset with the target value for a match. If the middle element is equal to the target value, then the algorithm is complete. Otherwise, the half in which the target cannot logically exist is eliminated and the search continues on the remaining half in the same manner.\n\nThe decision of discarding one half is achievable since the dataset is sorted.","images":[],"codeSnippets":[]},{"id":"5e1e1622bd4e220011945be6","title":"Binary Search Performance","body":"The binary search algorithm takes time to complete, indicated by its `time complexity`. The worst-case time complexity is `O(log N)`. This means that as the number of values in a dataset increases, the performance time of the algorithm (the number of comparisons) increases as a function of the base-2 logarithm of the number of values. \n\nExample: Binary searching a list of 64 elements takes at MOST `log2(64)` = 6 comparisons to complete.","images":[{"alt":"An example graph used to illustrate the binary search algorithm's performance.\n\nThe x-axis is labeled 'Number of elements'. The y-axis is labeled 'Number of comparisons'. The axes and their labels are white. There is a blue line on the graph starting where the X and Y axis intersect and curving up and to the right. The line flattens out as the number of elements increases. The blue line is labeled 'Binary Search O(log N)'. ","url":"https://content.codecademy.com/courses/search-course/visualizations/binaryComplexity.png"}],"codeSnippets":[]},{"id":"5e1beb8e9f60b100119b4eaf","title":"Binary Search","body":"The binary search algorithm efficiently finds a goal element in a sorted dataset. The algorithm repeatedly compares the goal with the value in the middle of a subset of the dataset. The process begins with the whole dataset; if the goal is smaller than the middle element, the algorithm repeats the process on the smaller (left) half of the dataset. If the goal is larger than the middle element, the algorithm repeats the process on the larger (right) half of the dataset. This continues until the goal is reached or there are no more values.","images":[{"alt":"A gif animation of a binary search, searching for the number 41.\n\nThere is a list of numbers in square boxes, from left to right the numbers are 1, 2, 7, 8, 22, 28, 41, 58, 67, 71, and 94. Under each of the square boxes there is a label number corresponding to the index of the boxes of numbers, in order from left to right those labels are 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, and 10.\n\nIn the first animation of the binary search we start at index 5 which has a value of 28. In the second animation of the binary search we search the last five indices 6 through 10. In the third animation we start with the number at index 8 which is 67 and we keep the 6th and 7th indices, 41 and 58 respectively. In the last animation of the gif we find the number 41 at index 6.","url":"https://content.codecademy.com/courses/search-course/visualizations/binarySearch.gif"}],"codeSnippets":[]},{"id":"5fc127d061cfc900126e0dc8","title":"Insertion Sort Algorithm","body":"Insertion sort algorithm works by repeatedly taking the next unsorted item in an unsorted list and inserting that item into the correct location in a sorted list.","images":[],"codeSnippets":[{"id":"5fc64838caf7dc0012e3bb78","language":"java","text":"class InsertionSort {\n public static void sort(int[] array) {\n for (int i = 1; i \u003c array.length; i++) {\n int current = array[i];\n int j = i -1;\n while (j \u003e= 0 \u0026\u0026 array[j] \u003e current) {\n array[j + 1] = array[j];\n j--;\n }\n array[j+1] = current;\n\n }\n }\n public static void main(String[] args) {\n }\n}"}]},{"id":"5fc134c510320c00128be851","title":"Insertion Sort Nested Loops","body":"Insertion sort uses nested loops. The inner loop iterates through the list of items that are already sorted looking for the correct place to insert the most recent unsorted item. This loop happens `n` times - once for each item that needs to be inserted.","images":[],"codeSnippets":[{"id":"5fc1376113026f0012695b18","language":"java","text":"class InsertionSort {\n public static void sort(int[] array) {\n // outer loop iterates through input array starting with second element\n for (int i = 1; i \u003c array.length; i++) {\n // store value of current element\n \n // inner loop\n while (j \u003e= 0 \u0026\u0026 array[j] \u003e current) {\n // compare current element to predecessor(s)\n }\n // move the greater element(s) one position to make space for swapped element\n }\n }\n}"}]},{"id":"5fc157b3e42b8a0017364ce1","title":"Insertion Sort Best Case Runtime","body":"In the case of an ascending array, the best case scenario, the runtime of insertion sort is O(n). As each element gets picked for insertion into the sorted list, it will only take one comparison to find the correct place to insert the new item. `1` comparison will happen `n` times, for a total runtime of O(n).","images":[],"codeSnippets":[{"id":"5fc64ac0b6945d001206b8c9","language":"java","text":"int[] ascendingNumbers = {2, 4, 6, 8};\ninsertionSort(ascendingNumbers);\n// sort second element - 4 is greater than 2 - no shift or further comparisons\n// sort third element - 6 is greater than 4 - no shift or further comparisons\n// sort fourth element - 8 is greater than 6 - no shift or further comparisons\n"}]},{"id":"5fc13c89e81674001272b457","title":"Java Insertion Sort Runtime","body":"Nested loops are generally an indicator of quadratic complexity. This means that as the number of elements `n` increases, the running time increases quadratically. This means that if `n` doubles, we know that sorting time will quadruple, resulting in a runtime of O(n^2) due to the nested loop structure.","images":[],"codeSnippets":[{"id":"5fc6497e51456b0012861e41","language":"java","text":"class InsertionSort {\n public static void sort(int[] array) {\n for (int i = 1; i \u003c array.length; i++) {\n // nested loop structure indicates O(n^2)\n while (j \u003e= 0 \u0026\u0026 array[j] \u003e current) {\n // compare current element to predecessor\n }\n // code to swap\n }\n }\n}"}]},{"id":"5fc164bae42b8a0017364cf2","title":"Insertion Sort Worst Case","body":"In the case of a descending array, our worst case scenario, insertion sort will have to make approximately n^2 comparisons. This happens when the list to sort is in perfect reverse order. All `n` items that need to be inserted into the sorted section of the list will be compared to every item in the already sorted section of the list.","images":[],"codeSnippets":[{"id":"5fc64a7dcaf7dc0012e3bb92","language":"java","text":"int[] descendingNumbers = {8, 6, 4, 2};\ninsertionSort(descendingNumbers);\n// result of first sort - {6, 8, 4, 2}\n// result of second sort - {4, 6, 8, 2}\n// comparisons to sort last element - 2 is less than 8, 2 is less than 6, 2 is less than 4, insert 2"}]},{"id":"5fbebb4bbfffcd001268431d","title":"Selection Sort Algorithm","body":"Selection sort works by repeatedly finding the minimum element of an unsorted array, and moving that element to the end of the \"sorted\" part of the array. It \"selects\" the smallest element and places it in the correct spot.","images":[],"codeSnippets":[{"id":"5fbebbd7e42b8a001215319f","language":"java","text":"class Main {\n public static void selectionSort (int arr[]) {\n \n int size = arr.length;\n\n for (int i = 0; i \u003c size - 1; i++) {\n\n int currentMinimumIndex = i;\n for (int j = i + 1; j \u003c arr.length; j++) {\n if (arr[j] \u003c arr[currentMinimumIndex]) {\n currentMinimumIndex = j;\n }\n }\n\n int temp = arr[currentMinimumIndex];\n arr[currentMinimumIndex] = arr[i];\n arr[i] = temp;\n }\n}\n\n public static void main(String args[]) {\n }\n}"}]},{"id":"5fbebc91e304650012472772","title":"Selection Sort Nested Loops","body":"Selection sort makes use of nested for loops. The inner for loop finds the smallest number from the section of the unsorted array and moves it to the end of the sorted section of the array. The outer for loop makes this process happen `n` times - once for each element that needs to be put into the sorted section of the array","images":[],"codeSnippets":[{"id":"5fbebd5dbc76c90012ee455e","language":"java","text":"public static void selectionSort (int arr[]) {\n \n //for loop to loop through all unsorted elements\n for (int i = 0; i \u003c size - 1; i++) {\n // for loop to find the smallest value of unsorted elements \n for (int j = i + 1; j \u003c arr.length; j++) {\n // Code that keeps track of the smallest value\n }\n // Code that swaps the smallest value to the correct place \n }\n\n }"}]},{"id":"5fbec142e81674001265cbd2","title":"Selection Sort Runtime","body":"Nested loops are generally an indicator of quadratic complexity. This means that as the number of elements `n` increases, the running time increases quadratically. This means that if `n` doubles, we know that sorting time will quadruple, resulting in a runtime of O(n^2) due to the nested loop structure.","images":[],"codeSnippets":[{"id":"5fc16478a01c350012981868","language":"java","text":" public static void selectionSort (int arr[]) {\n \n // nested for loop indicates runtime of O(n^2)\n for (int i = 0; i \u003c size - 1; i++) {\n for (int j = i + 1; j \u003c arr.length; j++) {\n }\n }\n }"}]},{"id":"5fbedea7bfffcd0012684656","title":"Selection Sort Number of Comparison Statements","body":"The number of comparison statements made by selection sort is less than n^2. This is because the inner for loop that searches for the smallest remaining value in the unsorted section of the list does not have to search through all `n` items. It only needs to search through the remaining unsorted values.\n\nNevertheless, the runtime remains O(n^2).","images":[],"codeSnippets":[{"id":"5fc68bf435525c00124abf37","language":"java","text":"class Main {\n public static void selectionSort (int arr[]) {\n \n // outer for loop makes n - 1 comparisons\n for (int i = 0; i \u003c size - 1; i++) {\n\n // inner for loop only searches remaining unsorted values\n for (int j = i + 1; j \u003c arr.length; j++) {\n // code that keeps track of the smallest value\n }\n // code that swaps elements\n }\n}\n\n public static void main(String args[]) {\n }\n}"}]},{"id":"5fc1221710320c001249e5d2","title":"Selection Sort Best and Worst Case Comparisons","body":"In both best case and worst case scenarios, selection sort makes approximately n^2 comparisons. Even if the list is already sorted, the inner for loop will have to make n comparisons to find the smallest remaining unsorted item.","images":[],"codeSnippets":[{"id":"5fc1243a91609a00137fdbc8","language":"java","text":"// worst case scenario\nint[] inputArray1 = { 19, 15, 12, 7 };\nselectionSort(inputArray1);\n// determine 1st index \n // compare 19 to 15, then 15 to 12, then 12 to 7\n // 7 is the lowest value, swap with 19\n // 3 comparisons were made \n\n// best case scenario \nint[] inputArray2 = { 7, 12, 15, 19 };\nselectionSort(inputArray2);\n// determine 1st index\n // compare 7 to 12, then 7 to 15, then 7 to 19\n // 7 is the lowest, no swap\n // 3 comparisons were made\n"}]},{"id":"5fc1258b3d410f00170de909","title":"Selection Sort Swap","body":"Sorting occurs as selection sort swaps the element in the first position of the unsorted sub-list with the element with the lowest value in the remainder of the unsorted sub-list. ","images":[],"codeSnippets":[{"id":"5fc126313d410f00170de912","language":"java","text":"public static void selectionSort (int arr[]) {\n\n // for loop to loop through all unsorted elements\n for (int i = 0; i \u003c size - 1; i++) {\n // for loop to find the smallest value of unsorted elements \n for (int j = i + 1; j \u003c arr.length; j++) {\n // Code that keeps track of the smallest value\n }\n // Code that swaps the smallest value to the correct place \n int temp = arr[currentMinimumIndex];\n arr[currentMinimumIndex] = arr[i];\n arr[i] = temp;\n }\n}"}]},{"id":"5fbd8c8ce81674001265ba61","title":"Java Linear Search Algorithm","body":"Linear search will start with the first element and check if it is a match for our target element, and will continue the search till it finds a match. The steps are: \nStep 1: Examine the current element in the list. \nStep 2: If the current element is equal to the target value, stop. \nStep 3: If the current element is not equal to the target value, check the next element in the list. \nContinue steps 1 - 3 until the element is found or the end of the list is reached. \n\n```pseudo\nfor each element in the search_list\n if element equal target value then\n print location and return index\nif element is not found then \n print message not found and return -1\n```","images":[],"codeSnippets":[]},{"id":"5fbe7fb810320c0012a874f7","title":"Return Value of a Linear Search","body":"A method that performs a linear search can return a message of success and the index of the matched value if the search can successfully match the target with an element of the dataset. In the event of a failure, a message indicating the value was not found along with returning a `-1`.\n","images":[],"codeSnippets":[{"id":"5fbe8541bc76c90012ee418a","language":"java","text":"class LinearSearch\n{\n public static int linearSearch(int[] arr, int target)\n {\n // loop through the input array\n // check if array at current index is equal to `target`\n // if true\n System.out.println(\"Element is present at index \" + i);\n return i;\n // if we finish looping through our array and the element is not found \n System.out.println(\"Element is not present in the array\");\n return -1;\n }\n public static void main(String args[])\n {\n int arr[] = { 2, 3, 4, 10, 40 };\n int target = 10;\n linearSearch(arr, target);\n }\n}"}]},{"id":"5fbe9767e42b8a0012152f85","title":"Linear Search Best and Worst Cases","body":"The best-case performance for the Linear Search algorithm is when the search item appears at the beginning of the list and is O(1). The worst-case performance is when the search item appears at the end of the list or not at all. This would require N comparisons, hence, the worse case is O(N).\n\n![alt text](https://content.codecademy.com/courses/search-course/visualizations/best%20case.png)\n\n![](https://content.codecademy.com/courses/search-course/visualizations/worst%20case.png)\n\n![](https://content.codecademy.com/courses/search-course/visualizations/worst%20case%202.png)","images":[],"codeSnippets":[]},{"id":"5fc7e032d064990017ba816b","title":"2D Array Linear Search","body":"In Java, a linear search on a 2D array is usually accomplished with nested for loops.\n\n```pseudo\nfor each row in the search_list\n for each column of that row\n if element at that row and column equals the target value then\n print the index of the row and column and return 1\n print message that element is not found and return -1\n```","images":[],"codeSnippets":[]},{"id":"5fc1734ee304650012a088d8","title":"Iterative Binary Search Middle Index","body":"The iterative binary search method take a `sorted array`, and `target`, as arguments. When the method runs the first time the `left`, the first index of the input array is `0`, while the `right`, the last index of the input array, is equal to its length - 1. The `mid` is the middle index of the input array. Now, the algorithm runs a while loop comparing the `target` with the array value of the `mid` index of the input array.","images":[],"codeSnippets":[{"id":"5fc1874483b83a001403eefc","language":"java","text":"class BinarySearch\n{\n public static int binarySearch(int[] arr, int target)\n {\n int left = 0; \n int right = array.length - 1;\n \n while (left \u003c= right)\n {\n \n int mid = (left + right) / 2;\n \n if (target == array[mid]) {\n return mid;\n }\n // code to run if `target` is greater or lesser than `array[mid]`\n }\n \n return -1;\n }\n}"}]},{"id":"5fc18a9a7611f6001217bc64","title":"Iterative Binary Search Algorithm","body":"The iterative `binarySearch()` algorithm is implemented with the following steps: \n* Accepts a sorted array and target value as parameters \n* Sets a `left` integer to `0` and `right` integer to `arr.length` \n* Executes a `while` loop as long as `right` is greater than `left` \n* Inside the `while` loop, finds the value in the array at the middle index, equal to the average of `left` and `right` \n* If the current mid-value equals the target value, return the middle index \n* If the target value is greater than the value being checked, set `left` equal to the middle index + 1 \n* If the target value is less than the value being checked, set `right` equal to the middle index \n* Outside of the `while` loop, return `-1`","images":[],"codeSnippets":[{"id":"5fc18b2cbc76c90012927f19","language":"java","text":"public class BinarySearch {\n public static int search(int[] arr, int target) {\n int left = 0;\n int right = arr.length;\n while (left \u003c right) {\n int mid = Math.floorDiv(left + right, 2);\n int midValue = arr[mid];\n if (midValue == target) {\n return mid;\n } else if (midValue \u003c target) {\n left = mid + 1;\n } else {\n right = mid;\n }\n }\n\n return -1;\n }\n}"}]},{"id":"5c8bfec5a2bddf5dcba84645","title":"Searching for smallest or largest value using linear search","body":"Linear search can be used to search for the smallest or largest value in an unsorted list rather than searching for a match. It can do so by keeping track of the largest (or smallest) value and updating as necessary as the algorithm iterates through the dataset.\n\n```pseudo\nCreate a variable called max_value_index \nSet max_value_index to the index of the first element of the search list\n For each element in the search list\n if element is greater than the element at max_value_index\n Set max_value_index equal to the index of the element\nreturn max_value_index\n```","images":[],"codeSnippets":[]},{"id":"5c8b6ef63709022d26ee4800","title":"Linear Search best case","body":"For a list that contains `n` items, the best case for a linear search is when the target value is equal to the first element of the list. In such cases, only one comparison is needed. Therefore, the best case performance is O(1).","images":[],"codeSnippets":[]},{"id":"5c8b3f10a2bddf5dbaa8461f","title":"Linear Search Complexity","body":"Linear search runs in linear time and makes a maximum of `n` comparisons, where `n` is the length of the list. Hence, the computational complexity for linear search is O(N). \n\nThe running time increases, at most, linearly with the size of the items present in the list.\n","images":[],"codeSnippets":[]},{"id":"5c8bef0c3709022d26ee487a","title":"Linear Search expressed as a Function","body":"A linear search can be expressed as a function that compares each item of the passed dataset with the target value until a match is found. \n\nThe given pseudocode block demonstrates a function that performs a linear search. The relevant index is returned if the target is found and -1 with a message that a value is not found if it is not.\n\n```pseudo\nFor each element in the array\n if element equal target value then\n return its index\n if element is not found, return \n “Value Not Found” message\n```","images":[],"codeSnippets":[]},{"id":"5c8bf34caf246d0a66430869","title":"Return value of a linear search","body":"A function that performs a linear search can return a message of success and the index of the matched value if the search can successfully match the target with an element of the dataset. In the event of a failure, a message as well as `-1` is returned as well.\n\n```pseudo\nFor each element in the array\n if element equal target value then\n print success message\n return its index\n if element is not found \n print Value not found message\n return -1\n```","images":[],"codeSnippets":[]},{"id":"5c8bfcb93709022cbaee48f3","title":"Modification of linear search function","body":"A linear search can be modified so that all instances in which the target is found are returned. This change can be made by not 'breaking' when a match is found.\n\n```pseudo\nFor each element in the searchList\n if element equal target value then\n Add its index to a list of occurrences\nif the list of occurrences is empty\n raise ValueError\notherwise\n return the list occurrences\n```","images":[],"codeSnippets":[]},{"id":"5c8b3bfaa2bddf5d83a845cd","title":"Linear search","body":"_Linear search_ sequentially checks each element of a given list for the target value until a match is found. If no match is found, a linear search would perform the search on all of the items in the list.\n\nFor instance, if there are `n` number of items in a list, and the target value resides in the `n-5`th position, a linear search will check `n-5` items total.\n","images":[],"codeSnippets":[]},{"id":"5c8bf6d4a2bddf5ddca8461b","title":"Linear search as a part of complex searching problems","body":"Despite being a very simple search algorithm, linear search can be used as a subroutine for many complex searching problems. Hence, it is convenient to implement linear search as a function so that it can be reused.","images":[],"codeSnippets":[]},{"id":"5e20c422bff5f400176ad3dd","title":"Linear Search Best and Worst Cases","body":"The best-case performance for the Linear Search algorithm is when the search item appears at the beginning of the list and is O(1). The worst-case performance is when the search item appears at the end of the list or not at all. This would require N comparisons, hence, the worse case is O(N).","images":[],"codeSnippets":[]},{"id":"5e20acbf9f60b100119b58e5","title":"Linear Search Average Runtime","body":"The Linear Search Algorithm performance runtime varies according to the item being searched. On average, this algorithm has a Big-O runtime of O(N), even though the average number of comparisons for a search that runs only halfway through the list is N/2.","images":[],"codeSnippets":[]},{"id":"5e1f7fe985e4fd00115909dc","title":"Linear Search Runtime","body":"The Linear Search algorithm has a Big-O (worst case) runtime of O(N). This means that as the input size increases, the speed of the performance decreases linearly. This makes the algorithm not efficient to use for large data inputs.","images":[{"alt":"Linear Search Algorithm Big-O runtime, O(N)","url":"https://content.codecademy.com/practice/art-for-practice/new-pngs/linear-search-graph.png"}],"codeSnippets":[]}],"relatedContent":[{"id":"ab8dec2a7871eddeca66f873f58ee750","slug":"java-algorithms","urlPath":"/learn/java-algorithms","title":"Java: Algorithms","lessonCount":8,"contentModuleIds":["1d2d12c69c02e33a97f36ce40cf7053c","602160c87820ec639bc2a21eb00a0b1d","1f1308eff69f6659bc0a93c3a3fa014e"],"grantsCertificate":true,"enrollmentStatus":"none","shortDescription":"Learn the basics of recursion and how to implement and analyze important algorithms in Java.","difficulty":"Beginner","pro":false,"timeToComplete":3,"type":"course"},{"id":"5fc508b822eca90012fb25eb","slug":"ap-computer-science-a","urlPath":"/learn/paths/ap-computer-science-a","imageUrl":"https://static-assets.codecademy.com/components/curriculum/path/ap-computer-science-a/curriculum-card.svg","goal":"skill","title":"Study for the AP Computer Science A Exam (Java)","lessonCount":23,"courseCount":8,"enrollmentStatus":"none","shortDescription":"Master the core concepts covered in AP Computer Science A Exam and gain a solid understanding of programming and fluency in Java.","difficulty":"Beginner","timeToComplete":19,"hasCareerJourney":false,"type":"path"}],"pathSlug":"ap-computer-science-a","__NEXTJS_CONTEXT__":{"cookie":null,"isPreview":false}},"__N_SSG":true},"page":"/learn/paths/[pathSlug]/tracks/[courseSlug]/modules/[moduleSlug]/cheatsheet","query":{"pathSlug":"ap-computer-science-a","courseSlug":"apcs-algorithms","moduleSlug":"apcs-searching-and-sorting"},"buildId":"portal-app-10b4a003571504fb0cc6f52c5fa4b3ba2701e379","assetPrefix":"/_portal","isFallback":false,"isExperimentalCompile":false,"gsp":true,"scriptLoader":[]}</script>

<style>:root { --onetrust-brand-purple: #3A10E5; --onetrust-color-gray-500: #828285; --onetrust-color-white: #fff; } #onetrust-banner-sdk { padding: 1rem !important; } #onetrust-banner-sdk > .ot-sdk-container { width: 100% !important; } #onetrust-banner-sdk > .ot-sdk-container > .ot-sdk-row { display: flex !important; flex-direction: column !important; align-items: center !important; max-width: 1436px !important; margin: 0 auto !important; } #onetrust-banner-sdk > .ot-sdk-container > .ot-sdk-row:after { content: none !important; } #onetrust-banner-sdk > div > .ot-sdk-container > .ot-sdk-row { display: flex !important; flex-direction: column !important; align-items: center !important; max-width: 1436px !important; margin: 0 auto !important; } #onetrust-banner-sdk > div > .ot-sdk-container > .ot-sdk-row:after { content: none !important; } #onetrust-group-container { display: flex !important; justify-content: center; float: none !important; width: 100% !important; max-width: 1148px !important; margin-left: 0 !important; margin-bottom: 0.625rem !important; } #onetrust-policy, #onetrust-policy-text { margin: 0 !important; font-size: 0.875rem !important; line-height: 1.375rem !important; text-align: center !important; float: none !important; } #onetrust-policy-text a { text-decoration: none; line-height: 26px !important; margin-left: 0 !important; } #onetrust-button-group-parent { position: relative !important; top: initial !important; left: initial !important; transform: initial !important; width: 264px !important; margin: 0 !important; padding: 0 !important; float: none !important; } #onetrust-button-group { display: flex !important; margin: 0 !important; } #onetrust-pc-btn-handler, #onetrust-accept-btn-handler { min-width: initial !important; padding: 0.375rem 1rem !important; margin: 0 !important; opacity: 1 !important; border-radius: 2px !important; line-height: 1.5 !important; user-select: none !important; font-size: 1rem !important; } #onetrust-pc-btn-handler:focus, #onetrust-accept-btn-handler:focus { box-shadow: 0 0 0 2px var(--onetrust-color-white), 0 0 0 4px var(--onetrust-brand-purple); text-decoration: none !important; outline: none !important; } #onetrust-pc-btn-handler{ color: var(--onetrust-brand-purple) !important; border: 1px solid var(--onetrust-brand-purple)!important; background: var(--onetrust-color-white) !important } #onetrust-accept-btn-handler { color: var(--onetrust-color-white) !important; background: var(--onetrust-brand-purple)!important; margin-left: 1rem !important; } #onetrust-close-btn-container { display: none !important; } .pc-logo { display: none !important; } #accept-recommended-btn-handler, .ot-pc-refuse-all-handler, .save-preference-btn-handler { margin-left: 4px !important; font-size: 14px !important; } #accept-recommended-btn-handler:focus, #onetrust-pc-sdk .ot-pc-refuse-all-handler:focus, #onetrust-pc-sdk .save-preference-btn-handler:focus { box-shadow: 0 0 0 2px var(--onetrust-color-white), 0 0 0 4px var(--onetrust-brand-purple); text-decoration: none !important; outline: none !important; opacity: 1 !important; } .ot-switch-label { border: 1px solid var(--onetrust-color-gray-500) !important; background-color: var(--onetrust-color-gray-500) !important; } .ot-switch-nob { background: var(--onetrust-color-white) !important; } .ot-switch-inner:before { background-color: var(--onetrust-brand-purple) !important; } .switch-checkbox:checked+.ot-switch-label .ot-switch-nob { border-color: var(--onetrust-brand-purple) !important; } .ot-pc-footer-logo { display: none !important; } #onetrust-banner-sdk>.ot-sdk-container { overflow: visible !important; } #onetrust-pc-sdk .category-item .ot-switch.ot-toggle input:focus + .ot-switch-label { outline-color: var(--onetrust-brand-purple) !important; } #onetrust-pc-sdk .category-item .ot-switch.ot-toggle input:focus+.ot-switch-label { outline-width: 3px !important; outline-offset: 2px !important; } @media (max-width: 30rem) { #accept-recommended-btn-handler, .ot-pc-refuse-all-handler, .save-preference-btn-handler { width: 96% !important; } } @media (min-width: 37.5rem) { #onetrust-banner-sdk { padding: 0.875rem 1rem !important; } } @media (min-width: 48rem) { #onetrust-banner-sdk { padding: 0.875rem 1.25rem !important; } } @media (min-width: 1650px) { #onetrust-banner-sdk > .ot-sdk-container > .ot-sdk-row { flex-direction: row !important; justify-content: space-between !important; } #onetrust-banner-sdk > div > .ot-sdk-container > .ot-sdk-row { flex-direction: row !important; justify-content: space-between !important; } #onetrust-group-container { margin-bottom: 0 !important; } #onetrust-button-group { flex-direction: row !important; } }</style>

![Company Logo](https://cdn.cookielaw.org/logos/static/ot_company_logo.png)

## Privacy Preference Center

When you visit any website, it may store or retrieve information on your browser, mostly in the form of cookies. This information might be about you, your preferences or your device and is mostly used to make the site work as you expect it to. The information does not usually directly identify you, but it can give you a more personalized web experience. Because we respect your right to privacy, you can choose not to allow some types of cookies. Click on the different category headings to find out more and change our default settings. However, blocking some types of cookies may impact your experience of the site and the services we are able to offer.  
[More information](https://cookiepedia.co.uk/giving-consent-to-cookies)

Allow All

### Manage Consent Preferences

#### Strictly Necessary Cookies

Always Active

Strictly Necessary Cookies

These cookies are necessary for the website to function and cannot be switched off in our systems. They are usually only set in response to actions made by you which amount to a request for services, such as setting your privacy preferences, logging in or filling in forms. You can set your browser to block or alert you about these cookies, but some parts of the site will not then work. These cookies do not store any personally identifiable information.

#### Functional Cookies

Functional Cookies

These cookies enable the website to provide enhanced functionality and personalisation. They may be set by us or by third party providers whose services we have added to our pages. If you do not allow these cookies then some or all of these services may not function properly.

#### Targeting Cookies

Targeting Cookies

These cookies may be set through our site by our advertising partners. They may be used by those companies to build a profile of your interests and show you relevant adverts on other sites. They do not store directly personal information, but are based on uniquely identifying your browser and internet device. If you do not allow these cookies, you will experience less targeted advertising.

#### Performance Cookies

Performance Cookies

These cookies allow us to count visits and traffic sources so we can measure and improve the performance of our site. They help us to know which pages are the most and least popular and see how visitors move around the site. All information these cookies collect is aggregated and therefore anonymous. If you do not allow these cookies we will not know when you have visited our site, and will not be able to monitor its performance.

Reject All Confirm My Choices

[![Powered by Onetrust](https://cdn.cookielaw.org/logos/static/powered_by_logo.svg "Powered by OneTrust Opens in a new Tab")](https://www.onetrust.com/products/cookie-consent/)

Back Button

Back

### Performance Cookies

Vendor Search Search Icon Filter Icon

Clear Filters

Information storage and access

Apply

Consent Leg.Interest

All Consent Allowed

Select All Vendors

Select All Vendors

All Consent Allowed

Reject All Confirm My Choices

[![Powered by Onetrust](https://cdn.cookielaw.org/logos/static/powered_by_logo.svg "Powered by OneTrust Opens in a new Tab")](https://www.onetrust.com/products/cookie-consent/)

<iframe class="ot-text-resize" sandbox="allow-same-origin" title="onetrust-text-resize" style="position: absolute; top: -50000px; width: 100em;" aria-hidden="true"></iframe>

## Embedded Content
