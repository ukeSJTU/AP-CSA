# Code Challenges: Code Challenge Cheatsheet | Codecademy

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
2.  Code Challenges

# Code Challenge

Print Cheatsheet

Share

## Topics

-   Code Challenge

### Loops determine a minimum or maximum value.

Loops can be used to determine a minimum or maximum value. We just need to have a temporary variable to track the max number so far. On each iteration, we can compare the current element to the max number, and if the current element is larger, then we should replace the max number with it.

int\[\] listOfNumbers \= {1, 1, 5, 3};

int maxNumber \= listOfNumbers\[0\];

for (int i \= 0; i < listOfNumbers.length; i++) {

if (listOfNumbers\[i\] \> maxDigit) {

    maxDigit \= listOfNumbers\[i\];

}

}

to clipboard

### Loops determine the frequency with which a specific criterion is met

Loops can be used to determine the frequency with which a specific criterion is met. We will need a counter to track the number of elements that satisfy a particular condition. Then we can wrap a condition with a for loop to make sure it is applied to all elements in the array. If the condition holds true, we can add one to the counter.

int\[\] numList \= {1, 2, 3, 1};

int numOfNumsGreaterThanOne \= 0;

for (int i \= 0; i < numList.length; i++) {

if (numList\[i\] \> 1) {

    numOfNumsGreaterThanOne++;

}

}

to clipboard

### Loops can determine if at least one element has a particular property

Loops can determine if at least one element has a particular property

int\[\] numList \= {1, 2, 3, 5};

boolean hasEvenNum \= false;

for (int i \= 0; i < numList.length; i++) {

if (numList\[i\] % 2 \== 0) {

    hasEvenNum \= true;

}

}

to clipboard

### Loops can determine if all elements have a particular property

Loops can determine if all elements have a particular property. One way is to set up a condition to evaluate if one element of the list has the property. Then we need a boolean that is true as long as the condition holds true, and wrap a loop around the condition to check every element in the list.

int\[\] numList \= {2, 4, 6, 8, 4};

int allEven \= false;

for (int i \= 0; i < numList.length; i++) {

if (numList\[i\] % 2 \== 1) {

    allEven \= false;

}

}

to clipboard

### Loops can determine the presence or absence of duplicate elements

Loops can determine the presence or absence of duplicate elements. One way is to set up a loop inside another loop. In each iteration of the outer loop, we check if any of the elements in the inner loop are equal.

int\[\] numList \= {1, 2, 3, 4, 4};

boolean hasDupe \= false;

for (int i \= 0; i < numList.length; i++) {

for (int j \= i; j < numList.length; j++) {

    if (i != j && numList\[i\] \== numList\[j\]) {

      hasDupe \= true;

    }

}

}

to clipboard

### Loops can be used to reverse the order of the elements

Loops can be used to reverse the order of the elements. One way is to set up a loop that goes through half of the elements of the array with two counters, one iterating forwards through the front of the array and the other iterating backwards from the end. Then we can just swap the elements at each counter (the first element with the last, the second with the second to last, and so on).

int back \= list.length \- 1;

for (int front \= 0; i < list.length/2; front++) {

int temp \= list\[front\];

list\[front\] \= list\[back\];

list\[back\] \= temp;

back\--;

}

to clipboard

### Loops can be used to shift or rotate elements left or right.

Loops can be used to shift or rotate elements left or right. To rotate the elements, we set the last element in the array to an element that track the previous element in list. At the start, the previous element should be the last element in the list. Then we iterate through each element in the list and swap out the previous element with the current element.

int previous \= list\[list.length \- 1\];

for (int i \= 0; i < list.length; i++) {

int temp \= list\[i\];

list\[i\] \= previous;

previous \= temp;

}

to clipboard

### Loops identify divisble integers

Loops can be used to identify if an integer is or is not evenly divisible by another integer. By the end of the loop, if the dividend is 0, then we know that there are no leftovers and it is evenly divisible by the divisor.

int divisor \= someNumber;

int dividend \= anotherNumber;

while (dividend \>= divisor) {

dividend \-= divisor;

}

if (dividend \== 0) {

// then the dividend is divisible by the divisor

}

to clipboard

### Loops compute sums

Loops can be used to compute a sum. Before we iterate through each element, then we just need to have a number to keep track of the current sum. Then on each iteration through the array, we can add that element to the sum. When the loop is finished, then we have the final sum.

