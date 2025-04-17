package examples;

public class CarDefaultValues {
    public String color = "red";
    public boolean isElectric = false;
    public int cupHolders = 4;

    public static void main(String[] args) {
        CarDefaultValues myCar = new CarDefaultValues();
        System.out.println(myCar.color); // Prints: red
    }
}
