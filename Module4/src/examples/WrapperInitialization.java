public class WrapperInitialization {
    public static void main(String[] args) {
        Double wrapper1 = 23.456;
        Integer wrapper2 = 3;
        Double wrapper3 = new Double(13.57);
        Integer wrapper4 = new Integer(7);
        Double wrapper5 = Double.valueOf(30.59);
        Integer wrapper6 = Integer.valueOf(15);

        System.out.println("Wrapper1 (Double): " + wrapper1);
        System.out.println("Wrapper2 (Integer): " + wrapper2);
        System.out.println("Wrapper3 (Double): " + wrapper3);
        System.out.println("Wrapper4 (Integer): " + wrapper4);
        System.out.println("Wrapper5 (Double): " + wrapper5);
        System.out.println("Wrapper6 (Integer): " + wrapper6);
    }
}
