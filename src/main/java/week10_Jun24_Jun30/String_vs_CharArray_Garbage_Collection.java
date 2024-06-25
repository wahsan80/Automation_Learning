package week10_Jun24_Jun30;

public class String_vs_CharArray_Garbage_Collection {
	
	// Garbage Collection in Java.
	
	public static void main(String[] args) {
	
		String password = new String("Password#9876");
	
		char[] chpassword = new char[] {'P', 'a', 's', 's', 'w', 'o', 'r', 'd', '#', '9', '8', '7', '6'};
	
		System.out.println("The password in the String object is : " + password);
		// Prints as it is. 
		System.out.println("The password in the Char Array is : " + chpassword);
		// Probably only printing the memory location. Need to provide index for exact printing. 
	}
}
