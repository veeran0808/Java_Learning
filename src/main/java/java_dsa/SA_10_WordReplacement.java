package java_dsa;

/**
 * This program replaces a specific word in a given string with another specified word.
 * 
 * Problem Statement:
 * Question: Write a function to replace a word (e.g., "this") with another word (e.g., "that") 
 * in a given string.
 * 
 * Example:
 * Input: "Hello this is veera", Replace "this" with "that"
 * Output: "Hello that is veera"
 * 
 * Methods Used:
 * - replaceWord(String input, String target, String replacement): Takes a string input, a 
 *   target word to replace, and a replacement word, then returns the modified string.
 * 
 * Data Flow:
 * 1. Input string is received along with the target and replacement words.
 * 2. The string is split into an array of words using space as a delimiter.
 * 3. Each word is checked against the target word.
 * 4. If a match is found, the target word is replaced with the replacement word.
 * 5. The modified words are joined back into a single string and returned.
 * 
 * Expected Input: "Hello this is veera", Replace "this" with "that"
 * Expected Output: "Hello that is veera"
 */
public class SA_10_WordReplacement {

    public static String replaceWord(String input, String target, String replacement) {
        // Split the input string into words using space as the delimiter
        String[] words = input.split(" ");
        
        // Initialize a variable to hold the modified string
        String result = "";
        
        // Iterate through each word in the array
        for (String word : words) {
            // Check if the current word matches the target word
            if (word.equals(target)) {
                // If it matches, append the replacement word to the result
                result += replacement + " ";
            } else {
                // If it does not match, append the original word to the result
                result += word + " ";
            }
        }
        
        // Return the final modified string, trimming any trailing spaces
        return result.trim();
    }

    public static void main(String[] args) {
        String input = "Hello this is veera";
        String target = "this"; // Word to be replaced
        String replacement = "that"; // Replacement word
        System.out.println(replaceWord(input, target, replacement)); // Output: "Hello that is veera"
    }
}
