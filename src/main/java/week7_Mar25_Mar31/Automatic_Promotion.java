package week7_Mar25_Mar31;

public class Automatic_Promotion {
	
	public static void main(String[] args) {
		Automatic_Promotion ap = new Automatic_Promotion();
		ap.show(10);
		ap.show("java");
		ap.show('a');
	}

	public void show(int i) { // Being called twice with different parameter type. Char being converted to int
		
		System.out.println("This is an int '" + i + "' parameter method");
	}

	public void show(String S) {
		
		System.out.println("This is an String parameter method");
	}
}
