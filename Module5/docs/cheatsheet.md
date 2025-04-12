# Conditionals and Control Flow: Conditionals and Control Flow Cheatsheet | Codecademy

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
2.  Conditionals and Control Flow

# Conditionals and Control Flow

Print Cheatsheet

Share

## Topics

-   Conditionals and Control Flow

### else Statement

The `else` statement executes a block of code when the condition inside the `if` statement is `false`. The `else` statement is always the last condition.

boolean condition1 \= false;

if (condition1){

    System.out.println("condition1 is true");

}

else{

    System.out.println("condition1 is not true");

}

// Prints: condition1 is not true

to clipboard

### else if Statements

`else`\-`if` statements can be chained together to check multiple conditions. Once a condition is `true`, a code block will be executed and the conditional statement will be exited.

There can be multiple `else`\-`if` statements in a single conditional statement.

int testScore \= 76;

char grade;

if (testScore \>= 90) {

grade \= 'A';

} else if (testScore \>= 80) {

grade \= 'B';

} else if (testScore \>= 70) {

grade \= 'C';

} else if (testScore \>= 60) {

grade \= 'D';

} else {

grade \= 'F';

}

System.out.println("Grade: " + grade); // Prints: C

to clipboard

### if Statement

An `if` statement executes a block of code when a specified boolean expression is evaluated as `true`.

if (true) {

    System.out.println("This code executes");

}

// Prints: This code executes

if (false) {

    System.out.println("This code does not execute");

}

// There is no output for the above statement

to clipboard

### Nested Conditional Statements

A nested conditional statement is a conditional statement nested inside of another conditional statement. The outer conditional statement is evaluated first; if the condition is `true`, then the nested conditional statement will be evaluated.

boolean studied \= true;

boolean wellRested \= true;

if (wellRested) {

System.out.println("Best of luck today!");

if (studied) {

    System.out.println("You are prepared for your exam!");

} else {

    System.out.println("Study before your exam!");

}

}

// Prints: Best of luck today!

// Prints: You are prepared for your exam!

to clipboard

### NOT Operator

The NOT logical operator is represented by `!`. This operator negates the value of a boolean expression.

boolean a \= true;

System.out.println(!a); // Prints: false

System.out.println(!false) // Prints: true

to clipboard

### AND Operator

The AND logical operator is represented by `&&`. This operator returns `true` if the `boolean` expressions on both sides of the operator are `true`; otherwise, it returns `false`.

System.out.println(true && true); // Prints: true

System.out.println(true && false); // Prints: false

System.out.println(false && true); // Prints: false

System.out.println(false && false); // Prints: false

to clipboard

### The OR Operator

The logical OR operator is represented by `||`. This operator will return `true` if at least one of the `boolean` expressions being compared has a `true` value; otherwise, it will return `false`.

System.out.println(true || true); // Prints: true

System.out.println(true || false); // Prints: true

System.out.println(false || true); // Prints: true

System.out.println(false || false); // Prints: false

to clipboard

### Conditional Operators - Order of Evaluation

If an expression contains multiple conditional operators, the order of evaluation is as follows: Expressions in parentheses -> NOT -> AND -> OR.

boolean foo \= true && (!false || true); // true

/\*

(!false || true) is evaluated first because it is contained within parentheses.

Then !false is evaluated as true because it uses the NOT operator.

Next, (true || true) is evaluation as true.

Finally, true && true is evaluated as true meaning foo is true. \*/

to clipboard

### Compare Object References

Boolean expressions allow us to compare object references. A Boolean expression is a Java expression that, when evaluated, returns a Boolean value: true or false.

a.equals(b)

a.equals(b) && b.equals(c)

to clipboard

### Comparing Primitive Values

We can use relational operators, such as `==` and `!=`, to compare primitive and reference values.

class ComparingPrimitives {

public static void main(String\[\] args) {

    System.out.println("Comparing ints:");

    System.out.println(4 \== 5); // print false

    System.out.println(4 != 5); // print true

    System.out.println(4 \== 4); // print true

    System.out.println("Comparing chars:");

    System.out.println('a' \== 'b'); // print false

    System.out.println('a' != 'b'); // print true

    System.out.println('a' \== 'a'); // print true

}

}

