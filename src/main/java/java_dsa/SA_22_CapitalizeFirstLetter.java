package java_dsa;

/**
 * This program capitalizes the first letter of each word in the given string.
 * 
 * Question: Write a program to capitalize the first letter of each word in the string.
 * 
 * Example:
 * Input: "hello this is veera"
 * Output: "Hello This Is Veera"
 * 
 * Methods Used:
 * - capitalizeFirstLetter(String input): Takes a string input, splits it into words,
 *   capitalizes the first letter of each word, and returns the modified string.
 * 
 * Data Flow:
 * 1. Input string is received.
 * 2. The string is split into an array of words.
 * 3. Each word is processed to capitalize its first letter.
 * 4. The modified words are joined to form the final string.
 * 5. The final string is returned.
 */

public class SA_22_CapitalizeFirstLetter {

    public static String capitalizeFirstLetter(String input) {
        // Split the input string into words using space as a delimiter
        String[] words = input.split(" ");
        // Create an array to hold capitalized words
        String[] capitalizedWords = new String[words.length];
        
        // Iterate through each word in the words array
        for (int i = 0; i < words.length; i++) {
            // Capitalize the first letter and combine with the rest of the word
            capitalizedWords[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1);
        }
        
        // Join the capitalized words into a single string with spaces
        return String.join(" ", capitalizedWords);
    }

    public static void main(String[] args) {
        String input = "hello this is veera";
        System.out.println(capitalizeFirstLetter(input)); // Output: "Hello This Is Veera"
    }
}
