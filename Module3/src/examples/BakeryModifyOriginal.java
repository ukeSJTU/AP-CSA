package examples;

public class BakeryModifyOriginal {
    CupcakeBasic bakeryCupcake;
    double price;
    String giveTotal;

    public BakeryModifyOriginal(CupcakeBasic cupcakeType, double priceOf) {
        bakeryCupcake = cupcakeType;
        // change cupcake object flavor to vanilla
        bakeryCupcake.flavor = "vanilla";
        price = priceOf;
        giveTotal = "The " + bakeryCupcake.flavor + " cupcake is €" + price;
    }
}
