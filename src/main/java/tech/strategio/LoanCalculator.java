package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * TODO: finish out this JavaDoc comment block.
     * FIXME: WHAT DOES THIS METHOD DO?
     *
     *
     * @param amount used to calculate the remaining for each month
     * @return the remaining amount after taking 10% for 3 months from the previous month's amount
     */
    static int getRemainingAmountIn3Months(int amount) {
        // TODO: Add your code below
        int months = 3; int monthly_pay;
        for(int i = 0; i < months; i++){
            monthly_pay = amount / 10;
            amount = amount - monthly_pay;
        }

        return amount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount: ");
        int amount = scanner.nextInt();
        System.out.println(getRemainingAmountIn3Months(amount));
    }
}
