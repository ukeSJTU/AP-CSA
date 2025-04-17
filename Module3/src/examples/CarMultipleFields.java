package examples;

public class CarMultipleFields {
    String color;
    // new fields!
    boolean isRunning;
    int velocity;

    // new parameters that correspond to the new fields
    public CarMultipleFields(String carColor, boolean carRunning, int milesPerHour) {
        color = carColor;
        // assign new parameters to the new fields
        isRunning = carRunning;
        velocity = milesPerHour;
    }
}
