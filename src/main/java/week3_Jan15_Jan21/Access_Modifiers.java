package week3_Jan15_Jan21;

public class Access_Modifiers {
	
	public static void main (String[] args) {
		
		// For classes, you can use either "public" or "default" without mentioning it:
		
		// public - The class is accessible by any other class
		// default - The class is only accessible by classes in the same package. This is used when you 
		// don't specify a modifier.
		// keywords are case sensitive. 
		
		test();
		test1();
		test2();
		test3();
		
		//a method in class can access all its modifiers?
	}
	
	// For attributes, methods and constructors, you can use the one of the following:
	
	public static void test() { // public - The code is accessible for all classes.
		
		System.out.println("Public test method.");
	}
	
	protected static void test1() { // The code is accessible in the same package and subclasses.
		
		System.out.println("Protected test1 method.");
	}
	
	private static void test2() { // The code is only accessible within the declared class
		
		System.out.println("Private test2 method.");
	}
	
	//default static void test3() {} // "default" is not valid.
	//Gives an error message that says "illegal modifier for the method". 
	
	static void test3() {
		
		// The class is only accessible by classes in the same package. This is used when you don't specify 
		// a modifier. Default without mentioning the word.
		
		System.out.println("Default test3 method.");
	}

}
