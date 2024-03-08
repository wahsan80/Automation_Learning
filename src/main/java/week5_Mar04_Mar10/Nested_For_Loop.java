package week5_Mar04_Mar10;

public class Nested_For_Loop {
	
	public static void main(String[] args) {
		
		//pattern programming
		
		for (int i = 1; i<=5; i++) {
			for (int j = 1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 1; i<=5; i++) {
			for (int j = 1; j<=5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 1; i<=5; i++) {
			for (int j = 1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
