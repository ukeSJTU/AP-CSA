# Writing Your First Java Program: Variables Cheatsheet | Codecademy

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
2.  Writing Your First Java Program

# Variables

Print Cheatsheet

Share

## Topics

-   [Hello World](/learn/paths/ap-computer-science-a/tracks/apcs-writing-your-first-java-program/modules/apcs-hello-world/cheatsheet)
-   Variables

### Casting

Casting is the process of transforming a value of one primitive data type to another.

A `double` value can be transformed into an `int` value using the `(int)` casting operator, while an `int` value can be transformed into a `double` value using the `(double)` casting operator.

// Convert double to int

double numDouble \= 12.99;

System.out.println((int)doubleNum); // Prints: 12

// Convert int to double

int numInt \= 9;

System.out.println((double)numInt); // Prints: 9.0

to clipboard

### `boolean` Data Type

In Java, the `boolean` primitive data type is used to store a value, which can be either `true` or `false`.

boolean result \= true;

boolean isMarried \= false;

to clipboard

### Strings

A String in Java is a Object that holds multiple characters. It is not a primitive datatype.

A String can be created by placing characters between a pair of double quotes (`"`).

To compare Strings, the `equals()` method must be used instead of the primitive equality comparator `==`.

// Creating a String variable

String name \= "Bob";

// The following will print "false" because strings are case-sensitive

System.out.println(name.equals("bob"));

to clipboard

### `int` Data Type

In Java, the `int` datatype is used to store integer values. This means that it can store all positive and negative whole numbers and zero.

int num1 \= 10; // positive value

int num2 \= \-5; // negative value

int num3 \= 0; // zero value

int num4 \= 12.5; // not allowed

to clipboard

### `char` Data Type

In Java, `char` is used to store a single character. The character must be enclosed in single quotes.

char answer \= 'y';

to clipboard

### Primitive Data Types

Java’s most basic data types are known as _primitive data types_ and are in the system by default.

The available types are as follows:

-   `int`
-   `char`
-   `boolean`
-   `byte`
-   `long`
-   `short`
-   `double`
-   `float`

`null` is another, but it can only ever store the value `null`.

int age \= 28;

char grade \= 'A';

boolean late \= true;

byte b \= 20;

long num1 \= 1234567;

short no \= 10;

float k \= (float)12.5;

double pi \= 3.14;

to clipboard

### Static Typing

In Java, the type of a variable is checked at compile time. This is known as _static typing_. It has the advantage of catching the errors at compile time rather than at execution time.

Variables must be declared with the appropriate data type or the program will not compile.

int i \= 10; // type is int

char ch \= 'a'; // type is char

j \= 20; // won't compile, no type is given

char name \= "Lil"; // won't compile, wrong data type

to clipboard

### final Keyword

The value of a variable cannot be changed if the variable was declared using the `final` keyword.

Note that the variable must be given a value when it is declared as `final`. `final` variables cannot be changed; any attempts at doing so will result in an error message.

// Value cannot be changed:

final double PI \= 3.14;

to clipboard

### double Data Type

The `double` primitive type is used to hold decimal values.

double PI \= 3.14;

double price \= 5.75;

to clipboard

### Math Operations

Basic math operations can be applied to `int`, `double` and `float` data types:

-   `+` addition
-   `-` subtraction
-   `*` multiplication
-   `/` division
-   `%` modulo (yields the remainder)

These operations are not supported for other data types.

int a \= 20;

int b \= 10;

int result;

result \= a + b; // 30

result \= a \- b; // 10

result \= a \* b; // 200

result \= a / b; // 2

result \= a % b; // 0

to clipboard

### Comparison Operators

Comparison operators can be used to compare two values:

-   `>` greater than
-   `<` less than
-   `>=` greater than or equal to
-   `<=` less than or equal to
-   `==` equal to
-   `!=` not equal to

They are supported for primitive data types and the result of a comparison is a boolean value `true` or `false`.

int a \= 5;

int b \= 3;

boolean result \= a \> b;

// result now holds the boolean value true

to clipboard

