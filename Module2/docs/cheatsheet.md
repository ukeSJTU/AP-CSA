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
