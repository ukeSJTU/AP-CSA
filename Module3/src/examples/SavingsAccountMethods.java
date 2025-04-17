package examples;

public class SavingsAccountMethods {
    double balance;

    public SavingsAccountMethods(double startingBalance) {
        balance = startingBalance;
    }

    public void deposit(double amountToDeposit) {
        // Add amountToDeposit to the balance
        double updatedBalance = balance + amountToDeposit;
        balance = updatedBalance;
    }

    public void withdraw(double amountToWithdraw) {
        // Subtract amountToWithdraw from the balance
        double updatedBalance = balance - amountToWithdraw;
        balance = updatedBalance;
    }

    public static void main(String[] args) {
    }
}
