public class CorrectChange {
    public static void main(String[] args) {
        int total = 876;
        int dollars = 0;
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;
        System.out.println("Input amount: 876");
        while (total > 100) {
            dollars = dollars + 1;
            total = total - 100;
        }
        while (total > 25) {
            quarters = quarters + 1;
            total = total - 25;
        }
        while (total > 10) {
            dimes = dimes + 1;
            total = total - 10;
        }
        while (total > 5) {
            nickels = nickels + 1;
            total = total - 5;
        }
        while (total > 0) {
            pennies = pennies + 1;
            total = total - 1;
        }
        System.out.println("Your change is");
        System.out.println("Dollars: " + dollars);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
    }
}