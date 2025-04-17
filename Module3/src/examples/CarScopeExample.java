package examples;

public class CarScopeExample {
    String color;
    int milesDriven;

    public CarScopeExample(String carColor) {
        color = carColor;
        milesDriven = 0;
    }

    public void drive() {
        String message = "Miles driven: " + milesDriven;
        System.out.println(message);
    }

    public static void main(String[] args) {
        CarScopeExample myFastCar = new CarScopeExample("red");
        myFastCar.drive();
    }
}
