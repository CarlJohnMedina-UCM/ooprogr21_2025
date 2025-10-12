import java.util.Scanner;

public class Payroll {

    public static final double STANDARD_WORK_HOURS = 40.0;
    public static final double OVERTIME_MULTIPLIER = 1.5;
    public static final double MAX_RATE = 50.0;

    public static void calculatePay(double hoursWorked, double payRate) {
        double regularHours;
        double overtimeHours;
        double regularPay;
        double overtimePay;

        if (hoursWorked > STANDARD_WORK_HOURS) {
            regularHours = STANDARD_WORK_HOURS;
            overtimeHours = hoursWorked - STANDARD_WORK_HOURS;
        } else {
            regularHours = hoursWorked;
            overtimeHours = 0.0;
        }

        regularPay = regularHours * payRate;
        double overtimeRate = payRate * OVERTIME_MULTIPLIER;
        overtimePay = overtimeHours * overtimeRate;

        System.out.println("Regular pay is $" + regularPay);
        System.out.println("Overtime pay is $" + overtimePay);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many hours did you work this week? ");
        double hoursWorked = scanner.nextDouble();

        System.out.print("What is your regular pay rate? ");
        double payRate = scanner.nextDouble();

        if (payRate > MAX_RATE) {
            System.out.println("\n*** NOTICE: Pay rate exceeds the maximum rate of $" + MAX_RATE + ".");
            payRate = MAX_RATE;
        }

        System.out.println();
        calculatePay(hoursWorked, payRate);

        scanner.close();
    }
}
