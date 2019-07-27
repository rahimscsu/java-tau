package chapter4;

/*
    NESTED Loop:
    Find the average of each student's test scores.
 */

import java.util.Scanner;

public class AverageTestScore {

    public static void main(String args[]) {

        // Initalize what we know
        int numberOfStudents = 24;
        int numberOfTests = 4;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numberOfStudents; i++) {
            double total = 0;

            for (int j = 0; j < numberOfTests; j++) {

                System.out.println ("What is the score for test number" + (j+1));
                double score = scanner.nextDouble();
                total = total + score;
            }
            double average = total/numberOfTests;
            System.out.println("The test average for student # " + (i+1) + " is " + average);
         }

        scanner.close();
    }
}
