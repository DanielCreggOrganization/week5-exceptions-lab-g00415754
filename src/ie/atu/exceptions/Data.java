package ie.atu.exceptions;

public class Data {
    public static void main(String[] args) {
        try {
            processData(10);
        } catch (Exception e) {
            System.out.println("Exception handled: " + e.getMessage());
        }
    }

    public static void processData(int data) throws Exception{
        throw new Exception("An error occured.");
    }
}
