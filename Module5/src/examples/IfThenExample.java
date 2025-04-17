package examples;

public class IfThenExample {
    public static void main(String[] args) {
        // Example of an if-then statement
        if (true) {
            System.out.println("Hello World!");
        }

        // Using a variable for the condition
        boolean isValidPassword = true;
        if (isValidPassword) {
            System.out.println("Password accepted!");
        }

        // Using a comparison for the condition
        int numberOfItemsInCart = 9;
        if (numberOfItemsInCart > 12) {
            System.out.println("Express checkout not available");
        }

        // Brief conditional without curly braces
        if (true)
            System.out.println("Brevity is the soul of wit");
    }
}
