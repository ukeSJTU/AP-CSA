import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(5);
        int num = myArrayList.get(0); // Asking for the first (technically "zero-th") number in myArrayList. num
                                      // should now hold 5.
        System.out.println("Retrieved number: " + num);
    }
}
