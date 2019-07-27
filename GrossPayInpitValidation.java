package chapter4;

/*
    WHILE LOOP
    Each store employee makes $15 an hour. Write a program that allows the employee
    to enter the number of hours worked for the week. Do not allow overtime.
 */

import java.util.Scanner;

public class GrossPayInpitValidation {

    public static void main (String args[]) {


        // Initialize known variables.
        int rate = 15;
        int maxHours = 40;

        // Get input for unknown variables.
        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        // Validate Input
        while (hoursWorked > maxHours || hoursWorked < 1) {
            System.out.println("Invalid Entry, Your hours should be less than or equal to 40. Try again");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        double gross = rate * hoursWorked;
        System.out.println("Your gross pay is $" + gross);

    }
}
