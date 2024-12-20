package java_aqa;

import java.util.HashMap;
import java.util.Map;

public class P5_CharMaxtOccurance {

	public static void main(String[] args) {

	//Char occurance 
	String word = "Helloworld";
	Map<Character,Integer> charMap = new HashMap<>();
	
	for(char ch : word.toLowerCase().toCharArray()) {
		charMap.put(ch, charMap.getOrDefault(ch, 0)+1 );
	}
	
	char maxChar = '\0';
	char secondMaxchar = '\0';
	int maxCount = 0;
	int secondMaxCount = 0;
	for(Map.Entry<Character, Integer> entry : charMap.entrySet()) {
		char key = entry.getKey();
		int value = entry.getValue();
		
		System.out.println("key occurance --->" + key + "---no of times--" + value);
		
		if(value > maxCount) {
			secondMaxchar = maxChar;
			secondMaxCount = maxCount;		
			maxCount = value;
			maxChar = key;
			
		}
		else if(value > secondMaxCount && value < maxCount) {
			secondMaxchar = key;
			secondMaxCount = value;		
		}
	}
	System.out.println("Print max occurance character..." + maxChar + " no of time "+maxCount );
	System.out.println("Print max occurance character..." + secondMaxchar + " no of time "+secondMaxCount );
		
	}
}