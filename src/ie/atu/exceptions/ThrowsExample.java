package ie.atu.exceptions;

public class ThrowsExample {
    public static void main(String[] args) {
        try {
            performOperation(); // May throw Exception
        } catch (Exception e) {
            System.out.println("Exception handled: " + e.getMessage());
        }
    }

    public static void performOperation() throws Exception {
        throw new Exception("An error occurred.");
    }
}
