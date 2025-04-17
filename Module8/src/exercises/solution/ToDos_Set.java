package exercises.solution;

import java.util.ArrayList;

public class ToDos_Set {
    public static void main(String[] args) {
        // Sherlock
        ArrayList<String> sherlocksToDos = new ArrayList<String>();
        sherlocksToDos.add("visit the crime scene");
        sherlocksToDos.add("play violin");
        sherlocksToDos.add("interview suspects");
        sherlocksToDos.add("solve the case");
        sherlocksToDos.add("apprehend the criminal");
        // Poirot
        ArrayList<String> poirotsToDos = new ArrayList<String>();
        poirotsToDos.add("visit the crime scene");
        poirotsToDos.add("interview suspects");
        poirotsToDos.add("let the little grey cells do their work");
        poirotsToDos.add("trim mustache");
        poirotsToDos.add("call all suspects together");
        poirotsToDos.add("reveal the truth of the crime");
        // Modify sherlocksToDos so that "play violin" becomes "listen to Dr. Watson for
        // amusement"
        sherlocksToDos.set(1, "listen to Dr. Watson for amusement");
        // Modify poirotsToDos so that "trim mustache" becomes "listen to Captain
        // Hastings for amusement"
        poirotsToDos.set(3, "listen to Captain Hastings for amusement");
        System.out.println("Sherlock's to-do list:");
        System.out.println(sherlocksToDos.toString() + "\n");
        System.out.println("Poirot's to-do list:");
        System.out.println(poirotsToDos.toString());
    }
}