### Compound Assignment Operators

Compound assignment operators can be used to change and reassign the value of a variable using one line of code. Compound assignment operators include `+=`, `-=`, `*=`, `/=`, and `%=`.

int number \= 5;

number += 3; // Value is now 8

number \-= 4; // Value is now 4

number \*= 6; // Value is now 24

number /= 2; // Value is now 12

number %= 7; // Value is now 5

to clipboard

### Increment and Decrement Operators

The increment operator, (`++`), can increase the value of a number-based variable by `1` while the decrement operator, (`--`), can decrease the value of a variable by `1`.

int numApples \= 5;

numApples++; // Value is now 6

int numOranges \= 5;

numOranges\--; // Value is now 4

to clipboard

### Order of Operations

The order in which an expression with multiple operators is evaluated is determined by the order of operations: parentheses -> multiplication -> division -> modulo -> addition -> subtraction.

[

Previous

](/learn/paths/ap-computer-science-a/tracks/apcs-writing-your-first-java-program/modules/apcs-hello-world/cheatsheet)

Print Cheatsheet

Share

## Learn more on Codecademy

-   [

    Free course

    ### Intro to Java

    Get started with Java by learning about the basics of a Java program and variables!

    Checker Dense

    **Beginner** Friendly

    **6** hours

    ![](https://static-assets.codecademy.com/Courses/Course-Cards/pillars.svg)

    ](/learn/java-introduction)

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

<script id="__NEXT_DATA__" type="application/json">{"props":{"pageProps":{"course":{"__typename":"Track","id":"d13e6d49ba0a7b60949ae3ec306f68d0","slug":"apcs-writing-your-first-java-program","title":"Writing Your First Java Program","contentModules":[{"__typename":"ContentModule","id":"741a44e4f6fb05796c3d2d91f8ce8b40","slug":"apcs-hello-world","title":"Hello World"},{"__typename":"ContentModule","id":"18fb3210703babdadf6d27ddca38397f","slug":"apcs-variables","title":"Variables"}]},"module":{"__typename":"ContentModule","id":"18fb3210703babdadf6d27ddca38397f","slug":"apcs-variables","title":"Variables","reviewCards":[{"__typename":"ReviewCard","id":"5fca5c607bd1ed0012eeebe6","title":"Casting","body":"Casting is the process of transforming a value of one primitive data type to another.\n\nA `double` value can be transformed into an `int` value using the `(int)` casting operator, while an `int` value can be transformed into a `double` value using the `(double)` casting operator.\n","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fca5d7218b7770012bae6f7","language":"java","text":"// Convert double to int\ndouble numDouble = 12.99;\nSystem.out.println((int)doubleNum); // Prints: 12\n\n// Convert int to double\nint numInt = 9;\nSystem.out.println((double)numInt); // Prints: 9.0"}]},{"__typename":"ReviewCard","id":"5cb04bfa5f1de87dfb4f6c05","title":"`boolean` Data Type","body":"In Java, the `boolean` primitive data type is used to store a value, which can be either `true` or `false`.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5d8cfba0b7060d00122f78dc","language":"java","text":"boolean result = true;\nboolean isMarried = false;"}]},{"__typename":"ReviewCard","id":"5cbe618d5f1de83411c3e68d","title":"Strings","body":"A String in Java is a Object that holds multiple characters. It is not a primitive datatype.\n\nA String can be created by placing characters between a pair of double quotes (`\"`). \n\nTo compare Strings, the `equals()` method must be used instead of the primitive equality comparator `==`. ","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5e66aa7741fd51001221dbad","language":"java","text":"// Creating a String variable\nString name = \"Bob\";\n\n// The following will print \"false\" because strings are case-sensitive\nSystem.out.println(name.equals(\"bob\"));"}]},{"__typename":"ReviewCard","id":"5cb305fa5f1de87dfd4f6d4c","title":"`int` Data Type","body":"In Java, the `int` datatype is used to store integer values. This means that it can store all positive and negative whole numbers and zero.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5e67211ae0fd36001165ac6b","language":"java","text":"int num1 = 10; // positive value\nint num2 = -5; // negative value\nint num3 = 0; // zero value\nint num4 = 12.5; // not allowed"}]},{"__typename":"ReviewCard","id":"5caefe73af246d214cf2a4cd","title":"`char` Data Type","body":"In Java, `char` is used to store a single character. The character must be enclosed in single quotes.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5d80035af7a5df0013ac2884","language":"java","text":"char answer = 'y';"}]},{"__typename":"ReviewCard","id":"5cb1b54c370902106cdf3e64","title":"Primitive Data Types","body":"Java's most basic data types are known as _primitive data types_ and are in the system by default.\n\nThe available types are as follows: \n\n- `int`\n- `char`\n- `boolean`\n- `byte`\n- `long`\n- `short`\n- `double`\n- `float`\n\n`null` is another, but it can only ever store the value `null`.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5e66aaeaaf9d7100118e98e2","language":"java","text":"int age = 28; \n\nchar grade = 'A';\n\nboolean late = true;\n\nbyte b = 20;\n\nlong num1 = 1234567;\n\nshort no = 10;\n\nfloat k = (float)12.5;\n\ndouble pi = 3.14;"}]},{"__typename":"ReviewCard","id":"5cb0611d37090210d7df3857","title":"Static Typing","body":"In Java, the type of a variable is checked at compile time. This is known as _static typing_. It has the advantage of catching the errors at compile time rather than at execution time.\n\nVariables must be declared with the appropriate data type or the program will not compile.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5e66aaf552c5800013f423ae","language":"java","text":"int i = 10; // type is int\nchar ch = 'a'; // type is char\n\nj = 20; // won't compile, no type is given\nchar name = \"Lil\"; // won't compile, wrong data type"}]},{"__typename":"ReviewCard","id":"5f5933dfea8d7d00125e5f7f","title":"final Keyword","body":"The value of a variable cannot be changed if the variable was declared using the `final` keyword.\n\nNote that the variable must be given a value when it is declared as `final`. `final` variables cannot be changed; any attempts at doing so will result in an error message.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"6001c36829533e000f639d13","language":"java","text":"// Value cannot be changed:\nfinal double PI = 3.14;"}]},{"__typename":"ReviewCard","id":"6006f1eae529a7001010e260","title":"double Data Type","body":"The `double` primitive type is used to hold decimal values.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"6006f224b75112000e7b6143","language":"java","text":"double PI = 3.14;\ndouble price = 5.75;"}]},{"__typename":"ReviewCard","id":"5cadfa3f370902194606fc64","title":"Math Operations","body":"Basic math operations can be applied to `int`, `double` and `float` data types:\n\n- `+` addition\n- `-` subtraction\n- `*` multiplication\n- `/` division\n- `%` modulo (yields the remainder)\n\nThese operations are not supported for other data types.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5e6720e76500670011498c63","language":"java","text":"int a = 20;\nint b = 10;\n\nint result;\n\nresult = a + b; // 30\n\nresult = a - b; // 10\n\nresult = a * b; // 200\n\nresult = a / b; // 2\n\nresult = a % b; // 0"}]},{"__typename":"ReviewCard","id":"5cad9095370902196b06fc08","title":"Comparison Operators","body":"Comparison operators can be used to compare two values:\n\n- `\u003e` greater than\n- `\u003c` less than\n- `\u003e=` greater than or equal to\n- `\u003c=` less than or equal to\n- `==` equal to\n- `!=` not equal to\n\nThey are supported for primitive data types and the result of a comparison is a boolean value `true` or `false`.\n","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5e66ab48854a7b0011c8adbe","language":"java","text":"int a = 5;\nint b = 3;\n\nboolean result = a \u003e b;\n// result now holds the boolean value true"}]},{"__typename":"ReviewCard","id":"5f592fa1c70abf00133cd5f2","title":"Compound Assignment Operators","body":"Compound assignment operators can be used to change and reassign the value of a variable using one line of code. Compound assignment operators include `+=`, `-=`, `*=`, `/=`, and `%=`.\n","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"6001c2e75a5f69000ea6908c","language":"java","text":"int number = 5;\n\nnumber += 3; // Value is now 8\nnumber -= 4; // Value is now 4\nnumber *= 6; // Value is now 24\nnumber /= 2; // Value is now 12\nnumber %= 7; // Value is now 5"}]},{"__typename":"ReviewCard","id":"5f593307c70abf00133cd609","title":"Increment and Decrement Operators","body":"The increment operator, (`++`), can increase the value of a number-based variable by `1` while the decrement operator, (`--`), can decrease the value of a variable by `1`.\n","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"6001c327fb3a46000f227005","language":"java","text":"int numApples = 5;\nnumApples++; // Value is now 6\n\nint numOranges = 5;\nnumOranges--; // Value is now 4"}]},{"__typename":"ReviewCard","id":"5f592e74f925e10013e1dbd2","title":"Order of Operations","body":"The order in which an expression with multiple operators is evaluated is determined by the order of operations: parentheses -\u003e multiplication -\u003e division -\u003e modulo -\u003e addition -\u003e subtraction.","images":[],"codeSnippets":[]}],"tracks":[{"__typename":"Track","released":true,"id":"8149b07e106bb4b49aad31a6432bf648","slug":"java-introduction","title":"Intro to Java","lessonCount":5,"contentModuleIds":["741a44e4f6fb05796c3d2d91f8ce8b40","18fb3210703babdadf6d27ddca38397f","7314c41b239a4b86a62fa5deca6d7e61"],"grantsCertificate":true,"enrollmentStatus":"none","pro":false,"shortDescription":"Get started with Java by learning about the basics of a Java program and variables!","difficulty":"Beginner","metrics":{"__typename":"TrackMetricsType","medianDurationHours":5.84}},{"__typename":"Track","released":false,"id":"d13e6d49ba0a7b60949ae3ec306f68d0","slug":"apcs-writing-your-first-java-program","title":"Writing Your First Java Program","lessonCount":3,"contentModuleIds":["33e89be947569df19e916e684435f7b3","741a44e4f6fb05796c3d2d91f8ce8b40","18fb3210703babdadf6d27ddca38397f"],"grantsCertificate":true,"enrollmentStatus":"none","pro":false,"shortDescription":"Welcome to the start of your journey with Java! In this track, we'll learn what Java is and write our first program!","difficulty":"Beginner","metrics":{"__typename":"TrackMetricsType","medianDurationHours":null}}],"paths":[{"__typename":"Path","released":true,"id":"5fc508b822eca90012fb25eb","slug":"ap-computer-science-a","goal":"skill","title":"Study for the AP Computer Science A Exam (Java)","lessonCount":23,"trackCount":8,"enrollmentStatus":"none","shortDescription":"Master the core concepts covered in AP Computer Science A Exam and gain a solid understanding of programming and fluency in Java.","difficulty":"Beginner","metrics":{"__typename":"PathMetricsType","medianDurationHours":19.34}}]},"reviewCards":[{"id":"5fca5c607bd1ed0012eeebe6","title":"Casting","body":"Casting is the process of transforming a value of one primitive data type to another.\n\nA `double` value can be transformed into an `int` value using the `(int)` casting operator, while an `int` value can be transformed into a `double` value using the `(double)` casting operator.\n","images":[],"codeSnippets":[{"id":"5fca5d7218b7770012bae6f7","language":"java","text":"// Convert double to int\ndouble numDouble = 12.99;\nSystem.out.println((int)doubleNum); // Prints: 12\n\n// Convert int to double\nint numInt = 9;\nSystem.out.println((double)numInt); // Prints: 9.0"}]},{"id":"5cb04bfa5f1de87dfb4f6c05","title":"`boolean` Data Type","body":"In Java, the `boolean` primitive data type is used to store a value, which can be either `true` or `false`.","images":[],"codeSnippets":[{"id":"5d8cfba0b7060d00122f78dc","language":"java","text":"boolean result = true;\nboolean isMarried = false;"}]},{"id":"5cbe618d5f1de83411c3e68d","title":"Strings","body":"A String in Java is a Object that holds multiple characters. It is not a primitive datatype.\n\nA String can be created by placing characters between a pair of double quotes (`\"`). \n\nTo compare Strings, the `equals()` method must be used instead of the primitive equality comparator `==`. ","images":[],"codeSnippets":[{"id":"5e66aa7741fd51001221dbad","language":"java","text":"// Creating a String variable\nString name = \"Bob\";\n\n// The following will print \"false\" because strings are case-sensitive\nSystem.out.println(name.equals(\"bob\"));"}]},{"id":"5cb305fa5f1de87dfd4f6d4c","title":"`int` Data Type","body":"In Java, the `int` datatype is used to store integer values. This means that it can store all positive and negative whole numbers and zero.","images":[],"codeSnippets":[{"id":"5e67211ae0fd36001165ac6b","language":"java","text":"int num1 = 10; // positive value\nint num2 = -5; // negative value\nint num3 = 0; // zero value\nint num4 = 12.5; // not allowed"}]},{"id":"5caefe73af246d214cf2a4cd","title":"`char` Data Type","body":"In Java, `char` is used to store a single character. The character must be enclosed in single quotes.","images":[],"codeSnippets":[{"id":"5d80035af7a5df0013ac2884","language":"java","text":"char answer = 'y';"}]},{"id":"5cb1b54c370902106cdf3e64","title":"Primitive Data Types","body":"Java's most basic data types are known as _primitive data types_ and are in the system by default.\n\nThe available types are as follows: \n\n- `int`\n- `char`\n- `boolean`\n- `byte`\n- `long`\n- `short`\n- `double`\n- `float`\n\n`null` is another, but it can only ever store the value `null`.","images":[],"codeSnippets":[{"id":"5e66aaeaaf9d7100118e98e2","language":"java","text":"int age = 28; \n\nchar grade = 'A';\n\nboolean late = true;\n\nbyte b = 20;\n\nlong num1 = 1234567;\n\nshort no = 10;\n\nfloat k = (float)12.5;\n\ndouble pi = 3.14;"}]},{"id":"5cb0611d37090210d7df3857","title":"Static Typing","body":"In Java, the type of a variable is checked at compile time. This is known as _static typing_. It has the advantage of catching the errors at compile time rather than at execution time.\n\nVariables must be declared with the appropriate data type or the program will not compile.","images":[],"codeSnippets":[{"id":"5e66aaf552c5800013f423ae","language":"java","text":"int i = 10; // type is int\nchar ch = 'a'; // type is char\n\nj = 20; // won't compile, no type is given\nchar name = \"Lil\"; // won't compile, wrong data type"}]},{"id":"5f5933dfea8d7d00125e5f7f","title":"final Keyword","body":"The value of a variable cannot be changed if the variable was declared using the `final` keyword.\n\nNote that the variable must be given a value when it is declared as `final`. `final` variables cannot be changed; any attempts at doing so will result in an error message.","images":[],"codeSnippets":[{"id":"6001c36829533e000f639d13","language":"java","text":"// Value cannot be changed:\nfinal double PI = 3.14;"}]},{"id":"6006f1eae529a7001010e260","title":"double Data Type","body":"The `double` primitive type is used to hold decimal values.","images":[],"codeSnippets":[{"id":"6006f224b75112000e7b6143","language":"java","text":"double PI = 3.14;\ndouble price = 5.75;"}]},{"id":"5cadfa3f370902194606fc64","title":"Math Operations","body":"Basic math operations can be applied to `int`, `double` and `float` data types:\n\n- `+` addition\n- `-` subtraction\n- `*` multiplication\n- `/` division\n- `%` modulo (yields the remainder)\n\nThese operations are not supported for other data types.","images":[],"codeSnippets":[{"id":"5e6720e76500670011498c63","language":"java","text":"int a = 20;\nint b = 10;\n\nint result;\n\nresult = a + b; // 30\n\nresult = a - b; // 10\n\nresult = a * b; // 200\n\nresult = a / b; // 2\n\nresult = a % b; // 0"}]},{"id":"5cad9095370902196b06fc08","title":"Comparison Operators","body":"Comparison operators can be used to compare two values:\n\n- `\u003e` greater than\n- `\u003c` less than\n- `\u003e=` greater than or equal to\n- `\u003c=` less than or equal to\n- `==` equal to\n- `!=` not equal to\n\nThey are supported for primitive data types and the result of a comparison is a boolean value `true` or `false`.\n","images":[],"codeSnippets":[{"id":"5e66ab48854a7b0011c8adbe","language":"java","text":"int a = 5;\nint b = 3;\n\nboolean result = a \u003e b;\n// result now holds the boolean value true"}]},{"id":"5f592fa1c70abf00133cd5f2","title":"Compound Assignment Operators","body":"Compound assignment operators can be used to change and reassign the value of a variable using one line of code. Compound assignment operators include `+=`, `-=`, `*=`, `/=`, and `%=`.\n","images":[],"codeSnippets":[{"id":"6001c2e75a5f69000ea6908c","language":"java","text":"int number = 5;\n\nnumber += 3; // Value is now 8\nnumber -= 4; // Value is now 4\nnumber *= 6; // Value is now 24\nnumber /= 2; // Value is now 12\nnumber %= 7; // Value is now 5"}]},{"id":"5f593307c70abf00133cd609","title":"Increment and Decrement Operators","body":"The increment operator, (`++`), can increase the value of a number-based variable by `1` while the decrement operator, (`--`), can decrease the value of a variable by `1`.\n","images":[],"codeSnippets":[{"id":"6001c327fb3a46000f227005","language":"java","text":"int numApples = 5;\nnumApples++; // Value is now 6\n\nint numOranges = 5;\nnumOranges--; // Value is now 4"}]},{"id":"5f592e74f925e10013e1dbd2","title":"Order of Operations","body":"The order in which an expression with multiple operators is evaluated is determined by the order of operations: parentheses -\u003e multiplication -\u003e division -\u003e modulo -\u003e addition -\u003e subtraction.","images":[],"codeSnippets":[]}],"relatedContent":[{"id":"8149b07e106bb4b49aad31a6432bf648","slug":"java-introduction","urlPath":"/learn/java-introduction","title":"Intro to Java","lessonCount":5,"contentModuleIds":["741a44e4f6fb05796c3d2d91f8ce8b40","18fb3210703babdadf6d27ddca38397f","7314c41b239a4b86a62fa5deca6d7e61"],"grantsCertificate":true,"enrollmentStatus":"none","shortDescription":"Get started with Java by learning about the basics of a Java program and variables!","difficulty":"Beginner","pro":false,"timeToComplete":6,"type":"course"},{"id":"5fc508b822eca90012fb25eb","slug":"ap-computer-science-a","urlPath":"/learn/paths/ap-computer-science-a","imageUrl":"https://static-assets.codecademy.com/components/curriculum/path/ap-computer-science-a/curriculum-card.svg","goal":"skill","title":"Study for the AP Computer Science A Exam (Java)","lessonCount":23,"courseCount":8,"enrollmentStatus":"none","shortDescription":"Master the core concepts covered in AP Computer Science A Exam and gain a solid understanding of programming and fluency in Java.","difficulty":"Beginner","timeToComplete":19,"hasCareerJourney":false,"type":"path"}],"pathSlug":"ap-computer-science-a","__NEXTJS_CONTEXT__":{"cookie":null,"isPreview":false}},"__N_SSG":true},"page":"/learn/paths/[pathSlug]/tracks/[courseSlug]/modules/[moduleSlug]/cheatsheet","query":{"pathSlug":"ap-computer-science-a","courseSlug":"apcs-writing-your-first-java-program","moduleSlug":"apcs-variables"},"buildId":"portal-app-10b4a003571504fb0cc6f52c5fa4b3ba2701e379","assetPrefix":"/_portal","isFallback":false,"isExperimentalCompile":false,"gsp":true,"scriptLoader":[]}</script>

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
