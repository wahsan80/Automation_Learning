package week2_Jan08_Jan14;

public class Increment_Decrement_Operators {

	public static void main(String[] args) {
		
		//post increment & decrement operators. Example. i++, i-- Use value first then increase or decrease
		//pre increment & decrement operators. Example. ++i, --i Increase or decrease first then use value
		
		int i = 1;
		
		System.out.println(i); // Value of i = 1 at this point
		i++; // i becomes 2
		
		System.out.println(i); // Value of i = 2 at this point
		++i; // i becomes 3
		
		System.out.println(i); // Value of i = 3 at this point
		i--; // i becomes 2
		
		System.out.println(i); //Value of i = 2 at this point
		--i; // i becomes 1
		
		System.out.println(i); //Value of i = 1 at this point
	}

}
