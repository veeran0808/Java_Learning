package java_dsa;

/**
 * This program reverses the entire string.
 * 
 * Methods Used:
 * - reverseString(String input): Takes a string input and returns the reversed string.
 * 
 * Data Flow:
 * 1. The input string is received.
 * 2. A character array is created to hold the reversed characters.
 * 3. The program iterates through the input string and fills the character array in reverse order.
 * 4. The reversed string is created from the character array and returned as the output.
 * 
 * Expected Input: "Hello this is veera"
 * Expected Output: "areev si siht olleH"
 */
public class S3_RevereseEntireWords {

    /**
     * Reverses the entire input string.
     * 
     * @param input The string to be reversed
     * @return The reversed string
     */
    public static String reverseString(String input) {
        // Create a character array to hold the reversed characters
        char[] reversed = new char[input.length()]; 

        // Iterate through the string
        for (int i = 0; i < input.length(); i++) {
            // Fill the character array in reverse order
            reversed[input.length() - 1 - i] = input.charAt(i);
        }

        // Create a new string from the character array and return it
        return new String(reversed);
    }

    /**
     * Main method to run the program.
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        // Input string to be reversed
        String input = "Hello this is veera";

        // Print the result of reversing the input string
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reverseString(input));
    }
}
