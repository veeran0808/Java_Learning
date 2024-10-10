package java_basics;

public class ReverseString {

	public static void main(String[] args) {
		// P1.Reverese String?
		// P2.Given string is palandrom or not?
		// WAY1......................................
		String s = "CDC";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println("the reverse string is..." + rev);
		if (s.equals(rev)) {
			System.out.println("user entered palanidrom");
		} else {
			System.out.println("not palindrom");
		}
		// *-----------BREAK-------------*-//
		for (int i = 0; i < 5; i++) {
			if (i == 2) {
				break;

			}
			System.out.println(i);
		}
		// *---------Boolean---------------------*//
		boolean val = true;
		System.out.println(val);

		// WAY2:-----------------//
		// PALANDROM : ABC CBA , ABC, CDAA
		boolean palandrom = true;
		String s1 = "CBCSDNSASCBC";
		int n = s1.length();

		for (int i = 0; i < n / 2; i++) {
			int j = n - i - 1;
			System.out.println("for loop I..." + s1.charAt(i));
			System.out.println("for loop J..." + s1.charAt(i));
			if (s1.charAt(i) != s1.charAt(j)) {
				System.out.println("if start i is..." + s1.charAt(i));
				System.out.println("if start j is..." + s1.charAt(j));
				
				System.out.println(j);
				palandrom = false;
				System.out.println(palandrom);
				break;

			}
		}
		/*
		 * if (palandrom) { System.out.println("it is palandrom"); } else {
		 * System.out.println("not palandrom"); }
		 */
	}

}
