package chapter4;

/*
    For loop: A cashier program that will scan a given number of items and tally the cost.
 */

import java.util.Scanner;

public class Cashier {

    public static void main(String args[]){

        // Get the number of items:
        System.out.println("Enter the number of items you would like to scan:");
        Scanner scanner = new Scanner(System.in);
        int qty = scanner.nextInt();

        double total = 0;

        // Create a loop to iterate through all the items and calculate the total cost.

        for (int i = 0; i < qty; i++) {

            System.out.println("Enter the cost of the item " + (i+1));
            double price = scanner.nextDouble();

            total = total + price;

        }

        scanner.close();
        System.out.println("The total is $" + total );
    }
}
