package ie.atu.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuExample {
    public static void main(String[] args) {
        // Scanner userInput = null;
        boolean validInput = false;

        try (Scanner userInput = new Scanner(System.in)) {
            while (!validInput) {
                try {
                    System.out.print("Enter first num: ");
                    int num1 = userInput.nextInt();

                    System.out.print("Enter second num: ");
                    int num2 = userInput.nextInt();

                    int result = num1 / num2;

                    System.out.println("Result: " + result);
                    validInput = true; // exit loop if no exception occured
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage() + ". Please try again.");
                } catch (InputMismatchException e) {
                    System.out.println("Error occured: " + e.getMessage() + ". Please try again.");
                    userInput.nextLine(); // Clear the buffer
                }
            }
        }

    }
}
