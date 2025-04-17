package examples;

public class NullCheckExample {
    public static void main(String[] args) {
        // Example of null check to avoid NullPointerException
        String word = null;
        if (word != null && word.indexOf("a") >= 0) {
            System.out.println(word + " contains an a.");
        }

        // Example with a non-null value
        word = "Alphabet";
        if (word != null && word.indexOf("a") >= 0) {
            System.out.println(word + " contains an a.");
        }
    }
}
