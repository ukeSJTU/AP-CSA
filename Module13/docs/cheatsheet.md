# Algorithms: Algorithmic Complexity Cheatsheet | Codecademy

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
2.  Algorithms

# Algorithmic Complexity

Print Cheatsheet

Share

## Topics

-   [Recursion](/learn/paths/ap-computer-science-a/tracks/apcs-algorithms/modules/apcs-recursion/cheatsheet)
-   Algorithmic Complexity
-   [Searching and Sorting](/learn/paths/ap-computer-science-a/tracks/apcs-algorithms/modules/apcs-searching-and-sorting/cheatsheet)

### Big-Θ Notation

We compute the big-Θ of an algorithm by counting the number of iterations the algorithm _always_ takes with an input of n. For instance, the loop in the pseudo code below will always iterate N times for a list size of N. The runtime can be described as Θ(N).

```
for each item in list:
  print item
```

### Asymptotic Notation

Asymptotic Notation is used to describe the running time of an algorithm - how much time an algorithm takes with a given input, n. There are three different notations: big O, big Theta (Θ), and big Omega (Ω). big-Θ is used when the running time is the same for all cases, big-O for the worst case running time, and big-Ω for the best case running time.

### Adding Runtimes

When an algorithm consists of many parts, we describe its runtime based on the slowest part of the program.

An algorithm with three parts has running times of Θ(2N) + Θ(log N) + Θ(1). We only care about the slowest part, so we would quantify the runtime to be Θ(N). We would also drop the coefficient of 2 since when N gets really large, the multiplier 2 will have a small effect.

to clipboard

### Algorithmic Common Runtimes

The common algorithmic runtimes from fastest to slowest are:

-   constant: Θ(1)
-   logarithmic: Θ(log N)
-   linear: Θ(N)
-   polynomial: Θ(N^2)
-   exponential: Θ(2^N)
-   factorial: Θ(N!)

![Common Algorithmic Runtimes from fastest to slowest.](https://content.codecademy.com/practice/art-for-practice/new-pngs/common_runtimes_dark.png)

### Big-O Notation

The Big-O notation describes the worst-case running time of a program. We compute the Big-O of an algorithm by counting how many iterations an algorithm will take in the worst-case scenario with an input of N. We typically consult the Big-O because we must always plan for the worst case. For example, O(log n) describes the Big-O of a binary search algorithm.

### Big-Ω Notation

Big-Ω (Omega) describes the best running time of a program. We compute the big-Ω by counting how many iterations an algorithm will take in the best-case scenario based on an input of N. For example, a Bubble Sort algorithm has a running time of Ω(N) because in the best case scenario the list is already sorted, and the bubble sort will terminate after the first iteration.

[

Previous

](/learn/paths/ap-computer-science-a/tracks/apcs-algorithms/modules/apcs-recursion/cheatsheet)[

Next

](/learn/paths/ap-computer-science-a/tracks/apcs-algorithms/modules/apcs-searching-and-sorting/cheatsheet)

Print Cheatsheet

Share
