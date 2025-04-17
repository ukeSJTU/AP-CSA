package exercises.solution;

public class ShippingCostCalculator {
    private String shipping;

    public ShippingCostCalculator(String shippingType) {
        shipping = shippingType;
    }

    public double calculateShipping() {
        if (shipping.equals("Regular")) {
            return 0.0;
        } else if (shipping.equals("Express")) {
            return 1.75;
        } else {
            return 0.50;
        }
    }
}
