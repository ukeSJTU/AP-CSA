public class StringToInt {
    public static void main(String[] args) {
        String numString = "12";
        // convert String to int
        int numInt = Integer.parseInt(numString);
        System.out.println("The int value: " + numInt); // Prints: The int value: 12
        // we can now use the value like any other int
        numInt++;
        System.out.println(numInt); // Prints: 13
    }
}
