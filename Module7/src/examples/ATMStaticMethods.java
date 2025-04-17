public class ATMStaticMethods {
    // Static variables
    public static int totalMoney = 0;
    public static int numATMs = 0;

    // Instance variables
    public int money;

    public ATMStaticMethods(int inputMoney) {
        this.money = inputMoney;
        numATMs += 1;
        totalMoney += inputMoney;
    }

    public void withdrawMoney(int amountToWithdraw) {
        if (amountToWithdraw <= this.money) {
            this.money -= amountToWithdraw;
            totalMoney -= amountToWithdraw;
        }
    }

    public static void averageMoney() {
        System.out.println(totalMoney / numATMs);
    }

    public static void main(String[] args) {
        System.out.println("Total number of ATMs: " + ATMStaticMethods.numATMs);
        ATMStaticMethods firstATM = new ATMStaticMethods(1000);
        ATMStaticMethods secondATM = new ATMStaticMethods(500);
        System.out.println("Total number of ATMs: " + ATMStaticMethods.numATMs);

        System.out.println("Total amount of money in all ATMs: " + ATMStaticMethods.totalMoney);
        firstATM.withdrawMoney(500);
        secondATM.withdrawMoney(200);
        System.out.println("Total amount of money in all ATMs: " + ATMStaticMethods.totalMoney);

        // Call averageMoney() here
        ATMStaticMethods.averageMoney();
    }
}
