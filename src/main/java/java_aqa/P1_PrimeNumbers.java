package java_aqa;

public class P1_PrimeNumbers {

	public static void main(String[] args) {
	
		//P1: Print prime number between 100 to 200
		for(int num=100;num<=200;num++) {
		boolean isPrime = true;
		for(int i=2; i<=num/2;i++) {
			System.out.println("Print num " + num + "print i " + i);
			if(num%i==0) {
			//	System.out.println("Print num " + num + "print i " + i);
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(num + " ");
		}
		
		}

	}

}
