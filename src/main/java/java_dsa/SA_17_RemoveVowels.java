package java_dsa;

/**
 * This program removes all vowels from the given string.
 * 
 * Problem Statement:
 * Question: Write a function to remove all vowels from the string.
 * 
 * Example:
 * Input: "Hello this is veera"
 * Output: "Hll ths s vr"
 */
public class SA_17_RemoveVowels {

    public static void main(String[] args) {
        String input = "Hello this is veera"; // Input string
        System.out.println(removeVowels(input)); // Print the result after removing vowels
    }

    /**
     * Removes all vowels from the input string.
     *
     * @param input The string from which vowels need to be removed.
     * @return A new string with all vowels removed.
     */
    public static String removeVowels(String input) {
        StringBuilder result = new StringBuilder(); // Initialize StringBuilder to store the result

        // Iterate through each character in the input string
        for (char ch : input.toCharArray()) {
            // Check if the character is not a vowel
            if (!isVowel(ch)) {
                result.append(ch); // Append non-vowel characters to the result
            }
        }

        // Convert StringBuilder to String and return the result
        return result.toString();
    }

    /**
     * Checks if a character is a vowel.
     *
     * @param ch The character to check.
     * @return true if the character is a vowel, false otherwise.
     */
    private static boolean isVowel(char ch) {
        // Check for both uppercase and lowercase vowels
        return "aeiouAEIOU".indexOf(ch) != -1; // Return true if character is a vowel
    }
}
