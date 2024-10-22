package java_dsa;

/**
 * This program counts the number of vowels and consonants in the string.
 * 
 * Problem Statement:
 * Question: Write a function to count the number of vowels and consonants in the string.
 * 
 * Example:
 * Input: "Hello this is veera"
 * Output: Vowels: 8, Consonants: 9
 */
public class SA_16_CountVowelsConsonants {

    public static void main(String[] args) {
        String input = "Hello this is veera";
        countVowelsAndConsonants(input);
    }

    public static void countVowelsAndConsonants(String input) {
        int vowels = 0, consonants = 0;
        String lowerCaseInput = input.toLowerCase();

        for (char ch : lowerCaseInput.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }
}

