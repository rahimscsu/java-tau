package chapter7;

/*
    This array holds the textual values of the days of the week.
    The user inputs a number corresponding to the day of the week, assuming the week starts on monday
    Program outputs a string that represents the day of the week
 */

import java.util.Scanner;

public class DayOfTheWeek {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter a number corresponding to the day of the week");
        int week = scanner.nextInt();

        weekCalculation(week);
    }

    public static void weekCalculation(int week) {
        String day[] = new String[7];
        day[0] = "Monday";
        day[1] = "Tuesday";
        day[2] = "Wednesday";
        day[3] = "Thursday";
        day[4] = "Friday";
        day[5] = "Saturday";
        day[6] = "Sunday";

        System.out.println("The day of the week that corresponds to the number you entered is " + day[week - 1]);

    }

}
