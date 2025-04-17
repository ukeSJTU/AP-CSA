import java.util.ArrayList;

public class ArrayListTraversal {
    public static void main(String[] args) {
        ArrayList<Integer> secretCode = new ArrayList<>();
        secretCode.add(1);
        secretCode.add(2);
        secretCode.add(3);
        secretCode.add(4);
        secretCode.add(5);

        for (int i = 0; i < secretCode.size(); i++) {
            // Increase value of element by 1
            int num = secretCode.get(i);
            secretCode.set(i, num + 1);
            System.out.println("Updated value at index " + i + ": " + secretCode.get(i));
        }
    }
}
