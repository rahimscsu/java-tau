package chapter4;

import java.util.Scanner;
import java.util.Random;

public class RollTheDieGame {

    public static void main (String args[]) {

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int difference = 20;
        int maxturns = 5;

        for (int i = 0; i < maxturns; i++) {

            Random random = new Random();
            int die = random.nextInt(6)+1;

                count = count + die;
                difference = difference - die;


                if (difference <= 0) {
                    System.out.println("Roll number " + (i+1) + " : You have rolled a " + die + " You are now on space " + count + " you lose ");
                    break;
                }
                else {
                    System.out.println("Roll number " + (i+1) + " : You have rolled a " + die + " You are now on space " + count + " and have " + difference + " more to go");
                }



            }

        maxturns--;
    }
}
