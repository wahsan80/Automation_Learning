package week4_Feb26_Mar03;

public class Control_Statements {
	
	public static void main(String[] args) {
		
		/* Decision Making in programming is similar to decision-making in real life. In programming also face 
		 * some situations where we want a certain block of code to be executed when some condition is fulfilled.
		 * A programming language uses control statements to control the flow of execution of a program based on 
		 * certain conditions. These are used to cause the flow of execution to advance and branch based on 
		 * changes to the state of a program. 
		 * Java’s Selection statements: if, if-else, nested-if, if-else-if, switch-case, jump – break, continue,
		 * return
		 * https://www.geeksforgeeks.org/decision-making-javaif-else-switch-break-continue-jump/
		*/
		
		// There are 3 types of control statements in Java
		// 1. Selection or Conditional Statements -> if, if-else, if-else-if, nested if
		// 2. Iteration or Looping Statements -> for, while, do-while
		// 3. Jump Statements -> break, continue, return
		
		// WAP to right first 50 natural numbers
		
		int i = 1;
		
		while (i <= 25) {
			
			System.out.println("i = " + i);
			i++;
		}
	}

}
