package examples;

public class CarMultipleConstructors {
    public String color;
    public int mpg;
    public boolean isElectric;

    // constructor 1
    public CarMultipleConstructors(String carColor, int milesPerGallon) {
        color = carColor;
        mpg = milesPerGallon;
    }

    // constructor 2
    public CarMultipleConstructors(boolean electricCar, int milesPerGallon) {
        isElectric = electricCar;
        mpg = milesPerGallon;
    }
}
