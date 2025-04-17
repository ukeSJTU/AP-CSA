import java.util.ArrayList;

public class RemoveWhileLoop {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);

        int i = 0; // initialize counter
        while (i < lst.size()) {
            // if value is odd, remove value
            if (lst.get(i) % 2 != 0) {
                lst.remove(i);
            } else {
                // if value is even, increment counter
                i++;
            }
        }
        System.out.println("After removing odd numbers: " + lst);
    }
}
