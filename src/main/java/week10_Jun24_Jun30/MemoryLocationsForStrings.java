package week10_Jun24_Jun30;

public class MemoryLocationsForStrings {
	
	// Strings are basically stored in heap memory.
	// There are 5 types of memory storage areas in Java
	// 1. Heap Memory [String Constant Pool (SCP) / String Literal Pool (SLP)] (Manipulate Size)
	// 2. Method area, 3. Stack area, 4. Native Method Area, 5. PC Register
	
	public static void main(String[] args) {
		
		String S1 = new String(); 
		// String Object. Whenever we use 'new' keyword to create an object, it is stored in Heap Memory Area
		
		String S2 = "Python"; // Also a String Object. SLP/SCP memory area. 
		
		String S3 = new String("Java"); // Passes Java
		// 'new' keyword is there, so object will be created in heap memory. 
		// literal "Java" is also there, so another object will be created in SLP/SCP area
		
		System.out.println(S3); // Prints Java
		System.out.println("******************************");
		
		String S4 = new String("America"); // 2 memory locations. 1. Object in heap area, 2. Literal in SLP
		
		String S5 = new String("Brazil");
		
		String S6 = new String("America"); // Only 1 object will be created. 
		
		String S7 = "America"; // 0 objects will be created. 
		
		String S8 = "Pakistan";
		
		System.out.println("******************************");
		
		String S9 = "Labrador"; // 1 object
		String S10 = new String("Labrador"); // 2 objects
		
		// Q. Which way will you choose to create Objects when you are designing your framework and why?
		
	}

}
