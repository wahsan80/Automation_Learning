package week8_Mar25_Mar31;

public class UsingMethodLogic {

	// static is concept of the Class
	// non-static is concept of the Object
	// a static entity can be called directly or by the help of the Class

	public static void main(String[] args) {
		System.out.println("This is the main method");
		UsingMethodLogic.logic1(); // Using Class Name to call the method. 
		UsingMethodLogic.logic2();
		UsingMethodLogic.logic3();
		logic1(); // Directly calling the method.
		logic2();
		logic3();

		UsingMethodLogic objref = new UsingMethodLogic(); // Create an object of the class. 
		objref.logic4(); // Using object to call the method. 

	}

	public static void logic1() {
		System.out.println("I have coding logic1");
	}

	public static void logic2() {
		System.out.println("I have coding logic2");
	}

	public static void logic3() {
		System.out.println("I have coding logic3");
	}

	public void logic4() {
		System.out.println("I have coding logic4");
	}

}
