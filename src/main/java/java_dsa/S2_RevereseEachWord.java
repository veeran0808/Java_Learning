package java_dsa;

public class S2_RevereseEachWord {

    /**
     * This method reverses each word in the input string while keeping the word order intact.
     * 
     * @param input The input string containing words separated by spaces.
     * @return A new string where each word is reversed, but the word order is unchanged.
     * 
     * Data Flow:
     * 1. The input string is split into an array of words.
     * 2. Each word in the array is reversed manually (character by character).
     * 3. The reversed words are joined back into a single string.
     * 4. The final string with reversed words is returned.
     */
    public static String reverseEachWord(String input) {
        // Step 1: Split the input string into words
        String[] words = input.split(" "); // Example: "Hello this is veera" -> ["Hello", "this", "is", "veera"]

        // Step 2: Create an array to hold the reversed words
        String[] reversedWords = new String[words.length];

        // Step 3: Reverse each word manually by iterating over its characters
        for (int i = 0; i < words.length; i++) {
            char[] wordChars = words[i].toCharArray(); // Convert the word to a character array
            
            // Step 4: Reverse the character array (manually reversing the characters)
            int start = 0;
            int end = wordChars.length - 1;
            while (start < end) {
                // Swap the characters
                char temp = wordChars[start];
                wordChars[start] = wordChars[end];
                wordChars[end] = temp;
                start++;
                end--;
            }
            // Step 5: Convert the reversed character array back to a string
            reversedWords[i] = new String(wordChars);
        }

        // Step 6: Join the reversed words back into a single string with space separators
        return String.join(" ", reversedWords);
    }

    public static void main(String[] args) {
        // Input string
        String input = "Hello this is veera";

        // Call the reverseEachWord method and print the result
        String result = reverseEachWord(input);
        System.out.println(result); // Output: "olleH siht si areev"

        // Expected Output: "olleH siht si areev"
    }
}
