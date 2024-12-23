package java_static;



public class Test {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.color = "black";
		car.startCar();
		Car.stopCar(); // stop car is static can call directly classname.class

	}

}
