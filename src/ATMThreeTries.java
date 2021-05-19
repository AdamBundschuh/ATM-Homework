/* Stretch goal: quit after three failed attempts with an apologetic message. */

import java.util.Scanner;

public class ATMThreeTries {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the WCCI ATM!");
        System.out.println("Please enter your PIN:");

        for (int i = 0; i <= 3; i++) {
            int pin = input.nextInt();
            System.out.println("==========================");

            if (pin != 1234 && i < 3) {
                System.out.println("Incorrect, please try again.");
                System.out.println("Attempts remaining: " + (3-i));
            } else if (pin != 1234 && i == 3) {
                System.out.println("The police have been notified.");
                System.out.println("Sorry, not sorry.");
                System.out.println("==========================");
            } else {
                System.out.println("Login Successful!");
                System.out.println("Account Balance: $0.00");
                System.out.println("Thank you for banking with WCCI even though you're broke!");
                System.out.println("==========================");
            }
        }
    }
}