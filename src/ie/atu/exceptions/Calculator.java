package ie.atu.exceptions;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter your second number: ");
        double num2 = input.nextDouble();

        try{
            System.out.println("Num1 / Num2 = " + (num1/num2));
        }catch(ArithmeticException e){
            System.out.println("Can't divide by 0.");
        }finally{
            System.out.println("Calculation Complete.");
        }

        input.close();
    }

    
    
}
