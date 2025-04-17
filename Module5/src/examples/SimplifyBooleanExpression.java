package examples;

public class SimplifyBooleanExpression {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        boolean exp1 = !(a == b && b >= a);
        boolean exp2 = !(a == b) || !(b >= a);
        boolean exp3 = a != b || b < a;
        System.out.println("exp1 (!(a == b && b >= a)): " + exp1);
        System.out.println("exp2 (!(a == b) || !(b >= a)): " + exp2);
        System.out.println("exp3 (a != b || b < a): " + exp3);
    }
}
