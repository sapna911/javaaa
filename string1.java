import java.util.Scanner;

public class string1{
    public static void main(String[] args) {
        // Define a string
        String defaultString = "Hello, World!";
        System.out.println("Default String: " + defaultString);

        // Ask the user to enter a string
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        System.out.println("You entered: " + userInput);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
