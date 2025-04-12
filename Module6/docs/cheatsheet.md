# A Deeper Dive Into Classes: String Methods Cheatsheet | Codecademy

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
2.  A Deeper Dive Into Classes

# String Methods

Print Cheatsheet

Share

## Topics

-   String Methods
-   [Access, Encapsulation, and Static Methods](/learn/paths/ap-computer-science-a/tracks/apcs-a-deeper-dive-into-classes/modules/apcs-access-encapsulation-and-static-methods/cheatsheet)

### length() String Method in Java

In Java, the `length()` string method returns the total number of characters – the length – of a `String`.

String str \= "Codecademy";

System.out.println(str.length());

// prints 10

to clipboard

### indexOf() String Method in Java

In Java, the `indexOf()` string method returns the first occurence of a character or a substring in a `String`. The character/substring that you want to find the index of goes inside of the `()`.

If `indexOf()` cannot find the character or substring, it will return -1.

String str \= "Hello World!";

System.out.println(str.indexOf("l"));

// prints 2

System.out.println(str.indexOf("Wor"));

// prints 6

System.out.println(str.indexOf("z"));

// prints -1

to clipboard

### concat() String Method in Java

In Java, the `concat()` string method is used to append one `String` to the end of another `String`. This method returns a `String` representing the text of the combined strings.

String s1 \= "Hello";

String s2 \= " World!";

String s3 \= s1.concat(s2);

// concatenates strings s1 and s2

System.out.println(s3);

// prints "Hello World!"

to clipboard

### String Method equals() in Java

In Java, the `equals()` string method tests for equality between two `String`s.

`equals()` compares the contents of each `String`. If all of the characters between the two match, the method returns `true`. If any of the characters do not match, it returns `false`.

Additionally, if you want to compare two strings without considering upper/lower cases, you can use `.equalsIgnoreCase()`.

String s1 \= "Hello";

String s2 \= "World";

System.out.println(s1.equals("Hello"));

// prints true

System.out.println(s2.equals("Hello"));

// prints false

System.out.println(s2.equalsIgnoreCase("world"));

// prints true

to clipboard

### charAt() String Method in Java

In Java, the `charAt()` string method returns the character of a `String` at a specified index. The index value is passed inside of the `()`, and should lie between 0 and `length()-1`.

String str \= "This is a string";

System.out.println(str.charAt(0));

// prints 'T'

System.out.println(str.charAt(15));

// prints 'g'

to clipboard

### toUpperCase() and toLowerCase() String Methods

In Java, we can easily convert a `String` to upper and lower case with the help of a few string methods:

-   `toUpperCase()` returns the string value converted to uppercase.
-   `toLowerCase()` returns the string value converted to lowercase.

String str \= "Hello World!";

String uppercase \= str.toUpperCase();

// uppercase = "HELLO WORLD!"

String lowercase \= str.toLowerCase();

// lowercase = "hello world!"

to clipboard

[

Next

](/learn/paths/ap-computer-science-a/tracks/apcs-a-deeper-dive-into-classes/modules/apcs-access-encapsulation-and-static-methods/cheatsheet)

Print Cheatsheet

Share
