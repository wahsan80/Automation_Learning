package week3_Jan15_Jan21;

public class Variables {
	
	// A Variable is a piece of memory that can contain a data value. 
	// A variable has a data type.
	// Variables are typically used to store information which your java program needs to do it's job. 
	// There are 3 different types of variables in Java; instance, static, local.
	
	// "instance variable" - A variable declared inside the class but outside the body of any method, constructor
	// or block is called an instance variable.  Instance variables are created when an object is created using 
	// the new keyword. It is destroyed when the object is destroyed. It can’t be declared as static, but you can
	// use access modifiers for instance variables. Instance variables are visible for all methods, constructors 
	// and blocks in the class. Usually instance variables are private, but you can change the visibility for 
	// subclasses. Instance variables as opposed to local variables have default values. For all number primitive 
	// types the default value is 0, for booleans it’s false, and for object references it’s null. Values can be 
	// assigned during the declaration or within the constructor.
	
	int j; // instance variable (Within class but outside the body of main or any other method.)
	String name;  // instance variable
	
	// "static variable" - A variable that is declared as static is called a static variable. Java offers you to 
	// declare such variables outside a method, constructor or block. It cannot be local, they belong to class, 
	// not to instances. That means that a single copy of a static variable once created and shared among all the
	// instances of the class. Memory allocation for static variables happens only once when the class is loaded
	// in the memory. They can have any visibility, but usually they are declared as public. They also have
	// default values such as instance variables.
	
	static String language; 
	
	public static void main(String[] arges) {
		
		int i = 1; // Stores data value in the heap memory allocation
		String S1 = "Python";
	}
	
	// "Local variable" - A variable declared inside the body of the method is called a local variable. Also, 
	// local variables are declared inside constructors and blocks. You can use local variables only within that 
	// method, constructor, or block where they were created and the other methods in the class aren't even aware
	// that the variable exists. So local variables are created when the method, constructor, or block is entered
	// and the variable is destroyed once the method, constructor, or block doesn’t work. A local variable cannot
	// be defined with the static keyword. Even more: you can’t use access modifiers for local variables.
	
	public static void test() {
		
		int i = 1; // Local variable
		int j = 2; // Local variable
	}

}
