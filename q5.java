import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Convert the name to uppercase
        String upperCaseName = name.toUpperCase();

        // Display the greeting message
        System.out.println("Hello, " + upperCaseName + ", nice to meet you!");

        // Close the scanner
        scanner.close();
    }
}
