package exercises.solution;

import java.util.ArrayList;

public class ToDos_IndexOf {
    public static void main(String[] args) {
        // Sherlock
        ArrayList<String> sherlocksToDos = new ArrayList<String>();
        sherlocksToDos.add("visit the crime scene");
        sherlocksToDos.add("play violin");
        sherlocksToDos.add("interview suspects");
        sherlocksToDos.add("listen to Dr. Watson for amusement");
        sherlocksToDos.add("solve the case");
        sherlocksToDos.add("apprehend the criminal");
        sherlocksToDos.remove("visit the crime scene");
        // Calculate to-dos until case is solved by finding the index of "solve the
        // case"
        int solved = sherlocksToDos.indexOf("solve the case");
        // Print the number of to-dos remaining before Sherlock reaches "solve the case"
        System.out.println(solved);
    }
}
