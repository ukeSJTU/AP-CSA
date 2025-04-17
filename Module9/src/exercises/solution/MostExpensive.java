public class MostExpensive {
    public static void main(String[] args) {
        double[] expenses = { 13.15, 14.80, 7.60, 9.45, 21.30, 32.10, 8.75 };
        double mostExpensive = 0;

        for (double expense : expenses) {
            if (expense > mostExpensive) {
                mostExpensive = expense;
            }
        }

        System.out.println("Most expensive item: " + mostExpensive);
    }
}
