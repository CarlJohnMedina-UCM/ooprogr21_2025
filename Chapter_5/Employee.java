public class Employee {
    // Constants
    public static final int MAX_EMPLOYEE_NUMBER = 9999;
    public static final double MAX_RATE = 60.00;
    public static final double OVERTIME_MULTIPLIER = 1.5;
    public static final int STANDARD_WORK_HOURS = 40;

    // Instance variables
    private int employeeNumber;
    private double payRate;

    /**
     * Constructor to initialize an Employee object.
     * Caps values if they exceed maximum allowed.
     */
    public Employee(int employeeNumber, double payRate) {
        if (employeeNumber > MAX_EMPLOYEE_NUMBER) {
            System.out.println("Employee number exceeds max (" + MAX_EMPLOYEE_NUMBER + "). Setting to max.");
            this.employeeNumber = MAX_EMPLOYEE_NUMBER;
        } else {
            this.employeeNumber = employeeNumber;
        }

        if (payRate > MAX_RATE) {
            System.out.println("Pay rate exceeds max ($" + MAX_RATE + "). Setting to max.");
            this.payRate = MAX_RATE;
        } else {
            this.payRate = payRate;
        }
    }

    // Getters
    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public double getPayRate() {
        return payRate;
    }

    // Setters with validation
    public void setEmployeeNumber(int employeeNumber) {
        if (employeeNumber <= MAX_EMPLOYEE_NUMBER) {
            this.employeeNumber = employeeNumber;
        } else {
            System.out.println("Invalid employee number. Must be <= " + MAX_EMPLOYEE_NUMBER);
        }
    }

    public void setPayRate(double payRate) {
        if (payRate <= MAX_RATE) {
            this.payRate = payRate;
        } else {
            System.out.println("Invalid pay rate. Must be <= $" + MAX_RATE);
        }
    }
}
