package defaultMethod;

interface Vehicle {

	public void start();
//	public void clean();

	public default void clean() {
		System.out.println("Cleaning completed...");
	}

}

public class Car implements Vehicle {

	@Override
	public void start() {

		System.out.println("Car Started....");
	}
	
	// default method can be Override
	/*
	 * @Override public void clean() { System.out.println("my clean method....");
	 * 
	 * }
	 */

	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		
		c.clean();
	}
}
