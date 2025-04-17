package exercises.starter;

public class ReservationInformUser {
    private boolean isConfirmed;

    public ReservationInformUser(boolean confirmed) {
        isConfirmed = confirmed;
    }

    public void informUser() {
        // TODO: Write an if-then-else statement using the NOT operator (!) with
        // isConfirmed
        // - If reservation is NOT confirmed, print "Unable to confirm reservation,
        // please contact restaurant."
        // - Else, print "Please enjoy your meal!"
        System.out.println("Please enjoy your meal!");
    }
}
