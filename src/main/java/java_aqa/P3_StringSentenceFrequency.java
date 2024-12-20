package java_aqa;

import java.util.HashMap;
import java.util.Map;

public class P3_StringSentenceFrequency {

	public static void main(String[] args) {

		// Convert the string to lowercase and split into words
		String sentence = "Hello automtion veeraa practice";
		String[] words = sentence.split(" ");

		// Use a HashMap to store the frequency of each word
		Map<String, Integer> map = new HashMap<>();
		for (String word : words) {
			map.put(word, map.getOrDefault(word, 0) + 1);
		}

	}

}