to clipboard

### Object Reference Aliases

An alias means that more than one reference is tied to the same object.

class ComparingAliases {

public static void main(String\[\] args) {

String farmAnimal1 \= new String("cat");

String farmAnimal2 \= new String("cow");

// farmAnimal3 references the same object as farmAnimal2

String farmAnimal3 \= farmAnimal2;

// comparing different objects

System.out.println(farmAnimal1 \== farmAnimal2); // print false

// comparing object aliases

System.out.println(farmAnimal2 \== farmAnimal3); // print true

}

}

to clipboard

### Comparing Object Reference Aliases

We can compare object reference values can be compared, using == and !=, to identify aliases.

class ComparingAliases {

public static void main(String\[\] args) {

String farmAnimal1 \= new String("cat");

String farmAnimal2 \= new String("cow");

String farmAnimal3 \= farmAnimal2;

// comparing different objects

System.out.println(farmAnimal1 \== farmAnimal2); // print false

// comparing object aliases

System.out.println(farmAnimal2 \== farmAnimal3); // print true

}

}

to clipboard

### Comparing Reference Values with Null

We can compare a reference value with null, using == or !=, to determine if the reference actually references an object.

class Main

{

public static void main(String\[\] args)

{

     String word \= null;

     // checking that \`word != null\` avoids NullPointerException error

     if (word != null && word.indexOf("a") \>= 0)

     {

         System.out.println(word + " contains an a.");

     }

}

}

to clipboard

### Custom Class Equals Method

Classes often have their own equals method, which can be used to determine whether two objects of the class are equivalent.

class Pet {

public String name;

public String breed;

public Pet (String name, String breed) {

    this.name \= name;

    this.breed \= breed;

}

// custom \`equals()\` method

public boolean equals(Pet p) {

    return (p.name \== name && p.breed \== breed);

}

public static void main(String\[\] args) {

    Pet pet1 \= new Pet("Air Bud", "Golden Retriever");

    Pet pet2 \= new Pet("Air Bud", "Golden Retriever");

    // compare with \`==\`

    System.out.println(pet1 \== pet2);

    // compare with \`.equals()\`

    System.out.println(pet1.equals(pet2));

}

}

to clipboard

### DeMorgan’s Laws

DeMorgan’s Laws can be used to rewrite expressions complex `boolean` expressions.

The first law states that two expressions that are negated together and compared using `&&` is equivalent to two separately negated expressions compared with `||`.

The second law states that two expressions that are compared with `||` and are negated together are equivalent to two separately negated expressions compared with `&&`.

int a \= 2;

int b \= 3;

boolean exp1 \= !(a \> b && a \== b);

// rewrite using first law

exp1 \= !(a \> b) || !(a \== b);

boolean exp2 \= !(a < b || a != b);

// rewrite using second law

exp2 \= !(a < b) && !(a != b);

to clipboard

### Equivalent Boolean Expressions

Equivalent `boolean` expressions are separate `boolean` expressions that always result in the same value.

If we were to replace a `boolean` expression in a program with an equivalent `boolean` expression, there would be no impact on the output of the program.

int a \= 1;

int b \= 2;

// the followning expressions are equivalent

boolean exp1 \= !(a \== b && b \>= a);

boolean exp2 \= !(a \== b) || !(b \>= a);

boolean exp3 \= a != b || a < b;

System.out.println(exp1); // Prints: true

System.out.println(exp2); // Prints: true

System.out.println(exp3); // Prints: true

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

