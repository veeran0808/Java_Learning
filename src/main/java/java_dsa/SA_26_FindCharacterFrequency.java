package java_dsa;

/**
 * This program finds the frequency of each character in the given string.
 * 
 * Question: Write a function to find the frequency of each character in the string.
 * 
 * Example:
 * Input: "Hello"
 * Output: "H" -> 1, "e" -> 1, "l" -> 2, "o" -> 1
 * 
 * Methods Used:
 * - findCharacterFrequency(String input): Takes a string input, counts the frequency 
 *   of each character, and returns a formatted string of character frequencies.
 * 
 * Data Flow:
 * 1. Input string is received.
 * 2. The string is iterated to count occurrences of each character.
 * 3. The frequencies are formatted into a string and returned.
 */

import java.util.HashMap;
import java.util.Map;

public class SA_26_FindCharacterFrequency {

    public static String findCharacterFrequency(String input) {
        Map<Character, Integer> frequencyMap = new HashMap<>(); // Create a map to store character frequencies

        // Count frequencies of each character
        for (char ch : input.toCharArray()) {
            if (ch != ' ') { // Ignore spaces
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            }
        }

        // Build the output string with character frequencies
        StringBuilder output = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            output.append("\"").append(entry.getKey()).append("\" -> ").append(entry.getValue()).append(", ");
        }

        // Remove the last comma and space, if any
        if (output.length() > 0) {
            output.setLength(output.length() - 2); // Remove trailing comma and space
        }

        return output.toString(); // Return the formatted frequencies
    }

    public static void main(String[] args) {
        String input = "Hello ";
        System.out.println(findCharacterFrequency(input)); // Output: "H" -> 1, "e" -> 1, "l" -> 2, "o" -> 1
    }
}
