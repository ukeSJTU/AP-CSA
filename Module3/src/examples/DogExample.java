package examples;

public class DogExample {
    // instance field
    public String breed;

    // constructor method
    public DogExample(String dogBreed) {
        // value of parameter dogBreed assigned to instance field breed
        breed = dogBreed;
    }

    public static void main(String[] args) {
        // create instance: use 'new' operator and invoke constructor
        DogExample fido = new DogExample("poodle");
        // fields are accessed using: the instance name, `.` operator, and the field
        // name.
        System.out.println(fido.breed); // Prints "poodle"
    }
}
