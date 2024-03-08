package week5_Mar04_Mar10;

public class For_Loop {
	
	//Important for Logic, Automation & Interview
	//Key word: 'for'
	//Logic: (initialization expression; condition/test expression, updation expression)
	//Syntax: for(Data Type Variable, condition, updation)
	//Example: for (int i = 1; i <= 10; i++);

	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 1; i <= 10; i++)
			System.out.println(i); //print new line
		
		for (int j = 1; j <= 10; j++)
			System.out.print(j + " "); //print on same line with a space
		
		System.out.println(); //Go to new line
		
		for (int i = 2; i <= 20*2; i=i+2) //WAP to display first 20 even numbers
			System.out.print(i + " ");
		
		System.out.println(); //Go to new line
		
		for (int i = 5; i <= 10*5; i=i+5) //WAP to display first 10 multiples of 5
			System.out.print(i + " ");
		
		System.out.println(); //Go to new line
		
		for (int i = 100; i >= 50; i--) //WAP to display numbers from 100 to 50
			System.out.print(i + " ");
		
		System.out.println(); //Go to new line
		
		for (int i = 200; i >= 100; i=i-5) //WAP to display multiples of 5 in a decreasing order starting from 200 to 100
			System.out.print(i + " ");
		
		System.out.println(); //Go to new line
		
		for (int i = 1; i <= 100; i++) { //WAP to display sum of first 100 natural numbers
			sum = sum + i;
			if (i == 100)
				System.out.print(i + " " + sum);
		}
	}
}
