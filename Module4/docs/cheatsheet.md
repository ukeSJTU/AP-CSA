# Object-Oriented Programming: Using Built-In Classes Cheatsheet | Codecademy

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
2.  Object-Oriented Programming

# Using Built-In Classes

Print Cheatsheet

Share

## Topics

-   [What Are Classes, Objects, and Methods?](/learn/paths/ap-computer-science-a/tracks/apcs-object-oriented-programming/modules/apcs-what-are-classes-objects-and-methods/cheatsheet)
-   Using Built-In Classes

### Autoboxing Primitive Types

Autoboxing is the automatic conversion that the Java compiler makes between primitive types and their corresponding object wrapper classes. This includes converting an `int` to an `Integer` and a `double` to a `Double`.

// These are all examples of autoboxing

Double wrapper1 \= 23.456;

Integer wrapper2 \= 3;

Double wrapper3 \= new Double(13.57);

Integer wrapper4 \= new Integer(7);

Double wrapper5 \= Double.valueOf(30.59);

Integer wrapper6 \= Integer.valueOf(15);

to clipboard

### Unboxing Wrapper Classes

Unboxing is the automatic conversion that the Java compiler makes from the wrapper class to the primitive type. This includes converting an `Integer` to an `int` and a `Double` to a `double`.

Integer IntegerWrapper \= new Integer(7);

// Examples of an Integer getting unboxed to an int

int primitiveInt \= IntegerWapper;

int primitiveInt2 \= IntegerWrapper.intValue();

to clipboard

### Integer and Double Wrapper Classes

The `Integer` class and `Double` class are part of the `java.lang package`. They are used as a wrapper class to allow primitive `int` and `double` values to be used by methods that require Objects.

// Primitives

int a \= 5;

double b \= 2.5;

// Wrapper Objects

Integer c \= 7;

Double d \= 10.2;

to clipboard

### Integer and Double Static Fields

The `Integer` and `Double` classes have important static fields named `Integer.MAX_VALUE`, `Integer.MIN_VALUE`, `Double.POSITIVE_INFINITY`, and `Double.NEGATIVE_INFINITY`. These can be used to find the largest and smallest `Integer` values that Java can store as well as represent the concept of infinity.

Integer wrapperIntMax \= Integer.MAX_VALUE;

Integer wrapperIntMin \= Integer.MIN_VALUE;

Double inf \= Double.POSITIVE_INFINITY;

Double negInf \= Double.NEGATIVE_INFINITY;

to clipboard

### Static Methods

Static methods are methods that can be called within a program without creating an object of the class.

// static method

public static int getTotal(int a, int b) {

return a + b;

}

public static void main(String\[\] args) {

int x \= 3;

int y \= 2;

System.out.println(getTotal(x,y)); // Prints: 5

}

to clipboard

### Calling a Static Method

Static methods can be called by appending the dot operator to a class name followed by the name of the method.

int largerNumber \= Math.max(3, 10); // Call static method

System.out.println(largerNumber); // Prints: 10

to clipboard

### The Math Class

The `Math` class (which is part of the java.lang package) contains a variety of static methods that can be used to perform numerical calculations.

System.out.println(Math.abs(\-7.0)); // Prints: 7

System.out.println(Math.pow(5, 3)); // Prints: 125.0

System.out.println(Math.sqrt(52)); // Prints: 7.211102550927978

to clipboard

[

Previous

](/learn/paths/ap-computer-science-a/tracks/apcs-object-oriented-programming/modules/apcs-what-are-classes-objects-and-methods/cheatsheet)

Print Cheatsheet

Share
