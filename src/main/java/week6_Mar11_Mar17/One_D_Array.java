package week6_Mar11_Mar17;

public class One_D_Array {
	
	public static void main(String[] args) {
		
		 //Declaration
		
		 int[] a; //this is the most popular form of writing arrays. Array of an integer type
		 int a1[];
		 int []a2;
		 int[]a3; 
		 
		 // [] this dimension if declared before a variable and comma is used and another variable is declared - 
		 // the both variables can use this dimension
		 // [] this dimension if declared after a variable and comma is used, then the other variable cannot use
		 // this dimension
		 
		 int[] a4, b4; // both a4 and b4 are 1-D arrays
		 int []a5,b5;  //both a5 and b5 are 1-D arrays
		 int[]a7,b7; //both a7 and b7 are 1-D arrays
		 int a6[], b6; //a6 is a 1-D array but b6 is just an int variable 
		 
		 // Lets Declare or Create an Array
		 
		 int[] a8 = new int[3];
		 int[] a9 = new int[0];
		 
		 System.out.println(a8.length);
		 System.out.println(a9.length);
		 
		 // int[] a10 = new int[-1]; // Negative Array Size Exception Error
		 // System.out.println(a10.length);
		 
		 // Array Initialization means putting some values in those memory spaces. 
		 
		 int[] a11 = new int[4]; // Create an 'int' Array with 4 memory spaces and assign it to an object
		 
		 a11[0] = 123; // Assign value 123 to a11 array at the memory position of index '0' 
		 a11[1] = 124; // Index will start at '0' & end at '3' at so total 4 memory spaces created and populated. 
		 a11[2] = 125;
		 a11[3] = 126;
		 // a11[4] = 127; // Will create a problem and error because index starts at 0 and ends at 3. Out of array
		                  // range
		 
		 System.out.println(a11.length);
	}

}
