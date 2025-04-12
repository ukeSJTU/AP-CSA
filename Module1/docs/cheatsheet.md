# Writing Your First Java Program: Hello World Cheatsheet | Codecademy

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

# Hello World

Print Cheatsheet

Share

## Topics

-   Hello World
-   [Variables](/learn/paths/ap-computer-science-a/tracks/apcs-writing-your-first-java-program/modules/apcs-variables/cheatsheet)

### Print Line

`System.out.println()` can print to the console:

-   `System` is a class from the core library provided by Java
-   `out` is an object that controls the output
-   `println()` is a method associated with that object that receives a single argument

System.out.println("Hello, world!");

// Output: Hello, world!

to clipboard

### Comments

Comments are bits of text that are ignored by the compiler. They are used to increase the readability of a program.

-   Single line comments are created by using `//`.
-   Multi-line comments are created by starting with `/*` and ending with `*/`.

// I am a single line comment!

/\*

And I am a

multi-line comment!

\*/

to clipboard

### Compiling Java

In Java, when we compile a program, each individual class is converted into a **.class** file, which is known as byte code.

The JVM (Java virtual machine) is used to run the byte code.

\# Compile the class file:

javac hello.java

\# Execute the compiled file:

java hello

to clipboard

### Whitespace

Whitespace, including spaces and newlines, between statements is ignored.

System.out.println("Example of a statement");

System.out.println("Another statement");

// Output:

// Example of a statement

// Another statement

to clipboard

### Statements

In Java, a statement is a line of code that executes a task and is terminated with a `;`.

System.out.println("Java Programming ☕️");

to clipboard

### `main()` Method

In Java, every application must contain a `main()` method, which is the entry point for the application. All other methods are invoked from the `main()` method.

The signature of the method is `public static void main(String[] args) { }`. It accepts a single argument: an array of elements of type `String`.

public class Person {

public static void main(String\[\] args) {

    System.out.println("Hello, world!");

}

}

to clipboard

### Computing Systems & Personal Security

Using a user’s personal data can create unique and personalized online experiences for use; however, there is a risk to personal privacy when collecting and storing personal data in a program.

### Computing Systems & Ethical and Social Impacts

Programs have had both positive and negative ethical and social impacts on society. Some examples of this include:

-   Machine learning: While there are positives to pattern identification and automation, there is a problem with data bias and its impact on marginalized communities.
-   AI: For example, should a driverless car make choices that protect the life of the passenger over the life of another driver or a pedestrian?

### Classes

A _class_ represents a single concept.

A Java program must have one class whose name is the same as the program filename.

In the example, the `Person` class must be declared in a program file named **Person.java**.

public class Person {

public static void main(String\[\] args) {

    System.out.println("I am a person, not a computer.");

}

}

to clipboard

[

Next

](/learn/paths/ap-computer-science-a/tracks/apcs-writing-your-first-java-program/modules/apcs-variables/cheatsheet)

Print Cheatsheet

Share
