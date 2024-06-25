package week10_Jun24_Jun30;

public class Immutable {
	
	// Strings are Immutable? Yes
	// String Buffer and String Builder are not Immutable
	
	// Immutable means something which can't be changed.
	// The concept of immutability wrt Strings is around String Objects.
	
	public static void main(String[] args) {
		
		String S1 = new String("Welcome"); // Original
		S1.concat("Home"); // Thats what we are trying to change
		
		System.out.println(S1); // "Home" didn't get print. Only "Welcome" got printed.
		
		// Whenever we try to change something in the String object. instead of changing it, it creates a new
		// object. 
		
		S1 = S1.concat("To Class"); // Creates new object. 
		
		System.out.println(S1);
		
		String Student1 = "Physics";
		String Student2 = "Physics";
		String Student3 = "Chemistry";
		
		String Student1000 = "Physics";
		
		
	}
}
