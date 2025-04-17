package examples;

public class CarStartRadio {
    String color;

    public CarStartRadio(String carColor) {
        color = carColor;
    }

    public void startRadio(double stationNum, String stationName) {
        System.out.println("Turning on the radio to " + stationNum + ", " + stationName + "!");
        System.out.println("Enjoy!");
    }

    public static void main(String[] args) {
        CarStartRadio myCar = new CarStartRadio("red");
        myCar.startRadio(103.7, "Meditation Station");
    }
}
