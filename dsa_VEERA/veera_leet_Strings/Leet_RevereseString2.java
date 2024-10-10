package veera_leet_Strings;

public class Leet_RevereseString2 {

	public static String  revereseString(String s) {
		//1.convert the string array into character array
		String[] words = s.split(" ");
		//2.Initialize two pointers
		int left =0;
		int right = words.length-1;
		//3.swap the pointers unitll the pointers meet
		while(left<right) {
		//4.swap the characters at left and right
			String temp = words[left];
			words[left]= words[right];
			words[right]=temp;
		//5.move the pointers towards the center
			left++;
			right--;
		}
		return  String.join(" ", words);
 	}
	public static void main(String[] args) {
		String s = "Hi this is veera";
		String reveresedword = revereseString(s);
		System.out.println("Original string ..."+ s);
		System.out.println("Reveresed String ..." + reveresedword);

	}

}
