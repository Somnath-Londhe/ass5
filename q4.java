import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask user to input the number of integers (n)
        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();

        // Accept 'n' integers from the user and add them to the ArrayList
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            numbers.add(num);
        }

        // Display the elements of ArrayList in reverse order
        System.out.println("Elements in reverse order:");
        // Use Collections.reverse to reverse the ArrayList
        Collections.reverse(numbers);
        
        // Print the reversed ArrayList
        for (int num : numbers) {
            System.out.println(num);
        }

        // Close the scanner
        scanner.close();
    }
}
