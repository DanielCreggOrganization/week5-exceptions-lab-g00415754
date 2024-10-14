package ie.atu.exceptions;

public class UncheckedExceptionsFix {
    public static void main(String[] args) {
        String text = "Hello World!";
        System.out.println(text.length()); // No longer Throws NullPointerException


        
        int[] numbers = {1, 2, 3,4, 5, 6};
        System.out.println(numbers[5]); // No longer Throws ArrayIndexOutOfBoundsException
    }
}