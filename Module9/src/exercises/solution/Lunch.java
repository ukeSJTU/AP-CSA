import java.util.ArrayList;

public class Lunch {
    public static ArrayList<String> removeAnts(ArrayList<String> lunchBox) {
        int i = 0;
        while (i < lunchBox.size()) {
            if (lunchBox.get(i).equals("ant")) {
                lunchBox.remove(i);
            } else {
                i++;
            }
        }
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
