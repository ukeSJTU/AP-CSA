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

## Learn more on Codecademy

-   [

    Free course

    ### Learn Java: Loops and Arrays

    Take your programming skills to the next level by learning about arrays and loops.

    Checker Dense

    **Beginner** Friendly

    **5** hours

    ![](https://static-assets.codecademy.com/Courses/Course-Cards/pillars.svg)

    ](/learn/learn-java-loops-and-arrays)

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

<script id="__NEXT_DATA__" type="application/json">{"props":{"pageProps":{"course":{"__typename":"Track","id":"161c7039a9e51ac7f7c73acbdf3d827f","slug":"apcs-arrays-and-loops","title":"Arrays and Loops","contentModules":[{"__typename":"ContentModule","id":"523c14bddf5d2d13c32123433948a429","slug":"apcs-arrays-and-arraylists","title":"Arrays and ArrayLists"},{"__typename":"ContentModule","id":"3274a95b6dd125de6a4c9c8261a8bc2a","slug":"apcs-loops","title":"Loops"},{"__typename":"ContentModule","id":"15dfb1b1a6ccad9f5414b27c67c7d749","slug":"apcs-two-dimensional-arrays","title":"Two-Dimensional Arrays"}]},"module":{"__typename":"ContentModule","id":"15dfb1b1a6ccad9f5414b27c67c7d749","slug":"apcs-two-dimensional-arrays","title":"Two-Dimensional Arrays","reviewCards":[{"__typename":"ReviewCard","id":"5fd074546411740012733afb","title":"Nested Iteration Statements","body":"In Java, nested iteration statements are iteration statements that appear in the body of another iteration statement. When a loop is nested inside another loop, the inner loop must complete all its iterations before the outer loop can continue.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fd074d692a1120012249d45","language":"java","text":"for(int outer = 0; outer \u003c 3; outer++){\n System.out.println(\"The outer index is: \" + outer);\n for(int inner = 0; inner \u003c 4; inner++){\n System.out.println(\"\\tThe inner index is: \" + inner);\n }\n}"}]},{"__typename":"ReviewCard","id":"5fd075ae391f52001269b189","title":"Declaring 2D Arrays","body":"In Java, 2D arrays are stored as arrays of arrays. Therefore, the way 2D arrays are declared is similar 1D array objects. 2D arrays are declared by defining a data type followed by two sets of square brackets.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fd1d8466411740012b3cf59","language":"java","text":"int[][] twoDIntArray;\nString[][] twoDStringArray;\ndouble[][] twoDDoubleArray;"}]},{"__typename":"ReviewCard","id":"5fd07613e6e5fa0012a2c474","title":"Accessing 2D Array Elements","body":"In Java, when accessing the element from a 2D array using `arr[first][second]`, the `first` index can be thought of as the desired row, and the `second` index is used for the desired column. Just like 1D arrays, 2D arrays are indexed starting at `0`.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fd076b62957060013cfebdd","language":"java","text":"//Given a 2d array called `arr` which stores `int` values\nint[][] arr = {{1,2,3},\n {4,5,6}};\n\n//We can get the value `4` by using\nint retrieved = arr[1][0];"}]},{"__typename":"ReviewCard","id":"5fd076dc09ca1900125f59b7","title":"Initializer Lists","body":"In Java, initializer lists can be used to quickly give initial values to 2D arrays. This can be done in two different ways.\n\n1. If the array has not been declared yet, a new array can be declared and initialized in the same step using curly brackets.\n\n2. If the array has already been declared, the `new` keyword along with the data type must be used in order to use an initializer list","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fd07720603a6c00128bfcad","language":"java","text":"// Method one: declaring and intitializing at the same time\ndouble[][] doubleValues = {{1.5, 2.6, 3.7}, {7.5, 6.4, 5.3}, {9.8, 8.7, 7.6}, {3.6, 5.7, 7.8}};\n\n// Method two: declaring and initializing separately:\nString[][] stringValues;\nstringValues = new String[][] {{\"working\", \"with\"}, {\"2D\", \"arrays\"}, {\"is\", \"fun\"}};"}]},{"__typename":"ReviewCard","id":"5fd0776c2b2efb00127791b4","title":"Modify 2D Array Elements","body":"In Java, elements in a 2D array can be modified in a similar fashion to modifying elements in a 1D array. Setting `arr[i][j]` equal to a new value will modify the element in row `i` column `j` of the array `arr`.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"61444c0dae2b35000e06e856","language":"java","text":"double[][] doubleValues = {{1.5, 2.6, 3.7}, {7.5, 6.4, 5.3}, {9.8, 8.7, 7.6}, {3.6, 5.7, 7.8}};\n\ndoubleValues[2][2] = 100.5;\n// This will change the value 7.6 to 100.5"}]},{"__typename":"ReviewCard","id":"5fd077f01300bc0013d8e2ca","title":"Row-Major Order","body":"\"Row-major order\" refers to an ordering of 2D array elements where traversal occurs across each row - from the top left corner to the bottom right. In Java, row major ordering can be implemented by having nested loops where the outer loop variable iterates through the rows and the inner loop variable iterates through the columns. Note that inside these loops, when accessing elements, the variable used in the outer loop will be used as the first index, and the inner loop variable will be used as the second index.\n","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fd07817de8d6a0012afc068","language":"java","text":"for(int i = 0; i \u003c matrix.length; i++) {\n for(int j = 0; j \u003c matrix[i].length; j++) {\n System.out.println(matrix[i][j]);\n }\n}"}]},{"__typename":"ReviewCard","id":"5fd078646d67be001316daaf","title":"Column-Major Order","body":"\"Column-major order\" refers to an ordering of 2D array elements where traversal occurs down each column - from the top left corner to the bottom right. In Java, column major ordering can be implemented by having nested loops where the outer loop variable iterates through the columns and the inner loop variable iterates through the rows. Note that inside these loops, when accessing elements, the variable used in the outer loop will be used as the second index, and the inner loop variable will be used as the first index.\n","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fd078896d67be001316dabb","language":"java","text":"for(int i = 0; i \u003c matrix[0].length; i++) {\n for(int j = 0; j \u003c matrix.length; j++) {\n System.out.println(matrix[j][i]);\n }\n}"}]},{"__typename":"ReviewCard","id":"5fd07943e6e5fa0012a2c4c3","title":"Traversing With Enhanced For Loops","body":"In Java, enhanced for loops can be used to traverse 2D arrays. Because enhanced for loops have no index variable, they are better used in situations where you only care about the values of the 2D array - not the location of those values ","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fd0796e21661d001285644d","language":"java","text":"for(String[] rowOfStrings : twoDStringArray) {\n for(String s : rowOfStrings) {\n System.out.println(s);\n }\n}"}]}],"tracks":[{"__typename":"Track","released":false,"id":"161c7039a9e51ac7f7c73acbdf3d827f","slug":"apcs-arrays-and-loops","title":"Arrays and Loops","lessonCount":4,"contentModuleIds":["523c14bddf5d2d13c32123433948a429","3274a95b6dd125de6a4c9c8261a8bc2a","15dfb1b1a6ccad9f5414b27c67c7d749"],"grantsCertificate":true,"enrollmentStatus":"none","pro":false,"shortDescription":"Create Arrays and ArrayLists, loop through those data structures, and ultimately create two-dimensional versions of these objects.","difficulty":"Beginner","metrics":{"__typename":"TrackMetricsType","medianDurationHours":null}},{"__typename":"Track","released":true,"id":"deed3d23a4d60bcf88d0879d1628d98d","slug":"learn-java-loops-and-arrays","title":"Learn Java: Loops and Arrays","lessonCount":4,"contentModuleIds":["f8adeda99dd7dfe64fc6dae0f169c7f9","3274a95b6dd125de6a4c9c8261a8bc2a","15dfb1b1a6ccad9f5414b27c67c7d749","a1bb414e64174cbf8eaa7a2ba3879be8"],"grantsCertificate":true,"enrollmentStatus":"none","pro":false,"shortDescription":"Take your programming skills to the next level by learning about arrays and loops.","difficulty":"Beginner","metrics":{"__typename":"TrackMetricsType","medianDurationHours":5.27}}],"paths":[{"__typename":"Path","released":true,"id":"5fc508b822eca90012fb25eb","slug":"ap-computer-science-a","goal":"skill","title":"Study for the AP Computer Science A Exam (Java)","lessonCount":23,"trackCount":8,"enrollmentStatus":"none","shortDescription":"Master the core concepts covered in AP Computer Science A Exam and gain a solid understanding of programming and fluency in Java.","difficulty":"Beginner","metrics":{"__typename":"PathMetricsType","medianDurationHours":19.34}}]},"reviewCards":[{"id":"5fd074546411740012733afb","title":"Nested Iteration Statements","body":"In Java, nested iteration statements are iteration statements that appear in the body of another iteration statement. When a loop is nested inside another loop, the inner loop must complete all its iterations before the outer loop can continue.","images":[],"codeSnippets":[{"id":"5fd074d692a1120012249d45","language":"java","text":"for(int outer = 0; outer \u003c 3; outer++){\n System.out.println(\"The outer index is: \" + outer);\n for(int inner = 0; inner \u003c 4; inner++){\n System.out.println(\"\\tThe inner index is: \" + inner);\n }\n}"}]},{"id":"5fd075ae391f52001269b189","title":"Declaring 2D Arrays","body":"In Java, 2D arrays are stored as arrays of arrays. Therefore, the way 2D arrays are declared is similar 1D array objects. 2D arrays are declared by defining a data type followed by two sets of square brackets.","images":[],"codeSnippets":[{"id":"5fd1d8466411740012b3cf59","language":"java","text":"int[][] twoDIntArray;\nString[][] twoDStringArray;\ndouble[][] twoDDoubleArray;"}]},{"id":"5fd07613e6e5fa0012a2c474","title":"Accessing 2D Array Elements","body":"In Java, when accessing the element from a 2D array using `arr[first][second]`, the `first` index can be thought of as the desired row, and the `second` index is used for the desired column. Just like 1D arrays, 2D arrays are indexed starting at `0`.","images":[],"codeSnippets":[{"id":"5fd076b62957060013cfebdd","language":"java","text":"//Given a 2d array called `arr` which stores `int` values\nint[][] arr = {{1,2,3},\n {4,5,6}};\n\n//We can get the value `4` by using\nint retrieved = arr[1][0];"}]},{"id":"5fd076dc09ca1900125f59b7","title":"Initializer Lists","body":"In Java, initializer lists can be used to quickly give initial values to 2D arrays. This can be done in two different ways.\n\n1. If the array has not been declared yet, a new array can be declared and initialized in the same step using curly brackets.\n\n2. If the array has already been declared, the `new` keyword along with the data type must be used in order to use an initializer list","images":[],"codeSnippets":[{"id":"5fd07720603a6c00128bfcad","language":"java","text":"// Method one: declaring and intitializing at the same time\ndouble[][] doubleValues = {{1.5, 2.6, 3.7}, {7.5, 6.4, 5.3}, {9.8, 8.7, 7.6}, {3.6, 5.7, 7.8}};\n\n// Method two: declaring and initializing separately:\nString[][] stringValues;\nstringValues = new String[][] {{\"working\", \"with\"}, {\"2D\", \"arrays\"}, {\"is\", \"fun\"}};"}]},{"id":"5fd0776c2b2efb00127791b4","title":"Modify 2D Array Elements","body":"In Java, elements in a 2D array can be modified in a similar fashion to modifying elements in a 1D array. Setting `arr[i][j]` equal to a new value will modify the element in row `i` column `j` of the array `arr`.","images":[],"codeSnippets":[{"id":"61444c0dae2b35000e06e856","language":"java","text":"double[][] doubleValues = {{1.5, 2.6, 3.7}, {7.5, 6.4, 5.3}, {9.8, 8.7, 7.6}, {3.6, 5.7, 7.8}};\n\ndoubleValues[2][2] = 100.5;\n// This will change the value 7.6 to 100.5"}]},{"id":"5fd077f01300bc0013d8e2ca","title":"Row-Major Order","body":"\"Row-major order\" refers to an ordering of 2D array elements where traversal occurs across each row - from the top left corner to the bottom right. In Java, row major ordering can be implemented by having nested loops where the outer loop variable iterates through the rows and the inner loop variable iterates through the columns. Note that inside these loops, when accessing elements, the variable used in the outer loop will be used as the first index, and the inner loop variable will be used as the second index.\n","images":[],"codeSnippets":[{"id":"5fd07817de8d6a0012afc068","language":"java","text":"for(int i = 0; i \u003c matrix.length; i++) {\n for(int j = 0; j \u003c matrix[i].length; j++) {\n System.out.println(matrix[i][j]);\n }\n}"}]},{"id":"5fd078646d67be001316daaf","title":"Column-Major Order","body":"\"Column-major order\" refers to an ordering of 2D array elements where traversal occurs down each column - from the top left corner to the bottom right. In Java, column major ordering can be implemented by having nested loops where the outer loop variable iterates through the columns and the inner loop variable iterates through the rows. Note that inside these loops, when accessing elements, the variable used in the outer loop will be used as the second index, and the inner loop variable will be used as the first index.\n","images":[],"codeSnippets":[{"id":"5fd078896d67be001316dabb","language":"java","text":"for(int i = 0; i \u003c matrix[0].length; i++) {\n for(int j = 0; j \u003c matrix.length; j++) {\n System.out.println(matrix[j][i]);\n }\n}"}]},{"id":"5fd07943e6e5fa0012a2c4c3","title":"Traversing With Enhanced For Loops","body":"In Java, enhanced for loops can be used to traverse 2D arrays. Because enhanced for loops have no index variable, they are better used in situations where you only care about the values of the 2D array - not the location of those values ","images":[],"codeSnippets":[{"id":"5fd0796e21661d001285644d","language":"java","text":"for(String[] rowOfStrings : twoDStringArray) {\n for(String s : rowOfStrings) {\n System.out.println(s);\n }\n}"}]}],"relatedContent":[{"id":"deed3d23a4d60bcf88d0879d1628d98d","slug":"learn-java-loops-and-arrays","urlPath":"/learn/learn-java-loops-and-arrays","title":"Learn Java: Loops and Arrays","lessonCount":4,"contentModuleIds":["f8adeda99dd7dfe64fc6dae0f169c7f9","3274a95b6dd125de6a4c9c8261a8bc2a","15dfb1b1a6ccad9f5414b27c67c7d749","a1bb414e64174cbf8eaa7a2ba3879be8"],"grantsCertificate":true,"enrollmentStatus":"none","shortDescription":"Take your programming skills to the next level by learning about arrays and loops.","difficulty":"Beginner","pro":false,"timeToComplete":5,"type":"course"},{"id":"5fc508b822eca90012fb25eb","slug":"ap-computer-science-a","urlPath":"/learn/paths/ap-computer-science-a","imageUrl":"https://static-assets.codecademy.com/components/curriculum/path/ap-computer-science-a/curriculum-card.svg","goal":"skill","title":"Study for the AP Computer Science A Exam (Java)","lessonCount":23,"courseCount":8,"enrollmentStatus":"none","shortDescription":"Master the core concepts covered in AP Computer Science A Exam and gain a solid understanding of programming and fluency in Java.","difficulty":"Beginner","timeToComplete":19,"hasCareerJourney":false,"type":"path"}],"pathSlug":"ap-computer-science-a","__NEXTJS_CONTEXT__":{"cookie":null,"isPreview":false}},"__N_SSG":true},"page":"/learn/paths/[pathSlug]/tracks/[courseSlug]/modules/[moduleSlug]/cheatsheet","query":{"pathSlug":"ap-computer-science-a","courseSlug":"apcs-arrays-and-loops","moduleSlug":"apcs-two-dimensional-arrays"},"buildId":"portal-app-10b4a003571504fb0cc6f52c5fa4b3ba2701e379","assetPrefix":"/_portal","isFallback":false,"isExperimentalCompile":false,"gsp":true,"scriptLoader":[]}</script><script>(function(){function c(){var b=a.contentDocument||a.contentWindow.document;if(b){var d=b.createElement('script');d.innerHTML="window.__CF$cv$params={r:'92f37abd2b1afcc7',t:'MTc0NDQ2ODgzMy4wMDAwMDA='};var a=document.createElement('script');a.nonce='';a.src='/cdn-cgi/challenge-platform/scripts/jsd/main.js';document.getElementsByTagName('head')[0].appendChild(a);";b.getElementsByTagName('head')[0].appendChild(d)}}if(document.body){var a=document.createElement('iframe');a.height=1;a.width=1;a.style.position='absolute';a.style.top=0;a.style.left=0;a.style.border='none';a.style.visibility='hidden';document.body.appendChild(a);if('loading'!==document.readyState)c();else if(window.addEventListener)document.addEventListener('DOMContentLoaded',c);else{var e=document.onreadystatechange||function(){};document.onreadystatechange=function(b){e(b);'loading'!==document.readyState&&(document.onreadystatechange=e,c())}}}})();</script><iframe height="1" width="1" style="position: absolute; top: 0px; left: 0px; border: none; visibility: hidden;"></iframe>

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

---
