package java_basics;

public class StringConcatination {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		System.out.println(a+b);
           
		String x = "Hello";
		String y = "Selenium";
		System.out.println(x+y);
		System.out.println(a+x);
		System.out.println(a+b+x+y); //30HelloSelenium concatination will happen from left to right
		System.out.println(x+y+a+b); //HelloSelenium1020
		System.out.println(x+y+(a+b)); //HelloSelenium30
		double c = 12.33;
		double d = 23.44;
		System.out.println(x+y+c+d); //HelloSelenium12.3323.44
		System.out.println(x+y+c+d+a+b); //HelloSelenium12.3323.441020
		
		char g = 'm';
		char p = 'n';
		
		String l = "testing";
		String u = "automation";
		System.out.println(l+u+g+p); //testingautomationmn
		
		char t1 = 'a';
		char t2 = 'b';
		System.out.println(t1+t2); //195 ASCII Value for a = 97, b =98
		
		char t3 = 'z'; //122
		System.out.println(t1+t2+t3); //317
		System.out.println(t1); //a
		System.out.println('a'+'b'); //195
		System.out.println("a+b"); //a+b
				
		//Print ASCII Value of 'a'
		System.out.println((byte)'a');//97
		System.out.println((byte)'$'); //36
	}

}
