package examples;

public class BakeryUsage {
    public static void main(String[] args) {
        CupcakeBasic chocolateSprinkle = new CupcakeBasic("chocolate", true);
        BakeryWithParameter myBakery = new BakeryWithParameter(chocolateSprinkle, 3.25);
        System.out.println(myBakery.giveTotal);
    }
}
