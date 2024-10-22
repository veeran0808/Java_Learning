package java_dsa;

/**
 * This program counts the number of words in a given string.
 * 
 * Problem Statement:
 * Question: Write a function to count the number of words in the string.
 * 
 * Example:
 * Input: "Hello this is veera"
 * Output: 4
 * 
 * Methods Used:
 * - countWords(String input): Takes a string input, splits it into words, 
 *   and returns the number of words.
 * 
 * Data Flow:
 * 1. Input string is received.
 * 2. The string is split into an array of words using space as a delimiter.
 * 3. The length of the array represents the number of words in the input string.
 * 
 * Expected Input: "Hello this is veera"
 * Expected Output: 4
 */
public class SA_11_WordCounter {

    public static int countWords(String input) {
        // Check for null or empty input
        if (input == null || input.trim().isEmpty()) {
            return 0; // Return 0 if input is null or empty
        }

        // Split the input string into words using space as the delimiter
        String[] words = input.trim().split(" "); 
        
        // Return the length of the array which represents the number of words
        return words.length;
    }

    public static void main(String[] args) {
        String input = "Hello this is veera";
        System.out.println(countWords(input)); // Output: 4
    }
}
