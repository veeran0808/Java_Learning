package java_static;

public class Sample {

	int a = 5;
	static int b = 10;
	
	public void methodOne() {
		System.out.println("Inside instance that is non static");
	}
	
	public void methodTwo() {
		System.out.println("Inside instance that is static");
	}
}
