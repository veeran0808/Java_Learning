package veera_leet_Strings;

import java.util.HashMap;
import java.util.Map;

public class StringsentenceOccuranceWord {

	public static void main(String[] args) {
	
		String s = "hello automation World Hello WORLD World world";
		String[] words = s.toLowerCase().split(" ");
		Map<String, Integer> wordsMap = new HashMap<>();
		
		for(String word : words) {
			wordsMap.put(word, wordsMap.getOrDefault(word, 0)+1);
		}

		String maxWord = null;
		String secondMaxWord = null; 
		int maxCount = 0;
		int secondMaxCount = 0;
		
		for(Map.Entry<String, Integer> entry:wordsMap.entrySet() ) {
			String key = entry.getKey();
			int value = entry.getValue();
			if(value>maxCount) {
				secondMaxCount = maxCount;
				secondMaxWord = maxWord;
				maxCount = value;
				maxWord = key;
			}
			
			else if(value >secondMaxCount && value < maxCount ) {
				secondMaxCount = value;
				secondMaxWord = key;
			}
		}
		
		System.out.println("Max occurance word and no of time "+maxWord+ " " + maxCount);
		System.out.println("Max occurance word and no of time "+secondMaxWord+ " " + secondMaxCount);
	}

}
