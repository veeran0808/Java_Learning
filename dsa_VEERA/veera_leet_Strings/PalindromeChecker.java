package veera_leet_Strings;
import java.util.Scanner;

public class PalindromeChecker {

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Step 1: Normalize the string by converting it to lower case
        str = str.toLowerCase();
        
        // Step 2: Initialize pointers for comparison
        int left = 0;
        int right = str.length() - 1;

        // Step 3: Compare characters from both ends towards the center
        while (left < right) {
            // Step 4: Skip non-alphanumeric characters
            if (!Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            } else if (!Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            } else {
                // Step 5: Compare the characters
                if (str.charAt(left) != str.charAt(right)) {
                    return false; // Not a palindrome
                }
                left++;
                right--;
            }
        }
        return true; // Is a palindrome
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Step 6: Input string from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Step 7: Check if the string is a palindrome and print the result
        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        // Closing the scanner to avoid resource leaks
        scanner.close();
    }
}

/*
Data Flow:
1. The user inputs a string via the console.
2. The string is passed to the isPalindrome function.
3. The function normalizes the string, initializes pointers, and starts comparing characters from both ends.
4. It returns true or false based on whether the string is a palindrome.
5. The main method receives the result and displays it to the user.

Example:
- Input: "A man, a plan, a canal: Panama"
- Normalized: "amanaplanacanalpanama"
- Comparison: 
  - 'a' == 'a' (left: 0, right: 20)
  - 'm' == 'm' (left: 1, right: 19)
  - ...continue until the pointers meet.

Time Complexity: O(n)
- Each character in the string is compared at most once.

Space Complexity: O(1)
- No additional data structures are used that scale with input size; only a few integer variables for pointers are used.
*/
