public class Employee {
    // Employee attributes (as requested, though not all are used in the calculation)
    private int employeeNumber;
    private double payRate;
    
    // Constants (as requested)
    public static final int MAX_EMPLOYEE_NUMBER = 9999;
    public static final double MAX_RATE = 60.00;
    public static final double OVERTIME_MULTIPLIER = 1.5;
    
    // Standard work week hours
    public static final int STANDARD_WORK_HOURS = 40;

    /**
     * Constructor to initialize an Employee.
     * @param employeeNumber The employee's unique ID.
     * @param payRate The employee's hourly pay rate.
     */
    public Employee(int employeeNumber, double payRate) {
        // Basic validation for demonstration, more robust validation would be better.
        if (employeeNumber > MAX_EMPLOYEE_NUMBER) {
            this.employeeNumber = MAX_EMPLOYEE_NUMBER;
        } else {
            this.employeeNumber = employeeNumber;
        }
        
        if (payRate > MAX_RATE) {
            this.payRate = MAX_RATE;
        } else {
            this.payRate = payRate;
        }
    }

    // --- Getters and Setters (Optional but good practice) ---
    
    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        if (employeeNumber <= MAX_EMPLOYEE_NUMBER) {
            this.employeeNumber = employeeNumber;
        }
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        if (payRate <= MAX_RATE) {
            this.payRate = payRate;
        }
    }
}
