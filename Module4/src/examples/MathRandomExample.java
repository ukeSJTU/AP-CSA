public class MathRandomExample {
    public static void main(String[] args) {
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());

        // Random double value between 0 and 10, not including 10
        double a = Math.random() * 10;
        System.out.println("Random double between 0 and 10: " + a);

        // Random int value between 0 and 9
        int b = (int) (Math.random() * 10);
        System.out.println("Random int between 0 and 9: " + b);

        // Random int value between 1 and 10
        int c = (int) (Math.random() * 10) + 1;
        System.out.println("Random int between 1 and 10: " + c);

        // Random int value between 10 and 20
        int d = (int) (Math.random() * 11) + 10;
        System.out.println("Random int between 10 and 20: " + d);
    }
}
