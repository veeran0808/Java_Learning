package java_dsa;

public class S4_ReverseSecondWord {

    /**
     * This method reverses only the second word in the input string and keeps the other words unchanged.
     * 
     * @param input The input string containing words separated by spaces.
     * @return A new string where only the second word is reversed.
     * 
     * Data Flow:
     * 1. The input string is split into an array of words.
     * 2. The second word is identified and reversed manually.
     * 3. The reversed second word is placed back in the array.
     * 4. The final string with the reversed second word is returned by joining the array.
     */
    public static String reverseSecondWord(String input) {
        // Step 1: Split the input string into words
        String[] words = input.split(" "); 
        // Example: "Hello this is veera" -> ["Hello", "this", "is", "veera"]

        // Step 2: Check if there's a second word to reverse
        if (words.length >= 2) {
            // Step 3: Reverse the second word manually
            char[] secondWordChars = words[1].toCharArray(); 
            // Convert the second word to a character array

            int start = 0;
            int end = secondWordChars.length - 1;

            while (start < end) {
                // Swap the characters to reverse the second word
                char temp = secondWordChars[start];
                secondWordChars[start] = secondWordChars[end];
                secondWordChars[end] = temp;
                
                start++;
                end--;
            }

            // Step 4: Replace the second word in the array with its reversed version
            words[1] = new String(secondWordChars);
        }

        // Step 5: Join the words back into a single string with space separators
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        // Input string
        String input = "Hello this is veera";

        // Call the reverseSecondWord method and print the result
        String result = reverseSecondWord(input);
        
        System.out.println(result); 
        // Output: Hello siht is veera

        // Expected Output: "Hello siht is veera"
    }
}
