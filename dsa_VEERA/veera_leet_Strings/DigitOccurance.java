package veera_leet_Strings;

import java.util.HashMap;
import java.util.Map;

public class DigitOccurance {

	public static void main(String[] args) {

		Map<Integer, Integer> maxOcuurance = new HashMap<>();
		int[] arr = { 1,1,1,1, 5, 3, 6, 4, 4, 3, 3 };
		for (int i = 0; i < arr.length; i++) {

			int n = arr[i];

			maxOcuurance.put(n, maxOcuurance.getOrDefault(n, 0) + 1);

		}
          int maxDigit = -1;
          int maxValue = 0;
          for(Map.Entry<Integer,Integer> entry: maxOcuurance.entrySet()) {
          int key = entry.getKey();
          int value = entry.getValue();
          if(value > maxValue) {
        	  maxDigit = key;
        	  maxValue = value;
          }
	}
          System.out.println("highest occurance digit..." + maxDigit);
          System.out.println("highest occurances..." + maxValue);

}
}