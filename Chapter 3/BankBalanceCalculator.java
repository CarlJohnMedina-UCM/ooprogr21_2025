import java.util.Scanner;

public class BankBalanceCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double balance;
        double interestRate = 0.03; // 3% default
        int year = 1;
        int choice;

        System.out.print("Enter your initial balance: ");
        balance = input.nextDouble();

        do {
            balance += balance * interestRate;
            System.out.printf("After year %d at %.2f interest rate, balance is $%.4f%n", year, interestRate, balance);

            System.out.print("\nDo you want to see the balance at the end of another year?\n");
            System.out.print("Enter 1 for yes\n");
            System.out.print("    or any other number for no >> ");
            choice = input.nextInt();

            year++;
        } while (choice == 1);

        System.out.println("\nThanks for Using Bank Balance Calculator.");
        input.close();
    }
}