<script id="__NEXT_DATA__" type="application/json">{"props":{"pageProps":{"course":{"__typename":"Track","id":"fdefc970099afa4d9d0e0cc24b994d5f","slug":"apcs-conditionals-and-control-flow","title":"Conditionals and Control Flow","contentModules":[{"__typename":"ContentModule","id":"3eaa9bf1a723e669af555587503daf40","slug":"apcs-conditionals-and-control-flow","title":"Conditionals and Control Flow"}]},"module":{"__typename":"ContentModule","id":"3eaa9bf1a723e669af555587503daf40","slug":"apcs-conditionals-and-control-flow","title":"Conditionals and Control Flow","reviewCards":[{"__typename":"ReviewCard","id":"5dbd97c281d47500126b2a19","title":"else Statement","body":"The `else` statement executes a block of code when the condition inside the `if` statement is `false`. The `else` statement is always the last condition.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"60072fab9a01c5000e07dc18","language":"java","text":"boolean condition1 = false;\n\nif (condition1){\n System.out.println(\"condition1 is true\");\n}\nelse{\n System.out.println(\"condition1 is not true\");\n}\n// Prints: condition1 is not true"}]},{"__typename":"ReviewCard","id":"5dbc707923f4e8001119308c","title":"else if Statements","body":"`else`-`if` statements can be chained together to check multiple conditions. Once a condition is `true`, a code block will be executed and the conditional statement will be exited.\n\nThere can be multiple `else`-`if` statements in a single conditional statement.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"6006eda5de323b000ebc3e5e","language":"java","text":"int testScore = 76;\nchar grade;\n\nif (testScore \u003e= 90) {\n grade = 'A';\n} else if (testScore \u003e= 80) {\n grade = 'B';\n} else if (testScore \u003e= 70) {\n grade = 'C';\n} else if (testScore \u003e= 60) {\n grade = 'D';\n} else {\n grade = 'F';\n}\n\nSystem.out.println(\"Grade: \" + grade); // Prints: C"}]},{"__typename":"ReviewCard","id":"5db832c3e37c6400111db75c","title":"if Statement","body":"An `if` statement executes a block of code when a specified boolean expression is evaluated as `true`.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"60072fb4b75112000e7b6224","language":"java","text":"if (true) {\n\tSystem.out.println(\"This code executes\");\n}\n// Prints: This code executes\n\nif (false) {\n\tSystem.out.println(\"This code does not execute\");\n}\n// There is no output for the above statement"}]},{"__typename":"ReviewCard","id":"5f68bcb8efef8c0013789b01","title":"Nested Conditional Statements","body":"A nested conditional statement is a conditional statement nested inside of another conditional statement. The outer conditional statement is evaluated first; if the condition is `true`, then the nested conditional statement will be evaluated.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5f68bd407c91b9001271bd34","language":"java","text":"boolean studied = true;\nboolean wellRested = true;\n\nif (wellRested) {\n System.out.println(\"Best of luck today!\"); \n if (studied) {\n System.out.println(\"You are prepared for your exam!\");\n } else {\n System.out.println(\"Study before your exam!\");\n }\n}\n\n// Prints: Best of luck today!\n// Prints: You are prepared for your exam!"}]},{"__typename":"ReviewCard","id":"5dc99de971981000115eee90","title":"NOT Operator","body":"The NOT logical operator is represented by `!`. This operator negates the value of a boolean expression.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"6144f7e6ae2b35001c06e961","language":"java","text":"boolean a = true;\nSystem.out.println(!a); // Prints: false\n\nSystem.out.println(!false) // Prints: true"}]},{"__typename":"ReviewCard","id":"600206dfc5c121000e37a584","title":"AND Operator","body":"The AND logical operator is represented by `\u0026\u0026`. This operator returns `true` if the `boolean` expressions on both sides of the operator are `true`; otherwise, it returns `false`.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"60020af7de323b000ebc3b94","language":"java","text":"System.out.println(true \u0026\u0026 true); // Prints: true\nSystem.out.println(true \u0026\u0026 false); // Prints: false\nSystem.out.println(false \u0026\u0026 true); // Prints: false\nSystem.out.println(false \u0026\u0026 false); // Prints: false"}]},{"__typename":"ReviewCard","id":"60020b1bfdccb7000ee8c31f","title":"The OR Operator","body":"The logical OR operator is represented by `||`. This operator will return `true` if at least one of the `boolean` expressions being compared has a `true` value; otherwise, it will return `false`.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"60020b55978094000e2adc2f","language":"java","text":"System.out.println(true || true); // Prints: true\nSystem.out.println(true || false); // Prints: true\nSystem.out.println(false || true); // Prints: true\nSystem.out.println(false || false); // Prints: false"}]},{"__typename":"ReviewCard","id":"5f68b06d71604d00121093b1","title":"Conditional Operators - Order of Evaluation","body":"If an expression contains multiple conditional operators, the order of evaluation is as follows: Expressions in parentheses -\u003e NOT -\u003e AND -\u003e OR.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"600206a8a05a31000e21e2c7","language":"java","text":"boolean foo = true \u0026\u0026 (!false || true); // true\n/* \n(!false || true) is evaluated first because it is contained within parentheses. \n\nThen !false is evaluated as true because it uses the NOT operator. \n\nNext, (true || true) is evaluation as true. \n\nFinally, true \u0026\u0026 true is evaluated as true meaning foo is true. */"}]},{"__typename":"ReviewCard","id":"5fc7c9f3caf7dc001276aff6","title":"Compare Object References","body":"Boolean expressions allow us to compare object references. A Boolean expression is a Java expression that, when evaluated, returns a Boolean value: true or false.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fc7ca5ecf809e00132e792a","language":"java","text":"a.equals(b)\na.equals(b) \u0026\u0026 b.equals(c)"}]},{"__typename":"ReviewCard","id":"5fc288bbe42b8a0012492d14","title":"Comparing Primitive Values","body":"We can use relational operators, such as `==` and `!=`, to compare primitive and reference values. ","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fc28b7e61cfc90012b94b26","language":"java","text":"class ComparingPrimitives {\n public static void main(String[] args) {\n System.out.println(\"Comparing ints:\");\n System.out.println(4 == 5); // print false\n System.out.println(4 != 5); // print true\n System.out.println(4 == 4); // print true\n\n System.out.println(\"Comparing chars:\");\n System.out.println('a' == 'b'); // print false\n System.out.println('a' != 'b'); // print true\n System.out.println('a' == 'a'); // print true\n }\n}"}]},{"__typename":"ReviewCard","id":"5fc2908161cfc90012b94b2c","title":"Object Reference Aliases","body":" An alias means that more than one reference is tied to the same object.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fc291c761cfc90012b94b3a","language":"java","text":"class ComparingAliases {\n public static void main(String[] args) {\n String farmAnimal1 = new String(\"cat\");\n String farmAnimal2 = new String(\"cow\");\n // farmAnimal3 references the same object as farmAnimal2\n String farmAnimal3 = farmAnimal2;\n \n // comparing different objects\n System.out.println(farmAnimal1 == farmAnimal2); // print false\n // comparing object aliases\n System.out.println(farmAnimal2 == farmAnimal3); // print true\n }\n}"}]},{"__typename":"ReviewCard","id":"5fc297897611f60012786a0f","title":"Comparing Object Reference Aliases","body":"We can compare object reference values can be compared, using == and !=, to identify aliases.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fc29841e304650012a08b13","language":"java","text":"class ComparingAliases {\n public static void main(String[] args) {\n String farmAnimal1 = new String(\"cat\");\n String farmAnimal2 = new String(\"cow\");\n String farmAnimal3 = farmAnimal2;\n \n // comparing different objects\n System.out.println(farmAnimal1 == farmAnimal2); // print false\n // comparing object aliases\n System.out.println(farmAnimal2 == farmAnimal3); // print true\n }\n}"}]},{"__typename":"ReviewCard","id":"5fc7cb18c853670012513720","title":"Comparing Reference Values with Null","body":"We can compare a reference value with null, using == or !=, to determine if the reference actually references an object.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fc7cc98750863001246ae98","language":"java","text":"class Main\n{\n public static void main(String[] args)\n {\n String word = null;\n // checking that `word != null` avoids NullPointerException error\n if (word != null \u0026\u0026 word.indexOf(\"a\") \u003e= 0)\n {\n System.out.println(word + \" contains an a.\");\n }\n }\n}"}]},{"__typename":"ReviewCard","id":"5fc50dae22eca90012fb2630","title":"Custom Class Equals Method","body":"Classes often have their own equals method, which can be used to determine whether two objects of the class are equivalent.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fc6ce0b14c52600128d3c1f","language":"java","text":"class Pet {\n public String name;\n public String breed;\n public Pet (String name, String breed) {\n this.name = name;\n this.breed = breed;\n }\n // custom `equals()` method\n public boolean equals(Pet p) {\n return (p.name == name \u0026\u0026 p.breed == breed);\n }\n public static void main(String[] args) {\n Pet pet1 = new Pet(\"Air Bud\", \"Golden Retriever\");\n Pet pet2 = new Pet(\"Air Bud\", \"Golden Retriever\");\n // compare with `==`\n System.out.println(pet1 == pet2); \n // compare with `.equals()`\n System.out.println(pet1.equals(pet2)); \n }\n}"}]},{"__typename":"ReviewCard","id":"5fb83242a01c3500129f6c42","title":"DeMorgan's Laws","body":"DeMorgan's Laws can be used to rewrite expressions complex `boolean` expressions.\n \nThe first law states that two expressions that are negated together and compared using `\u0026\u0026` is equivalent to two separately negated expressions compared with `||`.\n\nThe second law states that two expressions that are compared with `||` and are negated together are equivalent to two separately negated expressions compared with `\u0026\u0026`.\n ","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fb8335be30465001235849b","language":"java","text":"int a = 2;\nint b = 3;\n\nboolean exp1 = !(a \u003e b \u0026\u0026 a == b);\n// rewrite using first law\nexp1 = !(a \u003e b) || !(a == b);\n\nboolean exp2 = !(a \u003c b || a != b);\n// rewrite using second law\nexp2 = !(a \u003c b) \u0026\u0026 !(a != b);"}]},{"__typename":"ReviewCard","id":"5fb8347191609a00128fe2aa","title":"Equivalent Boolean Expressions","body":"Equivalent `boolean` expressions are separate `boolean` expressions that always result in the same value. \n\nIf we were to replace a `boolean` expression in a program with an equivalent `boolean` expression, there would be no impact on the output of the program.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5fb83646e42b8a0012184ea8","language":"java","text":"int a = 1;\nint b = 2;\n// the followning expressions are equivalent\nboolean exp1 = !(a == b \u0026\u0026 b \u003e= a);\nboolean exp2 = !(a == b) || !(b \u003e= a);\nboolean exp3 = a != b || a \u003c b;\n\nSystem.out.println(exp1); // Prints: true\nSystem.out.println(exp2); // Prints: true\nSystem.out.println(exp3); // Prints: true"}]}],"tracks":[{"__typename":"Track","released":false,"id":"fdefc970099afa4d9d0e0cc24b994d5f","slug":"apcs-conditionals-and-control-flow","title":"Conditionals and Control Flow","lessonCount":2,"contentModuleIds":["3eaa9bf1a723e669af555587503daf40"],"grantsCertificate":true,"enrollmentStatus":"none","pro":false,"shortDescription":"Learn how to use conditionals - one of the most important tools in programming.","difficulty":"Beginner","metrics":{"__typename":"TrackMetricsType","medianDurationHours":null}}],"paths":[{"__typename":"Path","released":true,"id":"5fc508b822eca90012fb25eb","slug":"ap-computer-science-a","goal":"skill","title":"Study for the AP Computer Science A Exam (Java)","lessonCount":23,"trackCount":8,"enrollmentStatus":"none","shortDescription":"Master the core concepts covered in AP Computer Science A Exam and gain a solid understanding of programming and fluency in Java.","difficulty":"Beginner","metrics":{"__typename":"PathMetricsType","medianDurationHours":19.34}}]},"reviewCards":[{"id":"5dbd97c281d47500126b2a19","title":"else Statement","body":"The `else` statement executes a block of code when the condition inside the `if` statement is `false`. The `else` statement is always the last condition.","images":[],"codeSnippets":[{"id":"60072fab9a01c5000e07dc18","language":"java","text":"boolean condition1 = false;\n\nif (condition1){\n System.out.println(\"condition1 is true\");\n}\nelse{\n System.out.println(\"condition1 is not true\");\n}\n// Prints: condition1 is not true"}]},{"id":"5dbc707923f4e8001119308c","title":"else if Statements","body":"`else`-`if` statements can be chained together to check multiple conditions. Once a condition is `true`, a code block will be executed and the conditional statement will be exited.\n\nThere can be multiple `else`-`if` statements in a single conditional statement.","images":[],"codeSnippets":[{"id":"6006eda5de323b000ebc3e5e","language":"java","text":"int testScore = 76;\nchar grade;\n\nif (testScore \u003e= 90) {\n grade = 'A';\n} else if (testScore \u003e= 80) {\n grade = 'B';\n} else if (testScore \u003e= 70) {\n grade = 'C';\n} else if (testScore \u003e= 60) {\n grade = 'D';\n} else {\n grade = 'F';\n}\n\nSystem.out.println(\"Grade: \" + grade); // Prints: C"}]},{"id":"5db832c3e37c6400111db75c","title":"if Statement","body":"An `if` statement executes a block of code when a specified boolean expression is evaluated as `true`.","images":[],"codeSnippets":[{"id":"60072fb4b75112000e7b6224","language":"java","text":"if (true) {\n\tSystem.out.println(\"This code executes\");\n}\n// Prints: This code executes\n\nif (false) {\n\tSystem.out.println(\"This code does not execute\");\n}\n// There is no output for the above statement"}]},{"id":"5f68bcb8efef8c0013789b01","title":"Nested Conditional Statements","body":"A nested conditional statement is a conditional statement nested inside of another conditional statement. The outer conditional statement is evaluated first; if the condition is `true`, then the nested conditional statement will be evaluated.","images":[],"codeSnippets":[{"id":"5f68bd407c91b9001271bd34","language":"java","text":"boolean studied = true;\nboolean wellRested = true;\n\nif (wellRested) {\n System.out.println(\"Best of luck today!\"); \n if (studied) {\n System.out.println(\"You are prepared for your exam!\");\n } else {\n System.out.println(\"Study before your exam!\");\n }\n}\n\n// Prints: Best of luck today!\n// Prints: You are prepared for your exam!"}]},{"id":"5dc99de971981000115eee90","title":"NOT Operator","body":"The NOT logical operator is represented by `!`. This operator negates the value of a boolean expression.","images":[],"codeSnippets":[{"id":"6144f7e6ae2b35001c06e961","language":"java","text":"boolean a = true;\nSystem.out.println(!a); // Prints: false\n\nSystem.out.println(!false) // Prints: true"}]},{"id":"600206dfc5c121000e37a584","title":"AND Operator","body":"The AND logical operator is represented by `\u0026\u0026`. This operator returns `true` if the `boolean` expressions on both sides of the operator are `true`; otherwise, it returns `false`.","images":[],"codeSnippets":[{"id":"60020af7de323b000ebc3b94","language":"java","text":"System.out.println(true \u0026\u0026 true); // Prints: true\nSystem.out.println(true \u0026\u0026 false); // Prints: false\nSystem.out.println(false \u0026\u0026 true); // Prints: false\nSystem.out.println(false \u0026\u0026 false); // Prints: false"}]},{"id":"60020b1bfdccb7000ee8c31f","title":"The OR Operator","body":"The logical OR operator is represented by `||`. This operator will return `true` if at least one of the `boolean` expressions being compared has a `true` value; otherwise, it will return `false`.","images":[],"codeSnippets":[{"id":"60020b55978094000e2adc2f","language":"java","text":"System.out.println(true || true); // Prints: true\nSystem.out.println(true || false); // Prints: true\nSystem.out.println(false || true); // Prints: true\nSystem.out.println(false || false); // Prints: false"}]},{"id":"5f68b06d71604d00121093b1","title":"Conditional Operators - Order of Evaluation","body":"If an expression contains multiple conditional operators, the order of evaluation is as follows: Expressions in parentheses -\u003e NOT -\u003e AND -\u003e OR.","images":[],"codeSnippets":[{"id":"600206a8a05a31000e21e2c7","language":"java","text":"boolean foo = true \u0026\u0026 (!false || true); // true\n/* \n(!false || true) is evaluated first because it is contained within parentheses. \n\nThen !false is evaluated as true because it uses the NOT operator. \n\nNext, (true || true) is evaluation as true. \n\nFinally, true \u0026\u0026 true is evaluated as true meaning foo is true. */"}]},{"id":"5fc7c9f3caf7dc001276aff6","title":"Compare Object References","body":"Boolean expressions allow us to compare object references. A Boolean expression is a Java expression that, when evaluated, returns a Boolean value: true or false.","images":[],"codeSnippets":[{"id":"5fc7ca5ecf809e00132e792a","language":"java","text":"a.equals(b)\na.equals(b) \u0026\u0026 b.equals(c)"}]},{"id":"5fc288bbe42b8a0012492d14","title":"Comparing Primitive Values","body":"We can use relational operators, such as `==` and `!=`, to compare primitive and reference values. ","images":[],"codeSnippets":[{"id":"5fc28b7e61cfc90012b94b26","language":"java","text":"class ComparingPrimitives {\n public static void main(String[] args) {\n System.out.println(\"Comparing ints:\");\n System.out.println(4 == 5); // print false\n System.out.println(4 != 5); // print true\n System.out.println(4 == 4); // print true\n\n System.out.println(\"Comparing chars:\");\n System.out.println('a' == 'b'); // print false\n System.out.println('a' != 'b'); // print true\n System.out.println('a' == 'a'); // print true\n }\n}"}]},{"id":"5fc2908161cfc90012b94b2c","title":"Object Reference Aliases","body":" An alias means that more than one reference is tied to the same object.","images":[],"codeSnippets":[{"id":"5fc291c761cfc90012b94b3a","language":"java","text":"class ComparingAliases {\n public static void main(String[] args) {\n String farmAnimal1 = new String(\"cat\");\n String farmAnimal2 = new String(\"cow\");\n // farmAnimal3 references the same object as farmAnimal2\n String farmAnimal3 = farmAnimal2;\n \n // comparing different objects\n System.out.println(farmAnimal1 == farmAnimal2); // print false\n // comparing object aliases\n System.out.println(farmAnimal2 == farmAnimal3); // print true\n }\n}"}]},{"id":"5fc297897611f60012786a0f","title":"Comparing Object Reference Aliases","body":"We can compare object reference values can be compared, using == and !=, to identify aliases.","images":[],"codeSnippets":[{"id":"5fc29841e304650012a08b13","language":"java","text":"class ComparingAliases {\n public static void main(String[] args) {\n String farmAnimal1 = new String(\"cat\");\n String farmAnimal2 = new String(\"cow\");\n String farmAnimal3 = farmAnimal2;\n \n // comparing different objects\n System.out.println(farmAnimal1 == farmAnimal2); // print false\n // comparing object aliases\n System.out.println(farmAnimal2 == farmAnimal3); // print true\n }\n}"}]},{"id":"5fc7cb18c853670012513720","title":"Comparing Reference Values with Null","body":"We can compare a reference value with null, using == or !=, to determine if the reference actually references an object.","images":[],"codeSnippets":[{"id":"5fc7cc98750863001246ae98","language":"java","text":"class Main\n{\n public static void main(String[] args)\n {\n String word = null;\n // checking that `word != null` avoids NullPointerException error\n if (word != null \u0026\u0026 word.indexOf(\"a\") \u003e= 0)\n {\n System.out.println(word + \" contains an a.\");\n }\n }\n}"}]},{"id":"5fc50dae22eca90012fb2630","title":"Custom Class Equals Method","body":"Classes often have their own equals method, which can be used to determine whether two objects of the class are equivalent.","images":[],"codeSnippets":[{"id":"5fc6ce0b14c52600128d3c1f","language":"java","text":"class Pet {\n public String name;\n public String breed;\n public Pet (String name, String breed) {\n this.name = name;\n this.breed = breed;\n }\n // custom `equals()` method\n public boolean equals(Pet p) {\n return (p.name == name \u0026\u0026 p.breed == breed);\n }\n public static void main(String[] args) {\n Pet pet1 = new Pet(\"Air Bud\", \"Golden Retriever\");\n Pet pet2 = new Pet(\"Air Bud\", \"Golden Retriever\");\n // compare with `==`\n System.out.println(pet1 == pet2); \n // compare with `.equals()`\n System.out.println(pet1.equals(pet2)); \n }\n}"}]},{"id":"5fb83242a01c3500129f6c42","title":"DeMorgan's Laws","body":"DeMorgan's Laws can be used to rewrite expressions complex `boolean` expressions.\n \nThe first law states that two expressions that are negated together and compared using `\u0026\u0026` is equivalent to two separately negated expressions compared with `||`.\n\nThe second law states that two expressions that are compared with `||` and are negated together are equivalent to two separately negated expressions compared with `\u0026\u0026`.\n ","images":[],"codeSnippets":[{"id":"5fb8335be30465001235849b","language":"java","text":"int a = 2;\nint b = 3;\n\nboolean exp1 = !(a \u003e b \u0026\u0026 a == b);\n// rewrite using first law\nexp1 = !(a \u003e b) || !(a == b);\n\nboolean exp2 = !(a \u003c b || a != b);\n// rewrite using second law\nexp2 = !(a \u003c b) \u0026\u0026 !(a != b);"}]},{"id":"5fb8347191609a00128fe2aa","title":"Equivalent Boolean Expressions","body":"Equivalent `boolean` expressions are separate `boolean` expressions that always result in the same value. \n\nIf we were to replace a `boolean` expression in a program with an equivalent `boolean` expression, there would be no impact on the output of the program.","images":[],"codeSnippets":[{"id":"5fb83646e42b8a0012184ea8","language":"java","text":"int a = 1;\nint b = 2;\n// the followning expressions are equivalent\nboolean exp1 = !(a == b \u0026\u0026 b \u003e= a);\nboolean exp2 = !(a == b) || !(b \u003e= a);\nboolean exp3 = a != b || a \u003c b;\n\nSystem.out.println(exp1); // Prints: true\nSystem.out.println(exp2); // Prints: true\nSystem.out.println(exp3); // Prints: true"}]}],"relatedContent":[{"id":"5fc508b822eca90012fb25eb","slug":"ap-computer-science-a","urlPath":"/learn/paths/ap-computer-science-a","imageUrl":"https://static-assets.codecademy.com/components/curriculum/path/ap-computer-science-a/curriculum-card.svg","goal":"skill","title":"Study for the AP Computer Science A Exam (Java)","lessonCount":23,"courseCount":8,"enrollmentStatus":"none","shortDescription":"Master the core concepts covered in AP Computer Science A Exam and gain a solid understanding of programming and fluency in Java.","difficulty":"Beginner","timeToComplete":19,"hasCareerJourney":false,"type":"path"}],"pathSlug":"ap-computer-science-a","__NEXTJS_CONTEXT__":{"cookie":null,"isPreview":false}},"__N_SSG":true},"page":"/learn/paths/[pathSlug]/tracks/[courseSlug]/modules/[moduleSlug]/cheatsheet","query":{"pathSlug":"ap-computer-science-a","courseSlug":"apcs-conditionals-and-control-flow","moduleSlug":"apcs-conditionals-and-control-flow"},"buildId":"portal-app-10b4a003571504fb0cc6f52c5fa4b3ba2701e379","assetPrefix":"/_portal","isFallback":false,"isExperimentalCompile":false,"gsp":true,"scriptLoader":[]}</script>

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
