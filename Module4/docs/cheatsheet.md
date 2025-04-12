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

## Learn more on Codecademy

-   [

    Free course

    ### Learn Java: Object-Oriented Programming

    Explore classes and objects in this introduction to object-oriented programming with Java.

    Checker Dense

    **Beginner** Friendly

    **3** hours

    ![](https://static-assets.codecademy.com/Courses/Course-Cards/pillars.svg)

    ](/learn/learn-java-object-oriented-programming)

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

<script id="__NEXT_DATA__" type="application/json">{"props":{"pageProps":{"course":{"__typename":"Track","id":"1fcc3fca6b8eec542f989d3b5a46e333","slug":"apcs-object-oriented-programming","title":"Object-Oriented Programming","contentModules":[{"__typename":"ContentModule","id":"b9b510f8b924bb413dc0c9397046d237","slug":"apcs-what-are-classes-objects-and-methods","title":"What Are Classes, Objects, and Methods?"},{"__typename":"ContentModule","id":"34d78465d55ddded3e3b129c58d55e12","slug":"apcs-using-built-in-classes","title":"Using Built-In Classes"}]},"module":{"__typename":"ContentModule","id":"34d78465d55ddded3e3b129c58d55e12","slug":"apcs-using-built-in-classes","title":"Using Built-In Classes","reviewCards":[{"__typename":"ReviewCard","id":"5fd079d96d67be001316daf5","title":"Autoboxing Primitive Types","body":"Autoboxing is the automatic conversion that the Java compiler makes between primitive types and their corresponding object wrapper classes. This includes converting an `int` to an `Integer` and a `double` to a `Double`.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fd07a2321661d0012856458","language":"java","text":"// These are all examples of autoboxing\nDouble wrapper1 = 23.456;\nInteger wrapper2 = 3;\nDouble wrapper3 = new Double(13.57);\nInteger wrapper4 = new Integer(7);\nDouble wrapper5 = Double.valueOf(30.59);\nInteger wrapper6 = Integer.valueOf(15);"}]},{"__typename":"ReviewCard","id":"5fd07a6821661d0012856460","title":"Unboxing Wrapper Classes","body":"Unboxing is the automatic conversion that the Java compiler makes from the wrapper class to the primitive type. This includes converting an `Integer` to an `int` and a `Double` to a `double`.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fd07a9a2957060013cfebfa","language":"java","text":"Integer IntegerWrapper = new Integer(7);\n\n// Examples of an Integer getting unboxed to an int\nint primitiveInt = IntegerWapper;\nint primitiveInt2 = IntegerWrapper.intValue();"}]},{"__typename":"ReviewCard","id":"5fd07ae22957060013cfec02","title":"Integer and Double Wrapper Classes","body":"The `Integer` class and `Double` class are part of the `java.lang package`. They are used as a wrapper class to allow primitive `int` and `double` values to be used by methods that require Objects.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fd07b07e6e5fa0012a2c4d2","language":"java","text":"// Primitives\nint a = 5;\ndouble b = 2.5;\n\n// Wrapper Objects\nInteger c = 7;\nDouble d = 10.2;"}]},{"__typename":"ReviewCard","id":"5fd07b5eaaed1700122695bd","title":"Integer and Double Static Fields","body":"The `Integer` and `Double` classes have important static fields named `Integer.MAX_VALUE`, `Integer.MIN_VALUE`, `Double.POSITIVE_INFINITY`, and `Double.NEGATIVE_INFINITY`. These can be used to find the largest and smallest `Integer` values that Java can store as well as represent the concept of infinity.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fd07b83fdfab70012d80d0f","language":"java","text":"Integer wrapperIntMax = Integer.MAX_VALUE;\nInteger wrapperIntMin = Integer.MIN_VALUE;\nDouble inf = Double.POSITIVE_INFINITY;\nDouble negInf = Double.NEGATIVE_INFINITY;"}]},{"__typename":"ReviewCard","id":"5fca52d202cf4800121db698","title":"Static Methods","body":"Static methods are methods that can be called within a program without creating an object of the class.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fca539a02cf4800121db6a4","language":"java","text":"// static method\npublic static int getTotal(int a, int b) {\n return a + b;\n}\n\npublic static void main(String[] args) {\n int x = 3;\n int y = 2;\n System.out.println(getTotal(x,y)); // Prints: 5\n}"}]},{"__typename":"ReviewCard","id":"5fca547f9c79c30012a1f00c","title":"Calling a Static Method","body":"Static methods can be called by appending the dot operator to a class name followed by the name of the method.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fca553e9b1e2c0013a6ddba","language":"java","text":"int largerNumber = Math.max(3, 10); // Call static method\nSystem.out.println(largerNumber); // Prints: 10\n"}]},{"__typename":"ReviewCard","id":"5fca57fb1519a60013f1caa3","title":"The Math Class","body":"The `Math` class (which is part of the java.lang package) contains a variety of static methods that can be used to perform numerical calculations.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fca59749077660012ace684","language":"java","text":"System.out.println(Math.abs(-7.0)); // Prints: 7\n\nSystem.out.println(Math.pow(5, 3)); // Prints: 125.0\n\nSystem.out.println(Math.sqrt(52)); // Prints: 7.211102550927978"}]}],"tracks":[{"__typename":"Track","released":false,"id":"1fcc3fca6b8eec542f989d3b5a46e333","slug":"apcs-object-oriented-programming","title":"Object-Oriented Programming","lessonCount":2,"contentModuleIds":["b9b510f8b924bb413dc0c9397046d237","34d78465d55ddded3e3b129c58d55e12"],"grantsCertificate":true,"enrollmentStatus":"none","pro":false,"shortDescription":"Learn how to write object-oriented programs by building your own classes. Then take a look at some of the most common built-in Java classes.","difficulty":"Beginner","metrics":{"__typename":"TrackMetricsType","medianDurationHours":null}},{"__typename":"Track","released":true,"id":"23a06f0af71448c0a2ed456d6191e11e","slug":"learn-java-object-oriented-programming","title":"Learn Java: Object-Oriented Programming","lessonCount":2,"contentModuleIds":["3026801be873685465b0bc8113b970a2","34d78465d55ddded3e3b129c58d55e12"],"grantsCertificate":true,"enrollmentStatus":"none","pro":false,"shortDescription":"Explore classes and objects in this introduction to object-oriented programming with Java.","difficulty":"Beginner","metrics":{"__typename":"TrackMetricsType","medianDurationHours":3.08}}],"paths":[{"__typename":"Path","released":true,"id":"5fc508b822eca90012fb25eb","slug":"ap-computer-science-a","goal":"skill","title":"Study for the AP Computer Science A Exam (Java)","lessonCount":23,"trackCount":8,"enrollmentStatus":"none","shortDescription":"Master the core concepts covered in AP Computer Science A Exam and gain a solid understanding of programming and fluency in Java.","difficulty":"Beginner","metrics":{"__typename":"PathMetricsType","medianDurationHours":19.34}}]},"reviewCards":[{"id":"5fd079d96d67be001316daf5","title":"Autoboxing Primitive Types","body":"Autoboxing is the automatic conversion that the Java compiler makes between primitive types and their corresponding object wrapper classes. This includes converting an `int` to an `Integer` and a `double` to a `Double`.","images":[],"codeSnippets":[{"id":"5fd07a2321661d0012856458","language":"java","text":"// These are all examples of autoboxing\nDouble wrapper1 = 23.456;\nInteger wrapper2 = 3;\nDouble wrapper3 = new Double(13.57);\nInteger wrapper4 = new Integer(7);\nDouble wrapper5 = Double.valueOf(30.59);\nInteger wrapper6 = Integer.valueOf(15);"}]},{"id":"5fd07a6821661d0012856460","title":"Unboxing Wrapper Classes","body":"Unboxing is the automatic conversion that the Java compiler makes from the wrapper class to the primitive type. This includes converting an `Integer` to an `int` and a `Double` to a `double`.","images":[],"codeSnippets":[{"id":"5fd07a9a2957060013cfebfa","language":"java","text":"Integer IntegerWrapper = new Integer(7);\n\n// Examples of an Integer getting unboxed to an int\nint primitiveInt = IntegerWapper;\nint primitiveInt2 = IntegerWrapper.intValue();"}]},{"id":"5fd07ae22957060013cfec02","title":"Integer and Double Wrapper Classes","body":"The `Integer` class and `Double` class are part of the `java.lang package`. They are used as a wrapper class to allow primitive `int` and `double` values to be used by methods that require Objects.","images":[],"codeSnippets":[{"id":"5fd07b07e6e5fa0012a2c4d2","language":"java","text":"// Primitives\nint a = 5;\ndouble b = 2.5;\n\n// Wrapper Objects\nInteger c = 7;\nDouble d = 10.2;"}]},{"id":"5fd07b5eaaed1700122695bd","title":"Integer and Double Static Fields","body":"The `Integer` and `Double` classes have important static fields named `Integer.MAX_VALUE`, `Integer.MIN_VALUE`, `Double.POSITIVE_INFINITY`, and `Double.NEGATIVE_INFINITY`. These can be used to find the largest and smallest `Integer` values that Java can store as well as represent the concept of infinity.","images":[],"codeSnippets":[{"id":"5fd07b83fdfab70012d80d0f","language":"java","text":"Integer wrapperIntMax = Integer.MAX_VALUE;\nInteger wrapperIntMin = Integer.MIN_VALUE;\nDouble inf = Double.POSITIVE_INFINITY;\nDouble negInf = Double.NEGATIVE_INFINITY;"}]},{"id":"5fca52d202cf4800121db698","title":"Static Methods","body":"Static methods are methods that can be called within a program without creating an object of the class.","images":[],"codeSnippets":[{"id":"5fca539a02cf4800121db6a4","language":"java","text":"// static method\npublic static int getTotal(int a, int b) {\n return a + b;\n}\n\npublic static void main(String[] args) {\n int x = 3;\n int y = 2;\n System.out.println(getTotal(x,y)); // Prints: 5\n}"}]},{"id":"5fca547f9c79c30012a1f00c","title":"Calling a Static Method","body":"Static methods can be called by appending the dot operator to a class name followed by the name of the method.","images":[],"codeSnippets":[{"id":"5fca553e9b1e2c0013a6ddba","language":"java","text":"int largerNumber = Math.max(3, 10); // Call static method\nSystem.out.println(largerNumber); // Prints: 10\n"}]},{"id":"5fca57fb1519a60013f1caa3","title":"The Math Class","body":"The `Math` class (which is part of the java.lang package) contains a variety of static methods that can be used to perform numerical calculations.","images":[],"codeSnippets":[{"id":"5fca59749077660012ace684","language":"java","text":"System.out.println(Math.abs(-7.0)); // Prints: 7\n\nSystem.out.println(Math.pow(5, 3)); // Prints: 125.0\n\nSystem.out.println(Math.sqrt(52)); // Prints: 7.211102550927978"}]}],"relatedContent":[{"id":"23a06f0af71448c0a2ed456d6191e11e","slug":"learn-java-object-oriented-programming","urlPath":"/learn/learn-java-object-oriented-programming","title":"Learn Java: Object-Oriented Programming","lessonCount":2,"contentModuleIds":["3026801be873685465b0bc8113b970a2","34d78465d55ddded3e3b129c58d55e12"],"grantsCertificate":true,"enrollmentStatus":"none","shortDescription":"Explore classes and objects in this introduction to object-oriented programming with Java.","difficulty":"Beginner","pro":false,"timeToComplete":3,"type":"course"},{"id":"5fc508b822eca90012fb25eb","slug":"ap-computer-science-a","urlPath":"/learn/paths/ap-computer-science-a","imageUrl":"https://static-assets.codecademy.com/components/curriculum/path/ap-computer-science-a/curriculum-card.svg","goal":"skill","title":"Study for the AP Computer Science A Exam (Java)","lessonCount":23,"courseCount":8,"enrollmentStatus":"none","shortDescription":"Master the core concepts covered in AP Computer Science A Exam and gain a solid understanding of programming and fluency in Java.","difficulty":"Beginner","timeToComplete":19,"hasCareerJourney":false,"type":"path"}],"pathSlug":"ap-computer-science-a","__NEXTJS_CONTEXT__":{"cookie":null,"isPreview":false}},"__N_SSG":true},"page":"/learn/paths/[pathSlug]/tracks/[courseSlug]/modules/[moduleSlug]/cheatsheet","query":{"pathSlug":"ap-computer-science-a","courseSlug":"apcs-object-oriented-programming","moduleSlug":"apcs-using-built-in-classes"},"buildId":"portal-app-10b4a003571504fb0cc6f52c5fa4b3ba2701e379","assetPrefix":"/_portal","isFallback":false,"isExperimentalCompile":false,"gsp":true,"scriptLoader":[]}</script>

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
