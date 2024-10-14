package ie.atu.exceptions;

import java.util.Scanner;

public class Temperatures {
    public static void main(String[] args) {
        int[] temp = {10,12,9,14,15,8,17}; //temps

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a day [1-7]: ");
        int day = input.nextInt();

        try {
            System.out.println("Temperature for day " + day + ": " + temp[day] + " degrees.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("There are only 7 days in a week.");
        }

        input.close();
    }
}
