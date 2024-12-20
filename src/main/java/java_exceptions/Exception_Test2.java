package java_exceptions;

public class Exception_Test2 {

	public static void main(String[] args) {
		System.out.println("Statement 1");
		try {
			System.out.println(10/0);
			System.out.println("Statement 2");
		}
		catch(ArithmeticException e) {
			System.out.println(10/2);
		}
		System.out.println("Statement 3");
	}

	
	/**
	 Within try block if anywhere an exception raised then rest of the try block wont'be 
	 executed even if we handled that exception hence we have to place / take only risk code inside 
	 the try block and length of the try block should be as less as possible
	 */
}
