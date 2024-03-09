package week5_Mar04_Mar10;

public class Nested_For_Loop {
	
	public static void main(String[] args) {
		
		// pattern programming
		// nested for loop - for each execution of outer 'for' loop, inner 'for' loops executes completely
		// Come back to this for further practice - Need more time
		
		int n1 = 6;
		int n2 = 5;
		
		for (int i = 1; i<=5; i++) { //pattern 1
			for (int j = 1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 1; i<=5; i++) { //pattern 2
			for (int j = 1; j<=5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int row = 1; row <= 5; row++) { //pattern 3- for better understanding, use row and column
			for (int col = 1; col<=row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int row = 1; row <= n1; row++) { // pattern 4
			for (int col = 1; col <= n1-row+1; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int row = 1; row <= n2; row++) { //
			for (int col = 1; col <= row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
	
	//Made the following patterns
	//     *
	//    **
	//   ***
	//  ****
	// *****
	
	// *
	// **
	// ***
	// ****
	// *****
	// ****
	// ***
	// **
	// *
	
	//     *
	//    **
	//   ***
	//  ****
	// *****
	//  ****
	//   ***
	//    **
	//     *

}
