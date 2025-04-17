package examples;

public class SavingsAccountUsage {
    public static void main(String[] args) {
        SavingsAccountMethods myAccount = new SavingsAccountMethods(2000);
        System.out.println(myAccount.balance);
        myAccount.deposit(100);
        System.out.println(myAccount.balance);
    }
}
