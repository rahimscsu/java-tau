package chapter3;

import java.util.Scanner;

public class GradeMessage {

    public static void main(String args[]) {

        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        // scanner.next();
        String grade = scanner.next();

        String message;

        switch (grade) {
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great Job!";
                break;
            case "C":
                message = "Good Job!";
                break;
            case "D":
                message = "You need to work a bit harder";
                break;
            case "F":
                message = "Uh oh!";
                break;
            default:
                message = "Invalid grade.";
                break;
        }

        System.out.println(message);
    }
}
