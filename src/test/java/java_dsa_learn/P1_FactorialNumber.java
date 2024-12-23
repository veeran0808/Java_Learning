package java_dsa_learn;

public class P1_FactorialNumber {

	public static int fact(int n) {
		int res = 1;
		for(int i=1;i<=n;i++) {
			res =res*i;
		}
		return res;
		
	}
	public static void main(String[] args) {
		
		//3! = 1* 2 * 3 = 6
		//5! = 1 * 2 * 3 * 4 * 5 = 120
		
		/*
		 * int n=5; int result = 1; 
		 * for(int i=1; i<=5;i++) { 
		 * result = result * i; }
		 * System.out.println(result);
		 */
		int output = fact(4);
		System.out.println(output);
		
	}
	
	

}
