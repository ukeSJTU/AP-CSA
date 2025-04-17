public class Coffee {
    public static void main(String[] args) {
        // Solution using while loop
        System.out.println("Using while loop:");
        int cupsOfCoffee = 1;
        while (cupsOfCoffee <= 100) {
            System.out.println("Fry drinks cup of coffee #" + cupsOfCoffee);
            cupsOfCoffee++;
        }

        // Solution using for loop (as per later instruction to refactor)
        System.out.println("\nUsing for loop:");
        for (int i = 1; i <= 100; i++) {
            System.out.println("Fry drinks cup of coffee #" + i);
        }
    }
}
