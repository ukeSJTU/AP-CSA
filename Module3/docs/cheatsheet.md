# Object-Oriented Programming: What Are Classes, Objects, and Methods? Cheatsheet | Codecademy

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

# What Are Classes, Objects, and Methods?

Print Cheatsheet

Share

## Topics

-   What Are Classes, Objects, and Methods?
-   [Using Built-In Classes](/learn/paths/ap-computer-science-a/tracks/apcs-object-oriented-programming/modules/apcs-using-built-in-classes/cheatsheet)

### Java objects’ state and behavior

In Java, instances of a class are known as objects. Every object has state and behavior in the form of instance fields and methods respectively.

public class Person {

// state of an object

int age;

String name;

// behavior of an object

public void set_value() {

    age \= 20;

    name \= "Robin";

}

public void get_value() {

    System.out.println("Age is " + age);

    System.out.println("Name is " + name);

}

// main method

public static void main(String \[\] args) {

    // creates a new Person object

    Person p \= new Person();

    // changes state through behavior

    p.set\_value();

}

}

to clipboard

### Java instance

Java instances are objects that are based on classes. For example, `Bob` may be an instance of the class `Person`.

Every instance has access to its own set of variables which are known as _instance fields_, which are variables declared within the scope of the instance. Values for instance fields are assigned within the constructor method.

public class Person {

int age;

String name;

// Constructor method

public Person(int age, String name) {

    this.age \= age;

    this.name \= name;

}

public static void main(String\[\] args) {

    Person Bob \= new Person(31, "Bob");

    Person Alice \= new Person(27, "Alice");

}

}

to clipboard

### Java dot notation

In Java programming language, we use `.` to access the variables and methods of an object or a Class.

This is known as _dot notation_ and the structure looks like this-

`instanceOrClassName.fieldOrMethodName`

public class Person {

int age;

public static void main(String \[\] args) {

    Person p \= new Person();

    // here we use dot notation to set age

    p.age \= 20;

    // here we use dot notation to access age and print

    System.out.println("Age is " + p.age);

    // Output: Age is 20

}

}

to clipboard

### Constructor Method in Java

Java classes contain a _constructor_ method which is used to create instances of the class.

The constructor is named after the class. If no constructor is defined, a default empty constructor is used.

public class Maths {

public Maths() {

    System.out.println("I am constructor");

}

public static void main(String \[\] args) {

    System.out.println("I am main");

    Maths obj1 \= new Maths();

}

}

to clipboard

### Creating a new Class instance in Java

In Java, we use the `new` keyword followed by a call to the class constructor in order to create a new _instance_ of a class.

The constructor can be used to provide initial values to instance fields.

public class Person {

int age;

// Constructor:

public Person(int a) {

    age \= a;

}

public static void main(String \[\] args) {

    // Here, we create a new instance of the Person class:

    Person p \= new Person(20);

    System.out.println("Age is " + p.age); // Prints: Age is 20

}

}

to clipboard

### Reference Data Types

A variable with a reference data type has a value that references the memory address of an instance. During variable declaration, the class name is used as the variable’s type.

public class Cat {

public Cat() {

    // instructions for creating a Cat instance

}

public static void main(String\[\] args) {

    // garfield is declared with reference data type \`Cat\`

    Cat garfield \= new Cat();

    System.out.println(garfield); // Prints: Cat@76ed5528

}

}

to clipboard

### Constructor Signatures

A class can contain multiple constructors as long as they have different parameter values. A signature helps the compiler differentiate between the different constructors.

A signature is made up of the constructor’s name and a list of its parameters.

// The signature is \`Cat(String furLength, boolean hasClaws)\`.

public class Cat {

String furType;

boolean containsClaws;

public Cat(String furLength, boolean hasClaws) {

    furType \= furLength;

    containsClaws \= hasClaws;

}

public static void main(String\[\] args) {

    Cat garfield \= new Cat("Long-hair", true);

}

}

to clipboard

### null Values

`null` is a special value that denotes that an object has a void reference.

public class Bear {

String species;

public Bear(String speciesOfBear;) {

    species \= speciesOfBear;

}

public static void main(String\[\] args) {

    Bear baloo \= new Bear("Sloth bear");

    System.out.println(baloo); // Prints: Bear@4517d9a3

    // set object to null

    baloo \= null;

    System.out.println(baloo); // Prints: null

}

}

to clipboard

### The body of a Java method

In Java, we use curly brackets `{}` to enclose the body of a method.

