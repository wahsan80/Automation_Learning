package week6_Mar11_Mar17;

public class Two_D_Arrays {
	
	public static void main(String[] args) {
		
		// Declaration
		
		int[][] a; // Preferred way of Declaration
		int[] []a1;
		int a2[][];
		int[] a3[];
		
		// int[][] a5, []b5; // Will give error
		
		int [][] a6, b6; // Both are 2-D
		int[] a7[], b7; 
		int[] a8[], b8[];
		int[][] a9, b9[]; // a9 is 2-D and b9 is 3-D
		
		// Creation
		
		int[][] a10 = new int[2][3];
		
		// Initialization
		
		int[][] a11 = new int[3][4];
		
		a11[0][0] = 101;
		a11[0][1] = 202;
		a11[0][2] = 303;
		a11[0][3] = 404;
		
		a11[1][0] = 101;
		a11[1][1] = 202;
		a11[1][2] = 303;
		a11[1][3] = 404;
		
		a11[2][0] = 101;
		a11[2][1] = 202;
		a11[2][2] = 303;
		a11[2][3] = 404;
		
		int[] a12 = {12,13,14,15,16}; // 5 Memory spaces
		System.out.println(a12.length); // 5 Array size length
		
		int[] a13 = new int[] {10, 20, 30, 40, 50, 60}; // 6 Memory spaces
		System.out.println(a13.length); // 6 Array size length
		
		// Retrieve
		
		System.out.println("==============");
		
		int[] a14 = {999, 888, 777, 666, 555, 444, 333, 222, 111};
		
		// How I'll retrieve all the values in output console?
		
		System.out.println(a14.length); // Check the length of the Array first. 
		
		for (int i = 0; i < a14.length; i++) // Length is 9 and array index starts at 0 so use less than sign to 
											 // keep it within array limit
			System.out.print(a14[i] + " ");
		
		int[][] a15 = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
		int[][] a16 = { {1,2,3,4,5,6}, {5,6,7,8,9,10}, {9,10,11,12,13,14} , {14,15,16,17,18,10} , {18,19,20,21,22,23}};
		
		//Retrieve
		
		int[][] a17 = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12} }; // 3 Arrays not 12
		
		System.out.println();
		System.out.println("==============");
		System.out.println(a17.length);
		
		for(int row=0 ; row<a17.length ; row++) {
			for(int col=0 ; col<a17[row].length ; col++) {
				System.out.print(a17[row][col] +  " ");
			}
			System.out.println();
		}
	}

}
