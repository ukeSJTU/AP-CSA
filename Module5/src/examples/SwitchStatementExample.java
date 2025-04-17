package examples;

public class SwitchStatementExample {
    public static void main(String[] args) {
        // Example of switch statement for course selection
        String course = "History";
        switch (course) {
            case "Algebra":
                System.out.println("Enroll in Algebra");
                break;
            case "Biology":
                System.out.println("Enroll in Biology");
                break;
            case "History":
                System.out.println("Enroll in History");
                break;
            case "Theatre":
                System.out.println("Enroll in Theatre");
                break;
            default:
                System.out.println("Course not found");
        }

        // Example showing fall-through behavior without break
        String course2 = "Biology";
        switch (course2) {
            case "Algebra":
                System.out.println("Enroll in Algebra");
            case "Biology":
                System.out.println("Enroll in Biology");
            case "History":
                System.out.println("Enroll in History");
            case "Theatre":
                System.out.println("Enroll in Theatre");
            default:
                System.out.println("Course not found - fall-through example");
        }
    }
}
