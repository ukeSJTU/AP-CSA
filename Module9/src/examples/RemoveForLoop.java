import java.util.ArrayList;

public class RemoveForLoop {
    public static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<>();
        lst.add("value to keep");
        lst.add("value to remove");
        lst.add("value to keep");
        lst.add("value to remove");

        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i).equals("value to remove")) {
                // remove value from ArrayList
                lst.remove(i);
                // Decrease loop control variable by 1
                i--;
            }
        }
        System.out.println("After removing: " + lst);
    }
}