// We can use a loop to add 1 to the sum 10 times

int sum \= 0;

int addToSum \= 1;

for (int i \= 0; i < 10; i++) {

sum += addToSum;

}

to clipboard

### Loops identify digits in a number

Loops can be used to identify digits in a number. We can go through each digit in a number by taking mod 10 of the number. This will give us the remainder, which is effectively the ones digit of the number. Removing the ones digit from a number can be done by dividing the number by 10. We can repeat these steps using a loop until there are no more digits left in the number.

int number \= 123;

while (number \> 0) {

int digit \= number % 10;

number /= 10; // take the ones digit off the number

}

to clipboard

### Loops can be used to access the elements in a list

Loops can be used to access all elements in a list. This is helpful when applying the same operation on every element in the list.

// Print out "Hello" 10 times

ArrayList<String\> list \= new ArrayList<String\>();

for (int i \= 0; i < 10; i++) {

list.add("Hello");

}

for (String s : list) {

System.out.println(s);

}

to clipboard

### ArrayLists can be used to apply the same standards to lists as regular arrays

ArrayLists can loop through arrays and update the elements similar to arrays.

ArrayList<Integer\> arrayList \= new ArrayList<Integer\>();

int\[\] intArray \= new int\[10\];

for (int i \= 0 ; i < 10; i++) {

arrayList.add(i);

intArray\[i\] \= i;

}

to clipboard

### Arrays can be used to add elements in ArrayLists

Loops can be used to add and remove elements in ArrayLists.

// add 10 strings in the list

ArrayList<String\> list \= new ArrayList<String\>();

for (int i \= 0; i < 10; i++) {

list.add("new string");

}

to clipboard

### Some algorithms require multiple String, array, or ArrayList objects to be traversed simultaneously.

If two lists need to be traversed simultaneously, we can use the same counter to iterate through both of them, or two counters for each list. If one counter is used, we just need to account for the length of the arrays to make sure that there aren’t out of bounds errors.

int firstListLength \= firstList.size();

int secondListLength \= secondList.size();

int numElementsToTraverse \= 0;

if (firstListLength < secondListLength) {

numElementsToTraverse \= firstListLength;

} else {

numElementsToTraverse \= secondListLength;

}

for (int i \= 0; i < numElementsToTraverse; i++) {

System.out.println(firstList.get(i));

System.out.println(secondList.get(i));

}

to clipboard

### Iterating 2D Arrays

In order to access each element of a 2D array, use iteration to traverse through each row of the 2D array. Then, within each row, use a nested loop to traverse through each element of the inner array.

// Prints the total value of each element in 2D array

int\[\]\[\] arr2D \= {{17, 13, 19, 22}, {12, 18, 25, 20}, {15, 18, 21, 24}, {19, 23, 23, 22}, {18, 20, 21, 26}};

int total \= 0;

for (int row \= 0; row < arr2D.length; row++) {

    for (int col \= 0; col < arr2D\[0\].length; col++) {

        total += arr2D\[row\]\[col\];

    }

}

System.out.println(total); // Prints: 396

to clipboard

### String Traversal for Checking Substrings

Standard algorithms involving `String` traversal can be used to perform tasks such as finding if one (or more) substrings contain a certain property or determining the number of substrings that meet specific criteria.

public static int findNumValues(String text, String findText) {

int count \= 0;

// iterate through String

for (int i \= 0; i <= text.length()\-findText.length(); i++){

    // check if substring matches a criteria

    if (text.substring(i,i+findText.length()).equals(findText))     {

      // increase count

      count += 1

    }

}

return count;

}

public static void main(String\[\] args) {

String text \= "hello hi howdy hi goodbye";

System.out.println(findNumValues(text, "hi"));

// Prints: 2

}

to clipboard

### String Traversal: Reversing a String

`String` traversal can be used to iterate through a `String` and create a new `String` with the characters reversed.

public static String reverseString(String text) {

String reversed \= new String("");

for (int i\=0; i < text.length(); i++){

    char nextCharacter \= text.charAt(i);

    reversed \= nextCharacter + reversed;

}

return reversed;

}

public static void main(String\[\] args) {

String text \= new String("greetings earthling");

System.out.println(reverseString(text));

// Prints: gnilhtrae sgniteerg

}

to clipboard

Print Cheatsheet

