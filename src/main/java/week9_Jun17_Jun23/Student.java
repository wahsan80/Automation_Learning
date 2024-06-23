package week9_Jun17_Jun23;

public class Student extends Abstraction_Concept {
	
	// An Abstract Class can extend another abstract Class without implementing the body of the unimplemented 
	// methods of the parent Abstract Class.
	
	// Added Unimplemented methods by clicking on the error message.
	
	// When a normal class extends an Abstract Class then all the unimplemented methods of the Abstract Class
	// have to implement their bodies in this normal class. 
	
	public static void main(String[] args) {
		
		// Abstraction_Concept ac = new Abstraction_Concept(); // Trying to create an Object. Gives error.
		// Can we create the object of an Abstract class? No.
		
		Student st = new Student();
		st.displayLogic1();
		st.displayLogic0();
		st.displayLogic3();
		st.displayLogic2();
		st.displayLogic5();
		st.displayLogic6();
		st.student_age = 5;
		st.student_name = "Bob";
		
		Abstraction_Concept ref = new Student();
		ref.displayLogic3();
		
	}

	@Override
	public void displayLogic2() {
		
		System.out.println("child display logic 2.");
	}

	@Override
	public void displayLogic3() {
		
		System.out.println("child display logic 3.");
	}

	@Override
	protected void displayLogic5() {
		
		System.out.println("child display logic 5.");
	}

	@Override
	void displayLogic6() {
		
		System.out.println("child display logic 6.");
	}

}
