package java_dsa;

/**
 * This program checks if a given string contains a specific word.
 * 
 * Problem Statement:
 * Question: Write a program to check if the string contains a specific word (e.g., "this").
 * 
 * Example:
 * Input: "Hello this is veera", Word to check: "this"
 * Output: true
 * 
 * Methods Used:
 * - containsWord(String input, String wordToCheck): Takes a string input and a word,
 *   checks if the word is present in the input string, and returns a boolean result.
 * 
 * Data Flow:
 * 1. Input string and word to check are received.
 * 2. The string is trimmed and split into an array of words.
 * 3. Each word is compared with the specified word.
 * 4. If a match is found, return true; otherwise, return false.
 * 
 * Expected Input: "Hello this is veera", Word to check: "this"
 * Expected Output: true
 */
public class SA_12_WordChecker {

    public static boolean containsWord(String input, String wordToCheck) {
        // Check for null or empty input
        if (input == null || input.trim().isEmpty() || wordToCheck == null || wordToCheck.trim().isEmpty()) {
            return false; // Return false if input or word to check is null or empty
        }

        // Split the input string into words using space as the delimiter
        String[] words = input.trim().split(" ");

        // Check each word to see if it matches the word to check
        for (String word : words) {
            if (word.equals(wordToCheck)) {
                return true; // Return true if a match is found
            }
        }
        return false; // Return false if no match is found
    }

    public static void main(String[] args) {
        String input = "Hello this is veera";
        String wordToCheck = "this";
        System.out.println(containsWord(input, wordToCheck)); // Output: true
    }
}

