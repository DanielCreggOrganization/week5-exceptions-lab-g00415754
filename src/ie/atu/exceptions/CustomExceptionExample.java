package ie.atu.exceptions;

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            registerUser(15); // This will throw an exception
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void registerUser(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("User must be at least 18 years old.");
        }
        System.out.println("User registered successfully.");
    }
}
