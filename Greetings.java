package chapter5;

/*
    Write a method that asks the user their name and greets them by their name.
 */

import java.util.Scanner;

public class Greetings {

    public static void main (String args[]) {

        System.out.println("Hi what is your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        greet(name);
    }

    public static void greet (String name) {
        System.out.println("The name is " + name);
    }
}
