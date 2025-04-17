package exercises.starter;

public class ShippingCostWithCoupon {
    private String shipping;
    private String couponCode;

    public ShippingCostWithCoupon(String shippingType, String coupon) {
        shipping = shippingType;
        couponCode = coupon;
    }

    public double calculateShipping() {
        if (shipping.equals("Regular")) {
            return 0.0;
        } else if (shipping.equals("Express")) {
            // TODO: Add a nested if-then statement to check if couponCode equals "ship50"
            // - Return 0.85 if true
            // - Return 1.75 if false using a nested else
            return 1.75;
        } else {
            return 0.50;
        }
    }
}
