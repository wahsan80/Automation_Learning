package week7_Mar25_Mar31;

public class MainMethod_Overloading {
	
	public static void main(String[] args) {
		MainMethod_Overloading.main(10); // Using class
		main(10); // Using method with single argument/parameter
		main(args = new String[3], args = new String[4]); // Using method with multiple arguments/parameters
	}
	
	public static void main(int i) {
		System.out.println("This is an int type parameter main method");
	}
	
	public static void main(String[] args1, String[] args2) {
		System.out.println("This is multiple parameters main method");
	}
}
