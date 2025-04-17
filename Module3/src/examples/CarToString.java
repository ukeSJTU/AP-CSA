package examples;

public class CarToString {
    String color;

    public CarToString(String carColor) {
        color = carColor;
    }

    public static void main(String[] args) {
        CarToString myCar = new CarToString("red");
        System.out.println(myCar);
    }

    public String toString() {
        return "This is a " + color + " car!";
    }
}
