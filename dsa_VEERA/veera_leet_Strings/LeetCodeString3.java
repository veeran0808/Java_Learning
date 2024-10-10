package veera_leet_Strings;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeetCodeString3 {

    /**
     * Method to reverse the order of words in a given sentence.
     * @param input The input sentence.
     * @return The sentence with words in reversed order.
     */
    public static String reverseWords(String input) {
        // Step 1: Split the input string into words
        String[] words = input.split(" ");
        
        // Step 2: Convert the array to a List to reverse the order of words
        List<String> wordList = Arrays.asList(words);
        Collections.reverse(wordList);  // Reverse the list
        
        // Step 3: Join the reversed words back into a string
        return String.join(" ", wordList);  // Join with space separator
    }

    public static void main(String[] args) {
        // Example input
        String input = "Hi This is Veera";
        
        // Call the reverseWords method
        String result = reverseWords(input);
        
        // Output the result
        System.out.println("Reversed Sentence: " + result);
    }
}
