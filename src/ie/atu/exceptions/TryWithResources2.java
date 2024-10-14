package ie.atu.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryWithResources2 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("text.txt"))) {
            String line = br.readLine();
            System.out.println(line);
        } catch (Exception e) {
            System.out.println("File is closed.");
        }
    }
}
