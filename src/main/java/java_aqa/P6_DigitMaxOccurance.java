package java_aqa;

import java.util.HashMap;
import java.util.Map;

public class P6_DigitMaxOccurance {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,1,6,2,1,4,1,1};
		Map<Integer,Integer> digitMap = new HashMap<>();
		for(int digit : arr ) {
			digitMap.put(digit, digitMap.getOrDefault(digit, 0)+1);
		}
		
		int maxDigit = -1;
		int secondMaxDigit = -1;
		int maxCount = 0;
		int secondMaxCount = 0;
		
		for(Map.Entry<Integer, Integer> entry : digitMap.entrySet()) {
			int key = entry.getKey();
			int value = entry.getValue();
		
			if(value>maxCount) {
				secondMaxDigit = maxDigit;
				secondMaxCount = maxCount;
		//	System.out.println("inside if loop" +secondMaxDigit + " -> " + secondMaxCount );
				maxDigit = key;
				maxCount = value;
			}
			
			else if(value > secondMaxCount && value < maxCount) {
				secondMaxDigit = key;
				secondMaxCount = value;
			}
		}

		System.out.println("Max occurance no--> " +maxDigit+ " ocurrances " + maxCount  );
		System.out.println("Second Max occurance no--> " +secondMaxDigit+ " ocurrances " + secondMaxCount  );
	}

}
