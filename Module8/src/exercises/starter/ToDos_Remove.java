package exercises.starter;

import java.util.ArrayList;

public class ToDos_Remove {
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
        // TODO: Remove "visit the crime scene" from both sherlocksToDos and
        // poirotsToDos using remove()
        // TODO: Also remove "play violin" from sherlocksToDos
        System.out.println(sherlocksToDos.toString() + "\n");
        System.out.println(poirotsToDos.toString());
    }
}