Share

## Learn more on Codecademy

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

<script id="__NEXT_DATA__" type="application/json">{"props":{"pageProps":{"course":{"__typename":"Track","id":"5fb2a60221d8d6823338f78037598ae9","slug":"apcs-code-challenges","title":"Code Challenges","contentModules":[{"__typename":"ContentModule","id":"b8c84ddfc8b8556dd95448a44db36865","slug":"apcs-code-challenges","title":"Code Challenge"}]},"module":{"__typename":"ContentModule","id":"b8c84ddfc8b8556dd95448a44db36865","slug":"apcs-code-challenges","title":"Code Challenge","reviewCards":[{"__typename":"ReviewCard","id":"5fd6ded614f5a50012bf6409","title":"Loops determine a minimum or maximum value.","body":"Loops can be used to determine a minimum or maximum value. We just need to have a temporary variable to track the max number so far. On each iteration, we can compare the current element to the max number, and if the current element is larger, then we should replace the max number with it.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fd72d2551b12c00121859e1","language":"java","text":"int[] listOfNumbers = {1, 1, 5, 3};\n\nint maxNumber = listOfNumbers[0];\nfor (int i = 0; i \u003c listOfNumbers.length; i++) {\n if (listOfNumbers[i] \u003e maxDigit) {\n maxDigit = listOfNumbers[i];\n }\n}"}]},{"__typename":"ReviewCard","id":"5fd6ec203f9a370012f924a8","title":"Loops determine the frequency with which a specific criterion is met","body":"Loops can be used to determine the frequency with which a specific criterion is met. We will need a counter to track the number of elements that satisfy a particular condition. Then we can wrap a condition with a for loop to make sure it is applied to all elements in the array. If the condition holds true, we can add one to the counter.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fd72ec0469b2c00125b87b5","language":"java","text":"int[] numList = {1, 2, 3, 1};\n\nint numOfNumsGreaterThanOne = 0;\n\nfor (int i = 0; i \u003c numList.length; i++) {\n if (numList[i] \u003e 1) {\n numOfNumsGreaterThanOne++;\n }\n}"}]},{"__typename":"ReviewCard","id":"5fd6f4bbe1795d0012b1e89f","title":"Loops can determine if at least one element has a particular property","body":"Loops can determine if at least one element has a particular property","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fd6f5981f09510012eaa29f","language":"java","text":"int[] numList = {1, 2, 3, 5};\n\nboolean hasEvenNum = false;\nfor (int i = 0; i \u003c numList.length; i++) {\n if (numList[i] % 2 == 0) {\n hasEvenNum = true;\n }\n}"}]},{"__typename":"ReviewCard","id":"5fd6f64e74f3f30012d0db5d","title":"Loops can determine if all elements have a particular property","body":"Loops can determine if all elements have a particular property. One way is to set up a condition to evaluate if one element of the list has the property. Then we need a boolean that is true as long as the condition holds true, and wrap a loop around the condition to check every element in the list.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fd6f83801990a0012ec92b3","language":"java","text":"int[] numList = {2, 4, 6, 8, 4};\n\nint allEven = false;\nfor (int i = 0; i \u003c numList.length; i++) {\n if (numList[i] % 2 == 1) {\n allEven = false;\n }\n}"}]},{"__typename":"ReviewCard","id":"5fd6f90a51b12c00121859b9","title":"Loops can determine the presence or absence of duplicate elements","body":"Loops can determine the presence or absence of duplicate elements. One way is to set up a loop inside another loop. In each iteration of the outer loop, we check if any of the elements in the inner loop are equal.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fd6fda414f5a50012bf643d","language":"java","text":"int[] numList = {1, 2, 3, 4, 4};\n\nboolean hasDupe = false;\nfor (int i = 0; i \u003c numList.length; i++) {\n for (int j = i; j \u003c numList.length; j++) {\n if (i != j \u0026\u0026 numList[i] == numList[j]) {\n hasDupe = true;\n }\n }\n}"}]},{"__typename":"ReviewCard","id":"5fd70274bb1c480013341e87","title":"Loops can be used to reverse the order of the elements","body":"Loops can be used to reverse the order of the elements. One way is to set up a loop that goes through half of the elements of the array with two counters, one iterating forwards through the front of the array and the other iterating backwards from the end. Then we can just swap the elements at each counter (the first element with the last, the second with the second to last, and so on).","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fd7069002b7f700120b51a9","language":"java","text":"int back = list.length - 1;\nfor (int front = 0; i \u003c list.length/2; front++) {\n int temp = list[front];\n list[front] = list[back];\n list[back] = temp;\n back--;\n}"}]},{"__typename":"ReviewCard","id":"5fd70dca01990a0012ec92d8","title":"Loops can be used to shift or rotate elements left or right.","body":"Loops can be used to shift or rotate elements left or right. To rotate the elements, we set the last element in the array to an element that track the previous element in list. At the start, the previous element should be the last element in the list. Then we iterate through each element in the list and swap out the previous element with the current element.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fd70f40469b2c00125b8767","language":"java","text":"int previous = list[list.length - 1];\nfor (int i = 0; i \u003c list.length; i++) {\n int temp = list[i];\n list[i] = previous;\n previous = temp;\n}"}]},{"__typename":"ReviewCard","id":"5fd6a63874c16500120a7913","title":"Loops identify divisble integers","body":"Loops can be used to identify if an integer is or is not evenly divisible by another integer. By the end of the loop, if the dividend is 0, then we know that there are no leftovers and it is evenly divisible by the divisor.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fd72dee51b12c00121859ec","language":"java","text":"int divisor = someNumber;\nint dividend = anotherNumber;\n\nwhile (dividend \u003e= divisor) {\n dividend -= divisor;\n}\n\nif (dividend == 0) {\n // then the dividend is divisible by the divisor\n}"}]},{"__typename":"ReviewCard","id":"5fd6aa5174f3f30012d0d833","title":"Loops compute sums","body":"Loops can be used to compute a sum. Before we iterate through each element, then we just need to have a number to keep track of the current sum. Then on each iteration through the array, we can add that element to the sum. When the loop is finished, then we have the final sum.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fd72d7e01990a0012ec9303","language":"java","text":"// We can use a loop to add 1 to the sum 10 times\nint sum = 0;\nint addToSum = 1;\n\nfor (int i = 0; i \u003c 10; i++) {\n sum += addToSum;\n}"}]},{"__typename":"ReviewCard","id":"5fd6cd8414f5a50012bf6401","title":"Loops identify digits in a number","body":"Loops can be used to identify digits in a number. We can go through each digit in a number by taking mod 10 of the number. This will give us the remainder, which is effectively the ones digit of the number. Removing the ones digit from a number can be done by dividing the number by 10. We can repeat these steps using a loop until there are no more digits left in the number.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fd72f2d3f9a370012f924e8","language":"java","text":"int number = 123;\nwhile (number \u003e 0) {\n int digit = number % 10;\n number /= 10; // take the ones digit off the number\n}"}]},{"__typename":"ReviewCard","id":"5fd7161b14f5a50012bf6444","title":"Loops can be used to access the elements in a list","body":"Loops can be used to access all elements in a list. This is helpful when applying the same operation on every element in the list.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fd7269901990a0012ec92f3","language":"java","text":"// Print out \"Hello\" 10 times\nArrayList\u003cString\u003e list = new ArrayList\u003cString\u003e();\nfor (int i = 0; i \u003c 10; i++) {\n list.add(\"Hello\");\n}\n\nfor (String s : list) {\n System.out.println(s);\n}"}]},{"__typename":"ReviewCard","id":"5fd71dfa469b2c00125b87a4","title":"ArrayLists can be used to apply the same standards to lists as regular arrays","body":"ArrayLists can loop through arrays and update the elements similar to arrays.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fd7288a71af060012f884b1","language":"java","text":"ArrayList\u003cInteger\u003e arrayList = new ArrayList\u003cInteger\u003e();\nint[] intArray = new int[10];\n\nfor (int i = 0 ; i \u003c 10; i++) {\n arrayList.add(i);\n intArray[i] = i;\n}"}]},{"__typename":"ReviewCard","id":"5fd71fa774c16500120a7aa4","title":"Arrays can be used to add elements in ArrayLists","body":"Loops can be used to add and remove elements in ArrayLists.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fd723c271af060012f884a9","language":"java","text":"// add 10 strings in the list\nArrayList\u003cString\u003e list = new ArrayList\u003cString\u003e();\nfor (int i = 0; i \u003c 10; i++) {\n list.add(\"new string\");\n}"}]},{"__typename":"ReviewCard","id":"5fd724961f09510012eaa2d8","title":"Some algorithms require multiple String, array, or ArrayList objects to be traversed simultaneously.","body":"If two lists need to be traversed simultaneously, we can use the same counter to iterate through both of them, or two counters for each list. If one counter is used, we just need to account for the length of the arrays to make sure that there aren't out of bounds errors.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fd7261e27fa3e0012554a43","language":"java","text":"int firstListLength = firstList.size();\nint secondListLength = secondList.size();\nint numElementsToTraverse = 0;\n\nif (firstListLength \u003c secondListLength) {\n numElementsToTraverse = firstListLength;\n} else {\n numElementsToTraverse = secondListLength;\n}\n\nfor (int i = 0; i \u003c numElementsToTraverse; i++) {\n System.out.println(firstList.get(i));\n System.out.println(secondList.get(i));\n}"}]},{"__typename":"ReviewCard","id":"5fce4a4a18b7770012bb02af","title":"Iterating 2D Arrays","body":"In order to access each element of a 2D array, use iteration to traverse through each row of the 2D array. Then, within each row, use a nested loop to traverse through each element of the inner array.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"6001dd75c5c121000e37a503","language":"java","text":"// Prints the total value of each element in 2D array\n\nint[][] arr2D = {{17, 13, 19, 22}, {12, 18, 25, 20}, {15, 18, 21, 24}, {19, 23, 23, 22}, {18, 20, 21, 26}};\n \nint total = 0;\nfor (int row = 0; row \u003c arr2D.length; row++) {\n for (int col = 0; col \u003c arr2D[0].length; col++) {\n total += arr2D[row][col];\n }\n}\n\nSystem.out.println(total); // Prints: 396"}]},{"__typename":"ReviewCard","id":"5fc7bef814c52600128d44d3","title":"String Traversal for Checking Substrings","body":"Standard algorithms involving `String` traversal can be used to perform tasks such as finding if one (or more) substrings contain a certain property or determining the number of substrings that meet specific criteria.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fda53991147090012111cf5","language":"java","text":"public static int findNumValues(String text, String findText) {\n int count = 0;\n // iterate through String\n for (int i = 0; i \u003c= text.length()-findText.length(); i++){\n // check if substring matches a criteria\n if (text.substring(i,i+findText.length()).equals(findText)) {\n // increase count\n count += 1\n }\n }\n return count;\n}\n\npublic static void main(String[] args) {\n String text = \"hello hi howdy hi goodbye\";\n System.out.println(findNumValues(text, \"hi\"));\n // Prints: 2\n}"}]},{"__typename":"ReviewCard","id":"5fca4b2689693900121ff818","title":"String Traversal: Reversing a String","body":"`String` traversal can be used to iterate through a `String` and create a new `String` with the characters reversed.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fca4c2689693900121ff821","language":"java","text":"public static String reverseString(String text) {\n String reversed = new String(\"\");\n for (int i=0; i \u003c text.length(); i++){\n char nextCharacter = text.charAt(i);\n reversed = nextCharacter + reversed;\n }\n return reversed;\n}\n\npublic static void main(String[] args) {\n String text = new String(\"greetings earthling\");\n System.out.println(reverseString(text));\n // Prints: gnilhtrae sgniteerg\n}"}]}],"tracks":[{"__typename":"Track","released":false,"id":"5fb2a60221d8d6823338f78037598ae9","slug":"apcs-code-challenges","title":"Code Challenges","lessonCount":0,"contentModuleIds":["b8c84ddfc8b8556dd95448a44db36865"],"grantsCertificate":true,"enrollmentStatus":"none","pro":false,"shortDescription":"It's time to put your Java knowledge to the test! Try solving some of our code challenges involving arrays, loops, Strings, and more!","difficulty":"Beginner","metrics":{"__typename":"TrackMetricsType","medianDurationHours":null}}],"paths":[{"__typename":"Path","released":true,"id":"5fc508b822eca90012fb25eb","slug":"ap-computer-science-a","goal":"skill","title":"Study for the AP Computer Science A Exam (Java)","lessonCount":23,"trackCount":8,"enrollmentStatus":"none","shortDescription":"Master the core concepts covered in AP Computer Science A Exam and gain a solid understanding of programming and fluency in Java.","difficulty":"Beginner","metrics":{"__typename":"PathMetricsType","medianDurationHours":19.34}}]},"reviewCards":[{"id":"5fd6ded614f5a50012bf6409","title":"Loops determine a minimum or maximum value.","body":"Loops can be used to determine a minimum or maximum value. We just need to have a temporary variable to track the max number so far. On each iteration, we can compare the current element to the max number, and if the current element is larger, then we should replace the max number with it.","images":[],"codeSnippets":[{"id":"5fd72d2551b12c00121859e1","language":"java","text":"int[] listOfNumbers = {1, 1, 5, 3};\n\nint maxNumber = listOfNumbers[0];\nfor (int i = 0; i \u003c listOfNumbers.length; i++) {\n if (listOfNumbers[i] \u003e maxDigit) {\n maxDigit = listOfNumbers[i];\n }\n}"}]},{"id":"5fd6ec203f9a370012f924a8","title":"Loops determine the frequency with which a specific criterion is met","body":"Loops can be used to determine the frequency with which a specific criterion is met. We will need a counter to track the number of elements that satisfy a particular condition. Then we can wrap a condition with a for loop to make sure it is applied to all elements in the array. If the condition holds true, we can add one to the counter.","images":[],"codeSnippets":[{"id":"5fd72ec0469b2c00125b87b5","language":"java","text":"int[] numList = {1, 2, 3, 1};\n\nint numOfNumsGreaterThanOne = 0;\n\nfor (int i = 0; i \u003c numList.length; i++) {\n if (numList[i] \u003e 1) {\n numOfNumsGreaterThanOne++;\n }\n}"}]},{"id":"5fd6f4bbe1795d0012b1e89f","title":"Loops can determine if at least one element has a particular property","body":"Loops can determine if at least one element has a particular property","images":[],"codeSnippets":[{"id":"5fd6f5981f09510012eaa29f","language":"java","text":"int[] numList = {1, 2, 3, 5};\n\nboolean hasEvenNum = false;\nfor (int i = 0; i \u003c numList.length; i++) {\n if (numList[i] % 2 == 0) {\n hasEvenNum = true;\n }\n}"}]},{"id":"5fd6f64e74f3f30012d0db5d","title":"Loops can determine if all elements have a particular property","body":"Loops can determine if all elements have a particular property. One way is to set up a condition to evaluate if one element of the list has the property. Then we need a boolean that is true as long as the condition holds true, and wrap a loop around the condition to check every element in the list.","images":[],"codeSnippets":[{"id":"5fd6f83801990a0012ec92b3","language":"java","text":"int[] numList = {2, 4, 6, 8, 4};\n\nint allEven = false;\nfor (int i = 0; i \u003c numList.length; i++) {\n if (numList[i] % 2 == 1) {\n allEven = false;\n }\n}"}]},{"id":"5fd6f90a51b12c00121859b9","title":"Loops can determine the presence or absence of duplicate elements","body":"Loops can determine the presence or absence of duplicate elements. One way is to set up a loop inside another loop. In each iteration of the outer loop, we check if any of the elements in the inner loop are equal.","images":[],"codeSnippets":[{"id":"5fd6fda414f5a50012bf643d","language":"java","text":"int[] numList = {1, 2, 3, 4, 4};\n\nboolean hasDupe = false;\nfor (int i = 0; i \u003c numList.length; i++) {\n for (int j = i; j \u003c numList.length; j++) {\n if (i != j \u0026\u0026 numList[i] == numList[j]) {\n hasDupe = true;\n }\n }\n}"}]},{"id":"5fd70274bb1c480013341e87","title":"Loops can be used to reverse the order of the elements","body":"Loops can be used to reverse the order of the elements. One way is to set up a loop that goes through half of the elements of the array with two counters, one iterating forwards through the front of the array and the other iterating backwards from the end. Then we can just swap the elements at each counter (the first element with the last, the second with the second to last, and so on).","images":[],"codeSnippets":[{"id":"5fd7069002b7f700120b51a9","language":"java","text":"int back = list.length - 1;\nfor (int front = 0; i \u003c list.length/2; front++) {\n int temp = list[front];\n list[front] = list[back];\n list[back] = temp;\n back--;\n}"}]},{"id":"5fd70dca01990a0012ec92d8","title":"Loops can be used to shift or rotate elements left or right.","body":"Loops can be used to shift or rotate elements left or right. To rotate the elements, we set the last element in the array to an element that track the previous element in list. At the start, the previous element should be the last element in the list. Then we iterate through each element in the list and swap out the previous element with the current element.","images":[],"codeSnippets":[{"id":"5fd70f40469b2c00125b8767","language":"java","text":"int previous = list[list.length - 1];\nfor (int i = 0; i \u003c list.length; i++) {\n int temp = list[i];\n list[i] = previous;\n previous = temp;\n}"}]},{"id":"5fd6a63874c16500120a7913","title":"Loops identify divisble integers","body":"Loops can be used to identify if an integer is or is not evenly divisible by another integer. By the end of the loop, if the dividend is 0, then we know that there are no leftovers and it is evenly divisible by the divisor.","images":[],"codeSnippets":[{"id":"5fd72dee51b12c00121859ec","language":"java","text":"int divisor = someNumber;\nint dividend = anotherNumber;\n\nwhile (dividend \u003e= divisor) {\n dividend -= divisor;\n}\n\nif (dividend == 0) {\n // then the dividend is divisible by the divisor\n}"}]},{"id":"5fd6aa5174f3f30012d0d833","title":"Loops compute sums","body":"Loops can be used to compute a sum. Before we iterate through each element, then we just need to have a number to keep track of the current sum. Then on each iteration through the array, we can add that element to the sum. When the loop is finished, then we have the final sum.","images":[],"codeSnippets":[{"id":"5fd72d7e01990a0012ec9303","language":"java","text":"// We can use a loop to add 1 to the sum 10 times\nint sum = 0;\nint addToSum = 1;\n\nfor (int i = 0; i \u003c 10; i++) {\n sum += addToSum;\n}"}]},{"id":"5fd6cd8414f5a50012bf6401","title":"Loops identify digits in a number","body":"Loops can be used to identify digits in a number. We can go through each digit in a number by taking mod 10 of the number. This will give us the remainder, which is effectively the ones digit of the number. Removing the ones digit from a number can be done by dividing the number by 10. We can repeat these steps using a loop until there are no more digits left in the number.","images":[],"codeSnippets":[{"id":"5fd72f2d3f9a370012f924e8","language":"java","text":"int number = 123;\nwhile (number \u003e 0) {\n int digit = number % 10;\n number /= 10; // take the ones digit off the number\n}"}]},{"id":"5fd7161b14f5a50012bf6444","title":"Loops can be used to access the elements in a list","body":"Loops can be used to access all elements in a list. This is helpful when applying the same operation on every element in the list.","images":[],"codeSnippets":[{"id":"5fd7269901990a0012ec92f3","language":"java","text":"// Print out \"Hello\" 10 times\nArrayList\u003cString\u003e list = new ArrayList\u003cString\u003e();\nfor (int i = 0; i \u003c 10; i++) {\n list.add(\"Hello\");\n}\n\nfor (String s : list) {\n System.out.println(s);\n}"}]},{"id":"5fd71dfa469b2c00125b87a4","title":"ArrayLists can be used to apply the same standards to lists as regular arrays","body":"ArrayLists can loop through arrays and update the elements similar to arrays.","images":[],"codeSnippets":[{"id":"5fd7288a71af060012f884b1","language":"java","text":"ArrayList\u003cInteger\u003e arrayList = new ArrayList\u003cInteger\u003e();\nint[] intArray = new int[10];\n\nfor (int i = 0 ; i \u003c 10; i++) {\n arrayList.add(i);\n intArray[i] = i;\n}"}]},{"id":"5fd71fa774c16500120a7aa4","title":"Arrays can be used to add elements in ArrayLists","body":"Loops can be used to add and remove elements in ArrayLists.","images":[],"codeSnippets":[{"id":"5fd723c271af060012f884a9","language":"java","text":"// add 10 strings in the list\nArrayList\u003cString\u003e list = new ArrayList\u003cString\u003e();\nfor (int i = 0; i \u003c 10; i++) {\n list.add(\"new string\");\n}"}]},{"id":"5fd724961f09510012eaa2d8","title":"Some algorithms require multiple String, array, or ArrayList objects to be traversed simultaneously.","body":"If two lists need to be traversed simultaneously, we can use the same counter to iterate through both of them, or two counters for each list. If one counter is used, we just need to account for the length of the arrays to make sure that there aren't out of bounds errors.","images":[],"codeSnippets":[{"id":"5fd7261e27fa3e0012554a43","language":"java","text":"int firstListLength = firstList.size();\nint secondListLength = secondList.size();\nint numElementsToTraverse = 0;\n\nif (firstListLength \u003c secondListLength) {\n numElementsToTraverse = firstListLength;\n} else {\n numElementsToTraverse = secondListLength;\n}\n\nfor (int i = 0; i \u003c numElementsToTraverse; i++) {\n System.out.println(firstList.get(i));\n System.out.println(secondList.get(i));\n}"}]},{"id":"5fce4a4a18b7770012bb02af","title":"Iterating 2D Arrays","body":"In order to access each element of a 2D array, use iteration to traverse through each row of the 2D array. Then, within each row, use a nested loop to traverse through each element of the inner array.","images":[],"codeSnippets":[{"id":"6001dd75c5c121000e37a503","language":"java","text":"// Prints the total value of each element in 2D array\n\nint[][] arr2D = {{17, 13, 19, 22}, {12, 18, 25, 20}, {15, 18, 21, 24}, {19, 23, 23, 22}, {18, 20, 21, 26}};\n \nint total = 0;\nfor (int row = 0; row \u003c arr2D.length; row++) {\n for (int col = 0; col \u003c arr2D[0].length; col++) {\n total += arr2D[row][col];\n }\n}\n\nSystem.out.println(total); // Prints: 396"}]},{"id":"5fc7bef814c52600128d44d3","title":"String Traversal for Checking Substrings","body":"Standard algorithms involving `String` traversal can be used to perform tasks such as finding if one (or more) substrings contain a certain property or determining the number of substrings that meet specific criteria.","images":[],"codeSnippets":[{"id":"5fda53991147090012111cf5","language":"java","text":"public static int findNumValues(String text, String findText) {\n int count = 0;\n // iterate through String\n for (int i = 0; i \u003c= text.length()-findText.length(); i++){\n // check if substring matches a criteria\n if (text.substring(i,i+findText.length()).equals(findText)) {\n // increase count\n count += 1\n }\n }\n return count;\n}\n\npublic static void main(String[] args) {\n String text = \"hello hi howdy hi goodbye\";\n System.out.println(findNumValues(text, \"hi\"));\n // Prints: 2\n}"}]},{"id":"5fca4b2689693900121ff818","title":"String Traversal: Reversing a String","body":"`String` traversal can be used to iterate through a `String` and create a new `String` with the characters reversed.","images":[],"codeSnippets":[{"id":"5fca4c2689693900121ff821","language":"java","text":"public static String reverseString(String text) {\n String reversed = new String(\"\");\n for (int i=0; i \u003c text.length(); i++){\n char nextCharacter = text.charAt(i);\n reversed = nextCharacter + reversed;\n }\n return reversed;\n}\n\npublic static void main(String[] args) {\n String text = new String(\"greetings earthling\");\n System.out.println(reverseString(text));\n // Prints: gnilhtrae sgniteerg\n}"}]}],"relatedContent":[{"id":"5fc508b822eca90012fb25eb","slug":"ap-computer-science-a","urlPath":"/learn/paths/ap-computer-science-a","imageUrl":"https://static-assets.codecademy.com/components/curriculum/path/ap-computer-science-a/curriculum-card.svg","goal":"skill","title":"Study for the AP Computer Science A Exam (Java)","lessonCount":23,"courseCount":8,"enrollmentStatus":"none","shortDescription":"Master the core concepts covered in AP Computer Science A Exam and gain a solid understanding of programming and fluency in Java.","difficulty":"Beginner","timeToComplete":19,"hasCareerJourney":false,"type":"path"}],"pathSlug":"ap-computer-science-a","__NEXTJS_CONTEXT__":{"cookie":null,"isPreview":false}},"__N_SSG":true},"page":"/learn/paths/[pathSlug]/tracks/[courseSlug]/modules/[moduleSlug]/cheatsheet","query":{"pathSlug":"ap-computer-science-a","courseSlug":"apcs-code-challenges","moduleSlug":"apcs-code-challenges"},"buildId":"portal-app-10b4a003571504fb0cc6f52c5fa4b3ba2701e379","assetPrefix":"/_portal","isFallback":false,"isExperimentalCompile":false,"gsp":true,"scriptLoader":[]}</script>

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
