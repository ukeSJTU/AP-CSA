public class IntegerClassExample {
    public static void main(String[] args) {
        Integer wrapperInt = new Integer(5);
        Integer wrapperInt2 = Integer.valueOf(230);
        Integer wrapperFromStr = new Integer("100");
        int primitiveIntFromWrapper = Integer.parseInt("150");
        int primitiveIntFromWrapper2 = wrapperFromStr.intValue();
        double convertedValue = wrapperInt.doubleValue();

        System.out.println("wrapperInt: " + wrapperInt);
        System.out.println("wrapperInt2: " + wrapperInt2);
        System.out.println("wrapperFromStr: " + wrapperFromStr);
        System.out.println("primitiveIntFromWrapper: " + primitiveIntFromWrapper);
        System.out.println("primitiveIntFromWrapper2: " + primitiveIntFromWrapper2);
        System.out.println("convertedValue to double: " + convertedValue);

        Integer wrapperIntMax = Integer.MAX_VALUE;
        Integer wrapperIntMin = Integer.MIN_VALUE;
        System.out.println("Max Integer Value: " + wrapperIntMax);
        System.out.println("Min Integer Value: " + wrapperIntMin);
    }
}
