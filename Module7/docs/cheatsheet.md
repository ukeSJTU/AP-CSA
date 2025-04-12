# A Deeper Dive Into Classes: Access, Encapsulation, and Static Methods Cheatsheet | Codecademy

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

# Access, Encapsulation, and Static Methods

Print Cheatsheet

Share

## Topics

-   [String Methods](/learn/paths/ap-computer-science-a/tracks/apcs-a-deeper-dive-into-classes/modules/apcs-string-methods/cheatsheet)
-   Access, Encapsulation, and Static Methods

### The static Keyword

Static methods and variables are declared as static by using the `static` keyword upon declaration.

public class ATM{

// Static variables

public static int totalMoney \= 0;

public static int numATMs \= 0;

// A static method

public static void averageMoney(){

    System.out.println(totalMoney / numATMs);

}

to clipboard

### Static Methods and Variables

Static methods and variables are associated with the class as a whole, not objects of the class. Both are used by using the name of the class followed by the `.` operator.

public class ATM{

// Static variables

public static int totalMoney \= 0;

public static int numATMs \= 0;

// A static method

public static void averageMoney(){

    System.out.println(totalMoney / numATMs);

}

public static void main(String\[\] args){

    //Accessing a static variable

    System.out.println("Total number of ATMs: " + ATM.numATMs);

    // Calling a static method

    ATM.averageMoney();

}

}

to clipboard

### Static Methods with Instance Variables

Static methods cannot access or change the values of instance variables.

class ATM{

// Static variables

public static int totalMoney \= 0;

public static int numATMs \= 0;

public int money \= 1;

// A static method

public static void averageMoney(){

    // Can not use this.money here because a static method can't access instance variables

}

}

to clipboard

### Methods with Static Variables

Both non-static and static methods can access or change the values of static variables.

class ATM{

// Static variables

public static int totalMoney \= 0;

public static int numATMs \= 0;

public int money \= 1;

// A static method interacting with a static variable

public static void staticMethod(){

    totalMoney += 1;

}

// A non-static method interactingwith a static variable

public void nonStaticMethod(){

    totalMoney += 1;

}

}

to clipboard

### Static Methods and the this Keyword

Static methods do not have a `this` reference and are therefore unable to use the class’s instance variables or call non-static methods.

public class DemoClass{

public int demoVariable \= 5;

public void demoNonStaticMethod(){

}

public static void demoStaticMethod(){

    // Can't use "this.demoVariable" or "this.demoNonStaticMethod()"

}

}

to clipboard

### The public and private keywords

In Java, the keywords `public` and `private` define the access of classes, instance variables, constructors, and methods.

`private` restricts access to only the class that declared the structure, while `public` allows for access from any class.

### Encapsulation

Encapsulation is a technique used to keep implementation details hidden from other classes. Its aim is to create small bundles of logic.

### The private Keyword

In Java, instance variables are encapsulated by using the `private` keyword. This prevents other classes from directly accessing these variables.

public class CheckingAccount{

// Three private instance variables

private String name;

private int balance;

private String id;

}

to clipboard

### Accessor Methods

In Java, accessor methods return the value of a `private` variable. This gives other classes access to that value stored in that variable. without having direct access to the variable itself.

Accessor methods take no parameters and have a return type that matches the type of the variable they are accessing.

public class CheckingAccount{

private int balance;

//An accessor method

public int getBalance(){

    return this.balance;

}

}

to clipboard

### Mutator Methods

In Java, mutator methods reset the value of a `private` variable. This gives other classes the ability to modify the value stored in that variable without having direct access to the variable itself.

Mutator methods take one parameter whose type matches the type of the variable it is modifying. Mutator methods usually don’t return anything.

public class CheckingAccount{

private int balance;

//A mutator method

public void setBalance(int newBalance){

    this.balance \= newBalance;

}

}

to clipboard

### Local Variables

In Java, local variables can only be used within the scope that they were defined in. This scope is often defined by a set of curly brackets. Variables can’t be used outside of those brackets.

public void exampleMethod(int exampleVariable){

// exampleVariable can only be used inside these curly brackets.

}

to clipboard

### The this Keyword with Variables

In Java, the `this` keyword can be used to designate the difference between instance variables and local variables. Variables with `this.` reference an instance variable.

public class Dog{

public String name;

public void speak(String name){

    // Prints the instance variable named name

    System.out.println(this.name);

    // Prints the local variable named name

    System.out.println(name);

}

}

to clipboard

### The this Keyword with Methods

In Java, the `this` keyword can be used to call methods when writing classes.

public class ExampleClass{

public void exampleMethodOne(){

    System.out.println("Hello");

}

public void exampleMethodTwo(){

    //Calling a method using this.

    this.exampleMethodOne();

    System.out.println("There");

}

}

to clipboard

[

Previous

](/learn/paths/ap-computer-science-a/tracks/apcs-a-deeper-dive-into-classes/modules/apcs-string-methods/cheatsheet)

Print Cheatsheet

Share

## Learn more on Codecademy

-   [

    Free course

    ### Learn Java: Classes, Methods, Inheritance, and Polymorphism

    Take a deeper look into Java classes and methods and learn the basics of encapsulation.

    Checker Dense

    **Beginner** Friendly

    **4** hours

    ![](https://static-assets.codecademy.com/Courses/Course-Cards/pillars.svg)

    ](/learn/learn-java-classes-and-methods)

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

<script id="__NEXT_DATA__" type="application/json">{"props":{"pageProps":{"course":{"__typename":"Track","id":"a31fbcb120a5ccef31e8ccc6c64b1ce3","slug":"apcs-a-deeper-dive-into-classes","title":"A Deeper Dive Into Classes","contentModules":[{"__typename":"ContentModule","id":"d4bdce5505f5358f3fefe0193624d403","slug":"apcs-string-methods","title":"String Methods"},{"__typename":"ContentModule","id":"afa66e73343f576900bfd3c0f7a49182","slug":"apcs-access-encapsulation-and-static-methods","title":"Access, Encapsulation, and Static Methods"}]},"module":{"__typename":"ContentModule","id":"afa66e73343f576900bfd3c0f7a49182","slug":"apcs-access-encapsulation-and-static-methods","title":"Access, Encapsulation, and Static Methods","reviewCards":[{"__typename":"ReviewCard","id":"5fd0e494de8d6a0012afc1df","title":"The static Keyword","body":"Static methods and variables are declared as static by using the `static` keyword upon declaration.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fd0e4b909ca190012c64355","language":"java","text":"public class ATM{\n // Static variables\n public static int totalMoney = 0;\n public static int numATMs = 0;\n\n // A static method\n public static void averageMoney(){\n System.out.println(totalMoney / numATMs);\n }"}]},{"__typename":"ReviewCard","id":"5fd0e4ec09ca190012c6435b","title":"Static Methods and Variables","body":"Static methods and variables are associated with the class as a whole, not objects of the class. Both are used by using the name of the class followed by the `.` operator.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fd0e5122ed824001227f7bd","language":"java","text":"public class ATM{\n // Static variables\n public static int totalMoney = 0;\n public static int numATMs = 0;\n\n // A static method\n public static void averageMoney(){\n System.out.println(totalMoney / numATMs);\n }\n\n public static void main(String[] args){\n\n //Accessing a static variable\n System.out.println(\"Total number of ATMs: \" + ATM.numATMs); \n\n // Calling a static method\n ATM.averageMoney();\n }\n\n}"}]},{"__typename":"ReviewCard","id":"5fd0e53c2ed824001227f7c4","title":"Static Methods with Instance Variables","body":"Static methods cannot access or change the values of instance variables.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fd0e57292a1120012249fc9","language":"java","text":"class ATM{\n// Static variables\n public static int totalMoney = 0;\n public static int numATMs = 0; \n\n public int money = 1;\n\n // A static method\n public static void averageMoney(){\n // Can not use this.money here because a static method can't access instance variables\n }\n\n}"}]},{"__typename":"ReviewCard","id":"5fd0e59f92a1120012249fd1","title":"Methods with Static Variables","body":"Both non-static and static methods can access or change the values of static variables.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fd0e5cd92a1120012249fe3","language":"java","text":"class ATM{\n// Static variables \n public static int totalMoney = 0; \n public static int numATMs = 0; \n public int money = 1;\n\n // A static method interacting with a static variable \n public static void staticMethod(){ \n totalMoney += 1;\n } \n\n // A non-static method interactingwith a static variable \n public void nonStaticMethod(){\n totalMoney += 1; \n } \n}"}]},{"__typename":"ReviewCard","id":"5fd0e60a391f52001269b284","title":"Static Methods and the this Keyword","body":"Static methods do not have a `this` reference and are therefore unable to use the class’s instance variables or call non-static methods.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fd0e62f21661d001295cd4c","language":"java","text":"public class DemoClass{\n\n public int demoVariable = 5;\n\n public void demoNonStaticMethod(){\n \n }\n public static void demoStaticMethod(){\n // Can't use \"this.demoVariable\" or \"this.demoNonStaticMethod()\"\n }\n}"}]},{"__typename":"ReviewCard","id":"5fd0e06409ca1900125f5baa","title":"The public and private keywords","body":"In Java, the keywords `public` and `private` define the access of classes, instance variables, constructors, and methods.\n\n`private` restricts access to only the class that declared the structure, while `public` allows for access from any class.","images":[],"codeSnippets":[]},{"__typename":"ReviewCard","id":"5fd0e0adaaed170012269794","title":"Encapsulation","body":"Encapsulation is a technique used to keep implementation details hidden from other classes. Its aim is to create small bundles of logic.","images":[],"codeSnippets":[]},{"__typename":"ReviewCard","id":"5fd0e0efaaed1700122697a5","title":"The private Keyword","body":"In Java, instance variables are encapsulated by using the `private` keyword. This prevents other classes from directly accessing these variables.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fd0e1191300bc0013d8e40a","language":"java","text":"public class CheckingAccount{\n // Three private instance variables\n private String name;\n private int balance;\n private String id;\n}"}]},{"__typename":"ReviewCard","id":"5fd0e14b2b2efb0012779399","title":"Accessor Methods","body":"In Java, accessor methods return the value of a `private` variable. This gives other classes access to that value stored in that variable. without having direct access to the variable itself.\n\nAccessor methods take no parameters and have a return type that matches the type of the variable they are accessing.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fd0e179fdfab70012d80e90","language":"java","text":"public class CheckingAccount{\n private int balance;\n \n //An accessor method\n public int getBalance(){\n return this.balance;\n }\n}"}]},{"__typename":"ReviewCard","id":"5fd0e19e2b2efb00127793a1","title":"Mutator Methods","body":"In Java, mutator methods reset the value of a `private` variable. This gives other classes the ability to modify the value stored in that variable without having direct access to the variable itself. \n\nMutator methods take one parameter whose type matches the type of the variable it is modifying. Mutator methods usually don't return anything.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fd0e1c21300bc0013d8e411","language":"java","text":"public class CheckingAccount{\n private int balance;\n \n //A mutator method\n public void setBalance(int newBalance){\n this.balance = newBalance;\n }\n}"}]},{"__typename":"ReviewCard","id":"5fd0e1e9aaed1700122697af","title":"Local Variables","body":"In Java, local variables can only be used within the scope that they were defined in. This scope is often defined by a set of curly brackets. Variables can't be used outside of those brackets.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fd0e207fdfab70012d80ea5","language":"java","text":"public void exampleMethod(int exampleVariable){\n // exampleVariable can only be used inside these curly brackets.\n}"}]},{"__typename":"ReviewCard","id":"5fd0e2312b2efb00127793ab","title":"The this Keyword with Variables","body":"In Java, the `this` keyword can be used to designate the difference between instance variables and local variables. Variables with `this.` reference an instance variable.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fd0e253aaed1700122697bc","language":"java","text":"public class Dog{\n public String name;\n\n public void speak(String name){\n // Prints the instance variable named name\n System.out.println(this.name);\n\n // Prints the local variable named name\n System.out.println(name);\n }\n}"}]},{"__typename":"ReviewCard","id":"5fd0e2792ed824001227f7b0","title":"The this Keyword with Methods","body":"In Java, the `this` keyword can be used to call methods when writing classes.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fd0e2e2aaed1700122697c5","language":"java","text":"public class ExampleClass{\n public void exampleMethodOne(){\n System.out.println(\"Hello\");\n }\n\n public void exampleMethodTwo(){\n //Calling a method using this.\n this.exampleMethodOne();\n System.out.println(\"There\");\n }\n}"}]}],"tracks":[{"__typename":"Track","released":false,"id":"a31fbcb120a5ccef31e8ccc6c64b1ce3","slug":"apcs-a-deeper-dive-into-classes","title":"A Deeper Dive Into Classes","lessonCount":3,"contentModuleIds":["d4bdce5505f5358f3fefe0193624d403","afa66e73343f576900bfd3c0f7a49182"],"grantsCertificate":true,"enrollmentStatus":"none","pro":false,"shortDescription":"Take a deeper look at how classes work in Java. Explore String methods as well as some of the more advanced features of your own classes.","difficulty":"Beginner","metrics":{"__typename":"TrackMetricsType","medianDurationHours":null}},{"__typename":"Track","released":true,"id":"02c8c9f4eed7545e0b4cc37a785ae026","slug":"learn-java-classes-and-methods","title":"Learn Java: Classes, Methods, Inheritance, and Polymorphism","lessonCount":4,"contentModuleIds":["39bd41a73209fcc6c02a2db2b6c91815","afa66e73343f576900bfd3c0f7a49182","19fa29e05cb6449980567c8f96a25862"],"grantsCertificate":true,"enrollmentStatus":"none","pro":false,"shortDescription":"Take a deeper look into Java classes and methods and learn the basics of encapsulation.","difficulty":"Beginner","metrics":{"__typename":"TrackMetricsType","medianDurationHours":3.85}}],"paths":[{"__typename":"Path","released":true,"id":"5fc508b822eca90012fb25eb","slug":"ap-computer-science-a","goal":"skill","title":"Study for the AP Computer Science A Exam (Java)","lessonCount":23,"trackCount":8,"enrollmentStatus":"none","shortDescription":"Master the core concepts covered in AP Computer Science A Exam and gain a solid understanding of programming and fluency in Java.","difficulty":"Beginner","metrics":{"__typename":"PathMetricsType","medianDurationHours":19.34}}]},"reviewCards":[{"id":"5fd0e494de8d6a0012afc1df","title":"The static Keyword","body":"Static methods and variables are declared as static by using the `static` keyword upon declaration.","images":[],"codeSnippets":[{"id":"5fd0e4b909ca190012c64355","language":"java","text":"public class ATM{\n // Static variables\n public static int totalMoney = 0;\n public static int numATMs = 0;\n\n // A static method\n public static void averageMoney(){\n System.out.println(totalMoney / numATMs);\n }"}]},{"id":"5fd0e4ec09ca190012c6435b","title":"Static Methods and Variables","body":"Static methods and variables are associated with the class as a whole, not objects of the class. Both are used by using the name of the class followed by the `.` operator.","images":[],"codeSnippets":[{"id":"5fd0e5122ed824001227f7bd","language":"java","text":"public class ATM{\n // Static variables\n public static int totalMoney = 0;\n public static int numATMs = 0;\n\n // A static method\n public static void averageMoney(){\n System.out.println(totalMoney / numATMs);\n }\n\n public static void main(String[] args){\n\n //Accessing a static variable\n System.out.println(\"Total number of ATMs: \" + ATM.numATMs); \n\n // Calling a static method\n ATM.averageMoney();\n }\n\n}"}]},{"id":"5fd0e53c2ed824001227f7c4","title":"Static Methods with Instance Variables","body":"Static methods cannot access or change the values of instance variables.","images":[],"codeSnippets":[{"id":"5fd0e57292a1120012249fc9","language":"java","text":"class ATM{\n// Static variables\n public static int totalMoney = 0;\n public static int numATMs = 0; \n\n public int money = 1;\n\n // A static method\n public static void averageMoney(){\n // Can not use this.money here because a static method can't access instance variables\n }\n\n}"}]},{"id":"5fd0e59f92a1120012249fd1","title":"Methods with Static Variables","body":"Both non-static and static methods can access or change the values of static variables.","images":[],"codeSnippets":[{"id":"5fd0e5cd92a1120012249fe3","language":"java","text":"class ATM{\n// Static variables \n public static int totalMoney = 0; \n public static int numATMs = 0; \n public int money = 1;\n\n // A static method interacting with a static variable \n public static void staticMethod(){ \n totalMoney += 1;\n } \n\n // A non-static method interactingwith a static variable \n public void nonStaticMethod(){\n totalMoney += 1; \n } \n}"}]},{"id":"5fd0e60a391f52001269b284","title":"Static Methods and the this Keyword","body":"Static methods do not have a `this` reference and are therefore unable to use the class’s instance variables or call non-static methods.","images":[],"codeSnippets":[{"id":"5fd0e62f21661d001295cd4c","language":"java","text":"public class DemoClass{\n\n public int demoVariable = 5;\n\n public void demoNonStaticMethod(){\n \n }\n public static void demoStaticMethod(){\n // Can't use \"this.demoVariable\" or \"this.demoNonStaticMethod()\"\n }\n}"}]},{"id":"5fd0e06409ca1900125f5baa","title":"The public and private keywords","body":"In Java, the keywords `public` and `private` define the access of classes, instance variables, constructors, and methods.\n\n`private` restricts access to only the class that declared the structure, while `public` allows for access from any class.","images":[],"codeSnippets":[]},{"id":"5fd0e0adaaed170012269794","title":"Encapsulation","body":"Encapsulation is a technique used to keep implementation details hidden from other classes. Its aim is to create small bundles of logic.","images":[],"codeSnippets":[]},{"id":"5fd0e0efaaed1700122697a5","title":"The private Keyword","body":"In Java, instance variables are encapsulated by using the `private` keyword. This prevents other classes from directly accessing these variables.","images":[],"codeSnippets":[{"id":"5fd0e1191300bc0013d8e40a","language":"java","text":"public class CheckingAccount{\n // Three private instance variables\n private String name;\n private int balance;\n private String id;\n}"}]},{"id":"5fd0e14b2b2efb0012779399","title":"Accessor Methods","body":"In Java, accessor methods return the value of a `private` variable. This gives other classes access to that value stored in that variable. without having direct access to the variable itself.\n\nAccessor methods take no parameters and have a return type that matches the type of the variable they are accessing.","images":[],"codeSnippets":[{"id":"5fd0e179fdfab70012d80e90","language":"java","text":"public class CheckingAccount{\n private int balance;\n \n //An accessor method\n public int getBalance(){\n return this.balance;\n }\n}"}]},{"id":"5fd0e19e2b2efb00127793a1","title":"Mutator Methods","body":"In Java, mutator methods reset the value of a `private` variable. This gives other classes the ability to modify the value stored in that variable without having direct access to the variable itself. \n\nMutator methods take one parameter whose type matches the type of the variable it is modifying. Mutator methods usually don't return anything.","images":[],"codeSnippets":[{"id":"5fd0e1c21300bc0013d8e411","language":"java","text":"public class CheckingAccount{\n private int balance;\n \n //A mutator method\n public void setBalance(int newBalance){\n this.balance = newBalance;\n }\n}"}]},{"id":"5fd0e1e9aaed1700122697af","title":"Local Variables","body":"In Java, local variables can only be used within the scope that they were defined in. This scope is often defined by a set of curly brackets. Variables can't be used outside of those brackets.","images":[],"codeSnippets":[{"id":"5fd0e207fdfab70012d80ea5","language":"java","text":"public void exampleMethod(int exampleVariable){\n // exampleVariable can only be used inside these curly brackets.\n}"}]},{"id":"5fd0e2312b2efb00127793ab","title":"The this Keyword with Variables","body":"In Java, the `this` keyword can be used to designate the difference between instance variables and local variables. Variables with `this.` reference an instance variable.","images":[],"codeSnippets":[{"id":"5fd0e253aaed1700122697bc","language":"java","text":"public class Dog{\n public String name;\n\n public void speak(String name){\n // Prints the instance variable named name\n System.out.println(this.name);\n\n // Prints the local variable named name\n System.out.println(name);\n }\n}"}]},{"id":"5fd0e2792ed824001227f7b0","title":"The this Keyword with Methods","body":"In Java, the `this` keyword can be used to call methods when writing classes.","images":[],"codeSnippets":[{"id":"5fd0e2e2aaed1700122697c5","language":"java","text":"public class ExampleClass{\n public void exampleMethodOne(){\n System.out.println(\"Hello\");\n }\n\n public void exampleMethodTwo(){\n //Calling a method using this.\n this.exampleMethodOne();\n System.out.println(\"There\");\n }\n}"}]}],"relatedContent":[{"id":"02c8c9f4eed7545e0b4cc37a785ae026","slug":"learn-java-classes-and-methods","urlPath":"/learn/learn-java-classes-and-methods","title":"Learn Java: Classes, Methods, Inheritance, and Polymorphism","lessonCount":4,"contentModuleIds":["39bd41a73209fcc6c02a2db2b6c91815","afa66e73343f576900bfd3c0f7a49182","19fa29e05cb6449980567c8f96a25862"],"grantsCertificate":true,"enrollmentStatus":"none","shortDescription":"Take a deeper look into Java classes and methods and learn the basics of encapsulation.","difficulty":"Beginner","pro":false,"timeToComplete":4,"type":"course"},{"id":"5fc508b822eca90012fb25eb","slug":"ap-computer-science-a","urlPath":"/learn/paths/ap-computer-science-a","imageUrl":"https://static-assets.codecademy.com/components/curriculum/path/ap-computer-science-a/curriculum-card.svg","goal":"skill","title":"Study for the AP Computer Science A Exam (Java)","lessonCount":23,"courseCount":8,"enrollmentStatus":"none","shortDescription":"Master the core concepts covered in AP Computer Science A Exam and gain a solid understanding of programming and fluency in Java.","difficulty":"Beginner","timeToComplete":19,"hasCareerJourney":false,"type":"path"}],"pathSlug":"ap-computer-science-a","__NEXTJS_CONTEXT__":{"cookie":null,"isPreview":false}},"__N_SSG":true},"page":"/learn/paths/[pathSlug]/tracks/[courseSlug]/modules/[moduleSlug]/cheatsheet","query":{"pathSlug":"ap-computer-science-a","courseSlug":"apcs-a-deeper-dive-into-classes","moduleSlug":"apcs-access-encapsulation-and-static-methods"},"buildId":"portal-app-10b4a003571504fb0cc6f52c5fa4b3ba2701e379","assetPrefix":"/_portal","isFallback":false,"isExperimentalCompile":false,"gsp":true,"scriptLoader":[]}</script>

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
