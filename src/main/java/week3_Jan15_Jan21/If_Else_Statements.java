package week3_Jan15_Jan21;

public class If_Else_Statements {
	
	public static void main (String[] args) {
		
		int a = 1, b = 2;
		
		if (a > b) //false
			System.out.println("a is less than b."); //Only 1 line gets executed if the condition is true. 
			// System.out.println("Testing"); Need parenthesis for multiple lines execution if statement is true.
		else if (a >= b ) // false
			System.out.println("a is not equal or greater than b.");
		else 
			System.out.println("No true condition exists.");
		
	}

}
