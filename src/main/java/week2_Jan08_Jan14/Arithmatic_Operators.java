package week2_Jan08_Jan14;

public class Arithmatic_Operators {

	public static void main(String[] args) {

		/*	Arithmetic Operators - Arithmetic operators are used to perform common mathematical operations.

		Operator	Name			Description								Example
		+			Addition		Adds together two values				x + y	
		-			Subtraction		Subtracts one value from another		x - y	
		*			Multiplication	Multiplies two values					x * y	
		/			Division		Divides one value by another			x / y	
		%			Modulus			Returns the division remainder			x % y	
		++			Increment		Increases the value of a variable by 1	++x	
		--			Decrement		Decreases the value of a variable by 1	--x
		
		*/
		
		int i = 10;
		int j = 20;
		
		System.out.println("The sume of these 2 integers is: " + (i+j)); 
		System.out.println(100 + 200); // Addition
		System.out.println(300 - 200); // Subtraction
		System.out.println(10 * j);   // Multiplication
		System.out.println(200 / i);  // Division
		System.out.println(55 % i);   //Modulus (Remainder)
	}

}
