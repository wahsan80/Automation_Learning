package week10_Jun24_Jun30;

public class Car extends Vehicle{
	
	// 'super' keyword in Java is a reference variable used to refer to parent Class Objects
	// 'super' with variables
	// 'super' with methods 
	// 'super' with constructors
	
	int maxSpeed = 120;
	
	public static void main(String[] args) {
		
		Car child = new Car();
		child.display();
	}
	
	public void display() {
		
		System.out.println("Maximum speed is : " + super.maxSpeed); // 'super' referring to parent class 
	}

}
