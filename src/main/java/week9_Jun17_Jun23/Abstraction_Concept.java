package week9_Jun17_Jun23;

// Abstraction means hiding internal implementation and just highlighting the setup services
// Abstraction in Java can be achieved by 2 ways. 
// 1. Abstract Class [0 to 100% Abstraction]
// 2. Interface [100% Abstraction]

// Unimplemented methods, they don't have a body. They are also called Abstract methods.

// If a Class uses they keyword Abstract then it becomes an Abstract Class
// An Abstract Class can have both Abstract (Unimplemented) methods and normal methods. 
// An Abstract method can only reside inside an Abstract Class
// Can have a non-static protected abstract method
// Can't have static protected abstract method
// Can have an abstract method without an access modifier

public abstract class Abstraction_Concept {
	
	String student_name;
	int student_age;
	
	public static void displayLogic0() {
		
		System.out.println("This is a normal static method.");
	}
	
	public void displayLogic1() {
		
		System.out.println("This is a normal method.");
	}
	
	public abstract void displayLogic2(); // Unimplemented method. Only allowed inside an Abstract Class.
	
	public abstract void displayLogic3(); 
	
	// private abstract void displayLogic4(); // Can't have a private abstract method. Gives error.
	
	protected abstract void displayLogic5();
	
	abstract void displayLogic6(); // Case sensitive. 'Abstract' not acceptable
}
