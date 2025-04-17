public class ArrayTraversal {
    public static void main(String[] args) {
        int[] secretCode = { 1, 2, 3, 4, 5 }; // Example array
        for (int i = 0; i < secretCode.length; i++) {
            // Increase value of element by 1
            secretCode[i] += 1;
            System.out.println("Updated value at index " + i + ": " + secretCode[i]);
        }
    }
}
