package veera_leet_Strings;

public class StringLargestWord {

	public static void main(String[] args) {
		String s = "Hello automation world Veeraaa";
		String[] words = s.split(" ");
		
		String largestWord = null;
		int maxLength = 0;
		for(String word : words) {
			if(word.length()> maxLength) {
				maxLength = word.length();
				largestWord = word;
			}		
		}
		System.out.println("Max word " + largestWord + " max length " + maxLength);

	}

}
