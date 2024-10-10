package java_basics;

public class LeetCode4_Functions {

	public static void fun(String s, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(s);
		}

	}
	public static void ab(String sup) {
		System.out.println(sup);
	}

	public static void main(String[] args) {
		// P3: "Veera 4" print veera 4 times
		/*
		 * String s = "Veera"; int n = 3;
		 * 
		 * 
		 * for(int i=0;i<n;i++) { System.out.println(s); }
		 */
		String vee ="avd";
		ab(vee);
		fun("veera", 3);
		fun("gopi", 4);

	}
}
