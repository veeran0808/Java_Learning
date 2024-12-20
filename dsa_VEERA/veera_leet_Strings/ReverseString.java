package veera_leet_Strings;

public class ReverseString {

	public static void main(String[] args) {
		
	  String s = "Hello";
	  String revered = " ";
	  int reverseWordlength =  s.length()-1;
	  for(int i = reverseWordlength; i>=0; i-- ) {
		  revered+= s.charAt(i);
		  System.out.println(revered);
		  
	  }
	  System.out.println(revered);
	  
	}

}
