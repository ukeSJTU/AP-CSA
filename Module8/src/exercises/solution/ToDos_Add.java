package exercises.solution;

import java.util.ArrayList;

public class ToDos_Add {
    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<String>();
        String toDo1 = "Water plants";
        String toDo2 = "Do laundry";
        String toDo3 = "Wash the dishes";
        toDoList.add(toDo1);
        toDoList.add(toDo2);
        toDoList.add(toDo3);
        System.out.println(toDoList);
    }
}
