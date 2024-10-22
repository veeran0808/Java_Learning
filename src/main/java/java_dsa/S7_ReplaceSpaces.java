package java_dsa;

/**
 * This program replaces all spaces in a given string with a special character.
 * 
 * Methods Used:
 * - replaceSpaces(String input, char replacement): Takes a string input and a character
 *   to replace spaces, then returns the modified string.
 * 
 * Data Flow:
 * 1. The input string is received.
 * 2. Each character in the string is checked.
 * 3. If the character is a space, it is replaced with the specified character.
 * 4. The final modified string is returned.
 * 
 * Expected Input: "Hello this is veera"
 * Expected Output: "Hello-this-is-veera"
 */
public class S7_ReplaceSpaces {

    /**
     * Replaces all spaces in the input string with the specified character.
     * 
     * @param input The string to modify
     * @param replacement The character to replace spaces with
     * @return The modified string with spaces replaced
     */
    public static String replaceSpaces(String input, char replacement) {
        // Create a character array from the input string
        char[] characters = input.toCharArray();
        
        // Variable to hold the result
        String result = "";

        // Iterate through each character in the array
        for (char c : characters) {
            // If the character is a space, replace it with the specified character
            if (c == ' ') {
                result += replacement; // Concatenate the replacement character
            } else {
                result += c; // Concatenate the original character
            }
        }
        
        // Return the modified string
        return result;
    }

    /**
     * Main method to run the program.
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        // Input string to replace spaces
        String input = "Hello this is veera";
        char replacementCharacter = '-'; // Character to replace spaces

        // Print the original string and the modified string
        System.out.println("Original String: " + input);
        System.out.println("Modified String: " + replaceSpaces(input, replacementCharacter)); // Output: Hello-this-is-veera
    }
}
