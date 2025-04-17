package examples;

public class BakeryWithCopy {
    CupcakeCopyConstructor bakeryCupcake;
    double price;
    String giveTotal;

    public BakeryWithCopy(CupcakeCopyConstructor cupcakeType, double priceOf) {
        // Create a copy Cupcake object
        CupcakeCopyConstructor copy = new CupcakeCopyConstructor(cupcakeType);
        // set bakeryCupcake to hold value of object copy
        bakeryCupcake = copy;
        price = priceOf;
        bakeryCupcake.flavor = "vanilla";
        giveTotal = "The " + bakeryCupcake.flavor + " cupcake is €" + price;
    }
}
