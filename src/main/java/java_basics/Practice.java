package java_basics;

public class Practice {

	public static void main(String[] args) {

		String s = "veera";
		String ans = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			ans = ans + s.charAt(i);
		}
		System.out.println(ans);
		if (s.equals(ans)) {
			System.out.println("its palandrom");
		} else {
			System.out.println("not palandrom");
		}

		String s1 = "ABCD";
		int n = s1.length();
		boolean val = true;
		for(int i=0;i<n/2;i++) {
			int j = n-i-1;
			if(s1.charAt(i)!=s1.charAt(j)) {
				System.out.println(s1.charAt(i));
				System.out.println(s1.charAt(j));
				
				val = false;
				System.out.println(val);
				break;
			}
		}
	}
}
