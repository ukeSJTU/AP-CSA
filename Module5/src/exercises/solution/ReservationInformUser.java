package exercises.solution;

public class ReservationInformUser {
    private boolean isConfirmed;

    public ReservationInformUser(boolean confirmed) {
        isConfirmed = confirmed;
    }

    public void informUser() {
        if (!isConfirmed) {
            System.out.println("Unable to confirm reservation, please contact restaurant.");
        } else {
            System.out.println("Please enjoy your meal!");
        }
    }
}
