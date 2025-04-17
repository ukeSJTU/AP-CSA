package examples;

public class LogicalNotExample {
    public static void main(String[] args) {
        // Example of using NOT operator
        boolean hasPrerequisite = false;
        if (!hasPrerequisite) {
            System.out.println("Must complete prerequisite course!");
        }

        // Illustrating NOT operator behavior
        System.out.println("!false: " + (!false)); // true
        System.out.println("!true: " + (!true)); // false
    }
}
