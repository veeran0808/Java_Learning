package java_exceptions;

public class E1_Test {

	public static void main(String[] args) {
		doStuff();
	}

	private static void doStuff() {
		domoreStuff();
		System.out.println(10/0);
	}

	private static void domoreStuff() {
		System.out.println("Hello");
		//System.out.println(10/0);
		//Exception in thread "main" java.lang.ArithmeticException: / by zero
		
	}

	/**
	 * one thread main thread
	 * main(); --> doStuff(); --> domoreStuff(); -->doStuff(); --> main 
	 *           main();          doStuff();        main();
	 *                            main();
	 * -->Destroy by JVM
	 * -->If everything goes well the JVM terminate this thread and corresponding stack will be destroyed 
	 * 
	 */
}
