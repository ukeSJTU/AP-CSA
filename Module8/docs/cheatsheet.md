# Arrays and Loops: Arrays and ArrayLists Cheatsheet | Codecademy

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

# Arrays and ArrayLists

Print Cheatsheet

Share

## Topics

-   Arrays and ArrayLists
-   [Loops](/learn/paths/ap-computer-science-a/tracks/apcs-arrays-and-loops/modules/apcs-loops/cheatsheet)
-   [Two-Dimensional Arrays](/learn/paths/ap-computer-science-a/tracks/apcs-arrays-and-loops/modules/apcs-two-dimensional-arrays/cheatsheet)

### Java ArrayList

In Java, an `ArrayList` is used to represent a dynamic list.

While Java arrays are fixed in size (the size cannot be modified), an `ArrayList` allows flexibility by being able to both add and remove elements.

// import the ArrayList package

import java.util.ArrayList;

// create an ArrayList called students

ArrayList<String\> students \= new ArrayList<String\>();

to clipboard

### Index

An index refers to an element’s position within an array.

The index of an array starts from 0 and goes up to one less than the total length of the array.

int\[\] marks \= {50, 55, 60, 70, 80};

System.out.println(marks\[0\]);

// Output: 50

System.out.println(marks\[4\]);

// Output: 80

to clipboard

### Arrays

In Java, an array is used to store a list of elements of the same datatype.

Arrays are fixed in size and their elements are ordered.

// Create an array of 5 int elements

int\[\] marks \= {10, 20, 30, 40, 50};

to clipboard

### Array creation in Java

In Java, an array can be created in the following ways:

-   Using the `{}` notation, by adding each element all at once.
-   Using the `new` keyword, and assigning each position of the array individually.

int\[\] age \= {20, 21, 30};

int\[\] marks \= new int\[3\];

marks\[0\] \= 50;

marks\[1\] \= 70;

marks\[2\] \= 93;

to clipboard

### Changing an Element Value

To change an element value, select the element via its index and use the assignment operator to set a new value.

int\[\] nums \= {1, 2, 0, 4};

// Change value at index 2

nums\[2\] \= 3;

to clipboard

### Modifying ArrayLists in Java

An `ArrayList` can easily be modified using built in methods.

To add elements to an `ArrayList`, you use the `add()` method. The element that you want to add goes inside of the `()`.

To remove elements from an `ArrayList`, you use the `remove()` method. Inside the `()` you can specify the index of the element that you want to remove. Alternatively, you can specify directly the element that you want to remove.

import java.util.ArrayList;

public class Students {

public static void main(String\[\] args) {

     // create an ArrayList called studentList, which initially holds \[\]

    	ArrayList<String\> studentList \= new ArrayList<String\>();

    // add students to the ArrayList

    studentList.add("John");

    studentList.add("Lily");

    studentList.add("Samantha");

    studentList.add("Tony");

    // remove John from the ArrayList, then Lily

    studentList.remove(0);

    studentList.remove("Lily");

    // studentList now holds \[Samantha, Tony\]

    System.out.println(studentList);

}

}

to clipboard

[

Next

](/learn/paths/ap-computer-science-a/tracks/apcs-arrays-and-loops/modules/apcs-loops/cheatsheet)

Print Cheatsheet

Share
