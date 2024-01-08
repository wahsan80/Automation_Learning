package week1_Jan02_Jan07;

public class Primitive_Data_Types {
	
	public static void main(String[] args) {
		
		//Primitive data types are int, char, boolean, double, float, byte, short, long - 8 types
		
		// Type		= Size		= Description (Stores)
		// =================================================================================================
		// byte 	= 1 byte	= Whole numbers from -128 to +127 (3 digits)
		// short	= 2 bytes	= Whole numbers from -32,768 to +32,767 (5 digits)
		// int 		= 4 bytes	= Whole numbers from -2,147,483,648 to +2,147,483,647 (10 digits)
		// long 	= 8 bytes	= Whole number from -9,223,372,036,854,775,808 to +9,223,372,036,854,775,807 (19)
		
		// float	= 4 bytes	= Stores fractional numbers 6-7 decimal digits.
		// double	= 8 bytes 	= Stores fractional numbers 15 decimal digits.
		
		// boolean 	= 1 bit	= 	= true or false value
		
		// char 	= 2 bytes	= A single character/letter or ASCII values
		
		// https://www.w3schools.com/java/default.asp
		// Whenever a topic gets completed then do a quiz on this website to check the knowledge 
		
		System.out.println("Data Types = Range");
		System.out.println("=========================");
		
		// =======================================================================
		
		byte bt = 127; // After 3 digits, it gives an error that can't convert from int to byte. Value takes 
		  				// precedence over data type? Otherwise should have said that can't convert byte to int
		
		System.out.println("byte = " + bt);
		
		// =======================================================================
		
		short s = 32767; // After 5 digits, gives an error that can't convert from int to short. Goes out of range.
		
		System.out.println("short = " + s);
		
		// =======================================================================
		
		int i = 2147483647; //Error after 10 digits. Out of range
		
		System.out.println("int = " + i);
		
		// =======================================================================
		
		long l = 9223372036854775807L; //Error after 19 digits. Out of range. Need to insert 'L' after the number.
		
		System.out.println("long = " + l);
		
		// =======================================================================
		
		float f = 3.40282347e+38f; //Need to insert 'f' after the number.
		
		System.out.println("float = " + f);
		
		// =======================================================================
		
		double d =  1.79769313486231570e+308; //Need to insert 'f' after the number.
		
		System.out.println("double = " + d);
		
		// =======================================================================
		
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = (b1 != b2); // true statement
		boolean b4 = (b1 == b2);
		
		System.out.println("Boolean = " + b3);
		System.out.println("Boolean = " + b4);
		
		// =======================================================================
		
		char c = 'W'; // c = i; Can't convert from int (one data type) to char (another data type) - Error
		
		System.out.println("char = " + c);
		
	}

}
