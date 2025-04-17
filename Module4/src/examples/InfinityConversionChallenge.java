public class InfinityConversionChallenge {
    public static void main(String[] args) {
        Double positiveInfWrapper = Double.POSITIVE_INFINITY;
        // Unbox the infinitely large `Double` into an `int`
        int positiveInf = positiveInfWrapper.intValue();
        // Modify the if condition to test if the integer value is equal to the
        // `MAX_VALUE` static field from the `Integer` class
        if (positiveInf == Integer.MAX_VALUE) {
            System.out.print("True");
        }
    }
}
