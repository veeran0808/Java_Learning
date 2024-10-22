package java_dsa;

import java.util.HashSet;

/**
 * This program checks if the input string contains any duplicate words.
 * 
 * Problem Statement:
 * Question: Write a function to check if the string contains any duplicate words.
 * 
 * Example:
 * Input: "Hello this is veera this"
 * Output: true (duplicate word: "this")
 */
public class SA_19_CheckForDuplicateWords {

    public static void main(String[] args) {
        String input = "Hello this is veera this"; // Input string
        boolean hasDuplicates = checkForDuplicateWords(input); // Check for duplicates
        System.out.println(hasDuplicates); // Print result
    }

    /**
     * Checks for duplicate words in the input string.
     *
     * @param input The string in which to check for duplicate words.
     * @return true if duplicates are found, false otherwise.
     */
    public static boolean checkForDuplicateWords(String input) {
        HashSet<String> wordSet = new HashSet<>(); // Set to store unique words

        // Split the input string into words based on spaces
        String[] words = input.split("\\s+");

        // Iterate through each word in the array
        for (String word : words) {
            // Trim the word to remove any leading or trailing spaces
            word = word.trim();
            // Check if the word is already in the set
            if (!wordSet.add(word)) {
                // If adding returns false, the word is a duplicate
                return true; // Duplicate found
            }
        }

        return false; // No duplicates found
    }
}

