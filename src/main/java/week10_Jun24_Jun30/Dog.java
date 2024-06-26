package week10_Jun24_Jun30;

public class Dog extends Animal{
	
	public static void main(String[] args) {
		
		Dog d = new Dog();
	}
	
	Dog(){
		
		// The parameterized super() must always be the first statement in the body of the constructor of the
		// subclass. 
		
		//super(); // No parameters
		super("Romeo"); // Parent (Animal) Class - 1 parameter
		System.out.println("This is Child (Dog) Class Constructor.");
	}

}
