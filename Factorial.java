/*
 * The factorial program
 *
 * @author  Liam Fletcher
 * @version 1.0
 * @since   2021-11-30
 */

import java.util.Scanner;

public final class Factorial {
    private Factorial() {

    }
    /**
     * This function finds the factorial of a number passed into the function 
     * @return
     * returns factorial.
     * @param userInteger
     */
    static int findFactorial(final int userInteger) {
        if (userInteger > 0) {
            if (userInteger == 1) {
                return 1;
            } else {
                int factorial = userInteger * findFactorial(userInteger - 1);
                return factorial;
            }
        } else {
            // Throwing error 
            throw null;
        }
    }

    /**
     * This function allows the user to enter an integer and will show the factorial
     * @param args
     */
    public static void main(final String[] args) {
        try {
            // Creating a scanner object 
            final Scanner numberInput = new Scanner(System.in);

            // User input for the integer
            System.out.print("Enter an integer you want the factorial of: ");
            int userNumber = numberInput.nextInt();

            // Calling the function 
            int userFactorial = findFactorial(userNumber);

            // Returning the factorial 
            System.out.println("");
            System.out.print("The factorial of your number is: " + userFactorial);

            // Catches 
        } catch (NullPointerException e) {
            System.out.println("");
            System.out.println("Unable to find factorial of given integer");
        } catch (Exception e) {
            System.out.println("");
            System.out.println("Invalid Input");
        }
    }
}
