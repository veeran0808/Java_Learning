package java_aqa;

public class P2_PrintSumOfPrimeNumbers {

	public static void main(String[] args) {
		// Print sum of first 100 prime numbers
		int count = 0;
		int sum = 0;
		int num = 2;
		System.out.println("Print the 1st 100 prime numbers");
		while(count <100) {
			boolean isPrime = true;
			for(int i=2 ;i<=num/2;i++ ) {
				if(num%i==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(num + " ");
				sum +=num;
				count++;
			}
			num++;
		}

		System.out.println("Sum of the 1st 100 prime numbers are..." + sum);
	}

}
