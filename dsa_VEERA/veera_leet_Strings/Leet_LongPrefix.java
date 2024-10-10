package veera_leet_Strings;

public class Leet_LongPrefix {

	public static void main(String[] args) {
		Leet_LongPrefix lcp = new Leet_LongPrefix();
		String[] testStrings = {"flower", "flow", "flight"};
	    System.out.println(lcp.longestCommonPrefix(testStrings)); 
	

	}
	public String longestCommonPrefix(String[] strs) {
		if(strs==null || strs.length==0)	
		return "";
		
		//Start with the first string of the array as the inital prefix
		String prefix = strs[0];
		
		//Compare the each prefix with each string in array
		for(int i=0;i<strs.length;i++) {
			//Narrowdown prefix with each comparison
			while(strs[i].indexOf(prefix)!=0) {
				//shorten the prefix by one charater from the end 
				prefix = prefix.substring(0,prefix.length()-1);
			
				//if the prefix is empty there is no common prefix
				if(prefix.isEmpty())
					return "";
			}
		}
		return prefix;
		
		
	}

}
