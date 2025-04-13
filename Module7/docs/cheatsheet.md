# A Deeper Dive Into Classes: Access, Encapsulation, and Static Methods Cheatsheet | Codecademy

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
