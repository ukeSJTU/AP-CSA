# Inheritance and Polymorphism: Inheritance and Polymorphism Cheatsheet | Codecademy

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
2.  Inheritance and Polymorphism

# Inheritance and Polymorphism

Print Cheatsheet

Share

## Topics

-   Inheritance and Polymorphism

### Inheritance in Java

_Inheritance_ is an important feature of object-oriented programming in Java. It allows for one class (_child class_) to inherit the fields and methods of another class (_parent class_). For instance, we might want a child class `Dog` to inherent traits from a more general parent class `Animal`.

When defining a child class in Java, we use the keyword `extends` to inherit from a parent class.

// Parent Class

class Animal {

// Animal class members

}

// Child Class

class Dog extends Animal {

// Dog inherits traits from Animal

// additional Dog class members

}

to clipboard

### Main() method in Java

In simple Java programs, you may work with just one class and one file. However, as your programs become more complex you will work with multiple classes, each of which requires its own file. Only one of these files in the Java package requires a `main()` method, and this is the file that will be run in the package.

For example, say we have two files in our Java package for two different classes:

-   `Shape`, the parent class.
-   `Square`, the child class.

If the Java file containing our `Shape` class is the only one with a `main()` method, this is the file that will be run for our Java package.

// Shape.java file

class Shape {

public static void main(String\[\] args) {

Square sq \= new Square();

}

}

// Square.java file

class Square extends Shape {

}

to clipboard

### super() in Java

In Java, a child class inherits its parent’s fields and methods, meaning it also inherits the parent’s constructor. Sometimes we may want to modify the constructor, in which case we can use the `super()` method, which acts like the parent constructor inside the child class constructor.

Alternatively, we can also completely override a parent class constructor by writing a new constructor for the child class.

// Parent class

class Animal {

String sound;

Animal(String snd) {

    this.sound \= snd;

}

}

// Child class

class Dog extends Animal {

// super() method can act like the parent constructor inside the child class constructor.

Dog() {

    super("woof");

}

// alternatively, we can override the constructor completely by defining a new constructor.

Dog() {

    this.sound \= "woof";

}

}

to clipboard

### Protected and Final keywords in Java

When creating classes in Java, sometimes we may want to control child class access to parent class members. We can use the `protected` and `final` keywords to do just that.

`protected` keeps a parent class member accessible to its child classes, to files within its own package, and by subclasses of this class in another package.

Adding `final` before a parent class method’s access modifier makes it so that any child classes cannot modify that method - it is immutable.

class Student {

protected double gpa;

// any child class of Student can access gpa

final protected boolean isStudent() {

    return true;

}

// any child class of Student cannot modify isStudent()

}

to clipboard

### Polymorphism in Java

Java incorporates the object-oriented programming principle of _polymorphism_.

Polymorphism allows a child class to share the information and behavior of its parent class while also incorporating its own functionality. This allows for the benefits of simplified syntax and reduced cognitive overload for developers.

// Parent class

class Animal {

public void greeting() {

    System.out.println("The animal greets you.");

}

}

// Child class

class Cat extends Animal {

public void greeting() {

    System.out.println("The cat meows.");

}

}

class MainClass {

public static void main(String\[\] args) {

    Animal animal1 \= new Animal();  // Animal object

    Animal cat1 \= new Cat();  // Cat object

    animal1.greeting(); // prints "The animal greets you."

    cat1.greeting(); // prints "The cat meows."

}

}

to clipboard

### Method Overriding in Java

In Java, we can easily _override_ parent class methods in a child class. Overriding a method is useful when we want our child class method to have the same name as a parent class method but behave a bit differently.

In order to override a parent class method in a child class, we need to make sure that the child class method has the following in common with its parent class method:

-   Method name
-   Return type
-   Number and type of parameters

Additionally, we should include the `@Override` keyword above our child class method to indicate to the compiler that we want to override a method in the parent class.

