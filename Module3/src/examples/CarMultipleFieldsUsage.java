package examples;

public class CarMultipleFieldsUsage {
    public static void main(String[] args) {
        // new values passed into the method call
        CarMultipleFields ferrari = new CarMultipleFields("red", true, 27);
        CarMultipleFields renault = new CarMultipleFields("blue", false, 70);
        System.out.println(renault.isRunning); // false
        System.out.println(ferrari.velocity); // 27

        // values match types, no error
        CarMultipleFields honda = new CarMultipleFields("green", false, 0);
        // values do not match types, error!
        // CarMultipleFields junker = new CarMultipleFields(true, 42, "brown");
    }
}