The statements written inside the `{}` are executed when a method is called.

public class Maths {

public static void sum(int a, int b) { // Start of sum

    int result \= a + b;

    System.out.println("Sum is " + result);

} // End of sum

public static void main(String \[\] args) {

    // Here, we call the sum method

    sum(10, 20);

    // Output: Sum is 30

}

}

to clipboard

### Method parameters in Java

In java, parameters are declared in a method definition. The parameters act as variables inside the method and hold the value that was passed in. They can be used inside a method for printing or calculation purposes.

In the example, a and b are two parameters which, when the method is called, hold the value 10 and 20 respectively.

public class Maths {

public int sum(int a, int b) {

    int k \= a + b;

    return k;

}

public static void main(String \[\] args) {

    Maths m \= new Maths();

    int result \= m.sum(10, 20);

    System.out.println("sum is " + result);

    // prints - sum is 30

}

}

to clipboard

### Java Variables Inside a Method

Java variables defined inside a method cannot be used outside the scope of that method.

//For example, \`i\` and \`j\` variables are available in the \`main\` method only:

public class Maths {

public static void main(String \[\] args) {

    int i, j;

    System.out.println("These two variables are available in main method only");

}

}

to clipboard

### Returning info from a Java method

A Java method can return any value that can be saved in a variable. The value returned must match with the return type specified in the method signature.

The value is returned using the `return` keyword.

public class Maths {

// return type is int

public int sum(int a, int b) {

    int k;

    k \= a + b;

    // sum is returned using the return keyword

    return k;

}

public static void main(String \[\] args) {

    Maths m \= new Maths();

    int result;

    result \= m.sum(10, 20);

    System.out.println("Sum is " + result);

    // Output: Sum is 30

}

}

to clipboard

### Declaring a Method

Method declarations should define the following method information: scope (private or public), return type, method name, and any parameters it receives.

// Here is a public method named sum whose return type is int and has two int parameters a and b

public int sum(int a, int b) {

return(a + b);

}

to clipboard

[

Next

](/learn/paths/ap-computer-science-a/tracks/apcs-object-oriented-programming/modules/apcs-using-built-in-classes/cheatsheet)

Print Cheatsheet

Share

## Learn more on Codecademy

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

