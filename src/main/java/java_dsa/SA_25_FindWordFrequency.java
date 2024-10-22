package java_dsa;

/**
 * This program finds the frequency of each word in the given string.
 * 
 * Question: Write a function to find the frequency of each word in the string.
 * 
 * Example:
 * Input: "Hello this is veera this"
 * Output: "Hello" -> 1, "this" -> 2, "is" -> 1, "veera" -> 1
 * 
 * Methods Used:
 * - findWordFrequency(String input): Takes a string input, splits it into words,
 *   counts the frequency of each word, and returns a formatted string of word frequencies.
 * 
 * Data Flow:
 * 1. Input string is received.
 * 2. The string is split into an array of words.
 * 3. A frequency map is created to count occurrences of each word.
 * 4. The frequencies are formatted into a string and returned.
 */

import java.util.HashMap;
import java.util.Map;

public class SA_25_FindWordFrequency {

    public static String findWordFrequency(String input) {
        String[] words = input.split(" "); // Split input into words
        Map<String, Integer> frequencyMap = new HashMap<>(); // Create a map to store word frequencies

        // Count frequencies of each word
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        // Build the output string with word frequencies
        StringBuilder output = new StringBuilder();
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            output.append("\"").append(entry.getKey()).append("\" -> ").append(entry.getValue()).append(", ");
        }

        // Remove the last comma and space, if any
        if (output.length() > 0) {
            output.setLength(output.length() - 2); // Remove trailing comma and space
        }

        return output.toString(); // Return the formatted frequencies
    }

    public static void main(String[] args) {
        String input = "Hello this is veera this";
        System.out.println(findWordFrequency(input)); // Output: "Hello" -> 1, "this" -> 2, "is" -> 1, "veera" -> 1
    }
}

