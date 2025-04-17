import java.util.ArrayList;

public class Lunch {
    public static ArrayList<String> removeAnts(ArrayList<String> lunchBox) {
        // TODO: Use a for or while loop to iterate through lunchBox
        // TODO: Remove any element with the value "ant"
        // TODO: Return lunchBox after the loop

        return lunchBox;
    }

    public static void main(String[] args) {
        ArrayList<String> lunchContainer = new ArrayList<String>();
        lunchContainer.add("apple");
        lunchContainer.add("ant");
        lunchContainer.add("ant");
        lunchContainer.add("sandwich");
        lunchContainer = removeAnts(lunchContainer);
        System.out.println(lunchContainer);
    }
}
