package ie.atu.exceptions;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a grade: ");
        int grade = input.nextInt();
    
        try{
            calculateGrade(grade);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        input.close();
    }

    public static void calculateGrade(int grade){
        if(grade > 100 || grade < 0){
            throw new IllegalArgumentException("Invalid grade.");
        }
    }
}
