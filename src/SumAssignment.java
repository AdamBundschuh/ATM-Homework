/*
Sum: Ask the user for an integer.
Calculate the sum of the numbers from one to the integer the user entered.
Example: If the user enters 6, your program should print 21 (1 + 2 + 3 + 4 + 5 + 6).

Stretch goal: Allow the user to enter a lower integer and a higher integer.
Calculate the sum of the numbers from the lower to the higher, inclusive.
Example: If the user entered 4, then 6, your program should print 15 (4 + 5 + 6).

Stretchier goal: If user enters a lower number for the second number, display an
error message instead of calculating the sum. */

import java.util.Scanner;

public class SumAssignment {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int currentSum = 0;

        System.out.println("Give me a lower number:");
        int lowNum = input.nextInt();
        System.out.println("Give me a higher number:");
        int highNum = input.nextInt();

        while (lowNum > highNum) {
                System.out.println("Can you read?! " + lowNum + " is not lower than " + highNum + ".");
                System.out.println("Give me a lower number:");
                lowNum = input.nextInt();
                System.out.println("Give me a higher number:");
                highNum = input.nextInt();
            }

        //System.out.println("Loop starting.");
        for (int i = (lowNum-1); i < highNum; i++) {
            //System.out.println("Current iteration: " + (i+1));
            currentSum = (i+1) + currentSum;
        }

        //System.out.println("Loop ended.");
        System.out.println("Total sum is " + currentSum);

    }
}