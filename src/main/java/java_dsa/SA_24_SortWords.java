package java_dsa;

/**
 * This program sorts the words in the given string alphabetically.
 * 
 * Question: Write a function to sort the words in the string alphabetically.
 * 
 * Example:
 * Input: "Hello this is veera"
 * Output: "Hello is this veera"
 * 
 * Methods Used:
 * - sortWordsAlphabetically(String input): Takes a string input, splits it into words, 
 *   sorts the words, and returns the sorted string.
 * 
 * Data Flow:
 * 1. Input string is received.
 * 2. The string is split into an array of words.
 * 3. The array of words is sorted.
 * 4. The sorted words are joined into a single string.
 * 5. The final sorted string is returned.
 */

import java.util.Arrays;

public class SA_24_SortWords {

    public static String sortWordsAlphabetically(String input) {
        // Split the input string into words
        String[] words = input.split(" ");
        
        // Sort the array of words
        Arrays.sort(words);
        
        // Join the sorted words into a single string
        String sortedString = String.join(" ", words);
        
        return sortedString; // Return the sorted string
    }

    public static void main(String[] args) {
        String input = "Hello this is veera";
        System.out.println(sortWordsAlphabetically(input)); // Output: "Hello is this veera"
    }
}
