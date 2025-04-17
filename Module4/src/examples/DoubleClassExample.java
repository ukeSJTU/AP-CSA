public class DoubleClassExample {
    public static void main(String[] args) {
        Double wrapperDouble = new Double(10.34);
        Double wrapperDoubleFromStr = new Double("20.40");
        Double inf = Double.POSITIVE_INFINITY;
        Double negInf = Double.NEGATIVE_INFINITY;
        if (Double.isInfinite(inf + 1)) {
            System.out.println("Infinite");
        }
        double value = wrapperDouble.doubleValue();
        float convertedVal = wrapperDoubleFromStr.floatValue();

        System.out.println("wrapperDouble: " + wrapperDouble);
        System.out.println("wrapperDoubleFromStr: " + wrapperDoubleFromStr);
        System.out.println("Positive Infinity: " + inf);
        System.out.println("Negative Infinity: " + negInf);
        System.out.println("Unboxed double value: " + value);
        System.out.println("Converted to float: " + convertedVal);
    }
}
