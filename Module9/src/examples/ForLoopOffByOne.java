public class ForLoopOffByOne {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum); // This produces 45, missing 10
    }
}
