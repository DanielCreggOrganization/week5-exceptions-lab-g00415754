package ie.atu.exceptions;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount you would like to withdraw: €");
        int withdraw = input.nextInt();

        try {
            withdraw(withdraw);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        input.close();
    }

    public static void withdraw(int wd) throws InsufficientFundsException{
        int amount = 200;
        if(wd > amount){
            throw new InsufficientFundsException("Insufficient Funds.");
        }
        if(wd < 1){
            throw new InsufficientFundsException("You cannot withdraw less than €1.");
        }
    }
}

