package week9_Jun17_Jun23;

public class Global_Static_NonStatic_Local_Variables {
	
	public static String name; // This is a static Class variable
	public String department;  // This is an instance Class variable
	protected int i;
	private char c;
	protected static int j;
	
	int k;
	
	// Static is the property of the Class
	// Static can only call Static. They will never call Non-Static
	// Non-Static can call Non-Static and Static
	
	public static void main(String[] args) {
		
		String name = "Don";
		System.out.println(name);
		
		j = 100;
		System.out.println(j);
		
		// Create an Object of the class.
		
		Global_Static_NonStatic_Local_Variables objref = new Global_Static_NonStatic_Local_Variables();
		objref.department = "Library";
		
		System.out.println(objref.department);
		objref.display();
		
		Global_Static_NonStatic_Local_Variables.sample("sds", 90);
	}
	
	public void display() {
		
		System.out.println(2-2);
		sample("abs", 9);
		
		int i = 10; // Even inside a Non-Static method, local variables are not Non-Static nor they are Static
	}
	
	public static void sample(String day, int number) {
		
		System.out.println(2+2);
		//display(); // Static can't call Non_Static - Gives an error message
		
		System.out.println(day + " " + number);
		
		String classRoom = "Java"; // Local Variable
		
		// Local variables can't be declared static even if they are inside a static method.
		// Local variables are neither Static not Non-Static
	}
	
}
