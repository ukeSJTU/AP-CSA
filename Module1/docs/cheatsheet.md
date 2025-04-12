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

<script id="__NEXT_DATA__" type="application/json">{"props":{"pageProps":{"course":{"__typename":"Track","id":"d13e6d49ba0a7b60949ae3ec306f68d0","slug":"apcs-writing-your-first-java-program","title":"Writing Your First Java Program","contentModules":[{"__typename":"ContentModule","id":"741a44e4f6fb05796c3d2d91f8ce8b40","slug":"apcs-hello-world","title":"Hello World"},{"__typename":"ContentModule","id":"18fb3210703babdadf6d27ddca38397f","slug":"apcs-variables","title":"Variables"}]},"module":{"__typename":"ContentModule","id":"741a44e4f6fb05796c3d2d91f8ce8b40","slug":"apcs-hello-world","title":"Hello World","reviewCards":[{"__typename":"ReviewCard","id":"5cb1bdad5f1de87da04f6fa3","title":"Print Line","body":"`System.out.println()` can print to the console:\n\n- `System` is a class from the core library provided by Java\n- `out` is an object that controls the output\n- `println()` is a method associated with that object that receives a single argument","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5e63f2aadc672d0012e13250","language":"java","text":"System.out.println(\"Hello, world!\");\n// Output: Hello, world!"}]},{"__typename":"ReviewCard","id":"5caed8435f1de87dfd4f669c","title":"Comments","body":"Comments are bits of text that are ignored by the compiler. They are used to increase the readability of a program.\n\n- Single line comments are created by using `//`.\n- Multi-line comments are created by starting with `/*` and ending with `*/`.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5e63f315156cc50011ae937a","language":"java","text":"// I am a single line comment!\n\n/*\nAnd I am a \nmulti-line comment!\n*/"}]},{"__typename":"ReviewCard","id":"5cb1c08037090210c3df3fc8","title":"Compiling Java","body":"In Java, when we compile a program, each individual class is converted into a **.class** file, which is known as byte code.\n\nThe JVM (Java virtual machine) is used to run the byte code.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5e66aa3e52c5800013f423a6","language":"shell","text":"# Compile the class file:\njavac hello.java\n\n# Execute the compiled file:\njava hello"}]},{"__typename":"ReviewCard","id":"5cb583c05f1de84ea127bd4d","title":"Whitespace","body":"Whitespace, including spaces and newlines, between statements is ignored.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5e66aa4bace3bf0013b2ccb6","language":"java","text":"System.out.println(\"Example of a statement\");\n\nSystem.out.println(\"Another statement\");\n\n// Output:\n// Example of a statement\n// Another statement"}]},{"__typename":"ReviewCard","id":"5caf01055f1de87e174f66a8","title":"Statements","body":"In Java, a statement is a line of code that executes a task and is terminated with a `;`.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5e63f3870b0cde001133a2d5","language":"java","text":"System.out.println(\"Java Programming ☕️\");"}]},{"__typename":"ReviewCard","id":"5cb049bfaf246d2132f2a832","title":"`main()` Method","body":"In Java, every application must contain a `main()` method, which is the entry point for the application. All other methods are invoked from the `main()` method.\n\nThe signature of the method is `public static void main(String[] args) { }`. It accepts a single argument: an array of elements of type `String`.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5e63f3317fe10c00129c3c75","language":"java","text":"public class Person {\n \n public static void main(String[] args) {\n \n System.out.println(\"Hello, world!\");\n\n }\n \n}"}]},{"__typename":"ReviewCard","id":"5fca4de002cf4800121db68a","title":"Computing Systems \u0026 Personal Security","body":"Using a user's personal data can create unique and personalized online experiences for use; however, there is a risk to personal privacy when collecting and storing personal data in a program.","images":[],"codeSnippets":[]},{"__typename":"ReviewCard","id":"5fca50f618b7770012bae5ff","title":"Computing Systems \u0026 Ethical and Social Impacts","body":"Programs have had both positive and negative ethical and social impacts on society. Some examples of this include:\n* Machine learning: While there are positives to pattern identification and automation, there is a problem with data bias and its impact on marginalized communities.\n* AI: For example, should a driverless car make choices that protect the life of the passenger over the life of another driver or a pedestrian?","images":[],"codeSnippets":[]},{"__typename":"ReviewCard","id":"5cae10fd3709023b3b950604","title":"Classes","body":"A _class_ represents a single concept.\n\nA Java program must have one class whose name is the same as the program filename.\n\nIn the example, the `Person` class must be declared in a program file named **Person.java**.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5e66a9fcd4d12f0012ce1716","language":"java","text":"public class Person {\n \n public static void main(String[] args) {\n \n System.out.println(\"I am a person, not a computer.\");\n \n }\n \n}"}]}],"tracks":[{"__typename":"Track","released":true,"id":"8149b07e106bb4b49aad31a6432bf648","slug":"java-introduction","title":"Intro to Java","lessonCount":5,"contentModuleIds":["741a44e4f6fb05796c3d2d91f8ce8b40","18fb3210703babdadf6d27ddca38397f","7314c41b239a4b86a62fa5deca6d7e61"],"grantsCertificate":true,"enrollmentStatus":"none","pro":false,"shortDescription":"Get started with Java by learning about the basics of a Java program and variables!","difficulty":"Beginner","metrics":{"__typename":"TrackMetricsType","medianDurationHours":5.84}},{"__typename":"Track","released":false,"id":"d13e6d49ba0a7b60949ae3ec306f68d0","slug":"apcs-writing-your-first-java-program","title":"Writing Your First Java Program","lessonCount":3,"contentModuleIds":["33e89be947569df19e916e684435f7b3","741a44e4f6fb05796c3d2d91f8ce8b40","18fb3210703babdadf6d27ddca38397f"],"grantsCertificate":true,"enrollmentStatus":"none","pro":false,"shortDescription":"Welcome to the start of your journey with Java! In this track, we'll learn what Java is and write our first program!","difficulty":"Beginner","metrics":{"__typename":"TrackMetricsType","medianDurationHours":null}}],"paths":[{"__typename":"Path","released":true,"id":"5fc508b822eca90012fb25eb","slug":"ap-computer-science-a","goal":"skill","title":"Study for the AP Computer Science A Exam (Java)","lessonCount":23,"trackCount":8,"enrollmentStatus":"none","shortDescription":"Master the core concepts covered in AP Computer Science A Exam and gain a solid understanding of programming and fluency in Java.","difficulty":"Beginner","metrics":{"__typename":"PathMetricsType","medianDurationHours":19.34}}]},"reviewCards":[{"id":"5cb1bdad5f1de87da04f6fa3","title":"Print Line","body":"`System.out.println()` can print to the console:\n\n- `System` is a class from the core library provided by Java\n- `out` is an object that controls the output\n- `println()` is a method associated with that object that receives a single argument","images":[],"codeSnippets":[{"id":"5e63f2aadc672d0012e13250","language":"java","text":"System.out.println(\"Hello, world!\");\n// Output: Hello, world!"}]},{"id":"5caed8435f1de87dfd4f669c","title":"Comments","body":"Comments are bits of text that are ignored by the compiler. They are used to increase the readability of a program.\n\n- Single line comments are created by using `//`.\n- Multi-line comments are created by starting with `/*` and ending with `*/`.","images":[],"codeSnippets":[{"id":"5e63f315156cc50011ae937a","language":"java","text":"// I am a single line comment!\n\n/*\nAnd I am a \nmulti-line comment!\n*/"}]},{"id":"5cb1c08037090210c3df3fc8","title":"Compiling Java","body":"In Java, when we compile a program, each individual class is converted into a **.class** file, which is known as byte code.\n\nThe JVM (Java virtual machine) is used to run the byte code.","images":[],"codeSnippets":[{"id":"5e66aa3e52c5800013f423a6","language":"shell","text":"# Compile the class file:\njavac hello.java\n\n# Execute the compiled file:\njava hello"}]},{"id":"5cb583c05f1de84ea127bd4d","title":"Whitespace","body":"Whitespace, including spaces and newlines, between statements is ignored.","images":[],"codeSnippets":[{"id":"5e66aa4bace3bf0013b2ccb6","language":"java","text":"System.out.println(\"Example of a statement\");\n\nSystem.out.println(\"Another statement\");\n\n// Output:\n// Example of a statement\n// Another statement"}]},{"id":"5caf01055f1de87e174f66a8","title":"Statements","body":"In Java, a statement is a line of code that executes a task and is terminated with a `;`.","images":[],"codeSnippets":[{"id":"5e63f3870b0cde001133a2d5","language":"java","text":"System.out.println(\"Java Programming ☕️\");"}]},{"id":"5cb049bfaf246d2132f2a832","title":"`main()` Method","body":"In Java, every application must contain a `main()` method, which is the entry point for the application. All other methods are invoked from the `main()` method.\n\nThe signature of the method is `public static void main(String[] args) { }`. It accepts a single argument: an array of elements of type `String`.","images":[],"codeSnippets":[{"id":"5e63f3317fe10c00129c3c75","language":"java","text":"public class Person {\n \n public static void main(String[] args) {\n \n System.out.println(\"Hello, world!\");\n\n }\n \n}"}]},{"id":"5fca4de002cf4800121db68a","title":"Computing Systems \u0026 Personal Security","body":"Using a user's personal data can create unique and personalized online experiences for use; however, there is a risk to personal privacy when collecting and storing personal data in a program.","images":[],"codeSnippets":[]},{"id":"5fca50f618b7770012bae5ff","title":"Computing Systems \u0026 Ethical and Social Impacts","body":"Programs have had both positive and negative ethical and social impacts on society. Some examples of this include:\n* Machine learning: While there are positives to pattern identification and automation, there is a problem with data bias and its impact on marginalized communities.\n* AI: For example, should a driverless car make choices that protect the life of the passenger over the life of another driver or a pedestrian?","images":[],"codeSnippets":[]},{"id":"5cae10fd3709023b3b950604","title":"Classes","body":"A _class_ represents a single concept.\n\nA Java program must have one class whose name is the same as the program filename.\n\nIn the example, the `Person` class must be declared in a program file named **Person.java**.","images":[],"codeSnippets":[{"id":"5e66a9fcd4d12f0012ce1716","language":"java","text":"public class Person {\n \n public static void main(String[] args) {\n \n System.out.println(\"I am a person, not a computer.\");\n \n }\n \n}"}]}],"relatedContent":[{"id":"8149b07e106bb4b49aad31a6432bf648","slug":"java-introduction","urlPath":"/learn/java-introduction","title":"Intro to Java","lessonCount":5,"contentModuleIds":["741a44e4f6fb05796c3d2d91f8ce8b40","18fb3210703babdadf6d27ddca38397f","7314c41b239a4b86a62fa5deca6d7e61"],"grantsCertificate":true,"enrollmentStatus":"none","shortDescription":"Get started with Java by learning about the basics of a Java program and variables!","difficulty":"Beginner","pro":false,"timeToComplete":6,"type":"course"},{"id":"5fc508b822eca90012fb25eb","slug":"ap-computer-science-a","urlPath":"/learn/paths/ap-computer-science-a","imageUrl":"https://static-assets.codecademy.com/components/curriculum/path/ap-computer-science-a/curriculum-card.svg","goal":"skill","title":"Study for the AP Computer Science A Exam (Java)","lessonCount":23,"courseCount":8,"enrollmentStatus":"none","shortDescription":"Master the core concepts covered in AP Computer Science A Exam and gain a solid understanding of programming and fluency in Java.","difficulty":"Beginner","timeToComplete":19,"hasCareerJourney":false,"type":"path"}],"pathSlug":"ap-computer-science-a","__NEXTJS_CONTEXT__":{"cookie":null,"isPreview":false}},"__N_SSG":true},"page":"/learn/paths/[pathSlug]/tracks/[courseSlug]/modules/[moduleSlug]/cheatsheet","query":{"pathSlug":"ap-computer-science-a","courseSlug":"apcs-writing-your-first-java-program","moduleSlug":"apcs-hello-world"},"buildId":"portal-app-10b4a003571504fb0cc6f52c5fa4b3ba2701e379","assetPrefix":"/_portal","isFallback":false,"isExperimentalCompile":false,"gsp":true,"scriptLoader":[]}</script>

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
