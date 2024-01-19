package week3_Jan15_Jan21;

public class Even_Or_Odd_Ex {
	
	public static void main(String[] args) {
	
		int num = 23;
	
		// WAP (Write a Program) to determine whether this number is even or odd? - Exercise (Ex) 1
	
		if (num % 2 == 0) // Using remainder (%) and equal (==) operators to see if it's true.
			System.out.println(num + " is an even number.");
		else // If condition is false.
			System.out.println(num + " is an odd number");
		
		// WAP to determine whether this number is a prime number or not - use for loop
		
		// A prime number is a number that can only be divided by itself and 1 without remainders.
		
		if (num < 2 && num % num == 0)
			System.out.println("It's a prime number."); 
		else 
			System.out.println("It's not a prime number.");
	}
}
