package examples;

public class ComparePrimitives {
    public static void main(String[] args) {
        System.out.println("Comparing ints:");
        int number1 = 5;
        int number2 = 7;
        int number3 = 5;
        System.out.println(number1 == number2);
        System.out.println(number1 != number2);
        System.out.println(number1 == number3);
        System.out.println("Comparing chars:");
        char letter1 = 'a';
        char letter2 = 'b';
        char letter3 = 'a';
        System.out.println(letter1 == letter2);
        System.out.println(letter1 != letter2);
        System.out.println(letter1 == letter3);
    }
}
