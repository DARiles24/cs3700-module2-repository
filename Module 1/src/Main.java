/* Arithmetic Operations Program
Last Edited by: Devin Riley
Last Edited on: 10/18/2026
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read two numbers inputs by user.
        System.out.print("Enter the first number (x): ");
        double x = input.nextDouble();

        System.out.print("Enter the second number (y): ");
        double y = input.nextDouble();

        // Calculate and store results.
        double sum = x + y;
        double difference = x - y;
        double product = x * y;

        // Display each math operation on its own line.
        System.out.println("\nResults:");
        System.out.println("Addition:       " + x + " + " + y + " = " + sum);
        System.out.println("Subtraction:    " + x + " - " + y + " = " + difference);
        System.out.println("Multiplication: " + x + " * " + y + " = " + product);

        // If second number is 0, division is not valid.
        if (y != 0) {
            double quotient = x / y;
            System.out.println("Division:       " + x + " / " + y + " = " + quotient);
        } else {
            System.out.println("Division:       " + x + " / " + y
                    + " = undefined (cannot divide by zero)");
        }

        input.close();
    }
}
