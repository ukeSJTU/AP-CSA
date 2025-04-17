package exercises.starter;

public class ReservationConfirmation {
    private int restaurantCapacity;
    private int guestCount;
    private boolean isRestaurantOpen;
    private boolean isConfirmed;

    public ReservationConfirmation(int capacity, int guests, boolean open) {
        restaurantCapacity = capacity;
        guestCount = guests;
        isRestaurantOpen = open;
        isConfirmed = false;
    }

    public void confirmReservation() {
        // TODO: Use an if-then-else statement to check if restaurantCapacity >=
        // guestCount AND isRestaurantOpen is true
        // - If true, print "Reservation confirmed" and set isConfirmed to true
        // - Else, print "Reservation denied" and set isConfirmed to false
    }

    public boolean getConfirmationStatus() {
        return isConfirmed;
    }

    public void informUser() {
        System.out.println("Please enjoy your meal");
    }
}
