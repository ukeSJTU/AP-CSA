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
