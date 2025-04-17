package exercises.solution;

public class ReservationValidation {
    private int guestCount;

    public ReservationValidation(int count) {
        if (count < 1 || count > 8) {
            System.out.println("Invalid reservation!");
        }
        guestCount = count;
    }
}
