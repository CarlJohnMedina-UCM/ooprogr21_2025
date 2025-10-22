import java.util.Scanner;

public class BankBalanceCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance = 100.00;      // starting balance
        double interestRate = 0.03;   // fixed interest rate (3%)
        int year = 1;                 // start at year 1
        int choice;                   // user input

        do {
            // compute new balance
            balance += balance * interestRate;

            // display balance after the year
            System.out.printf("After year %d at %.2f   interest rate, balance is $%.4f%n",
                    year, interestRate, balance);
            System.out.println();

            // ask if user wants to continue
            System.out.println("Do you want to see the balance at the end of another year?");
            System.out.println("Enter 1 for yes");
            System.out.print("   or any other number for no >> ");
            choice = input.nextInt();
            System.out.println();

            year++; // increment year

        } while (choice == 1);

        input.close();
    }
}
