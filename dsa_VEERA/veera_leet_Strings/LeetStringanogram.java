package veera_leet_Strings;

import java.util.Arrays;

public class LeetStringanogram {

	public static boolean isAnagram(String s, String t) {
		if(s.length()!=t.length()) {
			return false;
		}
		char[] sArray = s.toCharArray();
		char[] tArray = t.toCharArray();
		Arrays.sort(sArray);
		Arrays.sort(tArray);
		return Arrays.equals(sArray, tArray);
	}
	public static void main(String[] args) {
		String s ="listen";
		String t = "silent";
		if(isAnagram(s, t)) {
			System.out.println(s+" and "+ t + "are anagrams");
		}
		else {
			System.out.println(s+ " and " + t + "are not anagroms");
		}

	}

}
