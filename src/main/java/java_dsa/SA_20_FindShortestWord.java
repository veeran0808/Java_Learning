package java_dsa;

/**
 * This program finds the shortest word in the given string.
 * 
 * Problem Statement:
 * Question: Write a function to find the shortest word in the string.
 * 
 * Example:
 * Input: "Hello this is veera"
 * Output: "is"
 */
public class SA_20_FindShortestWord {

    public static void main(String[] args) {
        String input = "Hello this is veera"; // Input string
        String shortestWord = findShortestWord(input); // Find the shortest word
        System.out.println(shortestWord); // Print the result
    }

    /**
     * Finds the shortest word in the input string.
     *
     * @param input The string from which to find the shortest word.
     * @return The shortest word found in the input string.
     */
    public static String findShortestWord(String input) {
        String[] words = input.split("\\s+"); // Split the input string into words
        String shortest = null; // Variable to hold the shortest word

        // Iterate through each word in the array
        for (String word : words) {
            // Trim the word to remove any leading or trailing spaces
            word = word.trim();
            // If shortest is null or the current word is shorter than the current shortest
            if (shortest == null || word.length() < shortest.length()) {
                shortest = word; // Update shortest word
            }
        }

        return shortest; // Return the shortest word found
    }
}

