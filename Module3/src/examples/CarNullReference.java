package examples;

public class CarNullReference {
    public static void main(String[] args) {
        CarNullReference thunderBird = new CarNullReference();
        System.out.println(thunderBird); // Prints: Car@76ed5528
        thunderBird = null; // change value to null
        System.out.println(thunderBird); // Prints: null
    }
}
