# Quiz: Java Methods

---

# Question 1: Method Signature with Return and Parameter

-   Which method signature would make a method that returns an `int` and takes in a `String`?

-v-

# Question 1: Answer

-   `public int countLetters(String message)`. The return type is `int` and the input is of type `String`.

---

# Question 2: Identifying Non-Method Call

-   Which line of code is **NOT** an example of calling a method?

-v-

# Question 2: Answer

-   `int sugarCubes = 7;`. This line of code represents a variable being declared and initialized, not a method being called.

---

# Question 3: Purpose of `void` Keyword

-   When defining a method, the `void` keyword specifies which of the following?

-v-

# Question 3: Answer

-   The method does not return a value. `void` means that nothing is returned from the method call.

---

# Question 4: Calling Method on Object

-   An object named `dalmatian` belongs to the Spot class. Which of the following correctly calls the `run` method on `dalmatian`?

-v-

# Question 4: Answer

-   `dalmatian.run();`. The object is `dalmatian`, and the method `run()` is being called on it.

---

# Question 5: Calling Method with Input

-   Fill in the code that will call the `addSugar()` method with 7 as an input.
-   **Code:**
    ```java
    public class Coffee {
        public Coffee(){
        }
        public void addSugar(int sugarCubes){
            System.out.println("Added " + sugarCubes + " sugar cubes!");
        }
        public static void main(String[] args){
            Coffee myCup = new Coffee();
            myCup.addSugar(7);
        }
    }
    ```

-v-

# Question 5: Answer

-   `myCup.addSugar(7);`

---

# Question 6: Identifying Parameter in Method

-   In this method definition, what does `miles` represent?
-   **Code:**
    ```java
    public void run(int miles) {}
    ```

-v-

# Question 6: Answer

-   A parameter of type `int`. It is the `int` input to the `run()` method.

---

# Question 7: Error in Code Scope

-   Is there an error that will prevent this code from running?
-   **Code:**
    ```java
    class Coffee{
        public Coffee(){
        }
        public void stir(){
            String stirring = "Stirring the coffee!";
        }
        public static void main(String[] args){
            Coffee myCup = new Coffee();
            myCup.stir();
            System.out.println(stirring);
        }
    }
    ```

-v-

# Question 7: Answer

-   Yes! The variable `stirring` cannot be accessed in the `main()` method. `stirring` only exists within the `stir()` method.
