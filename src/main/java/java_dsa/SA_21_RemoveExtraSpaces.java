package java_dsa;

/**
 * This program removes extra spaces between words in the given string.
 * 
 * Problem Statement:
 * Question: Write a function to remove extra spaces between words.
 * 
 * Example:
 * Input: "Hello    this    is    veera"
 * Output: "Hello this is veera"
 */
public class SA_21_RemoveExtraSpaces {

    public static void main(String[] args) {
        String input = "Hello    this    is    veera"; // Input string with extra spaces
        String result = removeExtraSpaces(input); // Remove extra spaces
        System.out.println(result); // Print the result
    }

    /**
     * Removes extra spaces between words in the input string.
     *
     * @param input The string from which to remove extra spaces.
     * @return The string with extra spaces removed.
     */
    public static String removeExtraSpaces(String input) {
        // Trim the input to remove leading and trailing spaces, then replace multiple spaces with a single space
        return input.trim().replaceAll("\\s+", " ");
    }
}
