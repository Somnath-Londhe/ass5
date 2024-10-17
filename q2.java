public class q2 {
    public static void main(String[] args) {
        // String array to be reversed
        String[] stringArray = {"Hello", "World", "Java", "Programming", "Array"};

        // Loop through each string in the array
        for (String str : stringArray) {
            // Call the reverseString method to reverse the string
            String reversedStr = reverseString(str);
            System.out.println("Original: " + str + " | Reversed: " + reversedStr);
        }
    }

    // Method to reverse a given string
    public static String reverseString(String input) {
        // Use StringBuilder to reverse the string efficiently
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }
}
