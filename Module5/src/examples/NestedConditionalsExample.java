package examples;

public class NestedConditionalsExample {
    public static void main(String[] args) {
        // Example of nested conditional statements for weather-based decisions
        int temp = 45;
        boolean raining = true;
        if (temp < 60) {
            System.out.println("Wear a jacket!");
            if (raining == true) {
                System.out.println("Bring your umbrella.");
            } else {
                System.out.println("Leave your umbrella home.");
            }
        }
    }
}
