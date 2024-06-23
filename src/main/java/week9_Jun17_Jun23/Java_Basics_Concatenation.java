package week9_Jun17_Jun23;

public class Java_Basics_Concatenation {
	
	public static void main(String[] args) {
		
		String S1 = "Hello";
		String S2 = "Java";
		int i = 10;
		int j = 20;
		
		System.out.println(S1 + S2 + i + j); 
		// Just displaying the values without spaces. No + Operator effect. 
		System.out.println(S1 + S2 + (i + j)); 
		// Brackets enforced the + operator which resulted in sum of i + j
	}
}
