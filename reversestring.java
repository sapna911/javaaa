import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {
        // Ask the user to enter a string
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Reverse the string
        String reversedString = reverse(inputString);

        // Display the reversed string
        System.out.println("Reversed String: " + reversedString);

        // Close the scanner to avoid resource leak
        scanner.close();
    }

    // Function to reverse a string
    private static String reverse(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
