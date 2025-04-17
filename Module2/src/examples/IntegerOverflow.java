public class IntegerOverflow {
    public static void main(String[] args) {
        // the sum of the following expression is outside the appropriate int range
        int b = 2147483645 + 3;
        System.out.println(b);
    }
}
