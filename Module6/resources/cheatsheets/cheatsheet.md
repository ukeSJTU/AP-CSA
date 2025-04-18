# String Methods Cheatsheet

## length() String Method in Java

In Java, the `length()` string method returns the total number of characters – the length – of a `String`.

```java
String str = "Codecademy";
System.out.println(str.length());
// prints 10
```

## indexOf() String Method in Java

In Java, the `indexOf()` string method returns the first occurrence of a character or a substring in a `String`. The character/substring that you want to find the index of goes inside of the `()`.

If `indexOf()` cannot find the character or substring, it will return -1.

```java
String str = "Hello World!";
System.out.println(str.indexOf("l"));
// prints 2
System.out.println(str.indexOf("Wor"));
// prints 6
System.out.println(str.indexOf("z"));
// prints -1
```

## concat() String Method in Java

In Java, the `concat()` string method is used to append one `String` to the end of another `String`. This method returns a `String` representing the text of the combined strings.

```java
String s1 = "Hello";
String s2 = " World!";
String s3 = s1.concat(s2);
// concatenates strings s1 and s2
System.out.println(s3);
// prints "Hello World!"
```

## equals() String Method in Java

In Java, the `equals()` string method tests for equality between two `String`s.

`equals()` compares the contents of each `String`. If all of the characters between the two match, the method returns `true`. If any of the characters do not match, it returns `false`.

Additionally, if you want to compare two strings without considering upper/lower cases, you can use `.equalsIgnoreCase()`.

```java
String s1 = "Hello";
String s2 = "World";
System.out.println(s1.equals("Hello"));
// prints true
System.out.println(s2.equals("Hello"));
// prints false
System.out.println(s2.equalsIgnoreCase("world"));
// prints true
```

## charAt() String Method in Java

In Java, the `charAt()` string method returns the character of a `String` at a specified index. The index value is passed inside of the `()`, and should lie between 0 and `length()-1`.

```java
String str = "This is a string";
System.out.println(str.charAt(0));
// prints 'T'
System.out.println(str.charAt(15));
// prints 'g'
```

## toUpperCase() and toLowerCase() String Methods

In Java, we can easily convert a `String` to upper and lower case with the help of a few string methods:

-   `toUpperCase()` returns the string value converted to uppercase.
-   `toLowerCase()` returns the string value converted to lowercase.

```java
String str = "Hello World!";
String uppercase = str.toUpperCase();
// uppercase = "HELLO WORLD!"
String lowercase = str.toLowerCase();
// lowercase = "hello world!"
```
