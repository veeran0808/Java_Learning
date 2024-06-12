package java_basics;

public class FinalKeyword {

	public static void main(String[] args) {
		
		//constant values
		int x = 10;
		x =20;
		x =30;
		x =40;
		System.out.println(x);
		
		final int days = 7; //final : we can change /duplicate the value
		int salary = days * 10;
		System.out.println(salary);

		final int DEFAULT_TIME_OUT = 10;
		System.out.println(DEFAULT_TIME_OUT);
		
		final String LOGIN_PAGE_TITLE = "Amazon Login";
		System.out.println(LOGIN_PAGE_TITLE);
		
		final char GENDER = 'f';
		System.out.println(GENDER);
	}

}
