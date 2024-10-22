package java_dsa;

/**
 * This program checks if a given string is a palindrome, ignoring spaces and case sensitivity.
 * 
 * Problem Statement:
 * Question: Write a program to check if the string is a palindrome (ignoring spaces and case).
 * 
 * Example:
 * Input: "Hello"
 * Output: false
 * 
 * Methods Used:
 * - isPalindrome(String input): Takes a string input, processes it to remove spaces and convert to lower case,
 *   then checks if the processed string reads the same backward as forward.
 * 
 * Data Flow:
 * 1. Input string is received.
 * 2. The string is processed by removing spaces and converting it to lower case.
 * 3. The processed string is compared with its reverse to determine if it's a palindrome.
 * 
 * Expected Input: "Hello"
 * Expected Output: false
 */
public class SA_14_PalindromeChecker {

    /**
     * This method checks if the input string is a palindrome.
     * 
     * @param input the string to be checked
     * @return true if the string is a palindrome; false otherwise
     */
    public static boolean isPalindrome(String input) {
        // Check for null or empty input
        if (input == null || input.trim().isEmpty()) {
            return false; // Return false for null or empty input
        }

        // Remove spaces and convert to lower case for comparison
        String processedInput = input.replaceAll(" ", "").toLowerCase();

        // Initialize variables for comparing characters
        int left = 0; // Starting index from the left
        int right = processedInput.length() - 1; // Starting index from the right

        // Check characters from both ends moving towards the center
        while (left < right) {
            if (processedInput.charAt(left) != processedInput.charAt(right)) {
                return false; // Return false if characters do not match
            }
            left++; // Move left index to the right
            right--; // Move right index to the left
        }
        return true; // Return true if all characters match
    }

    public static void main(String[] args) {
        String input = "Hello";
        System.out.println(isPalindrome(input)); // Output: false
    }
}
