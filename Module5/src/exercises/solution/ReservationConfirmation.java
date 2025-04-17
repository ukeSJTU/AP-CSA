package exercises.solution;

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
        if (restaurantCapacity >= guestCount && isRestaurantOpen) {
            System.out.println("Reservation confirmed");
            isConfirmed = true;
        } else {
            System.out.println("Reservation denied");
            isConfirmed = false;
        }
    }

    public boolean getConfirmationStatus() {
        return isConfirmed;
    }

    public void informUser() {
        System.out.println("Please enjoy your meal");
    }
}
