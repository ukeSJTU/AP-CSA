import java.util.Random;

public class LuckyFive {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int dieRoll = randomGenerator.nextInt(6) + 1;

        // TODO: Create a while loop that continues while dieRoll is NOT 5
        // Inside the loop, reset dieRoll with a new random value (1-6) and print it
    }
}
