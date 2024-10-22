package java_dsa;

/**
 * This program converts all characters in the string to uppercase or lowercase.
 * 
 * Problem Statement:
 * Question: Write a program to convert all characters in the string to uppercase or lowercase.
 * 
 * Example:
 * Input: "Hello this is veera"
 * Output (Uppercase): "HELLO THIS IS VEERA"
 * Output (Lowercase): "hello this is veera"
 */
public class SA_15_ConvertCase {

    public static void main(String[] args) {
        String input = "Hello this is veera";
        System.out.println("Uppercase: " + input.toUpperCase());
        System.out.println("Lowercase: " + input.toLowerCase());
    }
}