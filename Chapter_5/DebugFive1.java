// DebugFive1
// Adds your lunch bill
// Burger and hot dog are $2.59
// Grilled cheese and fish are $1.99
// Fries are 89 cents

import java.util.*;

public class DebugFive1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        final double HIGH_PRICE = 2.59;
        final double MED_PRICE = 1.99;
        final double LOW_PRICE = 0.89;

        int usersChoice;
        double bill = 0.0;

        System.out.println("Order please:");
        System.out.println("1 - Burger");
        System.out.println("2 - Hotdog");
        System.out.println("3 - Grilled cheese");
        System.out.println("4 - Fish sandwich");
        System.out.print("Enter your choice (1-4): ");
        usersChoice = kb.nextInt();

        if (usersChoice == 1 || usersChoice == 2) {
            bill += HIGH_PRICE;
        } else if (usersChoice == 3 || usersChoice == 4) {
            bill += MED_PRICE;
        } else {
            System.out.println("Invalid main item choice.");
            return; 
        }

        System.out.print("Fries with that? 1 - Yes, 2 - No >> ");
        usersChoice = kb.nextInt();

        if (usersChoice == 1) {
            bill += LOW_PRICE;
        } else if (usersChoice != 2) {
            System.out.println("Invalid choice for fries. Assuming no fries.");
        }

        
        System.out.printf("Total bill is $%.2f%n", bill);
    }
}
