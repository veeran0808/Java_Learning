package java_dsa;

/**
 * This program finds the second longest word in a given string.
 * 
 * Methods Used:
 * - findSecondLongestWord(String input): Takes a string input, splits it into words,
 *   and returns the second longest word found in the string.
 * 
 * Data Flow:
 * 1. The input string is received.
 * 2. The string is split into an array of words.
 * 3. Two variables are used to track the longest and second longest words.
 * 4. The second longest word is returned as the output.
 * 
 * Expected Input: "Hello this is vee"
 * Expected Output: "this"
 */
public class S6_FindSecondLargestWord {

    /**
     * Finds the second longest word in the input string.
     * 
     * @param input The string to search for the second longest word
     * @return The second longest word found in the string
     */
    public static String findSecondLongestWord(String input) {
        // Split the string into words using space as the delimiter
        String[] words = input.split(" ");
        
        // Variables to track the longest and second longest words
        String longestWord = "";
        String secondLongestWord = "";

        // Iterate through each word in the array
        for (String word : words) {
            // Check if the current word is longer than the longest found so far
            if (word.length() > longestWord.length()) {
                // Update second longest before longest
                secondLongestWord = longestWord; 
                longestWord = word; // Update longest word
            } else if (word.length() > secondLongestWord.length() && !word.equals(longestWord)) {
                // Update second longest word if it's not the same as the longest
                secondLongestWord = word; 
            }
        }
        
        // Return the second longest word found
        return secondLongestWord; 
    }

    /**
     * Main method to run the program.
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        // Input string to find the second longest word
        String input = "Hello this is vee";

        // Print the second longest word found in the input string
        System.out.println("Original String: " + input);
        System.out.println("Second Longest Word: " + findSecondLongestWord(input)); // Output: this
    }
}

