package java_basics;

public class ConditionalStatements {

	public static void main(String[] args) {

		int a = 5;
		int b = 10;
		if (a == b) {
			System.out.println("hii");
		} else {
			System.out.println("Hello");
		}
		int c = 10;
		if (c > a) {
			System.out.println("bye");
		}
		if (true) {
			System.out.println("hi selenium");
		} else {// dead code not using
			System.out.println("bye selenium");
		}
		//
		boolean flag = true;
		if (flag) {
			System.out.println("hi testing ...");
		} else {
			System.out.println("bye testing");
		}
		//
		boolean test = true;
		if (!test) {
			System.out.println("testing is done");
		} else {
			System.out.println("testing is not done");
		}

		// Nested IF
		int number = 99;
		if (number <= 100) {
			System.out.println("calculating your marks");
			if (number >= 90) {
				System.out.println("GRADE A ");

				if (number == 100) {
					System.out.println("you got 100 percent schollership");
				}
				else {
					System.out.println("you are not eligible for schollar");
				}
			}
			else {
				if(number>=80) {
					System.out.println("GRADE B");
				}
				}
		
		} else {
			System.out.println("The student marks is " + number);
		}
		
		//If Else if
		String browser = "chrome";
		if(browser.equals("chrome")) {
			System.out.println("launch chrome");
		}
		else if(browser.equals("firefox")) {
			System.out.println("launch firfox");
		}
		else if(browser.equals("opera")) {
			System.out.println("launch opera");
		}
		else {
			System.out.println("please pass the right browser");
		}

	}

}
