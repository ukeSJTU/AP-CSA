package examples;

public class ConditionalAndExample {
    public static void main(String[] args) {
        // Example of using AND operator for student enrollment
        boolean tuitionPaid = true;
        boolean hasPrerequisite = true;

        if (tuitionPaid && hasPrerequisite) {
            System.out.println("Enroll student");
        }

        // Illustrating all combinations of AND operator
        System.out.println("true && true: " + (true && true)); // true
        System.out.println("false && true: " + (false && true)); // false
        System.out.println("true && false: " + (true && false)); // false
        System.out.println("false && false: " + (false && false)); // false
    }
}
