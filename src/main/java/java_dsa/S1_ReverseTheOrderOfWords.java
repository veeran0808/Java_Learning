package java_dsa;

public class S1_ReverseTheOrderOfWords {

    /**
     * This method reverses the order of words in the given string.
     * 
     * @param s The input string containing words separated by spaces.
     * @return A new string where the order of words is reversed.
     * 
     * Data Flow:
     * 1. The input string is split into an array of words.
     * 2. A new array is created to store the words in reverse order.
     * 3. Words from the original array are copied to the new array in reverse order.
     * 4. The words in the new array are joined back into a single string with spaces.
     * 5. The resulting reversed string is returned.
     */
    public static String reverseWords(String s) {
        // Step 1: Split the input string into individual words
        String[] words = s.split(" "); // "Hello this is veera" -> ["Hello", "this", "is", "veera"]

        // Step 2: Create an array to hold the reversed words
        String[] reversed = new String[words.length]; // Create a new array of the same size to store reversed words

        // Step 3: Iterate through the original words array from the first to the last element
        for (int i = 0; i < words.length; i++) {
            // Step 4: Place each word into the corresponding reverse position
            reversed[words.length - 1 - i] = words[i]; // Assign words in reverse order
        }

        // Step 5: Join the reversed words back into a single string
        return String.join(" ", reversed); // Join the array into a string with space separators
    }

    public static void main(String[] args) {
        // Input string
        String input = "Hello this is veera";

        // Call the reverseWords method and store the result
        String result = reverseWords(input);

        // Print the reversed string
        System.out.println(result); // Output: "veera is this Hello"

        // Expected Output: "veera is this Hello"
    }
}
