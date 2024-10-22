package java_dsa;

/**
 * This program replaces all vowels in a given string with the character '$' 
 * and trims any leading or trailing spaces from the input string.
 * 
 * Methods Used:
 * - replaceVowelsAndTrim(String input): Takes a string input, replaces vowels 
 *   with '$', and returns the modified string after trimming spaces.
 * 
 * Data Flow:
 * 1. Input string is received.
 * 2. Leading and trailing spaces are trimmed.
 * 3. The string is iterated character by character.
 * 4. Vowels are replaced with '$'.
 * 5. The final modified string is returned.
 * 
 * Expected Input: " Hello this is veera "
 * Expected Output: "$$ll$ th$s $s v$$r$"
 */
public class S8_VowelReplacement {

    public static String replaceVowelsAndTrim(String input) {
        // Trim leading and trailing spaces
        input = input.trim(); 
        
        // Initialize the result string
        String result = ""; 
        
        // Iterate through each character of the input string
        for (char c : input.toCharArray()) {
            // Check if the character is a vowel
            if ("AEIOUaeiou".indexOf(c) != -1) {
                // Replace vowel with '$'
                result += "$";
            } else {
                // Otherwise, keep the character as is
                result += c; 
            }
        }
        return result; // Return the final modified string
    }

    public static void main(String[] args) {
        String input = " Hello this is veera ";
        System.out.println(replaceVowelsAndTrim(input)); // Output: "$$ll$ th$s $s v$$r$"
    }
}
