package java_basics;

public class SwitchLearning {

	public static void main(String[] args) {

		String browser = "ie";
		switch (browser) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "opera":
			System.out.println("launch opera");
			break;
		case "ie":
			System.out.println("launch ie");
			break;
		default:
			System.out.println("please pass the right browser");
			break;

		}

	}
}
