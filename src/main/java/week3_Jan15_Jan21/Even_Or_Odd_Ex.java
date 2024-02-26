package week3_Jan15_Jan21;

public class Even_Or_Odd_Ex {
	
	public static void main(String[] args) {
	
		int num = 22;
	
		// WAP (Write a Program) to determine whether this number is even or odd? - Exercise (Ex) 1
	
		if (num % 2 == 0) // Using remainder (%) and equal (==) operators to see if it's true.
			System.out.println(num + " is an even number.");
		else // If condition is false.
			System.out.println(num + " is an odd number");
	}
}
