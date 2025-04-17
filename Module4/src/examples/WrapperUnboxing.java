public class WrapperUnboxing {
    public static void main(String[] args) {
        // Autoboxing into Integers
        Integer wrapper = 3;
        Integer wrapper2 = Integer.valueOf(15);
        // Unboxing back to ints
        int primitiveInt = wrapper;
        int primitiveInt2 = wrapper2.intValue();

        System.out.println("Unboxed int from wrapper: " + primitiveInt);
        System.out.println("Unboxed int from wrapper2 using intValue(): " + primitiveInt2);
    }
}
