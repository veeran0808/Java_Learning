package java_dsa;

/**
 * This program checks if two strings are anagrams of each other.
 * 
 * Question: Write a program to check if two strings are anagrams of each other.
 * 
 * Example:
 * Input 1: "Hello"
 * Input 2: "oellH"
 * Output: true
 * 
 * Methods Used:
 * - areAnagrams(String str1, String str2): Takes two string inputs, sorts the characters
 *   in both strings, and compares them to determine if they are anagrams.
 * 
 * Data Flow:
 * 1. Two input strings are received.
 * 2. The strings are normalized (trimmed and converted to lowercase).
 * 3. Characters of both strings are sorted.
 * 4. The sorted strings are compared for equality.
 * 5. The result is returned indicating if they are anagrams.
 */

import java.util.Arrays;

public class SA_23_CheckAnagrams {

    public static boolean areAnagrams(String str1, String str2) {
        // Normalize the strings by trimming and converting to lowercase
        str1 = str1.trim().toLowerCase();
        str2 = str2.trim().toLowerCase();
        
        // Check if lengths are different; if so, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        
        // Sort the character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        // Compare sorted character arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String input1 = "Hello";
        String input2 = "oellH";
        System.out.println(areAnagrams(input1, input2)); // Output: true
    }
}