<script id="__NEXT_DATA__" type="application/json">{"props":{"pageProps":{"course":{"__typename":"Track","id":"1fcc3fca6b8eec542f989d3b5a46e333","slug":"apcs-object-oriented-programming","title":"Object-Oriented Programming","contentModules":[{"__typename":"ContentModule","id":"b9b510f8b924bb413dc0c9397046d237","slug":"apcs-what-are-classes-objects-and-methods","title":"What Are Classes, Objects, and Methods?"},{"__typename":"ContentModule","id":"34d78465d55ddded3e3b129c58d55e12","slug":"apcs-using-built-in-classes","title":"Using Built-In Classes"}]},"module":{"__typename":"ContentModule","id":"b9b510f8b924bb413dc0c9397046d237","slug":"apcs-what-are-classes-objects-and-methods","title":"What Are Classes, Objects, and Methods?","reviewCards":[{"__typename":"ReviewCard","id":"5cb1b24baf246d213ff2af27","title":"Java objects' state and behavior","body":"In Java, instances of a class are known as objects. Every object has state and behavior in the form of instance fields and methods respectively.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5cb4a6be5f1de87dc94f732e","language":"java","text":"public class Person {\n // state of an object\n int age;\n String name;\n \n // behavior of an object\n public void set_value() {\n age = 20;\n name = \"Robin\";\n }\n public void get_value() {\n System.out.println(\"Age is \" + age);\n System.out.println(\"Name is \" + name);\n }\n \n // main method\n public static void main(String [] args) {\n // creates a new Person object\n Person p = new Person(); \n \n // changes state through behavior\n p.set_value();\n }\n}"}]},{"__typename":"ReviewCard","id":"5cb05e905f1de87dd64f6a4f","title":"Java instance","body":"Java instances are objects that are based on classes. For example, `Bob` may be an instance of the class `Person`. \n\nEvery instance has access to its own set of variables which are known as _instance fields_, which are variables declared within the scope of the instance. Values for instance fields are assigned within the constructor method.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5cb3e89637090210dbdf3d3a","language":"java","text":"public class Person {\n int age;\n String name;\n \n // Constructor method\n public Person(int age, String name) {\n this.age = age;\n this.name = name;\n }\n \n public static void main(String[] args) {\n Person Bob = new Person(31, \"Bob\");\n Person Alice = new Person(27, \"Alice\");\n }\n}"}]},{"__typename":"ReviewCard","id":"5cb06776370902109fdf3b18","title":"Java dot notation","body":"In Java programming language, we use `.` to access the variables and methods of an object or a Class.\n\nThis is known as _dot notation_ and the structure looks like this-\n\n`instanceOrClassName.fieldOrMethodName`","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5cb49e00370902109fdf4281","language":"java","text":"public class Person {\n int age;\n \n public static void main(String [] args) {\n Person p = new Person();\n \n // here we use dot notation to set age\n p.age = 20; \n \n // here we use dot notation to access age and print\n System.out.println(\"Age is \" + p.age);\n // Output: Age is 20\n }\n}"}]},{"__typename":"ReviewCard","id":"5c893d3c3709027da3cadb16","title":"Constructor Method in Java","body":"Java classes contain a _constructor_ method which is used to create instances of the class. \n\nThe constructor is named after the class. If no constructor is defined, a default empty constructor is used.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"6009c854a6a692000e9d61bc","language":"java","text":"public class Maths {\n public Maths() {\n System.out.println(\"I am constructor\");\n }\n public static void main(String [] args) {\n System.out.println(\"I am main\");\n Maths obj1 = new Maths();\n }\n}"}]},{"__typename":"ReviewCard","id":"5cb5a672af246d192545c726","title":"Creating a new Class instance in Java","body":"In Java, we use the `new` keyword followed by a call to the class constructor in order to create a new _instance_ of a class.\n\nThe constructor can be used to provide initial values to instance fields.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"6009c935340259000fc7b278","language":"java","text":"public class Person {\n int age;\n // Constructor:\n public Person(int a) {\n age = a;\n }\n \n public static void main(String [] args) {\n // Here, we create a new instance of the Person class:\n Person p = new Person(20);\n System.out.println(\"Age is \" + p.age); // Prints: Age is 20\n }\n}"}]},{"__typename":"ReviewCard","id":"5f5f6e86b9cdbf00124ecd56","title":"Reference Data Types","body":"A variable with a reference data type has a value that references the memory address of an instance. During variable declaration, the class name is used as the variable's type.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5f5f7090b9cdbf00124ecd65","language":"java","text":"public class Cat {\n public Cat() {\n // instructions for creating a Cat instance\n } \n\n public static void main(String[] args) {\n // garfield is declared with reference data type `Cat` \n Cat garfield = new Cat();\n System.out.println(garfield); // Prints: Cat@76ed5528\n }\n}"}]},{"__typename":"ReviewCard","id":"5f5f8489b666bc0012e2ca14","title":"Constructor Signatures","body":"A class can contain multiple constructors as long as they have different parameter values. A signature helps the compiler differentiate between the different constructors. \n\nA signature is made up of the constructor's name and a list of its parameters.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5f625151f89cef00135d547c","language":"java","text":"// The signature is `Cat(String furLength, boolean hasClaws)`.\npublic class Cat {\n String furType;\n boolean containsClaws;\n\n public Cat(String furLength, boolean hasClaws) {\n furType = furLength;\n containsClaws = hasClaws;\n }\n public static void main(String[] args) {\n Cat garfield = new Cat(\"Long-hair\", true);\n }\n}"}]},{"__typename":"ReviewCard","id":"5f6370784e2ae100128dbab0","title":"null Values","body":"`null` is a special value that denotes that an object has a void reference.\n","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5f6371a9efef8c001378871e","language":"java","text":"public class Bear {\n String species;\n public Bear(String speciesOfBear;) {\n species = speciesOfBear;\n }\n \n public static void main(String[] args) {\n Bear baloo = new Bear(\"Sloth bear\"); \n System.out.println(baloo); // Prints: Bear@4517d9a3\n // set object to null\n baloo = null;\n System.out.println(baloo); // Prints: null\n }\n}"}]},{"__typename":"ReviewCard","id":"5cb2f5913709021060df3b4b","title":"The body of a Java method","body":"In Java, we use curly brackets `{}` to enclose the body of a method.\n\nThe statements written inside the `{}` are executed when a method is called.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5cb4e8ef5f1de87db34f71f4","language":"java","text":"public class Maths {\n public static void sum(int a, int b) { // Start of sum\n int result = a + b;\n System.out.println(\"Sum is \" + result);\n } // End of sum\n \n \n public static void main(String [] args) {\n // Here, we call the sum method\n sum(10, 20);\n // Output: Sum is 30\n }\n}"}]},{"__typename":"ReviewCard","id":"5cac6d985f1de80371b369ee","title":"Method parameters in Java","body":"In java, parameters are declared in a method definition. The parameters act as variables inside the method and hold the value that was passed in. They can be used inside a method for printing or calculation purposes.\n\nIn the example, a and b are two parameters which, when the method is called, hold the value 10 and 20 respectively.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5cacb45337090207d0a22c30","language":"java","text":"public class Maths {\n public int sum(int a, int b) {\n int k = a + b;\n return k;\n }\n \n public static void main(String [] args) {\n Maths m = new Maths();\n int result = m.sum(10, 20);\n System.out.println(\"sum is \" + result);\n // prints - sum is 30\n }\n}"}]},{"__typename":"ReviewCard","id":"5c894299af246d0d72266b42","title":"Java Variables Inside a Method","body":"Java variables defined inside a method cannot be used outside the scope of that method.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5c92603b5f1de80efc4f6fec","language":"java","text":"//For example, `i` and `j` variables are available in the `main` method only:\n\npublic class Maths {\n public static void main(String [] args) {\n int i, j;\n System.out.println(\"These two variables are available in main method only\");\n }\n}\n "}]},{"__typename":"ReviewCard","id":"5cb066a93709021090df3b87","title":"Returning info from a Java method","body":"A Java method can return any value that can be saved in a variable. The value returned must match with the return type specified in the method signature.\n\nThe value is returned using the `return` keyword.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5cb49bbc370902109fdf4277","language":"java","text":"public class Maths { \n \n // return type is int\n public int sum(int a, int b) {\n int k;\n k = a + b;\n \n // sum is returned using the return keyword\n return k;\n }\n \n public static void main(String [] args) {\n Maths m = new Maths();\n int result;\n result = m.sum(10, 20);\n System.out.println(\"Sum is \" + result);\n // Output: Sum is 30\n }\n}"}]},{"__typename":"ReviewCard","id":"5cb1b965af246d214cf2aad1","title":"Declaring a Method","body":"Method declarations should define the following method information: scope (private or public), return type, method name, and any parameters it receives.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"6006fc8dfdccb7000ee8c549","language":"java","text":"// Here is a public method named sum whose return type is int and has two int parameters a and b\npublic int sum(int a, int b) {\n return(a + b);\n}\n"}]}],"tracks":[{"__typename":"Track","released":false,"id":"1fcc3fca6b8eec542f989d3b5a46e333","slug":"apcs-object-oriented-programming","title":"Object-Oriented Programming","lessonCount":2,"contentModuleIds":["b9b510f8b924bb413dc0c9397046d237","34d78465d55ddded3e3b129c58d55e12"],"grantsCertificate":true,"enrollmentStatus":"none","pro":false,"shortDescription":"Learn how to write object-oriented programs by building your own classes. Then take a look at some of the most common built-in Java classes.","difficulty":"Beginner","metrics":{"__typename":"TrackMetricsType","medianDurationHours":null}}],"paths":[{"__typename":"Path","released":true,"id":"5fc508b822eca90012fb25eb","slug":"ap-computer-science-a","goal":"skill","title":"Study for the AP Computer Science A Exam (Java)","lessonCount":23,"trackCount":8,"enrollmentStatus":"none","shortDescription":"Master the core concepts covered in AP Computer Science A Exam and gain a solid understanding of programming and fluency in Java.","difficulty":"Beginner","metrics":{"__typename":"PathMetricsType","medianDurationHours":19.34}}]},"reviewCards":[{"id":"5cb1b24baf246d213ff2af27","title":"Java objects' state and behavior","body":"In Java, instances of a class are known as objects. Every object has state and behavior in the form of instance fields and methods respectively.","images":[],"codeSnippets":[{"id":"5cb4a6be5f1de87dc94f732e","language":"java","text":"public class Person {\n // state of an object\n int age;\n String name;\n \n // behavior of an object\n public void set_value() {\n age = 20;\n name = \"Robin\";\n }\n public void get_value() {\n System.out.println(\"Age is \" + age);\n System.out.println(\"Name is \" + name);\n }\n \n // main method\n public static void main(String [] args) {\n // creates a new Person object\n Person p = new Person(); \n \n // changes state through behavior\n p.set_value();\n }\n}"}]},{"id":"5cb05e905f1de87dd64f6a4f","title":"Java instance","body":"Java instances are objects that are based on classes. For example, `Bob` may be an instance of the class `Person`. \n\nEvery instance has access to its own set of variables which are known as _instance fields_, which are variables declared within the scope of the instance. Values for instance fields are assigned within the constructor method.","images":[],"codeSnippets":[{"id":"5cb3e89637090210dbdf3d3a","language":"java","text":"public class Person {\n int age;\n String name;\n \n // Constructor method\n public Person(int age, String name) {\n this.age = age;\n this.name = name;\n }\n \n public static void main(String[] args) {\n Person Bob = new Person(31, \"Bob\");\n Person Alice = new Person(27, \"Alice\");\n }\n}"}]},{"id":"5cb06776370902109fdf3b18","title":"Java dot notation","body":"In Java programming language, we use `.` to access the variables and methods of an object or a Class.\n\nThis is known as _dot notation_ and the structure looks like this-\n\n`instanceOrClassName.fieldOrMethodName`","images":[],"codeSnippets":[{"id":"5cb49e00370902109fdf4281","language":"java","text":"public class Person {\n int age;\n \n public static void main(String [] args) {\n Person p = new Person();\n \n // here we use dot notation to set age\n p.age = 20; \n \n // here we use dot notation to access age and print\n System.out.println(\"Age is \" + p.age);\n // Output: Age is 20\n }\n}"}]},{"id":"5c893d3c3709027da3cadb16","title":"Constructor Method in Java","body":"Java classes contain a _constructor_ method which is used to create instances of the class. \n\nThe constructor is named after the class. If no constructor is defined, a default empty constructor is used.","images":[],"codeSnippets":[{"id":"6009c854a6a692000e9d61bc","language":"java","text":"public class Maths {\n public Maths() {\n System.out.println(\"I am constructor\");\n }\n public static void main(String [] args) {\n System.out.println(\"I am main\");\n Maths obj1 = new Maths();\n }\n}"}]},{"id":"5cb5a672af246d192545c726","title":"Creating a new Class instance in Java","body":"In Java, we use the `new` keyword followed by a call to the class constructor in order to create a new _instance_ of a class.\n\nThe constructor can be used to provide initial values to instance fields.","images":[],"codeSnippets":[{"id":"6009c935340259000fc7b278","language":"java","text":"public class Person {\n int age;\n // Constructor:\n public Person(int a) {\n age = a;\n }\n \n public static void main(String [] args) {\n // Here, we create a new instance of the Person class:\n Person p = new Person(20);\n System.out.println(\"Age is \" + p.age); // Prints: Age is 20\n }\n}"}]},{"id":"5f5f6e86b9cdbf00124ecd56","title":"Reference Data Types","body":"A variable with a reference data type has a value that references the memory address of an instance. During variable declaration, the class name is used as the variable's type.","images":[],"codeSnippets":[{"id":"5f5f7090b9cdbf00124ecd65","language":"java","text":"public class Cat {\n public Cat() {\n // instructions for creating a Cat instance\n } \n\n public static void main(String[] args) {\n // garfield is declared with reference data type `Cat` \n Cat garfield = new Cat();\n System.out.println(garfield); // Prints: Cat@76ed5528\n }\n}"}]},{"id":"5f5f8489b666bc0012e2ca14","title":"Constructor Signatures","body":"A class can contain multiple constructors as long as they have different parameter values. A signature helps the compiler differentiate between the different constructors. \n\nA signature is made up of the constructor's name and a list of its parameters.","images":[],"codeSnippets":[{"id":"5f625151f89cef00135d547c","language":"java","text":"// The signature is `Cat(String furLength, boolean hasClaws)`.\npublic class Cat {\n String furType;\n boolean containsClaws;\n\n public Cat(String furLength, boolean hasClaws) {\n furType = furLength;\n containsClaws = hasClaws;\n }\n public static void main(String[] args) {\n Cat garfield = new Cat(\"Long-hair\", true);\n }\n}"}]},{"id":"5f6370784e2ae100128dbab0","title":"null Values","body":"`null` is a special value that denotes that an object has a void reference.\n","images":[],"codeSnippets":[{"id":"5f6371a9efef8c001378871e","language":"java","text":"public class Bear {\n String species;\n public Bear(String speciesOfBear;) {\n species = speciesOfBear;\n }\n \n public static void main(String[] args) {\n Bear baloo = new Bear(\"Sloth bear\"); \n System.out.println(baloo); // Prints: Bear@4517d9a3\n // set object to null\n baloo = null;\n System.out.println(baloo); // Prints: null\n }\n}"}]},{"id":"5cb2f5913709021060df3b4b","title":"The body of a Java method","body":"In Java, we use curly brackets `{}` to enclose the body of a method.\n\nThe statements written inside the `{}` are executed when a method is called.","images":[],"codeSnippets":[{"id":"5cb4e8ef5f1de87db34f71f4","language":"java","text":"public class Maths {\n public static void sum(int a, int b) { // Start of sum\n int result = a + b;\n System.out.println(\"Sum is \" + result);\n } // End of sum\n \n \n public static void main(String [] args) {\n // Here, we call the sum method\n sum(10, 20);\n // Output: Sum is 30\n }\n}"}]},{"id":"5cac6d985f1de80371b369ee","title":"Method parameters in Java","body":"In java, parameters are declared in a method definition. The parameters act as variables inside the method and hold the value that was passed in. They can be used inside a method for printing or calculation purposes.\n\nIn the example, a and b are two parameters which, when the method is called, hold the value 10 and 20 respectively.","images":[],"codeSnippets":[{"id":"5cacb45337090207d0a22c30","language":"java","text":"public class Maths {\n public int sum(int a, int b) {\n int k = a + b;\n return k;\n }\n \n public static void main(String [] args) {\n Maths m = new Maths();\n int result = m.sum(10, 20);\n System.out.println(\"sum is \" + result);\n // prints - sum is 30\n }\n}"}]},{"id":"5c894299af246d0d72266b42","title":"Java Variables Inside a Method","body":"Java variables defined inside a method cannot be used outside the scope of that method.","images":[],"codeSnippets":[{"id":"5c92603b5f1de80efc4f6fec","language":"java","text":"//For example, `i` and `j` variables are available in the `main` method only:\n\npublic class Maths {\n public static void main(String [] args) {\n int i, j;\n System.out.println(\"These two variables are available in main method only\");\n }\n}\n "}]},{"id":"5cb066a93709021090df3b87","title":"Returning info from a Java method","body":"A Java method can return any value that can be saved in a variable. The value returned must match with the return type specified in the method signature.\n\nThe value is returned using the `return` keyword.","images":[],"codeSnippets":[{"id":"5cb49bbc370902109fdf4277","language":"java","text":"public class Maths { \n \n // return type is int\n public int sum(int a, int b) {\n int k;\n k = a + b;\n \n // sum is returned using the return keyword\n return k;\n }\n \n public static void main(String [] args) {\n Maths m = new Maths();\n int result;\n result = m.sum(10, 20);\n System.out.println(\"Sum is \" + result);\n // Output: Sum is 30\n }\n}"}]},{"id":"5cb1b965af246d214cf2aad1","title":"Declaring a Method","body":"Method declarations should define the following method information: scope (private or public), return type, method name, and any parameters it receives.","images":[],"codeSnippets":[{"id":"6006fc8dfdccb7000ee8c549","language":"java","text":"// Here is a public method named sum whose return type is int and has two int parameters a and b\npublic int sum(int a, int b) {\n return(a + b);\n}\n"}]}],"relatedContent":[{"id":"5fc508b822eca90012fb25eb","slug":"ap-computer-science-a","urlPath":"/learn/paths/ap-computer-science-a","imageUrl":"https://static-assets.codecademy.com/components/curriculum/path/ap-computer-science-a/curriculum-card.svg","goal":"skill","title":"Study for the AP Computer Science A Exam (Java)","lessonCount":23,"courseCount":8,"enrollmentStatus":"none","shortDescription":"Master the core concepts covered in AP Computer Science A Exam and gain a solid understanding of programming and fluency in Java.","difficulty":"Beginner","timeToComplete":19,"hasCareerJourney":false,"type":"path"}],"pathSlug":"ap-computer-science-a","__NEXTJS_CONTEXT__":{"cookie":null,"isPreview":false}},"__N_SSG":true},"page":"/learn/paths/[pathSlug]/tracks/[courseSlug]/modules/[moduleSlug]/cheatsheet","query":{"pathSlug":"ap-computer-science-a","courseSlug":"apcs-object-oriented-programming","moduleSlug":"apcs-what-are-classes-objects-and-methods"},"buildId":"portal-app-10b4a003571504fb0cc6f52c5fa4b3ba2701e379","assetPrefix":"/_portal","isFallback":false,"isExperimentalCompile":false,"gsp":true,"scriptLoader":[]}</script>

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
