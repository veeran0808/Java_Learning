package veera_leet_Strings;

import java.util.HashMap;
import java.util.Map;

public class StringWordsOccurance {

	public static void main(String[] args) {

		String[] words = { "pen", "bat",  "pen", "pend", "bat", "pen" };
		Map<String, Integer> wordsMap = new HashMap<>();
		for (String word : words) {
			wordsMap.put(word, wordsMap.getOrDefault(word, 0) + 1);
		}
		
		String maxWord = null;
		String SecondmaxWord = null;
		int maxCount = 0;
		int secondMaxCount = 0;
		
		for(Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
			
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println("key..." +key );
			System.out.println("value..." +value );
			if(value > maxCount) {
				secondMaxCount = maxCount;
				SecondmaxWord = maxWord;
				
				maxCount = value;
				maxWord = key;
			}
			
			else if(value > secondMaxCount && value < maxCount ) {
				
				secondMaxCount = value;
				SecondmaxWord = key;
			}
		}
		
		System.out.println("Max occurance word.." + maxWord + " occurances " + maxCount);
		System.out.println("Max occurance word.." + SecondmaxWord + " SecondmaxWord " + secondMaxCount);

	}

}
