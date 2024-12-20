package veera_leet_Strings;

public class StringSecondLargestWord {

	public static void main(String[] args) {
	
		String s = "hello automation worldd krish";
		String[] words = s.split(" ");
		String maxWord = null;
		String secondMaxWord = null;
		int maxLength = 0;
		int secondMaxLength = 0;
		
		for(String word: words) {
			int wordlength = word.length();
			if(wordlength > maxLength) {
				secondMaxLength = maxLength;
				secondMaxWord = maxWord;
				
				maxLength = wordlength;
				maxWord = word;
				
			}
			
			else if(wordlength > secondMaxLength && wordlength < maxLength ) {
				secondMaxLength = wordlength;
				secondMaxWord = word;
			//	System.out.println(secondMaxWord);
			}
		}
		
		System.out.println("Max word " + maxWord + " and max length " + maxLength );
		System.out.println("Second Max word " + secondMaxWord + " and max length " + secondMaxLength );

	}

}
