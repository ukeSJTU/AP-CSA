package examples;

public class CarStartEngine {
    String color;

    public CarStartEngine(String carColor) {
        color = carColor;
    }

    public void startEngine() {
        System.out.println("Starting the car!");
        System.out.println("Vroom!");
    }

    public static void main(String[] args) {
        CarStartEngine myFastCar = new CarStartEngine("red");
        // Call a method on an object
        myFastCar.startEngine();
        System.out.println("That was one fast car!");
    }
}
