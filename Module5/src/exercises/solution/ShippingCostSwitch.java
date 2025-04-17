package exercises.solution;

public class ShippingCostSwitch {
    private String shipping;

    public ShippingCostSwitch(String shippingType) {
        shipping = shippingType;
    }

    public double calculateShipping() {
        double shippingCost;
        switch (shipping) {
            case "Regular":
                shippingCost = 0.0;
                break;
            case "Express":
                shippingCost = 1.75;
                break;
            default:
                shippingCost = 0.50;
        }
        return shippingCost;
    }
}
