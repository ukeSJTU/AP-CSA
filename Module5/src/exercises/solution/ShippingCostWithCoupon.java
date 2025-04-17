package exercises.solution;

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
            if (couponCode.equals("ship50")) {
                return 0.85;
            } else {
                return 1.75;
            }
        } else {
            return 0.50;
        }
    }
}
