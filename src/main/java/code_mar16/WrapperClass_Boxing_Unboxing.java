package code_mar16;

public class WrapperClass_Boxing_Unboxing {
	
	public static void main(String[] args) {
		
		// Boxing:
		// Placing a primitive variable in an object is known as boxing. This allows the primitive to be used where
		// objects are required. For this purpose Java provides wrapper classes for each primitive – namely: Byte, 
		// Short, Integer, Long, Float, Double, Character and Boolean.
		
		int x = 20; 
		Integer y = Integer.valueOf(x);
		
		System.out.println(y);
		
		// Autoboxing
		// Autoboxing is the automatic conversion that the Java compiler makes between the primitive types and 
		// their corresponding object wrapper classes. For example, converting an int to an Integer, a double to 
		// a Double, and so on.
		
		int a = 100;
		Integer b = a;
		
		System.out.println(b);
		
		// Unboxing
		// Converting an object of a wrapper type (Integer) to its corresponding primitive (int) value is called
		// unboxing. The Java compiler applies unboxing when an object of a wrapper class is: Passed as a 
		// parameter to a method that expects a value of the corresponding primitive type.
		
		Integer result = 50;
		int newResult = result.intValue();
		
		System.out.println(newResult);
		
		// AutoUnboxing
		
		Integer marks = 90;
		int newMarks = marks;
		
		System.out.println(newMarks);
		
	}

}
