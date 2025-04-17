package examples;

public class CarAssignValues {
    public String color;

    public CarAssignValues(String carColor) {
        // assign parameter value to instance field
        color = carColor;
    }

    public static void main(String[] args) {
        CarAssignValues ferrari = new CarAssignValues("red");
        System.out.println(ferrari.color); // Prints: "red"
    }
}
