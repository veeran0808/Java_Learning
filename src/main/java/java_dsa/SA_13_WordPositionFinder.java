package java_dsa;

/**
 * This program finds the position (index) of a specified word in a given string.
 * 
 * Problem Statement:
 * Question: Write a function to find the position (index) of a word (e.g., "is") in the string.
 * 
 * Example:
 * Input: "Hello this is veera", Word to find: "is"
 * Output: 3 (if using 1-based index)
 * 
 * Methods Used:
 * - findWordPosition(String input, String wordToFind): Takes a string input and a word,
 *   finds the index of the word in the input string, and returns the 1-based index position.
 * 
 * Data Flow:
 * 1. Input string and word to find are received.
 * 2. The string is trimmed and split into an array of words.
 * 3. Each word is compared with the specified word.
 * 4. If a match is found, the position is returned; otherwise, return -1.
 * 
 * Expected Input: "Hello this is veera", Word to find: "is"
 * Expected Output: 3
 */
public class SA_13_WordPositionFinder {

    public static int findWordPosition(String input, String wordToFind) {
        // Check for null or empty input
        if (input == null || input.trim().isEmpty() || wordToFind == null || wordToFind.trim().isEmpty()) {
            return -1; // Return -1 if input or word to find is null or empty
        }

        // Split the input string into words using space as the delimiter
        String[] words = input.trim().split(" ");

        // Check each word to find the position of the specified word
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(wordToFind)) {
                return i + 1; // Return the 1-based index position if a match is found
            }
        }
        return -1; // Return -1 if the word is not found in the input string
    }

    public static void main(String[] args) {
        String input = "Hello this is veera";
        String wordToFind = "is";
        System.out.println(findWordPosition(input, wordToFind)); // Output: 3
    }
}
