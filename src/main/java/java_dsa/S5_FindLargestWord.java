package java_dsa;

/**
 * This program finds the longest word in a given string.
 * 
 * Methods Used:
 * - findLongestWord(String input): Takes a string input, splits it into words, 
 *   and returns the longest word found in the string.
 * 
 * Data Flow:
 * 1. The input string is received.
 * 2. The string is split into an array of words.
 * 3. Each word's length is checked to find the longest one.
 * 4. The longest word is returned as the output.
 * 
 * Expected Input: "Hello this is veera"
 * Expected Output: "Hello"
 */
public class S5_FindLargestWord {

    /**
     * Finds the longest word in the input string.
     * 
     * @param input The string to search for the longest word
     * @return The longest word found in the string
     */
    public static String findLongestWord(String input) {
        // Split the string into words using space as the delimiter
        String[] words = input.split(" "); 
        
        // Variable to keep track of the longest word
        String longestWord = ""; 
        
        // Iterate through each word in the array
        for (String word : words) {
            // Check if the current word is longer than the longest found so far
            if (word.length() > longestWord.length()) {
                longestWord = word; // Update longestWord with the current word
            }
        }
        
        // Return the longest word found
        return longestWord; 
    }

    /**
     * Main method to run the program.
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        // Input string to find the longest word
        String input = "Hello this is veera";

        // Print the longest word found in the input string
        System.out.println("Original String: " + input);
        System.out.println("Longest Word: " + findLongestWord(input)); // Output: Hello
    }
}
