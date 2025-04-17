package examples;

public class ConditionalOrExample {
    public static void main(String[] args) {
        // Example of using OR operator for course enrollment
        boolean hasAlgebraPrerequisite = false;
        boolean hasGeometryPrerequisite = true;

        if (hasAlgebraPrerequisite || hasGeometryPrerequisite) {
            System.out.println("Enroll in course");
        }

        // Illustrating all combinations of OR operator
        System.out.println("true || true: " + (true || true)); // true
        System.out.println("false || true: " + (false || true)); // true
        System.out.println("true || false: " + (true || false)); // true
        System.out.println("false || false: " + (false || false)); // false

        // Example of short-circuited evaluation
        if (1 > 0 || 2 / 0 == 7) {
            System.out.println("No errors here due to short-circuit!");
        }
    }
}
