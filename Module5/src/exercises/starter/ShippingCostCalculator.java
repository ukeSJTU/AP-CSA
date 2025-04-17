package exercises.starter;

public class ShippingCostCalculator {
    private String shipping;

    public ShippingCostCalculator(String shippingType) {
        shipping = shippingType;
    }

    public double calculateShipping() {
        // TODO: Use a chained if-then-else to calculate shipping cost
        // - Return 0 for "Regular"
        // - Return 1.75 for "Express"
        // - Return 0.50 for any other value
        return 0.0;
    }
}
