package java_dsa;


	public class SA_27_FindLastOccurrence{
	    /**
	     * Finds the last occurrence of a character in a string.
	     * @param inputString The string to search in.
	     * @param characterToFind The character to find.
	     * @return The index of the last occurrence, or -1 if not found.
	     */
	    public static int findLastOccurrence(String inputString, char characterToFind) {
	        // Loop through the string in reverse order
	        for (int index = inputString.length() - 1; index >= 0; index--) {
	            // Check if the current character matches the character to find
	            if (inputString.charAt(index) == characterToFind) {
	                return index; // Return index of last occurrence
	            }
	        }
	        return -1; // Character not found
	    }

	    // Test the function with various inputs
	    public static void main(String[] args) {
	        String input1 = "hello";
	        char character1 = 'l';
	        int lastIndex1 = findLastOccurrence(input1, character1);
	        System.out.println("Last occurrence of '" + character1 + "' in \"" + input1 + "\": " + lastIndex1); // Output: 3

	        String input2 = "world";
	        char character2 = 'o';
	        int lastIndex2 = findLastOccurrence(input2, character2);
	        System.out.println("Last occurrence of '" + character2 + "' in \"" + input2 + "\": " + lastIndex2); // Output: 1

	        String input3 = "Java programming";
	        char character3 = 'a';
	        int lastIndex3 = findLastOccurrence(input3, character3);
	        System.out.println("Last occurrence of '" + character3 + "' in \"" + input3 + "\": " + lastIndex3); // Output: 4

	        String input4 = "hello";
	        char character4 = 'z';
	        int lastIndex4 = findLastOccurrence(input4, character4);
	        System.out.println("Last occurrence of '" + character4 + "' in \"" + input4 + "\": " + lastIndex4); // Output: -1
	    }
	}

