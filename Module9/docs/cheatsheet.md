# Arrays and Loops: Loops Cheatsheet | Codecademy

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

# Loops

Print Cheatsheet

Share

## Topics

-   [Arrays and ArrayLists](/learn/paths/ap-computer-science-a/tracks/apcs-arrays-and-loops/modules/apcs-arrays-and-arraylists/cheatsheet)
-   Loops
-   [Two-Dimensional Arrays](/learn/paths/ap-computer-science-a/tracks/apcs-arrays-and-loops/modules/apcs-two-dimensional-arrays/cheatsheet)

### Java `while` Loop

The `while` statement in Java repeatedly runs code as long as the given condition remains `true`.

int count \= 0;

while (count < 5) {

    System.out.println("Count is: " + count);

    count++;

}

to clipboard

### `For` Loop in Java

The `for` loop repeats code over a range of values by initializing a variable, checking a condition, and updating the variable each iteration.

public class LoopExample {

    public static void main(String\[\] args) {

        for (int i \= 0; i < 5; i++) {

            System.out.println("Iteration " + i);

        }

    }

}

/\*

Iteration 0

Iteration 1

Iteration 2

Iteration 3

Iteration 4

\*/

to clipboard

### For-each statement in Java

In Java, the `for-each` statement allows you to directly loop through each item in an array or `ArrayList` and perform some action with each item.

When creating a `for-each` statement, you must include the `for` keyword and two expressions inside of parentheses, separated by a colon. These include:

1.  The handle for an element we’re currently iterating over.
2.  The source array or `ArrayList` we’re iterating over.

// array of numbers

int\[\] numbers \= {1, 2, 3, 4, 5};

// for-each loop that prints each number in numbers

// int num is the handle while numbers is the source array

for (int num : numbers) {

    System.out.println(num);

}

to clipboard

[

Previous

](/learn/paths/ap-computer-science-a/tracks/apcs-arrays-and-loops/modules/apcs-arrays-and-arraylists/cheatsheet)[

Next

](/learn/paths/ap-computer-science-a/tracks/apcs-arrays-and-loops/modules/apcs-two-dimensional-arrays/cheatsheet)

Print Cheatsheet

Share
