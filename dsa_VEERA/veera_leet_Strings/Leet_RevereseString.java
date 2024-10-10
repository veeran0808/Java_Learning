package veera_leet_Strings;

public class Leet_RevereseString {

	public static String  revereseString(String s) {
		//1.convert the string array into character array
		char[] chars = s.toCharArray();
		//2.Initialize two pointers
		int left =0;
		int right = chars.length-1;
		//3.swap the pointers unitll the pointers meet
		while(left<right) {
		//4.swap the characters at left and right
			char temp = chars[left];
			chars[left]= chars[right];
			chars[right]=temp;
		//5.move the pointers towards the center
			left++;
			right--;
		}
		return new String(chars);
 	}
	public static void main(String[] args) {
		String s = "Hi this is veera";
		String reveresed = revereseString(s);
		System.out.println("Original string ..."+ s);
		System.out.println("Reveresed String ..." + reveresed);

	}

}
