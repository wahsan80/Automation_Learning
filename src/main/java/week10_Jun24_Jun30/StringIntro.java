package week10_Jun24_Jun30;

public class StringIntro {
	
	// Q. Which is the parent Class of all Classes in Java?
	// A. Object Class is the parent of all Classes in Java. 
	
	// Q. Which is the most powerful Class in Java?
	// A. String (Top of all Classes in Java).
	
	public static void main(String[] args) {
		
		char c = '1';
		String S1 = "sfsdf945345435$%";
		
		char[] c1 = {'s', 'e', 'l', 'e', 'n', 'i', 'u', 'm'};
		String S2 = new String();
		System.out.println(c1);
		System.out.println(c);
		System.out.println(S1);
		System.out.println(c1[7]); // prints the character at index 7.
		
		String S3 = new String();
		String S4 = "Java";
		
		// What are the different memory locations in Java?
		// Objects created by String Class are stored in heap memory. 
	}
}
