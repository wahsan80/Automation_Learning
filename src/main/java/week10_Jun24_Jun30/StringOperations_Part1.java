package week10_Jun24_Jun30;

public class StringOperations_Part1 {
	
	public static void main(String[] args) {
		
		// 1. Determine the length of the String. 
		
		String S0 = null;
		//System.out.println(S0.length()); // Null Pointer Exception. Gives error
		
		String S1 = "I am learning Automation with Java Selenium";
		System.out.println("Length of S1 is : " + S1.length());
		
		// isEmpty() - this method should return true if the String is empty, otherwise false. 
		
		String S2 = "";
		System.out.println(S2.isEmpty());
		
		String S3 = "Hello";
		System.out.println(S3.isEmpty());
		
		String S4 = "   I am working   ";
		System.out.println(S4.length());
		
		String trimmedvalue = S4.trim(); // trim removes the blank spaces before and after the String
		System.out.println(trimmedvalue);
		System.out.println(trimmedvalue.length());
		
		// How to use trim() and length() methods together?
		
		String S5 = "   I am working very hard    "; // Length 29
		System.out.println(S5.length());
		
		int trimmedvalueThenLength = S5.trim().length(); // length().trim() wouldn't work.
		System.out.println(trimmedvalueThenLength); // Length 22
		
		// Comparing 2 Strings
		// equals() returns boolean
		
		String S6 = "Python";
		String S7 = "Java";	
		System.out.println(S6.equals(S7));
		
		// equalsIgnoreCase() returns boolean
		
		String S8 = "HELLOWORLD";
		String S9 = "helloworld";
		System.out.println(S8.equalsIgnoreCase(S9));
		
		// compareTo() - The compareTo() method compares two strings lexicographically.
		
		String S10 = "I am going out";
		String S11 = "I am coming home";
		System.out.println(S10.compareTo(S11));
		
		String S12 = "a"; // unicode value is 97 
		String S13 = "A"; // unicode value is 65
		System.out.println(S12.compareTo(S13)); // unicode value of 'a' - unicode value of 'A' // 97-65=32
		
		// compareToIgnoreCase()
		
		System.out.println(S12.compareToIgnoreCase(S13));
		
		// concat()
		
		String S14 = "Dummy";
		String S15 = "Value";
		String S16 = S14 + S15;
		System.out.println(S16);
		
		String S17 = "Horse"; // 1 object will be created in SCP/SLP memory location
		String S18 = S17.concat("White");
		
		System.out.println(S17);
		System.out.println(S18); //HorseWhite
		
		// join()
		
		String S19 = "Mercedes";
		String S20 = "Jaguar";
		String S21 = "Audi";
		System.out.println(String.join(", ", S19, S20, S21));
		System.out.println(String.join(S19, S20, S21));
		System.out.println(String.join("/", S19, S20, S21));
		
		// substring()
		
		String S22 = "ToyotaHondaNissan";
		System.out.println(S22.substring(1,5)); // Only print between 1-5
		
	}
}
