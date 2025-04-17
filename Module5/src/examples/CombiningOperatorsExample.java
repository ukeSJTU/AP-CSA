package examples;

public class CombiningOperatorsExample {
    public static void main(String[] args) {
        // Example of combining conditional operators
        boolean foo = true && !(false || !true);
        System.out.println("Value of foo (true && !(false || !true)): " + foo);

        // Breaking down the evaluation step by step
        System.out.println("Step 1: !true = " + (!true)); // false
        System.out.println("Step 2: false || false = " + (false || false)); // false
        System.out.println("Step 3: !false = " + (!false)); // true
        System.out.println("Step 4: true && true = " + (true && true)); // true
    }
}