// Parent class

class Animal {

public void eating() {

System.out.println("The animal is eating.");

}

}

// Child class

class Dog extends Animal {

// Dog's eating method overrides Animal's eating method

    @Override

public void eating() {

    System.out.println("The dog is eating.");

}

}

to clipboard

### Child Classes in Arrays and ArrayLists

In Java, polymorphism allows us to put instances of different classes that share a parent class together in an array or `ArrayList`.

For example, if we have an `Animal` parent class with child classes `Cat`, `Dog`, and `Pig` we can set up an array with instances of each animal and then iterate through the list of animals to perform the same action on each.

// Animal parent class with child classes Cat, Dog, and Pig.

Animal cat1, dog1, pig1;

cat1 \= new Cat();

dog1 \= new Dog();

pig1 \= new Pig();

// Set up an array with instances of each animal

Animal\[\] animals \= {cat1, dog1, pig1};

// Iterate through the list of animals and perform the same action with each

for (Animal animal : animals) {

animal.sound();

}

to clipboard

### The Object Superclass

The `Object` class is the superclass of all other classes. Every object created in Java is a descendent of the `Object` class.

Java will automatically continue to call the constructor of a superclass until it reaches the constructor of the `Object` class, even if the class doesn’t use the `extends` keyword. This is why, in any class hierarchy, execution begins with the `Object` constructor.

### The equals() Method

The `equals()` method should be used when comparing `String` objects.

// Declare 3 String objects

String a \= new String("Dracaena");

String b \= new String("Haworthia");

String c \= new String("Haworthia");

// Compare two objects that are not equal

System.out.println(a.equals(b)); // Prints: false

// Compare two objects that are equal

System.out.println(b.equals(c)); // Prints: true

to clipboard

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

