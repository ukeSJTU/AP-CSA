package examples;

public class IfThenElseIfExample {
    public static void main(String[] args) {
        // Example of chained if-then-else-if statement for course selection
        String course = "Theatre";
        if (course.equals("Biology")) {
            System.out.println("Enroll in Biology course");
        } else if (course.equals("Algebra")) {
            System.out.println("Enroll in Algebra course");
        } else if (course.equals("Theatre")) {
            System.out.println("Enroll in Theatre course");
        } else {
            System.out.println("Course not found!");
        }

        // Example of chained if-then-else-if for grading
        int testScore = 72;
        if (testScore >= 90) {
            System.out.println("A");
        } else if (testScore >= 80) {
            System.out.println("B");
        } else if (testScore >= 70) {
            System.out.println("C");
        } else if (testScore >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
