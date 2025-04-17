package examples;

public class BakeryWithParameter {
    CupcakeBasic bakeryCupcake;
    double price;
    String giveTotal;

    public BakeryWithParameter(CupcakeBasic cupcakeType, double priceOf) {
        bakeryCupcake = cupcakeType;
        price = priceOf;
        giveTotal = "The " + bakeryCupcake.flavor + " cupcake is €" + price;
    }
}