<script id="__NEXT_DATA__" type="application/json">{"props":{"pageProps":{"course":{"__typename":"Track","id":"5d01cf7de1190611ee92e3ee8b2d5bde","slug":"apcs-inheritance-and-polymorphism","title":"Inheritance and Polymorphism","contentModules":[{"__typename":"ContentModule","id":"cb197f482e746e88a87aac4f465dc89c","slug":"apcs-inheritance-and-polymorphism","title":"Inheritance and Polymorphism"}]},"module":{"__typename":"ContentModule","id":"cb197f482e746e88a87aac4f465dc89c","slug":"apcs-inheritance-and-polymorphism","title":"Inheritance and Polymorphism","reviewCards":[{"__typename":"ReviewCard","id":"5deffb4a76f391001646173c","title":"Inheritance in Java","body":"_Inheritance_ is an important feature of object-oriented programming in Java. It allows for one class (_child class_) to inherit the fields and methods of another class (_parent class_). For instance, we might want a child class `Dog ` to inherent traits from a more general parent class `Animal`. \n\nWhen defining a child class in Java, we use the keyword `extends` to inherit from a parent class. ","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"6009c64c48a9bf000e2d0b33","language":"java","text":"// Parent Class\nclass Animal {\n // Animal class members\n}\n\n// Child Class\nclass Dog extends Animal {\n // Dog inherits traits from Animal \n \n // additional Dog class members\n}"}]},{"__typename":"ReviewCard","id":"5df04b9380cabd00128ca970","title":"Main() method in Java","body":"In simple Java programs, you may work with just one class and one file. However, as your programs become more complex you will work with multiple classes, each of which requires its own file. Only one of these files in the Java package requires a `main()` method, and this is the file that will be run in the package. \n\nFor example, say we have two files in our Java package for two different classes: \n- `Shape`, the parent class.\n- `Square`, the child class. \n\nIf the Java file containing our `Shape` class is the only one with a `main()` method, this is the file that will be run for our Java package. ","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5df055f1ed6e5d001148dc2b","language":"java","text":"// Shape.java file \nclass Shape {\n public static void main(String[] args) {\n \tSquare sq = new Square();\n }\n}\n\n// Square.java file \nclass Square extends Shape {\n \n}"}]},{"__typename":"ReviewCard","id":"5df2ce21047c1b0011b45c4c","title":"super() in Java ","body":"In Java, a child class inherits its parent’s fields and methods, meaning it also inherits the parent's constructor. Sometimes we may want to modify the constructor, in which case we can use the `super()` method, which acts like the parent constructor inside the child class constructor.\n\nAlternatively, we can also completely override a parent class constructor by writing a new constructor for the child class.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"6009c4c6b5eaa90014f571a9","language":"java","text":"// Parent class\nclass Animal {\n String sound;\n Animal(String snd) {\n this.sound = snd;\n }\n}\n\n// Child class\nclass Dog extends Animal { \n // super() method can act like the parent constructor inside the child class constructor.\n Dog() {\n super(\"woof\");\n } \n // alternatively, we can override the constructor completely by defining a new constructor.\n Dog() {\n this.sound = \"woof\";\n }\n}"}]},{"__typename":"ReviewCard","id":"5df25edfb821a00011c2ccdd","title":"Protected and Final keywords in Java ","body":"When creating classes in Java, sometimes we may want to control child class access to parent class members. We can use the `protected` and `final` keywords to do just that.\n\n`protected` keeps a parent class member accessible to its child classes, to files within its own package, and by subclasses of this class in another package.\n\nAdding `final` before a parent class method’s access modifier makes it so that any child classes cannot modify that method - it is immutable. \n ","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"6009c6a03bc0030010938ae5","language":"java","text":"class Student {\n protected double gpa;\n // any child class of Student can access gpa \n \n final protected boolean isStudent() {\n return true;\n }\n // any child class of Student cannot modify isStudent()\n}"}]},{"__typename":"ReviewCard","id":"5df283e325f7060012b8284d","title":"Polymorphism in Java","body":"Java incorporates the object-oriented programming principle of _polymorphism_.\n\nPolymorphism allows a child class to share the information and behavior of its parent class while also incorporating its own functionality. This allows for the benefits of simplified syntax and reduced cognitive overload for developers.\n","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5df287927ca4e0001494c441","language":"java","text":"// Parent class\nclass Animal {\n public void greeting() {\n System.out.println(\"The animal greets you.\");\n }\n}\n\n// Child class\nclass Cat extends Animal {\n public void greeting() {\n System.out.println(\"The cat meows.\");\n }\n}\n\nclass MainClass {\n public static void main(String[] args) {\n Animal animal1 = new Animal(); // Animal object\n Animal cat1 = new Cat(); // Cat object\n animal1.greeting(); // prints \"The animal greets you.\"\n cat1.greeting(); // prints \"The cat meows.\"\n }\n}"}]},{"__typename":"ReviewCard","id":"5df112e725f7060012b824f0","title":"Method Overriding in Java ","body":"In Java, we can easily _override_ parent class methods in a child class. Overriding a method is useful when we want our child class method to have the same name as a parent class method but behave a bit differently.\n\nIn order to override a parent class method in a child class, we need to make sure that the child class method has the following in common with its parent class method:\n\n- Method name\n- Return type \n- Number and type of parameters\n\nAdditionally, we should include the `@Override` keyword above our child class method to indicate to the compiler that we want to override a method in the parent class. ","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5df2f00a7ca4e0001494c722","language":"java","text":"// Parent class \nclass Animal {\n public void eating() {\n \tSystem.out.println(\"The animal is eating.\");\n }\n}\n\n// Child class \nclass Dog extends Animal {\n // Dog's eating method overrides Animal's eating method\n\t@Override\n public void eating() {\n System.out.println(\"The dog is eating.\");\n }\n}"}]},{"__typename":"ReviewCard","id":"5df2ddbb190969001236a2bd","title":"Child Classes in Arrays and ArrayLists","body":"In Java, polymorphism allows us to put instances of different classes that share a parent class together in an array or `ArrayList`. \n\nFor example, if we have an `Animal` parent class with child classes `Cat`, `Dog`, and `Pig` we can set up an array with instances of each animal and then iterate through the list of animals to perform the same action on each. ","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5df2e323f86bd70011e49ac1","language":"java","text":"// Animal parent class with child classes Cat, Dog, and Pig. \nAnimal cat1, dog1, pig1;\n\ncat1 = new Cat();\ndog1 = new Dog();\npig1 = new Pig();\n\n// Set up an array with instances of each animal\nAnimal[] animals = {cat1, dog1, pig1};\n\n// Iterate through the list of animals and perform the same action with each\nfor (Animal animal : animals) {\n \n animal.sound();\n \n}"}]},{"__typename":"ReviewCard","id":"5fca5e049077660012ace6df","title":"The Object Superclass","body":"The `Object` class is the superclass of all other classes. Every object created in Java is a descendent of the `Object` class.\n\nJava will automatically continue to call the constructor of a superclass until it reaches the constructor of the `Object` class, even if the class doesn't use the `extends` keyword. This is why, in any class hierarchy, execution begins with the `Object` constructor.","images":[],"codeSnippets":[]},{"__typename":"ReviewCard","id":"5fca7121642b5000125017ef","title":"The equals() Method","body":"The `equals()` method should be used when comparing `String` objects.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fca71739b1e2c0013a6e38f","language":"java","text":"// Declare 3 String objects\nString a = new String(\"Dracaena\");\nString b = new String(\"Haworthia\");\nString c = new String(\"Haworthia\");\n \n// Compare two objects that are not equal\nSystem.out.println(a.equals(b)); // Prints: false\n \n// Compare two objects that are equal\nSystem.out.println(b.equals(c)); // Prints: true"}]}],"tracks":[{"__typename":"Track","released":false,"id":"5d01cf7de1190611ee92e3ee8b2d5bde","slug":"apcs-inheritance-and-polymorphism","title":"Inheritance and Polymorphism","lessonCount":1,"contentModuleIds":["cb197f482e746e88a87aac4f465dc89c"],"grantsCertificate":true,"enrollmentStatus":"none","pro":false,"shortDescription":"Learn how all classes are related through inheritance and polymorphism.","difficulty":"Beginner","metrics":{"__typename":"TrackMetricsType","medianDurationHours":null}}],"paths":[{"__typename":"Path","released":true,"id":"5fc508b822eca90012fb25eb","slug":"ap-computer-science-a","goal":"skill","title":"Study for the AP Computer Science A Exam (Java)","lessonCount":23,"trackCount":8,"enrollmentStatus":"none","shortDescription":"Master the core concepts covered in AP Computer Science A Exam and gain a solid understanding of programming and fluency in Java.","difficulty":"Beginner","metrics":{"__typename":"PathMetricsType","medianDurationHours":19.34}}]},"reviewCards":[{"id":"5deffb4a76f391001646173c","title":"Inheritance in Java","body":"_Inheritance_ is an important feature of object-oriented programming in Java. It allows for one class (_child class_) to inherit the fields and methods of another class (_parent class_). For instance, we might want a child class `Dog ` to inherent traits from a more general parent class `Animal`. \n\nWhen defining a child class in Java, we use the keyword `extends` to inherit from a parent class. ","images":[],"codeSnippets":[{"id":"6009c64c48a9bf000e2d0b33","language":"java","text":"// Parent Class\nclass Animal {\n // Animal class members\n}\n\n// Child Class\nclass Dog extends Animal {\n // Dog inherits traits from Animal \n \n // additional Dog class members\n}"}]},{"id":"5df04b9380cabd00128ca970","title":"Main() method in Java","body":"In simple Java programs, you may work with just one class and one file. However, as your programs become more complex you will work with multiple classes, each of which requires its own file. Only one of these files in the Java package requires a `main()` method, and this is the file that will be run in the package. \n\nFor example, say we have two files in our Java package for two different classes: \n- `Shape`, the parent class.\n- `Square`, the child class. \n\nIf the Java file containing our `Shape` class is the only one with a `main()` method, this is the file that will be run for our Java package. ","images":[],"codeSnippets":[{"id":"5df055f1ed6e5d001148dc2b","language":"java","text":"// Shape.java file \nclass Shape {\n public static void main(String[] args) {\n \tSquare sq = new Square();\n }\n}\n\n// Square.java file \nclass Square extends Shape {\n \n}"}]},{"id":"5df2ce21047c1b0011b45c4c","title":"super() in Java ","body":"In Java, a child class inherits its parent’s fields and methods, meaning it also inherits the parent's constructor. Sometimes we may want to modify the constructor, in which case we can use the `super()` method, which acts like the parent constructor inside the child class constructor.\n\nAlternatively, we can also completely override a parent class constructor by writing a new constructor for the child class.","images":[],"codeSnippets":[{"id":"6009c4c6b5eaa90014f571a9","language":"java","text":"// Parent class\nclass Animal {\n String sound;\n Animal(String snd) {\n this.sound = snd;\n }\n}\n\n// Child class\nclass Dog extends Animal { \n // super() method can act like the parent constructor inside the child class constructor.\n Dog() {\n super(\"woof\");\n } \n // alternatively, we can override the constructor completely by defining a new constructor.\n Dog() {\n this.sound = \"woof\";\n }\n}"}]},{"id":"5df25edfb821a00011c2ccdd","title":"Protected and Final keywords in Java ","body":"When creating classes in Java, sometimes we may want to control child class access to parent class members. We can use the `protected` and `final` keywords to do just that.\n\n`protected` keeps a parent class member accessible to its child classes, to files within its own package, and by subclasses of this class in another package.\n\nAdding `final` before a parent class method’s access modifier makes it so that any child classes cannot modify that method - it is immutable. \n ","images":[],"codeSnippets":[{"id":"6009c6a03bc0030010938ae5","language":"java","text":"class Student {\n protected double gpa;\n // any child class of Student can access gpa \n \n final protected boolean isStudent() {\n return true;\n }\n // any child class of Student cannot modify isStudent()\n}"}]},{"id":"5df283e325f7060012b8284d","title":"Polymorphism in Java","body":"Java incorporates the object-oriented programming principle of _polymorphism_.\n\nPolymorphism allows a child class to share the information and behavior of its parent class while also incorporating its own functionality. This allows for the benefits of simplified syntax and reduced cognitive overload for developers.\n","images":[],"codeSnippets":[{"id":"5df287927ca4e0001494c441","language":"java","text":"// Parent class\nclass Animal {\n public void greeting() {\n System.out.println(\"The animal greets you.\");\n }\n}\n\n// Child class\nclass Cat extends Animal {\n public void greeting() {\n System.out.println(\"The cat meows.\");\n }\n}\n\nclass MainClass {\n public static void main(String[] args) {\n Animal animal1 = new Animal(); // Animal object\n Animal cat1 = new Cat(); // Cat object\n animal1.greeting(); // prints \"The animal greets you.\"\n cat1.greeting(); // prints \"The cat meows.\"\n }\n}"}]},{"id":"5df112e725f7060012b824f0","title":"Method Overriding in Java ","body":"In Java, we can easily _override_ parent class methods in a child class. Overriding a method is useful when we want our child class method to have the same name as a parent class method but behave a bit differently.\n\nIn order to override a parent class method in a child class, we need to make sure that the child class method has the following in common with its parent class method:\n\n- Method name\n- Return type \n- Number and type of parameters\n\nAdditionally, we should include the `@Override` keyword above our child class method to indicate to the compiler that we want to override a method in the parent class. ","images":[],"codeSnippets":[{"id":"5df2f00a7ca4e0001494c722","language":"java","text":"// Parent class \nclass Animal {\n public void eating() {\n \tSystem.out.println(\"The animal is eating.\");\n }\n}\n\n// Child class \nclass Dog extends Animal {\n // Dog's eating method overrides Animal's eating method\n\t@Override\n public void eating() {\n System.out.println(\"The dog is eating.\");\n }\n}"}]},{"id":"5df2ddbb190969001236a2bd","title":"Child Classes in Arrays and ArrayLists","body":"In Java, polymorphism allows us to put instances of different classes that share a parent class together in an array or `ArrayList`. \n\nFor example, if we have an `Animal` parent class with child classes `Cat`, `Dog`, and `Pig` we can set up an array with instances of each animal and then iterate through the list of animals to perform the same action on each. ","images":[],"codeSnippets":[{"id":"5df2e323f86bd70011e49ac1","language":"java","text":"// Animal parent class with child classes Cat, Dog, and Pig. \nAnimal cat1, dog1, pig1;\n\ncat1 = new Cat();\ndog1 = new Dog();\npig1 = new Pig();\n\n// Set up an array with instances of each animal\nAnimal[] animals = {cat1, dog1, pig1};\n\n// Iterate through the list of animals and perform the same action with each\nfor (Animal animal : animals) {\n \n animal.sound();\n \n}"}]},{"id":"5fca5e049077660012ace6df","title":"The Object Superclass","body":"The `Object` class is the superclass of all other classes. Every object created in Java is a descendent of the `Object` class.\n\nJava will automatically continue to call the constructor of a superclass until it reaches the constructor of the `Object` class, even if the class doesn't use the `extends` keyword. This is why, in any class hierarchy, execution begins with the `Object` constructor.","images":[],"codeSnippets":[]},{"id":"5fca7121642b5000125017ef","title":"The equals() Method","body":"The `equals()` method should be used when comparing `String` objects.","images":[],"codeSnippets":[{"id":"5fca71739b1e2c0013a6e38f","language":"java","text":"// Declare 3 String objects\nString a = new String(\"Dracaena\");\nString b = new String(\"Haworthia\");\nString c = new String(\"Haworthia\");\n \n// Compare two objects that are not equal\nSystem.out.println(a.equals(b)); // Prints: false\n \n// Compare two objects that are equal\nSystem.out.println(b.equals(c)); // Prints: true"}]}],"relatedContent":[{"id":"5fc508b822eca90012fb25eb","slug":"ap-computer-science-a","urlPath":"/learn/paths/ap-computer-science-a","imageUrl":"https://static-assets.codecademy.com/components/curriculum/path/ap-computer-science-a/curriculum-card.svg","goal":"skill","title":"Study for the AP Computer Science A Exam (Java)","lessonCount":23,"courseCount":8,"enrollmentStatus":"none","shortDescription":"Master the core concepts covered in AP Computer Science A Exam and gain a solid understanding of programming and fluency in Java.","difficulty":"Beginner","timeToComplete":19,"hasCareerJourney":false,"type":"path"}],"pathSlug":"ap-computer-science-a","__NEXTJS_CONTEXT__":{"cookie":null,"isPreview":false}},"__N_SSG":true},"page":"/learn/paths/[pathSlug]/tracks/[courseSlug]/modules/[moduleSlug]/cheatsheet","query":{"pathSlug":"ap-computer-science-a","courseSlug":"apcs-inheritance-and-polymorphism","moduleSlug":"apcs-inheritance-and-polymorphism"},"buildId":"portal-app-10b4a003571504fb0cc6f52c5fa4b3ba2701e379","assetPrefix":"/_portal","isFallback":false,"isExperimentalCompile":false,"gsp":true,"scriptLoader":[]}</script>

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
