package exercises.solution;

public class OperatorsEvaluation {
    public static void main(String[] args) {
        // Expression 1: true && !false
        boolean result1 = true; // true && !false evaluates to true && true = true
        System.out.println("Expression 1 (true && !false): " + result1);

        // Expression 2: (false && true) || !(true && false)
        boolean result2 = true; // (false && true) = false, !(true && false) = !false = true, so false || true =
                                // true
        System.out.println("Expression 2 ((false && true) || !(true && false)): " + result2);

        // Expression 3: !true || (false && true || true)
        boolean result3 = true; // !true = false, (false && true || true) = false || true = true, so false ||
                                // true = true
        System.out.println("Expression 3 (!true || (false && true || true)): " + result3);
    }
}
