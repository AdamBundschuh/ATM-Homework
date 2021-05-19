/* You Can Do It!
For the following exercises, you'll need to figure out whether a while or a do/while loop is most appropriate:

ATM: Prompt the user for a PIN.
Display an error message if the user gets it wrong, and prompt again.
If the user gets it right, print a congratulatory message.

Stretch goal: quit after three failed attempts with an apologetic message.

Sum: Ask the user for an integer. Calculate the sum of the numbers from one to the integer the user entered.
Example: If the user enters 6, your program should print 21 (1 + 2 + 3 + 4 + 5 + 6).

Stretch goal: Allow the user to enter a lower integer and a higher integer.
Calculate the sum of the numbers from the lower to the higher, inclusive.
Example: If the user entered 4, then 6, your program should print 15 (4 + 5 + 6).

Stretchier goal: If user enters a lower number for the second number, display an
error message instead of calculating the sum. */

import java.util.Scanner;
public class ATMHomework {
    public static void main(String[] args) {

        int pin = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the WCCI ATM!");
        System.out.println("Please enter your PIN:");

        while (pin != 1234) {
            pin = input.nextInt();
            if (pin!= 1234) {
                System.out.print("Incorrect, please try again: ");
            } else {
                System.out.println("Login Successful!");
                System.out.println("Account Balance: $0.00");
                System.out.println("Thank you for banking with WCCI even though you're broke!");
            }
        }
    }
}