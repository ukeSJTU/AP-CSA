# Arrays and Loops: Two-Dimensional Arrays Cheatsheet | Codecademy

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
2.  Arrays and Loops

# Two-Dimensional Arrays

Print Cheatsheet

Share

## Topics

-   [Arrays and ArrayLists](/learn/paths/ap-computer-science-a/tracks/apcs-arrays-and-loops/modules/apcs-arrays-and-arraylists/cheatsheet)
-   [Loops](/learn/paths/ap-computer-science-a/tracks/apcs-arrays-and-loops/modules/apcs-loops/cheatsheet)
-   Two-Dimensional Arrays

### Nested Iteration Statements

In Java, nested iteration statements are iteration statements that appear in the body of another iteration statement. When a loop is nested inside another loop, the inner loop must complete all its iterations before the outer loop can continue.

for(int outer \= 0; outer < 3; outer++){

    System.out.println("The outer index is: " + outer);

    for(int inner \= 0; inner < 4; inner++){

        System.out.println("\\tThe inner index is: " + inner);

    }

}

to clipboard

### Declaring 2D Arrays

In Java, 2D arrays are stored as arrays of arrays. Therefore, the way 2D arrays are declared is similar 1D array objects. 2D arrays are declared by defining a data type followed by two sets of square brackets.

int\[\]\[\] twoDIntArray;

String\[\]\[\] twoDStringArray;

double\[\]\[\] twoDDoubleArray;

to clipboard

### Accessing 2D Array Elements

In Java, when accessing the element from a 2D array using `arr[first][second]`, the `first` index can be thought of as the desired row, and the `second` index is used for the desired column. Just like 1D arrays, 2D arrays are indexed starting at `0`.

//Given a 2d array called \`arr\` which stores \`int\` values

int\[\]\[\] arr \= {{1,2,3},

               {4,5,6}};

//We can get the value \`4\` by using

int retrieved \= arr\[1\]\[0\];

to clipboard

### Initializer Lists

In Java, initializer lists can be used to quickly give initial values to 2D arrays. This can be done in two different ways.

1.  If the array has not been declared yet, a new array can be declared and initialized in the same step using curly brackets.
2.  If the array has already been declared, the `new` keyword along with the data type must be used in order to use an initializer list

// Method one: declaring and intitializing at the same time

double\[\]\[\] doubleValues \= {{1.5, 2.6, 3.7}, {7.5, 6.4, 5.3}, {9.8,  8.7, 7.6}, {3.6, 5.7, 7.8}};

// Method two: declaring and initializing separately:

String\[\]\[\] stringValues;

stringValues \= new String\[\]\[\] {{"working", "with"}, {"2D", "arrays"}, {"is", "fun"}};

to clipboard

### Modify 2D Array Elements

In Java, elements in a 2D array can be modified in a similar fashion to modifying elements in a 1D array. Setting `arr[i][j]` equal to a new value will modify the element in row `i` column `j` of the array `arr`.

double\[\]\[\] doubleValues \= {{1.5, 2.6, 3.7}, {7.5, 6.4, 5.3}, {9.8,  8.7, 7.6}, {3.6, 5.7, 7.8}};

doubleValues\[2\]\[2\] \= 100.5;

// This will change the value 7.6 to 100.5

to clipboard

### Row-Major Order

“Row-major order” refers to an ordering of 2D array elements where traversal occurs across each row - from the top left corner to the bottom right. In Java, row major ordering can be implemented by having nested loops where the outer loop variable iterates through the rows and the inner loop variable iterates through the columns. Note that inside these loops, when accessing elements, the variable used in the outer loop will be used as the first index, and the inner loop variable will be used as the second index.

for(int i \= 0; i < matrix.length; i++) {

    for(int j \= 0; j < matrix\[i\].length; j++) {

        System.out.println(matrix\[i\]\[j\]);

    }

}

to clipboard

### Column-Major Order

“Column-major order” refers to an ordering of 2D array elements where traversal occurs down each column - from the top left corner to the bottom right. In Java, column major ordering can be implemented by having nested loops where the outer loop variable iterates through the columns and the inner loop variable iterates through the rows. Note that inside these loops, when accessing elements, the variable used in the outer loop will be used as the second index, and the inner loop variable will be used as the first index.

for(int i \= 0; i < matrix\[0\].length; i++) {

    for(int j \= 0; j < matrix.length; j++) {

        System.out.println(matrix\[j\]\[i\]);

    }

}

to clipboard

### Traversing With Enhanced For Loops

In Java, enhanced for loops can be used to traverse 2D arrays. Because enhanced for loops have no index variable, they are better used in situations where you only care about the values of the 2D array - not the location of those values

for(String\[\] rowOfStrings : twoDStringArray) {

    for(String s : rowOfStrings) {

        System.out.println(s);

    }

}

to clipboard

[

Previous

](/learn/paths/ap-computer-science-a/tracks/apcs-arrays-and-loops/modules/apcs-loops/cheatsheet)

Print Cheatsheet

Share
