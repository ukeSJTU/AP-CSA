package examples;

public class CupcakeCopyConstructor {
    String flavor;
    boolean sprinkles;

    // original constructor
    public CupcakeCopyConstructor(String type, boolean hasSprinkles) {
        flavor = type;
        sprinkles = hasSprinkles;
    }

    // copy constructor
    public CupcakeCopyConstructor(CupcakeCopyConstructor copy) {
        flavor = copy.flavor;
        sprinkles = copy.sprinkles;
    }
}
